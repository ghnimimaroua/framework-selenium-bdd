
package com.e2etests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.pageObjects.AccueilPage;
import com.e2etests.automation.util.SetUp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccueilStepDefinition {
	
	public WebDriver driver;
	private AccueilPage accueilPage = new AccueilPage();
	public AccueilStepDefinition() {
		driver = SetUp.driver;
	}
	
	@When("^je clique sur le module Recruitment$")
	public void jeCliqueSurLeModuleRecruitment() throws Throwable {
		PageFactory.initElements(driver, AccueilPage.class);
		accueilPage.goToRecruitment();
			}

	@Then("^je verifie la page Recruitment \\\"([^\\\"]*)\\\"$")
	public void jeVerifieLaPageRecruitment(String sub_menu_rec) throws Throwable {
		String pageRecruitment = AccueilPage.pageRecruitment.getText();
		Assert.assertTrue(pageRecruitment.contains(sub_menu_rec));
	}

	@When("^je clique sur le module PIM$.")
	public void jeCliqueSurLeModulePIM() throws Throwable {
	  accueilPage.goToPIM();  
	}

	@Then("^je verifie la page PIM \\\"([^\\\"]*)\\\"$")
	public void jeVerifieLaPagePIM(String sub_menu_PIM) throws Throwable {
		String pagePIM = AccueilPage.pagePIM.getText();
		Assert.assertTrue(pagePIM.contains(sub_menu_PIM)); 
	}



}
