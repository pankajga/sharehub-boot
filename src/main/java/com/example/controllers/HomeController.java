/**
 * 
 */
package com.example.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.ShareHub;
import com.example.services.HomeService;

/**
 * @author panka
 *
 */
@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	static {
		System.out.println("***************************************in controller***************************************");
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/getMutualFunds")
	public ArrayList<ShareHub> getMutualFunds(){
		
		return homeService.getMutualFunds();
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String Test() {
		
		return "success";
	}

}
