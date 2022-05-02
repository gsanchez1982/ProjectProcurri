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
	private String vInv; // Vendor Invoice
        private String OC; // Purchase order from Customer

	public Deals() {
	}

	protected Deals(Long id, String PO, String sInv, String vInv, String OC) {
		super();
		this.id = id;
		this.PO = PO;
		this.sInv = sInv;
		this.vInv = vInv;
		this.OC = OC;
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

}