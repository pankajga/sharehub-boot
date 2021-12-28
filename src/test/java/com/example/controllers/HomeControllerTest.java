/**
 * 
 */
package com.example.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.sharehub.SharehubApplication;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author panka
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HomeController.class)
@AutoConfigureMockMvc
@ContextConfiguration(classes = SharehubApplication.class)
public class HomeControllerTest {

	/**
		* Test method for {@link com.example.controllers.HomeController#getMutualFunds()}.
		*/
	
	@MockBean
	private HomeController homeController;
	
	@Autowired
	  private WebApplicationContext webApplicationContext;
	  private MockMvc mockMvc;

	  @Before
	  public void setUp() {
	    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	  }

		
	  @Test
	  @WithMockUser(roles = "sharehub-user") 
	  public void testGetMutualFundsStatus() throws Exception {
		  mockMvc.perform(MockMvcRequestBuilders.get("/share/getMutualFunds"))
		  .andExpect(MockMvcResultMatchers.status().isOk()); 
	  }
		 
	  
	  @Test
	  public void Test() throws Exception {
		  mockMvc.perform(MockMvcRequestBuilders.get("/share/test")).andExpect(MockMvcResultMatchers.status().isOk());
	  }

}

