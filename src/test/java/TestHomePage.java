import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BaseTestCase {
    @Test
    public void test_Home_Page_Search(){
        dojoHomePage = goToHomePage();
        Assert.assertTrue(dojoHomePage.isInterviewLinkPresent());

        dojoHomePage.searchInDojoHomePage("John Sonmez");

        resultsPage = dojoHomePage.goToResults();
        resultsPage.getSearchText();
        resultsPage.goToResultDetail();

        Assert.assertEquals(resultsPage.getResultDetailTitle().toLowerCase(), "john sonmez");
    }

    @Test
    public void test_Links_From_Home_Page(){
        dojoHomePage = goToHomePage();

        // Checking Interviews link
        interviewsPage = dojoHomePage.goToInterviews();
        Assert.assertEquals(interviewsPage.getInterviewsTitle().toLowerCase(),"interviews");
        interviewsPage.goToPreviousPage();

        // Checking Upcoming Interviews link
        upcomingPage = dojoHomePage.goToUpcoming();
        Assert.assertEquals(upcomingPage.getUpcomingTitle().toLowerCase(), "upcoming interviews");
        upcomingPage.goToPreviousPage();

        // Checking Travel Edition link
        travelEditionPage = dojoHomePage.goToTravelEdition();
        Assert.assertEquals(travelEditionPage.getTravelEditionTitle().toLowerCase(), "dojolive! travel edition");
        travelEditionPage.goToPreviousPage();

        // Checking About link
        aboutPage = dojoHomePage.goToAbout();
        Assert.assertEquals(aboutPage.getAboutTitle().toLowerCase(), "about dojolive!");
        aboutPage.goToPreviousPage();

        // Checking Suggest a Guest! link
        suggestAGuestPage = dojoHomePage.goToSuggestAGuest();
        Assert.assertEquals(suggestAGuestPage.getSuggestAGuestTitle().toLowerCase(), "nominate a guest!");
        suggestAGuestPage.goToPreviousPage();

        // Checking Contact link
        contactPage = dojoHomePage.goToContact();
        Assert.assertEquals(contactPage.getContactTitle().toLowerCase(), "contact");
        contactPage.goToPreviousPage();
        Assert.assertTrue(dojoHomePage.isInterviewLinkPresent());
    }
}