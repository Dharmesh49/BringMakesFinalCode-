package org.websparrow.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "packproduct_master")


public class PACKPRODUCT {
	
	// TODO: Generate getters and setters...

			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)
			@Column(name = "PackProduct_id")
			private int PackproductId;
			
			public int getPackproductId() {
				return PackproductId;
			}


			public void setPackproductId(int packproductId) {
				PackproductId = packproductId;
			}


			public String getPackproductName() {
				return PackproductName;
			}


			public void setPackproductName(String packproductName) {
				PackproductName = packproductName;
			}


			public int getSellingprice() {
				return Sellingprice;
			}


			public void setSellingprice(int sellingprice) {
				Sellingprice = sellingprice;
			}


			public String getTotalquantitytype() {
				return totalquantitytype;
			}


			public void setTotalquantitytype(String totalquantitytype) {
				this.totalquantitytype = totalquantitytype;
			}


			public double getTotalquantityvalue() {
				return totalquantityvalue;
			}


			public void setTotalquantityvalue(int totalquantityvalue) {
				this.totalquantityvalue = totalquantityvalue;
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


			@Column(name = "packproduct_name")
			private String PackproductName;

			@Column(name = "Selling_Price")
			private int Sellingprice;

			@Column(name = "TotalQuantity_Type")
			private String totalquantitytype;
			
			@Column(name="TotalQuantity_Value")
			private int totalquantityvalue;
			
			@Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date", nullable = false)
		    private Date createDate;
				    
				    
		     @Temporal(TemporalType.TIMESTAMP)
			 @Column(name = "update_date", nullable = false)
		     private Date updateDate;

			@Override
			public String toString() {
				return "PACKPRODUCT [PackproductId=" + PackproductId + ", PackproductName=" + PackproductName
						+ ", Sellingprice=" + Sellingprice + ", totalquantitytype=" + totalquantitytype
						+ ", totalquantityvalue=" + totalquantityvalue + ", createDate=" + createDate + ", updateDate="
						+ updateDate + "]";
			}
			
			
			
}
