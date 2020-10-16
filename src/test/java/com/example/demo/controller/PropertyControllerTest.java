package com.example.demo.controller;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.CaseStudyApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CaseStudyApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PropertyControllerTest {
private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;

	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	}

	@Test
	public void verifyPostExcelData() throws Exception {
		
		String str = "{\"Sheet1\":"+
			"["+
			"{\"Loan_No\":1, \"Borrower_Name\":\"Vinita\", \"DOB\":33118, \"Prop_Address\":\"jaipur\", \"Cost\":500}, "
			+ "{\"Loan_No\":2,\"Borrower_Name\":\"Nishika\",\"DOB\":32789,\"Prop_Address\":\"Virginia\",\"Cost\":800}"+
			"]"+		
		"}";
		
		mockMvc.perform(MockMvcRequestBuilders.post("/properties/")
		        .contentType(MediaType.APPLICATION_JSON)
		        .content(str)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(2)))
				.andDo(print());
	}
	

}
