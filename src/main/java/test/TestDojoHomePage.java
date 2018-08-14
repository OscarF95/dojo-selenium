package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DojoHomePage;
import pages.ResultsPage;

public class TestDojoHomePage extends DojoTest{


    DojoHomePage objDojoHomePage;
    ResultsPage objResultsPage;

    @Test(priority = 0)
    public void test_Home_Page_Search(){

        objDojoHomePage = new DojoHomePage(driver);

        String loquesea = objDojoHomePage.getInterviewLinkText();
        Assert.assertTrue(loquesea.toLowerCase().contains("watch an interview!"));
        objDojoHomePage.searchInDojoHomePage("John Sonmez", "searchsubmit");

        objResultsPage = new ResultsPage(driver);

        Assert.assertTrue(objResultsPage.getSearchText().toLowerCase().contains("john sonmez"));
    }
}