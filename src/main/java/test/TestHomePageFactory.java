package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageFactory extends BaseTestCase {
    @Test
    public void test_Home_Page_Search(){

        factoryDojoHomePage = goToWebsite("http://dojo.nearsoft.com");
        Assert.assertTrue(factoryDojoHomePage.isInterviewLinkPresent());

        factoryDojoHomePage.searchInDojoHomePage("John Sonmez");
    }

}
