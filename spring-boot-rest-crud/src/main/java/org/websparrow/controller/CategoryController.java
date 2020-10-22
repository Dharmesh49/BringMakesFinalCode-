package org.websparrow.controller;
import java.io.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;
import org.websparrow.entity.Category;
import org.websparrow.repository.CategoryRepository;

import javax.validation.constraints.*;


@RestController
@RequestMapping("/categorys")

public class CategoryController {
	
	@Autowired
	CategoryRepository categoryrepository;

	// insert new category into database
	@PostMapping("/add")
	public Category addCategory(@RequestBody Category category) {

		return categoryrepository.save(category);
	}

	

	// fetch all category list from database
	@GetMapping("/all")
	public Iterable<Category> allCategory() {

		return categoryrepository.findAll();
	}

	// fetch specific category by their ID
	@GetMapping("/{categoryId}")
	public Optional<Category> categoryById(@PathVariable("categoryId") int categoryId) {

		return categoryrepository.findById(categoryId);
	}

	// update existing category
	@PutMapping("/update")
	public Category updateCategory(@RequestBody Category category) {

		return categoryrepository.save(category);
	}

	// delete category from database
	@DeleteMapping("/{categoryId}")
	public void deleteCategory(@PathVariable("categoryId") int categoryId) {

		categoryrepository.deleteById(categoryId);
	}


	@PostMapping("/{categoryId}/upload")
	public void uploadImage(@PathVariable("categoryId") int categoryId, @NotNull @RequestParam("imageFile") MultipartFile imageFile) throws IOException {
		Optional<Category> categoryOptional = this.categoryrepository.findById(categoryId);

		if (categoryOptional.isPresent()) {
			Category category = categoryOptional.get();
			category.setImagesBox(imageFile.getBytes());
			categoryrepository.save(category);
		}
	}

	@GetMapping("/{categoryId}/image")
	public ResponseEntity<Resource> getImage(@PathVariable("categoryId") int categoryId) {
		Optional<Category> categoryOptional = this.categoryrepository.findById(categoryId);

		if (categoryOptional.isPresent()) {
			Category category = categoryOptional.get();
			return getImageResponseEntity(category.getImagesBox());
		}
		return ResponseEntity.of(Optional.empty());
	}

	private ResponseEntity<Resource> getImageResponseEntity(byte[] imagesBox) {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_TYPE, "image/jpeg");
		headers.add(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"imageFile\"");
		ByteArrayResource resource = new ByteArrayResource(imagesBox);
		return new ResponseEntity<>(resource, headers, HttpStatus.OK);
	}

}
