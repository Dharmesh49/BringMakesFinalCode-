package org.websparrow.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.websparrow.entity.OPERATIONLOG;
import org.websparrow.entity.Product;
import org.websparrow.entity.STOCK;

public interface ProductRepository   extends CrudRepository<Product, Integer>{
	
	
	List<Product> findAllBycreateDate(Date createDate);

	List<Product> findAllByupdateDate(Date updateDate);
	
	
	
	
	

}
