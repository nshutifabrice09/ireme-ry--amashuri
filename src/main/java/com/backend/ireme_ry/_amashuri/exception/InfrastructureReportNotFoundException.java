package com.backend.ireme_ry._amashuri.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class InfrastructureReportNotFoundException extends RuntimeException{

    public InfrastructureReportNotFoundException (Long id){
        super ("Couldn't find an Infrastructure Report with id "+id);
    }
}
