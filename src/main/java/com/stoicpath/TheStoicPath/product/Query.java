package com.stoicpath.TheStoicPath.product;

import org.springframework.http.ResponseEntity;

public interface Query <I, O>{
    //Metodo
    ResponseEntity<O> execute (I input);
    
}
