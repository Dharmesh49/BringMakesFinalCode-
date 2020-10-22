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
@Table(name = "stock_master")

public class STOCK {
	
	// TODO: Generate getters and setters...

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "stock_id")
		private int stockId;
		
		@Column(name = "stock_name")
		 private String stockName;

		@Column(name = "stock_text")
		private String stocktext;

		@Column(name = "stock_available")
	    private String   stockavailable;
		
		
		 @Column(name="Sell_Type")
		 private String selltype;
		 
		 @Column(name="Sell_Value")
		 private int sellvalue;
		 
		 
		 @Column(name="Min_Limit")
		 private int minlimit;
		 
		 
		 @Column(name="Quality_Point")
		 private int qualitypoint;
		 
		 
		 @Column(name="AvgSell_Price")
		 private int avgsellprice;
		 
		 
		 @Column(name="Selling_PriceKg")
		 private int sellingpricekg;
		 
		 
		 @Temporal(TemporalType.TIMESTAMP)
			@Column(name = "Expire_Duration", nullable = false)
		    private Date expireduration;
				    
				    
	   @Temporal(TemporalType.TIMESTAMP)
	   @Column(name = "Purchase_DateTime", nullable = false)
	   private Date purchasedatetime;


	public int getStockId() {
		return stockId;
	}


	public void setStockId(int stockId) {
		this.stockId = stockId;
	}


	public String getStockName() {
		return stockName;
	}


	public void setStockName(String stockName) {
		this.stockName = stockName;
	}


	public String getStocktext() {
		return stocktext;
	}


	public void setStocktext(String stocktext) {
		this.stocktext = stocktext;
	}


	public String getStockavailable() {
		return stockavailable;
	}


	public void setStockavailable(String stockavailable) {
		this.stockavailable = stockavailable;
	}


	public String getSelltype() {
		return selltype;
	}


	public void setSelltype(String selltype) {
		this.selltype = selltype;
	}


	public int getSellvalue() {
		return sellvalue;
	}


	public void setSellvalue(int sellvalue) {
		this.sellvalue = sellvalue;
	}


	public int getMinlimit() {
		return minlimit;
	}


	public void setMinlimit(int minlimit) {
		this.minlimit = minlimit;
	}


	public int getQualitypoint() {
		return qualitypoint;
	}


	public void setQualitypoint(int qualitypoint) {
		this.qualitypoint = qualitypoint;
	}


	public int getAvgsellprice() {
		return avgsellprice;
	}


	public void setAvgsellprice(int avgsellprice) {
		this.avgsellprice = avgsellprice;
	}


	public int getSellingpricekg() {
		return sellingpricekg;
	}


	public void setSellingpricekg(int sellingpricekg) {
		this.sellingpricekg = sellingpricekg;
	}


	public Date getExpireduration() {
		return expireduration;
	}


	public void setExpireduration(Date expireduration) {
		this.expireduration = expireduration;
	}


	public Date getPurchasedatetime() {
		return purchasedatetime;
	}


	public void setPurchasedatetime(Date purchasedatetime) {
		this.purchasedatetime = purchasedatetime;
	}


	@Override
	public String toString() {
		return "STOCK [stockId=" + stockId + ", stockName=" + stockName + ", stocktext=" + stocktext
				+ ", stockavailable=" + stockavailable + ", selltype=" + selltype + ", sellvalue=" + sellvalue
				+ ", minlimit=" + minlimit + ", qualitypoint=" + qualitypoint + ", avgsellprice=" + avgsellprice
				+ ", sellingpricekg=" + sellingpricekg + ", expireduration=" + expireduration + ", purchasedatetime="
				+ purchasedatetime + "]";
	}
	   
	   

		
		    
		    
		    

		
		

}
