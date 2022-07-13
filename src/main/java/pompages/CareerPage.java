package pompages;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;


public class CareerPage {
    WebDriver driver;
    ExcelData excel;


    private By careerbtn=By.xpath("//li[@class='nav-item' and text()='Careers']");
    private By viewOpeningbtn=By.xpath("//div[text()='View All Openings']");
    private By technEngg =By.xpath("//span[text()='Technology and Engineering']/parent::div");
    private By assoJavaDev=By.xpath("//div[text()='Associate Java Developer']");
    private By firstname=By.xpath("//input[@id='First_Name']");
    private By lastname=By.xpath("//input[@id='Last_Name']");
    private By experience=By.xpath("//input[@id='Total_Experience']");
    private By xpaths=By.xpath("//div[contains(@class,'1A58w')]");
    private By apply=By.xpath("//div[text()='Apply for this job']");
    private By next=By.xpath("//button[text()='NEXT']");
    private By emailId= By.xpath("//input[@id='Email']");
    private By mobNo=By.xpath("//input[@id='Mobile']");
    private By location=By.xpath("//input[@id='City']");
    private By companyName=By.xpath("//input[@id='Current_Employer']");
    private By jobTitle=By.xpath("//input[@id='Current_Job_Title']");
    private By ctc=By.xpath("//input[@name='Current_Salary']");
    private By noticePeriod=By.xpath("//select[@id='Notice_Period']");
    private By lastday=By.xpath("//input[@id='Last_Working_Day']");
    private By resumeUp=By.xpath("//label[@for='Resume']");

//    private By submitBtn= By.xpath("//button[contains(@class,'JobApplication') and text()='SUBMIT']");


    public CareerPage(WebDriver driver)
    {
        this.driver= driver;
        excel=new ExcelData();
    }
    public void clickViewOpening()
    {

        driver.findElement(viewOpeningbtn).click();
    }
    public void clickONTechnEngg()
    {
        driver.findElement(technEngg).click();
    }
    public void clickONCareer()
    {
        driver.findElement(careerbtn).click();
    }
    public void applyForJob()
    {
        driver.findElement(apply).click();
    }
    public void enterFirstname()
    {
        driver.findElement(firstname).sendKeys(excel.getCellDataString(1,0));
    }
    public void enterLastname()
    {
        driver.findElement(lastname).sendKeys(excel.getCellDataString(1,1));
    }
    public void enterExperience()
    {
        driver.findElement(experience).sendKeys(String.valueOf(excel.getCellDataNumber(1,2)));
    }
    public void clickOnAssoJavaDev()
    {
        driver.findElement(assoJavaDev).click();
    }
    public void clickOnNextbtn()
    {
        driver.findElement(next).click();
    }
    public void enterEmailId()
    {
        driver.findElement(emailId).sendKeys(excel.getCellDataString(1,3));
    }
    public void enterMobNO()
    {
        driver.findElement(mobNo).sendKeys(String.valueOf(excel.getCellDataString(1,4)));
    }
    public void enterLocation()
    {
        driver.findElement(location).sendKeys(excel.getCellDataString(1,5));
    }
    public void enterCompanyName()
    {
        driver.findElement(companyName).sendKeys(excel.getCellDataString(1,6));
    }
    public void enterjobTitle()
    {
        driver.findElement(jobTitle).sendKeys(excel.getCellDataString(1,7));
    }
    public void enterctc()
    {
        driver.findElement(ctc).sendKeys(String.valueOf(excel.getCellDataNumber(1,8)));
    }
    public void enternoticePeriod() {
        driver.findElement(noticePeriod).click();
        WebElement ele=driver.findElement(noticePeriod);
        Select sel=new Select(ele);
        List<WebElement> getAllOptions=sel.getOptions();
        System.out.println(getAllOptions.size());
        int max=getAllOptions.size();

        Random random=new Random();
        int randomNum = random.nextInt(max);
        getAllOptions.get(randomNum).click();

    }
    public void listOfOpenings() {
        List<WebElement> list= driver.findElements(xpaths);
        System.out.println(list.size());
        int maxProducts = list.size();
        // get random number
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        // Select the list item
        list.get(randomProduct).click();
    }
    public void uploadResume()
    {
        driver.findElement(resumeUp).click();
    }
    public void lastWorkingDay() {
        driver.findElement(lastday).sendKeys(String.valueOf(excel.getCellDataString(1,9)));
    }
    public void clickOnUpload() throws IOException, InterruptedException {
        driver.findElement(resumeUp).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\AutoIt\\ResumeUpload.exe");
    }
//    public void clickOnSubmitBtn()
//    {
//        driver.findElement(submitBtn).click();
//    }
    public void takescreenshot() throws IOException {
    File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenShotFile, new File(".//Screenshot/.screen.png"));

}



    }

