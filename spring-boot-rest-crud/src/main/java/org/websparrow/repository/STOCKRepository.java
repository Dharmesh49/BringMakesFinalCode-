package org.websparrow.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.websparrow.entity.STOCK;

public interface STOCKRepository extends CrudRepository<STOCK, Integer>{
	

	
 
 //   @Query("select a from STOCK a where a.creationDateTime <= :creationDateTime")
  //  List<STOCK> findAllWithCreationDateTimeBefore(
   //   @Param("creationDateTime") Date creationDateTime);

}
