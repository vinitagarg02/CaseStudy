package com.example.demo.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.entity.Property;
import com.example.demo.model.PropertyModel;
import com.example.demo.repository.PropertyRepo;




@RunWith(SpringJUnit4ClassRunner.class)
public class PropertyServiceTest {
	@Mock
	private PropertyRepo propertyRepo;
	
	@InjectMocks
	private PropertyServiceImpl propertyService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Test
	public void testGetAll() {

		List<Property> propertyList = new ArrayList<>();
		LocalDate date=LocalDate.parse("03-09-1985");
		propertyList.add(new Property(1L,1L,"vinita", date,"jaipur",500L,"yes"));
		when(propertyRepo.findAll()).thenReturn(propertyList);
		
		List<PropertyModel> result = propertyService.getAll();
		assertEquals(1, result.size());
			assertEquals(Long.valueOf(1l),result.get(0).id);
			assertEquals(Long.valueOf(1L),result.get(0).loanNo);
			assertEquals("vinita",result.get(0).borrower);
			assertEquals("date not equal" ,"03-09-1985",result.get(0).dob);
			assertEquals("jaipur",result.get(0).address);
			assertEquals(Long.valueOf(500l),result.get(0).cost);
			assertEquals("yes",result.get(0).floodRisk);
		
	}

}
