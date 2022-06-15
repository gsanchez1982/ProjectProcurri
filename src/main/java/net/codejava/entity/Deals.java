package net.codejava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deals {
	private Long id;
	private String PO; // Purchase order to Vendor
	private String sInv; // Sales Invoice (Invoice to customer)
        private String customer; // Name of the customer
	private String vInv; // Vendor Invoice
        private String OC; // Purchase order from Customer
        private String dealComments; // Comments related to the deal

	public Deals() {
	}

	protected Deals(Long id, String PO, String sInv, String customer, String vInv, String OC, String dealComments) {
		super();
		this.id = id;
		this.PO = PO;
		this.sInv = sInv;
                this.customer = customer;
		this.vInv = vInv;
		this.OC = OC;
                this.dealComments = dealComments;
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

}