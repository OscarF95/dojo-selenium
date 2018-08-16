package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInterviewsPageFactory extends BaseTestCase {
    @Test
    public void test_Interviews_Page_elements(){
        factoryInterviewsPage = goToInterviewsPage("http://dojo.nearsoft.com/interviews/");

        Assert.assertTrue(factoryInterviewsPage.isInterviewsTitlePresent());

        factoryInterviewsPage.goToOlderInterviews();

        Assert.assertTrue(factoryInterviewsPage.isInterviewsTitlePresent());

    }

}
