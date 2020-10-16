package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SheetModel {


    @JsonProperty("Sheet1")
    public List<PropertyModel> props;

}
