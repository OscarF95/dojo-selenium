package test;

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

        Assert.assertTrue(objDojoHomePage.getInterviewLinkText().toLowerCase().contains("watch an interview!"));
        objDojoHomePage.searchInDojoHomePage("John Sonmez", "searchsubmit");

        objResultsPage = new ResultsPage(driver);

        Assert.assertTrue(objResultsPage.getSearchText().toLowerCase().contains("john sonmez"));
    }
}