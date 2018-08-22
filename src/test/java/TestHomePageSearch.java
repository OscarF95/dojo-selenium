import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageSearch extends BaseTestCase {
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
}