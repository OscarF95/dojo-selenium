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
        dojoHomePage.goToPreviousPage();

        // Checking About link
        dojoHomePage.goToAbout();
        Assert.assertEquals(dojoHomePage.getAboutTitle().toLowerCase(), "about dojolive!");
        dojoHomePage.goToPreviousPage();

        // Checking Suggest a Guest! link
        dojoHomePage.goToSuggestAGuest();
        Assert.assertEquals(dojoHomePage.getSuggestAGuestTitle().toLowerCase(), "nominate a guest!");
        dojoHomePage.goToPreviousPage();

        // Checking Contact link
        dojoHomePage.goToContact();
        Assert.assertEquals(dojoHomePage.getContactTitle().toLowerCase(), "contact");
        dojoHomePage.goToPreviousPage();
        Assert.assertTrue(dojoHomePage.isInterviewLinkPresent());
    }
}