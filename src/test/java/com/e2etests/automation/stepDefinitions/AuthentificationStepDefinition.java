package com.e2etests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.pageObjects.AuthentificationPage;
import com.e2etests.automation.util.CommonMethods;
import com.e2etests.automation.util.SetUp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition extends CommonMethods {

	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
    private CommonMethods commonMethods = new CommonMethods();
	
	public AuthentificationStepDefinition() {
		driver = SetUp.driver;
	}
	
	@Given("^J ouvre l application OrangeHrm$")
	public void jOuvreLApplicationOrangeHrm() throws Throwable {
		logger.info("J ouvre l application OrangeHrm");
		commonMethods.readFromConfigFile("url");
	}

	@When("^Je saisie le login$")
	public void jeSaisieLeLogin() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		logger.info("Je saisie le login");
		authentificationPage.fillUserName();
	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
		logger.info("Je saisie le mot de passe");
		authentificationPage.fillPassword();
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		logger.info("Je clique sur le bouton login");
		authentificationPage.clickLoginButton();
	}

	@Then("^Je verifie le compte admin$")
	public void jeVerifieLeCompteAdmin() throws Throwable {
		String text = AuthentificationPage.msg_welcome.getText();
		Assert.assertTrue(text.contains("Welcome"));
	}

}