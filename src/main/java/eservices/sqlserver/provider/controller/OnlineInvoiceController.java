package eservices.sqlserver.provider.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eservices.sqlserver.provider.entity.OnlineInvoice;
import eservices.sqlserver.provider.repository.OnlineInvoiceRepository;

@RestController
@RequestMapping("/api")
public class OnlineInvoiceController {
	
	@Autowired
	OnlineInvoiceRepository onlineInvoiceRepository;
	
	
	// api post dia akan save pkai jpa

	@RequestMapping(method = RequestMethod.GET, value = "/HelloWorld")
	public ResponseEntity<?> authorizedHelloWorld(@RequestParam(value = "eservis_applid", required = false) String applid){
		return new ResponseEntity<>(onlineInvoiceRepository.findByAPPLID(applid), HttpStatus.OK);	}
	
	
	@RequestMapping(value = "/cancel-invoice", method = RequestMethod.GET)
	public ResponseEntity<?> CancelInvoice(@RequestParam(value = "eservis_applid", required = false) String applid) {

		LinkedHashMap<String, String> response = new LinkedHashMap<String, String>();

		try {
			
			OnlineInvoice onlineInvoice = onlineInvoiceRepository.findByAPPLID(applid);
			onlineInvoice.setInvoiceStat("9");
			onlineInvoiceRepository.save(onlineInvoice);
		
			response.put("status", "OK");
			response.put("message", response.toString());

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		// return new ResponseEntity<>(responseToken, HttpStatus.OK);
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

		@RequestMapping(value = "/update-invoice-stat", method = RequestMethod.GET)
	public ResponseEntity<?> CancelInvoice(@RequestParam(value = "eservis_applid", required = false) String applid,
	@RequestParam(value = "status", required = false) String status) {

		LinkedHashMap<String, String> response = new LinkedHashMap<String, String>();
			System.out.println("Status: "+status);

		try {
			OnlineInvoice onlineInvoice = onlineInvoiceRepository.findByAPPLID(applid);
			onlineInvoice.setInvoiceStat("1");
			onlineInvoiceRepository.save(onlineInvoice);
		
			response.put("status", "OK");
			response.put("message", response.toString());

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		// return new ResponseEntity<>(responseToken, HttpStatus.OK);
		return new ResponseEntity<>(response, HttpStatus.OK);

	}


}
