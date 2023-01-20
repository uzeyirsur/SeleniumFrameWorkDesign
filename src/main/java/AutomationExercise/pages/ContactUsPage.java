package AutomationExercise.pages;

import AutomationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    @FindBy(css = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchMessage;

    @FindBy(css = "input[placeholder='Name']")
    WebElement nameBox;

    @FindBy(css = "input[placeholder='Email']")
    WebElement emailBox;

    @FindBy(css = "input[placeholder='Subject']")
    WebElement subjectBox;

    @FindBy(id = "message")
    WebElement messageBox;

    @FindBy(css = "input[value='Submit']")
    WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successSubmitMessage;

    @FindBy(css = ".btn.btn-success")
    WebElement homeButton;

    public String getGetInTouchMessage() {
        return getInTouchMessage.getText();
    }
    public void setNameBox(String name){
        nameBox.sendKeys(name);
    }

    public void setEmailBox(String emailAdress) {
       emailBox.sendKeys(emailAdress);
    }

    public void setSubjectBox(String subject) {
        subjectBox.sendKeys(subject);
    }
    public void setMessageBox(String message){
        messageBox.sendKeys(message);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
    public void clickOkPopUp(){
        Driver.getDriver().switchTo().alert().accept();
    }
    public String getSuccessSubmitMessage(){
        return successSubmitMessage.getText();
    }
    public void clickHomeButton(){
        homeButton.click();
    }
}
