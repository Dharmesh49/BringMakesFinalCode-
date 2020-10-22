package org.websparrow.controller;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.websparrow.entity.Category;
import org.websparrow.entity.OPERATIONLOG;
import org.websparrow.entity.STOCK;
import org.websparrow.repository.OPERATIONLOGRepository;
import org.websparrow.entity.Product;
import org.websparrow.repository.ProductRepository;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductRepository productrepository;

	// insert new category into database
	@PostMapping("/add")
	public Product addproduct(@RequestBody Product product) {

		return   productrepository.save(product);
	}

	// fetch all category list from database
	@GetMapping("/all")
	public Iterable<Product> allProduct() {

		return productrepository.findAll();
	}

	// fetch specific category by their ID
	@GetMapping("/{operationId}")
	public Optional<Product> ProductById(@PathVariable("ProductId") int ProductId) {

		return productrepository.findById(ProductId);
	}

	// update existing category
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {

		return productrepository.save(product);
	}

	// delete category from database
	@DeleteMapping("/{ProductId}")
	public void  deleteProduct(@PathVariable("ProductId") int ProductId) {

		productrepository.deleteById(ProductId);
	}

	 @Test
	    public void whenFindByCreatDate_thenProducts1And2Returned() throws ParseException {
	        List<Product> result = productrepository.findAllBycreateDate(
	          new SimpleDateFormat("DD-MM-YYYY ").parse(""));
	 
	        assertEquals(2, result.size());
	        assertTrue(result.stream()
	          .map(Product::getProductId)
	          .allMatch(id -> Arrays.asList(1, 2).contains(id)));
	    }
	 
	    private void assertTrue(boolean allMatch) {
		// TODO Auto-generated method stub
		
	}

		private void assertEquals(int i, int size) {
		// TODO Auto-generated method stub
		
	}
	
		
		@Test
	    public void whenFindByupdateDate_thenProducts1And2Returned() throws ParseException {
	        List<Product> result = productrepository.findAllByupdateDate(
	          new SimpleDateFormat("DD-MM-YYYY ").parse(""));
	 
	        assertEquals(2, result.size());
	        assertTrue(result.stream()
	          .map(Product::getProductId)
	          .allMatch(id -> Arrays.asList(1, 2).contains(id)));
	    }
		
		@PostMapping("/{ProductId}/upload")
		public void uploadImage(@PathVariable("ProductId") int ProductId, @NotNull @RequestParam("imageFile") MultipartFile imageFile) throws IOException {
			Optional<Product> productOptional = this.productrepository.findById(ProductId);

			if ( productOptional.isPresent()) {
				Product product =  productOptional.get();
				product.setProductimages(imageFile.getBytes());
				productrepository.save(product);
			}
		}

		@GetMapping("/{ProductId}/image")
		public ResponseEntity<Resource> getImage(@PathVariable("categoryId") int ProductId) {
			Optional<Product> productOptional = this.productrepository.findById(ProductId);

			if (productOptional.isPresent()) {
				Product product = productOptional.get();
				return getImageResponseEntity(product.getProductimages());
			}
			return ResponseEntity.of(Optional.empty());
		}

		private ResponseEntity<Resource> getImageResponseEntity(byte[]  productimages) {
			HttpHeaders headers = new HttpHeaders();
			headers.add(HttpHeaders.CONTENT_TYPE, "image/jpeg");
			headers.add(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"imageFile\"");
			ByteArrayResource resource = new ByteArrayResource( productimages);
			return new ResponseEntity<>(resource, headers, HttpStatus.OK);
		}
		
		// video code uploading system
		
		
		@PostMapping("/{ProductId}/uploadhome")
		public void uploadVideo(@PathVariable("ProductId") int ProductId, @NotNull @RequestParam("fileType") MultipartFile imageFile) throws IOException {
			Optional<Product> productOptional = this.productrepository.findById(ProductId);

			if ( productOptional.isPresent()) {
				Product product =  productOptional.get();
				product.setProductvideo(imageFile.getBytes());
				productrepository.save(product);
			}
		}

		@GetMapping("/{ProductId}/video")
		public ResponseEntity<Resource> getVideo(@PathVariable("ProductId") int ProductId) {
			Optional<Product> productOptional = this.productrepository.findById(ProductId);

			if (productOptional.isPresent()) {
				Product product = productOptional.get();
				return getImageResponseEntity(product.getProductvideo());
			}
			return ResponseEntity.of(Optional.empty());
		}

		private ResponseEntity<Resource> getVideoResponseEntity(byte[]  productvideo) {
			HttpHeaders headers = new HttpHeaders();
			headers.add(HttpHeaders.CONTENT_TYPE, "video/" + "fileType");
			headers.add(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"fileType\"");
			ByteArrayResource resource = new ByteArrayResource( productvideo);
			return new ResponseEntity<>(resource, headers, HttpStatus.OK);
		}
	 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 

}
