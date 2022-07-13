package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.BaseUtilities;
import java.io.IOException;



public class homepageStepdef extends BaseUtilities{

    @Given("user navigate to url")
    public void user_navigate_to_url() {
        startup();
    }

    @When("user click on career button")
    public void user_click_on_career_button() throws InterruptedException {
        Thread.sleep(3000);
        cg.clickONCareer();
    }
    @When("user click on view all openings button")
    public void user_click_on_view_all_openings_button() throws InterruptedException {
        Thread.sleep(3000);
        cg.clickViewOpening();
    }
    @When("user click on Technology and Engineering link")
    public void user_click_on_technology_and_engineering_link() throws InterruptedException {
        Thread.sleep(3000);
       cg.clickONTechnEngg();
    }
    @When("user click on one of the link")
    public void user_click_on_one_of_the_link() throws InterruptedException {
        Thread.sleep(3000);
        cg.listOfOpenings();
    }
    @When("user click on Apply for this job button")
    public void user_click_on_apply_for_this_job_button() throws InterruptedException {
        Thread.sleep(3000);
        cg.applyForJob();
    }
    @When("user enters username, password and Experience and click on next button")
    public void user_enters_username_password_and_experience_and_click_on_next_button() throws InterruptedException {
        Thread.sleep(3000);
       cg.enterFirstname();
        Thread.sleep(3000);
       cg.enterLastname();
        Thread.sleep(3000);
       cg.enterExperience();
        Thread.sleep(3000);
       cg.clickOnNextbtn();

    }
    @When("user enter emailid, mobile no, location and click on next button")
    public void user_enter_emailid_mobile_no_location_and_click_on_next_button() throws InterruptedException {
        Thread.sleep(3000);
       cg.enterEmailId();
        Thread.sleep(3000);
       cg.enterMobNO();
        Thread.sleep(3000);
       cg.enterLocation();
        Thread.sleep(3000);
       cg.clickOnNextbtn();
    }
    @When("user enter company name, jobTitle, ctc, notice period, upload resume and click on submit button")
    public void user_enter_company_name_job_title_ctc_notice_period_upload_resume_and_click_on_submit_button() throws IOException, InterruptedException {
        Thread.sleep(3000);
        cg.enterCompanyName();
        Thread.sleep(3000);
      cg.enterjobTitle();
        Thread.sleep(3000);
      cg.enterctc();
        Thread.sleep(3000);
      cg.enternoticePeriod();
        Thread.sleep(3000);
      cg.lastWorkingDay();
        Thread.sleep(3000);
      cg.clickOnUpload();
        Thread.sleep(3000);

//      cg.clickOnSubmitBtn();
      cg.takescreenshot();

    }


}
