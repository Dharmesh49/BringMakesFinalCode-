package org.websparrow.entity;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Quantitytype_master")

public class QuantityType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Type_id")
	private int  typeid;
	
	@Column(name = "Quantity_name")
    private String QuantityName;

	@Column(name = "Description_Text")
	private String DescriptionText;
		
	   
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false)
    private Date createDate;
		    
		    
     @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "update_date", nullable = false)
     private Date updateDate;

	

	


	@Override
		public String toString() {
			return "QuantityType [typeid=" + typeid + ", QuantityName=" + QuantityName + ", DescriptionText="
					+ DescriptionText + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
		}


	public int getTypeid() {
		return typeid;
	}


	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}


	public String getQuantityName() {
		return QuantityName;
	}


	public void setQuantityName(String quantityName) {
		QuantityName = quantityName;
	}


	public String getDescriptionText() {
		return DescriptionText;
	}


	public void setDescriptionText(String descriptionText) {
		DescriptionText = descriptionText;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	

}
