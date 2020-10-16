package com.example.demo.service;

import java.util.List;

import com.example.demo.model.PropertyModel;
import com.example.demo.model.SheetModel;

/**
 * 
 * @author Vinita
 *
 */
public interface PropertyService {
	
	/**
	 * 
	 * @param mod
	 */
	public void postExcelData(SheetModel mod) throws Exception;
	
	/**
	 * 
	 * @return
	 */
	public List<PropertyModel> getAll();
}
