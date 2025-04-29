package com.backend.ireme_ry._amashuri.exception;

public class InfrastructureReportNotFoundException extends RuntimeException{

    public InfrastructureReportNotFoundException (Long id){
        super ("Couldn't find an Infrastructure Report with id "+id);
    }
}
