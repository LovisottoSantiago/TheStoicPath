package com.stoicpath.TheStoicPath.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    //Define the four mappings, Post, Get, Put and Delete
    @PostMapping("/product")
    public ResponseEntity<String> createProduct(){
        return ResponseEntity.status(HttpStatus.CREATED).body("Product created");
    }
    
    @GetMapping("/product")
        public ResponseEntity<String> getProduct(){
            return ResponseEntity.status(HttpStatus.OK).body("Got product");
    }
    
    @PutMapping("/product")
        public ResponseEntity<String> updateProduct(){
            return ResponseEntity.status(HttpStatus.OK).body("Product updated");
    }
    
    @DeleteMapping("/product")
        public ResponseEntity<String> deleteProduct(){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Product deleted");
    }
    
}
