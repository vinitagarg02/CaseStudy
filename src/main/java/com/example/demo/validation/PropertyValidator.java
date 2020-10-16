package com.example.demo.validation;

import com.example.demo.model.PropertyModel;


public class PropertyValidator {
	public static void validatePropertyId(PropertyModel propertymodel) throws Exception{
		if (propertymodel.id !=null){
			throw new Exception("Id is not null");
		}
		
	}
}
