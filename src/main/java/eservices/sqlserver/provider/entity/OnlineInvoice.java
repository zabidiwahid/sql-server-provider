package eservices.sqlserver.provider.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the ONLINE_INVOICE database table.
 * 
 */
@Entity
@Table(name="ONLINE_INVOICE", schema="IJPN")
public class OnlineInvoice{
	
	@Id
	@Column(name="APPLID")
	private String APPLID;
	
	@Column(name="ID_NO")
	private String idNo;
	
	@Column(name="INVOICE_NO")
	private String invoiceNo;
	
	@Column(name="ID_TYPE")
	private String idType;
	
	@Column(name="TXNSERNO")
	private BigDecimal txnserno;
	
	@Column(name="TXNSOURCE")
	private String txnsource;
	
	@Column(name="BRANCHCODEJPN")
	private String branchcodejpn;
		
	@Column(name="INVOICE_STAT")
	private String invoiceStat;
	
	@Column(name="PAYMENT_STATUS")
	private String paymentStatus;	

	@Column(name="TXNCODE")
	private String txncode;
	
	@Column(name="TXNDES")
	private String txndes;

	@Column(name="APPLICATIONDATE")
	private Date applicationdate;

	@Column(name="RECEIPTNO")
	private String receiptno;

	@Column(name="RECEIPTDATETIME")
	private Timestamp receiptdatetime;
	
	@Column(name="PAYMENTMODE1")
	private String paymentmode1;
	
	@Column(name="SERVICECHARGE")
	private BigDecimal servicecharge;

	@Column(name="FPX_REF_ID")
	private String fpxRefId;

	@Column(name="FPX_REF_TYPE")
	private String fpxRefType;

	@Column(name="PAYMENTMODE1AMT")
	private BigDecimal paymentmode1amt;
	
	@Column(name="TXN_CNT")
	private int txnCnt;
	
	@Column(name="AGENCYREVNCODEDETAILS")
	private String agencyrevncodedetails;

	@Column(name="AGREVENUECODE")
	private BigDecimal agrevenuecode;

	@Column(name="VA_APPLID")
	private String vaApplid;

	public OnlineInvoice() {
	}
	
		public String getAPPLID() {
		return APPLID;
	}

	public void setAPPLID(String aPPLID) {
		APPLID = aPPLID;
	}
	
	
	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getInvoiceStat() {
		return invoiceStat;
	}

	public void setInvoiceStat(String invoiceStat) {
		this.invoiceStat = invoiceStat;
	}

	public String getAgencyrevncodedetails() {
		return this.agencyrevncodedetails;
	}

	public void setAgencyrevncodedetails(String agencyrevncodedetails) {
		this.agencyrevncodedetails = agencyrevncodedetails;
	}

	public BigDecimal getAgrevenuecode() {
		return this.agrevenuecode;
	}

	public void setAgrevenuecode(BigDecimal agrevenuecode) {
		this.agrevenuecode = agrevenuecode;
	}

	public Date getApplicationdate() {
		return this.applicationdate;
	}

	public void setApplicationdate(Date applicationdate) {
		this.applicationdate = applicationdate;
	}

	public String getBranchcodejpn() {
		return this.branchcodejpn;
	}

	public void setBranchcodejpn(String branchcodejpn) {
		this.branchcodejpn = branchcodejpn;
	}

	public String getFpxRefId() {
		return this.fpxRefId;
	}

	public void setFpxRefId(String fpxRefId) {
		this.fpxRefId = fpxRefId;
	}

	public String getFpxRefType() {
		return this.fpxRefType;
	}

	public void setFpxRefType(String fpxRefType) {
		this.fpxRefType = fpxRefType;
	}

	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentmode1() {
		return this.paymentmode1;
	}

	public void setPaymentmode1(String paymentmode1) {
		this.paymentmode1 = paymentmode1;
	}

	public BigDecimal getPaymentmode1amt() {
		return this.paymentmode1amt;
	}

	public void setPaymentmode1amt(BigDecimal paymentmode1amt) {
		this.paymentmode1amt = paymentmode1amt;
	}

	public Timestamp getReceiptdatetime() {
		return this.receiptdatetime;
	}

	public void setReceiptdatetime(Timestamp receiptdatetime) {
		this.receiptdatetime = receiptdatetime;
	}

	public String getReceiptno() {
		return this.receiptno;
	}

	public void setReceiptno(String receiptno) {
		this.receiptno = receiptno;
	}

	public BigDecimal getServicecharge() {
		return this.servicecharge;
	}

	public void setServicecharge(BigDecimal servicecharge) {
		this.servicecharge = servicecharge;
	}

	public int getTxnCnt() {
		return this.txnCnt;
	}

	public void setTxnCnt(int txnCnt) {
		this.txnCnt = txnCnt;
	}

	public String getTxncode() {
		return this.txncode;
	}

	public void setTxncode(String txncode) {
		this.txncode = txncode;
	}

	public String getTxndes() {
		return this.txndes;
	}

	public void setTxndes(String txndes) {
		this.txndes = txndes;
	}

	public BigDecimal getTxnserno() {
		return this.txnserno;
	}

	public void setTxnserno(BigDecimal txnserno) {
		this.txnserno = txnserno;
	}

	public String getTxnsource() {
		return this.txnsource;
	}

	public void setTxnsource(String txnsource) {
		this.txnsource = txnsource;
	}

	public String getVaApplid() {
		return this.vaApplid;
	}

	public void setVaApplid(String vaApplid) {
		this.vaApplid = vaApplid;
	}

}
