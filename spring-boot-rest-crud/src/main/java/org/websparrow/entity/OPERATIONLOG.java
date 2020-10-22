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
@Table(name = "operation_master")
public class OPERATIONLOG {
	// TODO: Generate getters and setters...

			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)
			@Column(name = "operation_id")
			private int operationId;
			
			@Column(name = "operation_name")
			private String operationName;
			
			@Column(name = "Description_Text")
			private String DescriptionText;

			@Column(name = "operation_Action")
			private int operationAction;
			
			@Column(name="IP_ADRESS")
			private double IpAdress;
			
			@Column(name="Late_Type")
            private String latetype;
			
			@Column(name="Long_Type")
			private long longtype;
			
			
			@Temporal(TemporalType.DATE)
			@Column(name = "create_date", nullable = false)
		    private Date createDate;
				    
				    
		     @Temporal(TemporalType.DATE)
			 @Column(name = "update_date", nullable = false)
		     private Date updateDate;
		     
		     
		     
		     
		     

			
			@Override
			public String toString() {
				return "OPERATIONLOG [operationId=" + operationId + ", operationName=" + operationName
						+ ", DescriptionText=" + DescriptionText + ", operationAction=" + operationAction
						+ ", IpAdress=" + IpAdress + ", latetype=" + latetype + ", longtype=" + longtype
						+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
			}

			public double getIpAdress() {
				return IpAdress;
			}

			public void setIpAdress(double ipAdress) {
				IpAdress = ipAdress;
			}

			public String getLatetype() {
				return latetype;
			}

			public void setLatetype(String latetype) {
				this.latetype = latetype;
			}

			public long getLongtype() {
				return longtype;
			}

			public void setLongtype(long longtype) {
				this.longtype = longtype;
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

			public int getOperationId() {
				return operationId;
			}

			public void setOperationId(int operationId) {
				this.operationId = operationId;
			}

			public String getOperationName() {
				return operationName;
			}

			public void setOperationName(String operationName) {
				this.operationName = operationName;
			}

			public String getDescriptionText() {
				return DescriptionText;
			}

			public void setDescriptionText(String descriptionText) {
				DescriptionText = descriptionText;
			}

			public int getOperationAction() {
				return operationAction;
			}

			public void setOperationAction(int operationAction) {
				this.operationAction = operationAction;
			}

			
			
}
