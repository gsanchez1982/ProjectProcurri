package net.codejava.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Deals implements Serializable {
	private Long id;
	private String PO; // Purchase order to Vendor
	private String sInv; // Sales Invoice (Invoice to customer)
        private String sInvType; // Status of Sales Invoice (paid, cancelled, valid, or not yet invoiced).
        private String customer; // Name of the customer
	private String vInv; // Vendor Invoice
        private String OC; // Purchase order from Customer
        private String dealComments; // Comments related to the deal
        @DateTimeFormat(pattern ="dd-MMM-yyyy")
        private Date ocDate;

	public Deals() {
	}

	protected Deals(Long id, String PO, String sInv, String sInvType, String customer, String vInv, String OC, String dealComments, Date ocDate) {
		super();
		this.id = id;
		this.PO = PO;
		this.sInv = sInv;
                this.sInvType = sInvType;
                this.customer = customer;
		this.vInv = vInv;
		this.OC = OC;
                this.dealComments = dealComments;
                this.ocDate = ocDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPO() {
		return PO;
	}

	public void setPO(String PO) {
		
                this.PO = PO;
	}

	public String getSInv() {
		return sInv;
	}

	public void setSInv(String sInv) {
		this.sInv = sInv;
	}

        public String getSInvType() {
		return sInvType;
	}

	public void setSInvType(String sInvType) {
		this.sInvType = sInvType;
	}
        
        
	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getVInv() {
		return vInv;
	}

	public void setVInv(String vInv) {
		this.vInv = vInv;
	}

	public String getOC() {
		return OC;
	}

	public void setOC(String OC) {
                this.OC = OC;
	}
        
	public String getDealComments() {
		return dealComments;
	}

	public void setDealComments(String dealComments) {
                this.dealComments = dealComments;
	}
        
                
        @Temporal(javax.persistence.TemporalType.DATE)
	public Date getOcDate() {
		return ocDate;
	}

	public void setOcDate(Date ocDate) {
                this.ocDate = ocDate;
	}
        
}