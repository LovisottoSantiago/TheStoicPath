package com.stoicpath.TheStoicPath.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    private final CreateProductService createProductService;
    
    private final GetProductService getProductService;
    
    private final UpdateProductService updateProductService;
        
    private final DeleteProductService deleteProductService;
    
    
    public ProductController(CreateProductService createProductService
                                         , GetProductService getProductService
                                         , UpdateProductService updateProductService
                                         , DeleteProductService deleteProductService) {
        this.createProductService = createProductService;
        this.getProductService = getProductService;
        this.updateProductService = updateProductService;
        this.deleteProductService = deleteProductService;
    }
    
    

    //Define the four mappings, Post, Get, Put and Delete
    @PostMapping("/product")
    public ResponseEntity<String> createProduct(){
        return createProductService.execute(null);
    }
    
    @GetMapping("/product")
        public ResponseEntity<String> getProduct(){
            return getProductService.execute(null);
    }
    
    @PutMapping("/product")
        public ResponseEntity<String> updateProduct(){
            return updateProductService.execute(null);
    }
    
    @DeleteMapping("/product")
        public ResponseEntity<String> deleteProduct(){
            return deleteProductService.execute(null);
    }
    
}
