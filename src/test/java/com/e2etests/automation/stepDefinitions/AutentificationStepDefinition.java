package com.e2etests.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.e2etests.automation.util.SetUp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutentificationStepDefinition {
	
	public WebDriver driver;
	
	public AutentificationStepDefinition() {
		driver = SetUp.driver;
	}
	
	

	
	
	@Given("^J ouvre l application OrangeHrm$")
	public void jOuvreLApplicationOrangeHrm() throws Throwable {
	  
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		Thread.sleep(2000);
	}

	@When("^Je saisie le login$")
	public void jeSaisieLeLogin() throws Throwable {
	    
	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
	  
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
	    
	}

	@Then("^Je verifie le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
	    
	}


}
