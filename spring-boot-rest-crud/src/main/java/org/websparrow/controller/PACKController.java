package org.websparrow.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.entity.Category;
import org.websparrow.entity.PACK;
import org.websparrow.repository.CategoryRepository;
import org.websparrow.repository.PACKRepository;



@RestController
@RequestMapping("/PACK")
public class PACKController {
	@Autowired
	PACKRepository packRepository;

	// insert new category into database
	@PostMapping("/add")
	public PACK addPACK(@RequestBody PACK Pack) {

		return packRepository.save(Pack);
	}

	// fetch all category list from database
	@GetMapping("/all")
	public Iterable<PACK> allPACK() {

		return packRepository.findAll();
	}

	// fetch specific category by their ID
	@GetMapping("/{PackId}")
	public Optional<PACK> PackIdById(@PathVariable("PackId") int PackId) {

		return packRepository.findById(PackId);
	}

	// update existing category
	@PutMapping("/update")
	public PACK updatePACK(@RequestBody PACK Pack) {

		return packRepository.save(Pack);
	}

	// delete category from database
	@DeleteMapping("/{PackId}")
	public void deleteCategory(@PathVariable("PackId") int PackId) {

		packRepository.deleteById(PackId);
	}

	
	

}
