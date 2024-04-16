package Testrunnerfiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/featurefiles/Mytest.feature"},
        glue = "step_definition",
       stepNotifications = true,
        monochrome = true,
        plugin = {"pretty", "html:test-output/target/my_report.html",
                "junit:test-output/target/cucumber_xml_reports.xml",
                "json:test-output/target/cucumber_json_reports.json"},
tags = "@mytest")
        //tags = "@ball and @apple"
public class abcTest {
}
