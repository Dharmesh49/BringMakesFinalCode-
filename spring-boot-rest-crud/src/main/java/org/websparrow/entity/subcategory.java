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
@Table(name = "subCategory_master")


public class subcategory {
	
	// TODO: Generate getters and setters...

			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)
		    @Column(name = "subcategory_id")
			private int subcategoryId;
			
		    @Column(name = "subcategory_name")
			 private String subcategoryName;

		   @Column(name = "subcategory_text")
			private String subcategorytext;

		    @Column(name = "subcategory_available")
		    private  String subcategoryavailable;
		    
		    @Column(name="Category_Available")
		    private String categoryavailable;
					
			
		    @Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date", nullable = false)
		    private Date createDate;
		    
		    @Temporal(TemporalType.TIMESTAMP)
			@Column(name = "update_date", nullable = false)
		    private Date updateDate;

			public int getSubcategoryId() {
				return subcategoryId;
			}

			public void setSubcategoryId(int subcategoryId) {
				this.subcategoryId = subcategoryId;
			}

			public String getSubcategoryName() {
				return subcategoryName;
			}

			public void setSubcategoryName(String subcategoryName) {
				this.subcategoryName = subcategoryName;
			}

			public String getSubcategorytext() {
				return subcategorytext;
			}

			public void setSubcategorytext(String subcategorytext) {
				this.subcategorytext = subcategorytext;
			}

			public String getSubcategoryavailable() {
				return subcategoryavailable;
			}

			public void setSubcategoryavailable(String subcategoryavailable) {
				this.subcategoryavailable = subcategoryavailable;
			}

			public String getCategoryavailable() {
				return categoryavailable;
			}

			public void setCategoryavailable(String categoryavailable) {
				this.categoryavailable = categoryavailable;
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

			@Override
			public String toString() {
				return "subcategory [subcategoryId=" + subcategoryId + ", subcategoryName=" + subcategoryName
						+ ", subcategorytext=" + subcategorytext + ", subcategoryavailable=" + subcategoryavailable
						+ ", categoryavailable=" + categoryavailable + ", createDate=" + createDate + ", updateDate="
						+ updateDate + "]";
			}
         
         
		
			
			

}
