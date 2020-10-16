package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PropertyModel;
import com.example.demo.model.SheetModel;
import com.example.demo.service.PropertyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PropertyController {

	@Autowired
	PropertyService propertyService;

	@PostMapping("/properties")
	public ResponseEntity<List<PropertyModel>> postExcelData(@RequestBody SheetModel mode) throws Exception{
		propertyService.postExcelData(mode);
		return new ResponseEntity<List<PropertyModel>>(propertyService.getAll(), HttpStatus.OK);
		
	}
	
}
