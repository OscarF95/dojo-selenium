import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInterviewsPage extends BaseTestCase {
    @Test
    public void test_Interviews_Page_elements(){
        dojoHomePage = goToHomePage();

        interviewsPage = dojoHomePage.goToInterviews();

        Assert.assertTrue(interviewsPage.isInterviewsTitlePresent());

        interviewsPage.goToOlderInterviews();

        Assert.assertTrue(interviewsPage.isInterviewsTitlePresent());

    }

}
