package AutomationExercise.utilities;

import AutomationExercise.pages.*;

public class Pages {
    private HomePage homePage;
    private LoginPage loginPage;
    private SignUpPage signUpPage;
    private ProductsPage productsPage;
    private AccountCreatedPage accountCreatedPage;
    private DeleteAccountPage deleteAccountPage;
    private ContactUsPage contactUsPage;


    public Pages() {

        this.homePage = new HomePage();
        this.loginPage = new LoginPage();
        this.signUpPage = new SignUpPage();
        this.productsPage = new ProductsPage();
        this.accountCreatedPage = new AccountCreatedPage();
        this.deleteAccountPage = new DeleteAccountPage();
        this.contactUsPage = new ContactUsPage();
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public SignUpPage getSignUpPage() {
        return signUpPage;
    }

    public ProductsPage getProductsPage() {
        return productsPage;
    }

    public AccountCreatedPage getAccountCreatedPage() {
        return accountCreatedPage;
    }

    public DeleteAccountPage getDeleteAccountPage() {
        return deleteAccountPage;
    }

    public ContactUsPage getContactUsPage() {
        return contactUsPage;
    }



}

