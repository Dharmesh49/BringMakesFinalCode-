package org.websparrow.repository;


import org.springframework.data.repository.CrudRepository;
import org.websparrow.controller.CategoryController;
import org.websparrow.entity.QuantityType;



public interface QuantityTypeRepository extends CrudRepository<QuantityType, Integer> {

}
