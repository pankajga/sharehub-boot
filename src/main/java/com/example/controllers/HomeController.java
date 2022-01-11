/**
 * 
 */
package com.example.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.ShareHub;
import com.example.dao.DataDao;
import com.example.services.HomeService;

/**
 * @author panka
 *
 */
@CrossOrigin("*")
@RequestMapping("/share")
@RestController
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@Autowired
	DataDao dataDao;
	
	static {
		System.out.println("***************************************in controller***************************************");
	}
	
	
	@GetMapping(value = "/getMutualFunds")
	@RolesAllowed({"sharehub-user", "sharehub-admin"})
	public ArrayList<ShareHub> getMutualFunds(){
		
		  ArrayList<ShareHub> mutualFundList = new ArrayList<>();
		  
		  Iterable<ShareHub> itr = dataDao.findAll(); 
		  itr.forEach(mutualFundList::add);
		  
		  return mutualFundList;
		 
		
		//return homeService.getMutualFunds();
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String Test() {
		
		return "success";
	}

}
