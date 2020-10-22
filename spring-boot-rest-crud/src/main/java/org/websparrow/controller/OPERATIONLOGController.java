package org.websparrow.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.entity.OPERATIONLOG;
import org.websparrow.entity.STOCK;
import org.websparrow.repository.OPERATIONLOGRepository;


@RestController
@RequestMapping("/OperationLog")
public class OPERATIONLOGController {
	@Autowired
	OPERATIONLOGRepository OperationRepository;

	// insert new category into database
	@PostMapping("/add")
	public OPERATIONLOG addOperationlog(@RequestBody OPERATIONLOG operationlog) {

		return OperationRepository.save(operationlog);
	}

	// fetch all category list from database
	@GetMapping("/all")
	public Iterable<OPERATIONLOG> allOPERATIONLOG() {

		return OperationRepository.findAll();
	}

	// fetch specific category by their ID
	@GetMapping("/{operationId}")
	public Optional<OPERATIONLOG> operationById(@PathVariable("operationId") int operationId) {

		return OperationRepository.findById(operationId);
	}

	// update existing category
	@PutMapping("/update")
	public OPERATIONLOG updateOperation(@RequestBody OPERATIONLOG operationlog) {

		return OperationRepository.save(operationlog);
	}

	// delete category from database
	@DeleteMapping("/{operationId}")
	public void deleteOperation(@PathVariable("operationId") int operationId) {

		OperationRepository.deleteById(operationId);
	}

	 @Test
	    public void whenFindByCreatDate_thenOPERATIONLOGs1And2Returned() throws ParseException {
	        List<OPERATIONLOG> result = OperationRepository.findAllBycreateDate(
	          new SimpleDateFormat("DD-MM-YYYY ").parse(""));
	 
	        assertEquals(2, result.size());
	        assertTrue(result.stream()
	          .map(OPERATIONLOG::getOperationId)
	          .allMatch(id -> Arrays.asList(1, 2).contains(id)));
	    }
	 
	    private void assertTrue(boolean allMatch) {
		// TODO Auto-generated method stub
		
	}

		private void assertEquals(int i, int size) {
		// TODO Auto-generated method stub
		
	}
	
		
		@Test
	    public void whenFindByupdateDate_thenOPERATIONLOGs1And2Returned() throws ParseException {
	        List<OPERATIONLOG> result = OperationRepository.findAllByupdateDate(
	          new SimpleDateFormat("DD-MM-YYYY ").parse(""));
	 
	        assertEquals(2, result.size());
	        assertTrue(result.stream()
	          .map(OPERATIONLOG::getOperationId)
	          .allMatch(id -> Arrays.asList(1, 2).contains(id)));
	    }
	 
	  
	}
