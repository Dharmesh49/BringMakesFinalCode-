package org.websparrow.entity;


import java.util.Arrays;
import java.time.LocalDate;
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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import org.hibernate.annotations.Parent;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name = "category_master")

public class Category {
	
	// TODO: Generate getters and setters...

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		//@Column(name = "category_id")
		private int categoryId;
		
	
		@Column(name = "category_name")
		private String categoryName;

		@Column(name = "Description_Text")
		private String DescriptionText;
		
        @Lob
		@Column(name = "Images_Box")
		private byte[] imagesBox;
        
        @NotEmpty(message = "name is required")		
		@Column(name = "Slug_Type")
    	private String slug;
				
		
         
         @Temporal(TemporalType.TIMESTAMP)
			@Column(name = "create_date", nullable = false)
		    private Date createDate;
         
        
				    
				    
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

		
		    
	        // @JsonFormat(pattern = "dd-MM-yyyy")
		//	@Temporal(TemporalType.TIMESTAMP)
			 @Column(name = "update_date", nullable = false)
		     private Date updateDate;
		     
		
	
		
		@Override
			public String toString() {
				return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", DescriptionText="
						+ DescriptionText + ", imagesBox=" + Arrays.toString(imagesBox) + ", slug=" + slug
						+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
			}

		public int getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getDescriptionText() {
			return DescriptionText;
		}

		public void setDescriptionText(String descriptionText) {
			DescriptionText = descriptionText;
		}

		public byte[] getImagesBox() {
			return imagesBox;
		}

		public void setImagesBox(byte[] imagesBox) {
			this.imagesBox = imagesBox;
		}

		public String getSlug() {
			return slug;
		}

		public void setSlug(String slug) {
			this.slug = slug;
		}

		

		

}
