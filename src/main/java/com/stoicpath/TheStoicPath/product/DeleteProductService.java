package com.stoicpath.TheStoicPath.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DeleteProductService implements Command<Void, String> {
    //return ResponseEntity.status(HttpStatus.CREATED).body("Product created");

    @Override
    public ResponseEntity<String> execute(Void input) {
       return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Product deleted");
    }
    
    
    
}
