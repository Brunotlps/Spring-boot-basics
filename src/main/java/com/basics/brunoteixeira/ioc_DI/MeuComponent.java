package com.basics.brunoteixeira.ioc_DI;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MeuComponent {
    


    public String chamarComponent() {
        return "Sucessfull";
    }



}
