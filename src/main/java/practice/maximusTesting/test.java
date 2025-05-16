package practice.maximusTesting;

import java.time.Duration;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class test {
	private static final Logger logger =Logger.getLogger(test.class.getName());
	public static void main(String[] args) throws InterruptedException {
		
		ConsoleHandler log = new ConsoleHandler();
		log.setLevel(Level.ALL);
		
		logger.addHandler(log);
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		logger.info("opening portal!!!");
		
		driver.get("place your website link here ");
		
		logger.info("Entering creadentials!!");
		driver.findElement(By.id("txtEmail")).sendKeys("your username");
		driver.findElement(By.id("txtPaswd")).sendKeys("your password");
		
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(10000);
		
		logger.info("login successfull");
		
		WebElement ptBtn =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Patients\"]")));
		ptBtn.click();
		
		logger.info("Entering patients Deatils!!");
		
		driver.findElement(By.className("add-patient")).click();
		driver.findElement(By.id("firstname")).sendKeys("wiliamson");
		driver.findElement(By.id("lastname")).sendKeys("kane");
		driver.findElement(By.xpath("//input[@formcontrolname=\"dob\"]")).sendKeys("04/02/2003");
		driver.findElement(By.xpath("//ng-select[@formcontrolname=\"gender\"]")).click();
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"ng-option ng-star-inserted\"]")));
		element.click();
		
		
		driver.findElement(By.xpath("//input[@formcontrolname=\"mailaddress\"]")).sendKeys("225 Falcon Dr");
		driver.findElement(By.xpath("//input[@formcontrolname=\"mailzip\"]")).sendKeys("40353-9792");
		
		logger.info("Saving Patients Details");
		
		driver.findElement(By.xpath("//*[text()=\"Save\"]")).click();
		
		
		logger.info("Details are successfully Saved");
		
		///claims
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Patients\"]")).click();
		
		
		
		WebElement claims2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"acc-no cursor-pointer ng-star-inserted\"]")));
		claims2.click();
		
		logger.info("Creating Claims!!!");
		
		WebElement createclaim=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\" Create Claim \"]")));
		createclaim.click();
		
		//click on search icon
		
		
		
		
		
		WebElement locSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"input-group-prepend\"]")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		locSearch.click();
		
		Actions act = new Actions(driver);
		
		
		//double click on loction
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\"Skilled Nursing\"]")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		act.doubleClick(ele).perform();

		
		//enterPOs
		
		WebElement pos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"ng-value-container\"]")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pos.click();
		
		WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\" 03-School\"]")));
		ele1.click();
		
		
		//submit the claim 
		WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Create\"]")));
		submit.click();
		
		logger.info("succefully created claim!!");
		
		
		logger.info("Adding claims details");

		
		
		driver.findElement(By.xpath("//*[@id=\"accessNo\"]")).sendKeys("555555");
		

		WebElement Dos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"searchedProcCode_0\"]")));
		Dos.sendKeys("21800");
		Dos.sendKeys(Keys.ENTER);
		WebElement insu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"ff-svg ng-tns-c254-16\"]")));
		insu.click();
		
		WebElement tratement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@class,\"compactText ng-tns-c254\")]")));
		act.doubleClick(tratement).perform();
		

		
		WebElement daignosis = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ICD1_0\"]/div/div/div[3]/input")));
		
		daignosis.sendKeys("i10");
		daignosis.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement amount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Amount_0\"]")));
		amount.sendKeys("3000");
		amount.sendKeys(Keys.ENTER);
		
		WebElement taxo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"taxmonomy0\"]")));
		taxo.click();
		WebElement taxOpt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"taxmonomy0\"]/option")));
		taxOpt.click();
		logger.info("details added succesfully");
	
		driver.findElement(By.xpath("//*[text()=\" Submit \"]")).click();
		
	
		
		logger.info("details submitted ");
		
		
		/// add insurance 
		///
		///
		
		logger.info("Adding insurance");
		
		WebElement addInsurance = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\" Add Insurance \"]")));
		addInsurance.click();
		
		
//		Select object = new Select(driver.findElement(By.xpath("//*[@id=\"Financial_Class_ID\"]/div/div/div[2]/input")));
//		object.selectByVisibleText("Auto Accident");

		WebElement se = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"ff-svg ng-tns-c136-19 ng-star-inserted\"]")));
		se.click();
		
		WebElement insurance = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\"BLUE CROSS COMPLETE - JVHL\"]")));
		Thread.sleep(2000);

		act.doubleClick(insurance).perform();
		

		
		
		
		
		WebElement policy =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Policy_Number\"]")));
		Thread.sleep(2000);
		policy.sendKeys("205418");
		
		
		
		WebElement dates =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("EFD")));
		dates.sendKeys("04/03/2025");
		
		WebElement rel =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Subscriber_Relationship\"]/div/div")));
		rel.click();
		
		WebElement rel1 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/span[text()=\"Brother\"]")));
		rel1.click();
		
		WebElement sear =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"position-absolute ff-icon ng-tns-c136-19\"]")));
		sear.click();
		
		WebElement friend = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\"Party, Liable M\"]")));

		act.doubleClick(friend).perform();
		
		Thread.sleep(2000);
		
		logger.info("Saving insurance details");
		
		driver.findElement(By.xpath("//*[text()=\" Save and Close \"]")).click();
		

		//download excel
		
		logger.info("downloading excel data");
		WebElement  back = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[2]/a[@class=\"nav-link segment-link active\"]")));
		Thread.sleep(2000);
		act.doubleClick(back).perform();

		
		
		driver.findElement(By.xpath("//input[@id=\"patSelect0\"]")).click();
		
		driver.findElement(By.xpath("//*[text()=\"Export\"]")).click();
		
		logger.info("Successfully Downloaded");
		
		System.out.println("succesfully completed");
	}
}
