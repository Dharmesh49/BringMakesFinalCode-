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
import org.websparrow.entity.PACKPRODUCT;
import org.websparrow.repository.CategoryRepository;
import org.websparrow.repository.PACKPRODUCTRepository;


@RestController
@RequestMapping("/packproduct")

public class PACKPRODUCTController {
	@Autowired
	PACKPRODUCTRepository PackProductRepository;

	// insert new category into database
	@PostMapping("/add")
	public PACKPRODUCT addPACKPRODUCT(@RequestBody PACKPRODUCT packproduct) {

		return PackProductRepository.save(packproduct);
	}

	// fetch all category list from database
	@GetMapping("/all")
	public Iterable<PACKPRODUCT> allPACKPRODUCT() {

		return PackProductRepository.findAll();
	}

	// fetch specific category by their ID
	@GetMapping("/{PackproductId}")
	public Optional<PACKPRODUCT> packproductById(@PathVariable("PackproductId") int PackproductId) {

		return PackProductRepository.findById(PackproductId);
	}

	// update existing category
	@PutMapping("/update")
	public PACKPRODUCT updatePACKPRODCUT(@RequestBody PACKPRODUCT packproduct) {

		return PackProductRepository.save(packproduct);
	}

	// delete category from database
	@DeleteMapping("/{PackproductId}")
	public void deleteCategory(@PathVariable("PackproductId") int PackproductId) {

		PackProductRepository.deleteById(PackproductId);
	}


}
