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
@Table(name = "product_master")
public class Product {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "product_id")
	private int ProductId;
	
	
	@Column(name = "Product_Name")
	private String productname;
	
	
	@Column(name ="Product_Description")
	private String  productdescription;
	
	@Lob
	@Column(name="Product_Images")
	private byte[] Productimages;
	
	@Lob
	@Column(name="Prdouct_Video")
	private byte[]  Productvideo;
	
	
	@Column(name="SubCategory_Optional")
	private String subcategoryoptional;
	
	@Column(name="Category_Optional")
	private String categoryoptional;
	
	@Column(name="More_Details")
	private String moredetails;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false)
    private Date createDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date", nullable = false)
    private Date updateDate;

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public byte[] getProductimages() {
		return Productimages;
	}

	public void setProductimages(byte[] productimages) {
		Productimages = productimages;
	}

	public byte[] getProductvideo() {
		return Productvideo;
	}

	public void setProductvideo(byte[] productvideo) {
		Productvideo = productvideo;
	}

	public String getSubcategoryoptional() {
		return subcategoryoptional;
	}

	public void setSubcategoryoptional(String subcategoryoptional) {
		this.subcategoryoptional = subcategoryoptional;
	}

	public String getCategoryoptional() {
		return categoryoptional;
	}

	public void setCategoryoptional(String categoryoptional) {
		this.categoryoptional = categoryoptional;
	}

	public String getMoredetails() {
		return moredetails;
	}

	public void setMoredetails(String moredetails) {
		this.moredetails = moredetails;
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
		return "Product [ProductId=" + ProductId + ", productname=" + productname + ", productdescription="
				+ productdescription + ", Productimages=" + Arrays.toString(Productimages) + ", Productvideo="
				+ Arrays.toString(Productvideo) + ", subcategoryoptional=" + subcategoryoptional + ", categoryoptional="
				+ categoryoptional + ", moredetails=" + moredetails + ", createDate=" + createDate + ", updateDate="
				+ updateDate + "]";
	}
	
	
	
	
	
	
    //	Name
	//2. Description 
//	5. images 
//	6. video
//	9. subcategory (optional)
//	10. category (optional)
//	11. more details (optional)
//	12. created
//	13. updated 
//	14. deleted
//	15. Vendor(Vendor_id)
//	16. Admin_Id
	
	
	
	
	

}
