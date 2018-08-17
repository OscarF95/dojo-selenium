package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageFactory extends BaseTestCase {
    String home = "http://dojo.nearsoft.com";

    @Test
    public void test_Home_Page_Search(){
        factoryDojoHomePage = goToWebsite(home);
        Assert.assertTrue(factoryDojoHomePage.isInterviewLinkPresent());

        factoryDojoHomePage.searchInDojoHomePage("John Sonmez");

        factoryResultsPage = factoryDojoHomePage.goToResults();
        factoryResultsPage.goToResultDetail();

        Assert.assertEquals(factoryResultsPage.getResultDetailTitle().toLowerCase(), "john sonmez");
    }

    @Test
    public void test_Links_From_Home_Page(){
        factoryDojoHomePage = goToWebsite(home);

        // Checking Interviews link
        factoryDojoHomePage.goToInterviews();
        Assert.assertEquals(factoryDojoHomePage.getInterviewsTitle().toLowerCase(),"interviews");
        factoryDojoHomePage.goToPreviousPage();

        // Checking Upcoming Interviews link
        factoryDojoHomePage.goToUpcoming();
        Assert.assertEquals(factoryDojoHomePage.getUpcomingTitle().toLowerCase(), "upcoming interviews");
        factoryDojoHomePage.goToPreviousPage();

        // Checking Travel Edition link
        factoryDojoHomePage.goToTravelEdition();
        Assert.assertEquals(factoryDojoHomePage.getTravelEditionTitle().toLowerCase(), "dojolive! travel edition");
        factoryDojoHomePage.goToPreviousPage();

        // Checking About link
        factoryDojoHomePage.goToAbout();
        Assert.assertEquals(factoryDojoHomePage.getAboutTitle().toLowerCase(), "about dojolive!");
        factoryDojoHomePage.goToPreviousPage();

        // Checking Suggest a Guest! link
        factoryDojoHomePage.goToSuggestAGuest();
        Assert.assertEquals(factoryDojoHomePage.getSuggestAGuestTitle().toLowerCase(), "nominate a guest!");
        factoryDojoHomePage.goToPreviousPage();

        // Checking Contact link
        factoryDojoHomePage.goToContact();
        Assert.assertEquals(factoryDojoHomePage.getContactTitle().toLowerCase(), "contact");
        factoryDojoHomePage.goToPreviousPage();
        Assert.assertTrue(factoryDojoHomePage.isInterviewLinkPresent());
    }
}