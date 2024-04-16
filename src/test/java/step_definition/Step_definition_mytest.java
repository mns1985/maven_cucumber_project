package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pom.web_elements;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Step_definition_mytest {
    public static Logger cucumber_logs = LogManager.getFormatterLogger(Step_definition_mytest.class.getName());

    WebDriver driver_obj1;
    web_elements web_elements_obj;
    public static FileInputStream fileInputStream_obj;
    public static Properties properties_obj;

    public void data_initialization() throws IOException {
        web_elements_obj = new web_elements();
        fileInputStream_obj = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\testdata_cucumber.properties");
        properties_obj = new Properties();
        properties_obj.load(fileInputStream_obj);
    }

    @Given("open chrome browser in private window")
    public void open_chrome_browser_in_private_window() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver_obj1 = new ChromeDriver(chromeOptions);
        cucumber_logs.info("Chrome browser opened successfully in private window.");
    }

    @Given("Open soch Website")
    public void open_soch_website() {
        driver_obj1.get("https://www.soch.com/intl/");
        driver_obj1.manage().window().maximize();
        driver_obj1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cucumber_logs.info("soch website opened in chrome browser");
    }

    @When("Click on chat button")
    public void click_on_chat_button() {
        if (web_elements_obj == null) {
            try {
                data_initialization();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver_obj1.findElement(By.xpath(web_elements_obj.chat_link)).click();
        cucumber_logs.info("chat window opened");
    }

    @Then("Enter chat information")
    public void enter_chat_information() {
        driver_obj1.findElement(By.xpath(web_elements_obj.chat_name)).sendKeys(properties_obj.getProperty("chat_name"));
        driver_obj1.findElement(By.xpath(web_elements_obj.chat_email)).sendKeys(properties_obj.getProperty("emailid"));
        driver_obj1.findElement(By.xpath(web_elements_obj.chat_contact)).sendKeys(properties_obj.getProperty("phonenumber"));
        driver_obj1.findElement(By.xpath(web_elements_obj.chat_message)).sendKeys(properties_obj.getProperty("chatmessage"));
        cucumber_logs.info("Entered all valid data");
    }

    @When("I Click on submit button")
    public void i_click_on_submit_button() {
        driver_obj1.findElement(By.xpath(web_elements_obj.Register)).click();
        cucumber_logs.info("registered successfully");
    }

    @Then("chat window closed")
    public void chat_window_closed() {
        driver_obj1.close();
        cucumber_logs.info("window closed");
    }

    @Given("Open soch Website1")
    public void open_soch_website1() {
        driver_obj1.get("https://www.soch.com/intl/");
        driver_obj1.manage().window().maximize();
        driver_obj1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("Click on Topwear link in menubar")
    public void click_on_topwear_link_in_menubar() {
        if (web_elements_obj == null) {
            try {
                data_initialization();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver_obj1.findElement(By.xpath(web_elements_obj.topwear_link)).click();
    }

    @Then("I Click on kurtas link")
    public void i_click_on_kurtas_link() {
        driver_obj1.findElement(By.xpath(web_elements_obj.kurtas)).click();
    }

    @When("i click on sort by recomended tab")
    public void i_click_on_sort_by_recomended_tab() {
        driver_obj1.findElement(By.xpath(web_elements_obj.sortby)).click();
    }

    @Then("I select high-low link from drop-down")
    public void i_select_high_low_link_from_drop_down() {
        driver_obj1.findElement(By.xpath(web_elements_obj.high_low)).click();
    }
    @Then("chat window closed1")
    public void chat_window_closed1() {
        driver_obj1.close();
        cucumber_logs.info("window closed");
    }

    @Given("Open soch Website2")
    public void open_soch_website2() {
        driver_obj1.get("https://www.soch.com/intl/");
        driver_obj1.manage().window().maximize();
        driver_obj1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("Click on sarees link in menubar")
    public void click_on_sarees_link_in_menubar() {
        if (web_elements_obj == null) {
            try {
                data_initialization();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver_obj1.findElement(By.xpath(web_elements_obj.sarees)).click();
    }

    @Then("I Click on partywear sarees  link")
    public void i_click_on_partywear_sarees_link() {
        driver_obj1.findElement(By.xpath(web_elements_obj.partywearsarees)).click();

    }

    @Then("select a product")
    public void select_a_product() {
        driver_obj1.findElement(By.xpath(web_elements_obj.product_select)).click();
    }

    @Then("click on wishlist")
    public void click_on_wishlist() {
        driver_obj1.findElement(By.xpath(web_elements_obj.wishlist_symbol)).click();
    }
    @Then("chat window closed2")
    public void chat_window_closed2() {
        driver_obj1.close();
        cucumber_logs.info("window closed");
    }
    @When("I Enter chat information name as {string} and email as {string} and phonenumber as {string} and message as {string}")
    public void i_enter_chat_information_name_as_and_email_as_and_phonenumber_as_and_message_as(String name, String emailid, String phonenumber, String message) {
        driver_obj1.findElement(By.xpath("//input[@id=\"kapture_chat_name\"]")).sendKeys(name);
        driver_obj1.findElement(By.xpath("//input[@id=\"kapture_chat_email\"]")).sendKeys(emailid);
        driver_obj1.findElement(By.xpath("//input[@id=\"kapture_chat_contact\"]")).sendKeys(phonenumber);
        driver_obj1.findElement(By.xpath("//textarea[@id=\"kapture_chat_message\"]")).sendKeys(message);
        cucumber_logs.info("Entered all valid data");


    }
    @Then("chat window closed3")
    public void chat_window_closed3() {
        driver_obj1.close();
        cucumber_logs.info("window closed");
    }


}

