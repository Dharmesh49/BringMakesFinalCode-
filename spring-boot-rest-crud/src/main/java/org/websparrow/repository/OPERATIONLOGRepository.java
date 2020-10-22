package org.websparrow.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.websparrow.entity.OPERATIONLOG;
import org.websparrow.entity.STOCK;

public interface OPERATIONLOGRepository extends CrudRepository<OPERATIONLOG, Integer> {
	
	List<OPERATIONLOG> findAllBycreateDate(Date createDate);

	List<OPERATIONLOG> findAllByupdateDate(Date updateDate);
	
	// List<STOCK> findAllBypurschaseDatetimeBetween(
	    		//Date purschaseDatetimeStart,
	    		//Date purschaseDatetimeEnd
	    		//);
	
	
	 
	 
	
	
	

}
