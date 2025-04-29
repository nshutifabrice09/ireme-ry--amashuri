package com.backend.ireme_ry._amashuri.exception;

public class SchoolNotFoundException extends RuntimeException{

    public SchoolNotFoundException (Long id){
        super ("Couldn't find a School with id "+id);
    }
}
