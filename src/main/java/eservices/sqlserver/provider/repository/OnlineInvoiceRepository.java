package eservices.sqlserver.provider.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eservices.sqlserver.provider.entity.OnlineInvoice;

@Repository
public interface OnlineInvoiceRepository extends JpaRepository<OnlineInvoice, String> {
	
 	
	
	OnlineInvoice findByAPPLID(String applId);
	
	List<OnlineInvoice> findByAPPLIDIn(List<String> applid);

	
}