import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInterviewsPage extends BaseTestCase {
    @Test
    public void test_Interviews_Page_elements(){
        factoryDojoHomePage = goToHomePage();

        factoryInterviewsPage = factoryDojoHomePage.goToInterviews();

        Assert.assertTrue(factoryInterviewsPage.isInterviewsTitlePresent());

        factoryInterviewsPage.goToOlderInterviews();

        Assert.assertTrue(factoryInterviewsPage.isInterviewsTitlePresent());

    }

}
