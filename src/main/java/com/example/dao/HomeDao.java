/**
 * 
 */
package com.example.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.bean.ShareHub;

/**
 * @author panka
 *
 */
@Repository
public class HomeDao {
	
	ArrayList<ShareHub> list = new ArrayList<>();
	
	public ArrayList<ShareHub> getMutualFunds(){
		
		list = prepareFunds();
		return list;
	}
	
	
	//method to create list of funds
	public ArrayList<ShareHub> prepareFunds(){
		
		ArrayList<ShareHub> fundList = new ArrayList<>();
		
		ShareHub sh1 = new ShareHub();
		sh1.setMfName("ICICI Prudential Technology");
		sh1.setMfTagLine("Direct Plan Growth");
		sh1.setMfReturns("43.08");
		sh1.setMfYearPlan("3");
		sh1.setMfEquity("Equity Sectoral / Thematic");
		sh1.setMfLogo("https://logosandtypes.com/wp-content/uploads/2020/07/icici-bank.svg");
		
		ShareHub sh2 = new ShareHub();
		sh2.setMfName("Parag Parikh Flexi Cap Fund");
		sh2.setMfTagLine("Direct Growth");
		sh2.setMfReturns("30.4");
		sh2.setMfYearPlan("4");
		sh2.setMfEquity("Equity Flexi Cap");
		sh2.setMfLogo("https://static.paytmmoney.com/amc-logo/PPFAS.png");
		
		ShareHub sh3 = new ShareHub();
		sh3.setMfName("Axis Small Cap Direct Fund");
		sh3.setMfTagLine("Direct Growth");
		sh3.setMfReturns("33.09");
		sh3.setMfYearPlan("2");
		sh3.setMfEquity("Equity Small Cap");
		sh3.setMfLogo("https://www.nfcw.com/wp-content/uploads/2020/06/axis-bank-logo.jpg");
		
		ShareHub sh4 = new ShareHub();
		sh4.setMfName("Tata Digital India Fund");
		sh4.setMfTagLine("Direct Growth");
		sh4.setMfReturns("41.39");
		sh4.setMfYearPlan("3");
		sh4.setMfEquity("Equity Sectoral / Thematic");
		sh4.setMfLogo("https://static.paytmmoney.com/amc-logo/TATMF.png");
		
		ShareHub sh5 = new ShareHub();
		sh5.setMfName("SBI Small Cap Fund");
		sh5.setMfTagLine("Direct Growth");
		sh5.setMfReturns("28.97");
		sh5.setMfYearPlan("3");
		sh5.setMfEquity("Equity Small Cap");
		sh5.setMfLogo("https://static.paytmmoney.com/amc-logo/SBIMF.png");
		
		ShareHub sh6 = new ShareHub();
		sh6.setMfName("Mirae Asset Tax Saver Fund");
		sh6.setMfTagLine("Direct Growth");
		sh6.setMfReturns("24.34");
		sh6.setMfYearPlan("1");
		sh6.setMfEquity("Equity ELSS");
		sh6.setMfLogo("https://static.paytmmoney.com/amc-logo/MIRAS.png");
		
		ShareHub sh7 = new ShareHub();
		sh7.setMfName("Aditya Birla Sun Life Digital India");
		sh7.setMfTagLine("Direct Direct Growth");
		sh7.setMfReturns("41.92");
		sh7.setMfYearPlan("2");
		sh7.setMfEquity("Equity Sectoral / Thematic");
		sh7.setMfLogo("https://assets-netstorage.groww.in/mf-assets/logos/birla_groww.png");
		
		ShareHub sh8 = new ShareHub();
		sh8.setMfName("Kotak Bluechip Fund");
		sh8.setMfTagLine("Direct Growth");
		sh8.setMfReturns("19.84");
		sh8.setMfYearPlan("5");
		sh8.setMfEquity("Equity Large Cap");
		sh8.setMfLogo("https://static.paytmmoney.com/amc-logo/KOTMH.png");
		
		fundList.add(sh1);
		fundList.add(sh2);
		fundList.add(sh3);
		fundList.add(sh4);
		fundList.add(sh5);
		fundList.add(sh6);
		fundList.add(sh7);
		fundList.add(sh8);
		
		return fundList;
		
	}

}
