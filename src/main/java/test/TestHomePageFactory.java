package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageFactory extends BaseTestCase {
    String website = "http://dojo.nearsoft.com";

    @Test
    public void test_Home_Page_Search(){
        factoryDojoHomePage = goToWebsite(website);
        Assert.assertTrue(factoryDojoHomePage.isInterviewLinkPresent());

        factoryDojoHomePage.searchInDojoHomePage("John Sonmez");
    }

    @Test
    public void test_Links_From_Home_Page(){
        factoryDojoHomePage = goToWebsite(website);

        factoryDojoHomePage.goToInterviews();
        Assert.assertEquals(factoryDojoHomePage.getInterviewsTitle(),"Interviews");
        factoryDojoHomePage.goToPreviousPage();

        factoryDojoHomePage.goToUpcoming();
        Assert.assertEquals(factoryDojoHomePage.getUpcomingTitle(), "Upcoming Interviews");
    }
}