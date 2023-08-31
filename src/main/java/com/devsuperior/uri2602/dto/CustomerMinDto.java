package com.devsuperior.uri2602.dto;

import com.devsuperior.uri2602.projections.CustomerMinProjection;

public class CustomerMinDto {

    private String name;

    public CustomerMinDto(){}

    public CustomerMinDto(String name) {
        this.name = name;
    }

    public CustomerMinDto(CustomerMinProjection projection){
        name = projection.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append(name);
        return st.toString();
    }
}
