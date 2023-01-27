package AutomationExercise.automationTestExercises;

import AutomationExercise.utilities.BrowserUtils;
import AutomationExercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_07_VerifyTestCasesPage extends BaseTest{
    @Test
public void verifyNavigateToTestCasesPage(){
        pages.getHomePage().clickTestCases();
        BrowserUtils.navigateBackAndForwardToDismissAds();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Automation Practice Website for UI Testing - Test Cases");

    }
}
