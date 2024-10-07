package StepDefinitions;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;   //Yukarıdaki 3 impotrun yerine aşağıdaki yazılabilir

import io.cucumber.java.en.*;  // Burada yıldız hepsi demek , hepsi Eklendi, import oldu

public class _01_LoginSteps {

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("Site açıldı");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {

        System.out.println("Username ve şifre gönderildi");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        System.out.println("Siteye girildiği doğrulandı");
    }
}
