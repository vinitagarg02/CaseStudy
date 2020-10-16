package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Property;
import com.example.demo.model.PropertyModel;
import com.example.demo.model.SheetModel;
import com.example.demo.repository.PropertyRepo;
import com.example.demo.validation.PropertyValidator;

@Service("propertyService")
public class PropertyServiceImpl implements PropertyService {
	@Autowired
	PropertyRepo propertyRepo;

	/**
	 * 
	 */
	public void postExcelData(SheetModel mod) throws Exception {
		// Property p=new Property();
		for (PropertyModel pm : mod.props) {
			PropertyValidator.validatePropertyId(pm);
			Property p = modelToEntity(pm);

			propertyRepo.save(p);
		}

	}

	/**
	 * 
	 * @param pm
	 * @return
	 */
	private Property modelToEntity(PropertyModel pm) {
		Property p = new Property();
		p.setLoanNo(pm.loanNo);
		p.setBorrower(pm.borrower);
		p.setDob(pm.dob);
		p.setAddress(pm.address);
		p.setCost(pm.cost);
		p.setFloodRisk(pm.floodRisk);
		return p;
	}

	/**
	 * 
	 */
	public List<PropertyModel> getAll() {

		List<PropertyModel> lpm = new ArrayList<>();
		List<Property> list = propertyRepo.findAll();
		for (Property p : list) {
			PropertyModel pm = entityToModel(p);
			lpm.add(pm);
		}

		return lpm;
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	private PropertyModel entityToModel(Property p) {
		PropertyModel pm = new PropertyModel();
		pm.id= p.getId();
		pm.loanNo = p.getLoanNo();
		pm.borrower = p.getBorrower();
		pm.dob = p.getDob();
		pm.address = p.getAddress();
		pm.cost = p.getCost();
		pm.floodRisk = p.getFloodRisk();
		return pm;
	}

}
