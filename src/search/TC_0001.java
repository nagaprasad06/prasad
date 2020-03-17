package search;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_0001 {
	@Test
	public void upload()throws InterruptedException, InvalidFormatException, IOException {
	//public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Practice\\Task\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.in/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	File file =    new File("D:\\Selenium_Practice\\Task\\Task.xlsx");
	FileInputStream inputStream = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
	XSSFSheet sheet = workbook.getSheetAt(0);
	String s= sheet.getRow(0).getCell(0).getStringCellValue();
	String s1= sheet.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
	
	Thread.sleep(5000);
	
	/*List <WebElement>e= driver.findElements(By.cssSelector("cite"));
	System.out.println(e.size());*/
	
	
	//for(int i=0;i<e.size();i++)
	//{
	Thread.sleep(5000);
		
	/*WebElement x=	driver.findElement(By.xpath("(//cite)[1]"));
		
		
		//String t= x.getText();
		
		
		//System.out.println(x);*/
	//List<WebElement> links = driver.findElements(By.tagName("h3'"));
	
		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/div/cite")).click();
	String x=null;

	int a=1;
	//System.out.println(links.get(0));
	
while(a<2) {
	
	
	List<WebElement> e=driver.findElements(By.xpath("(//*[@class='TbwUpd NJjxre'])"));
	
	for(int i=0;i<e.size();i++)
	{
		
		e=driver.findElements(By.xpath("(//*[@class='TbwUpd NJjxre'])"));
		
		System.out.println(e.get(i).getText());
		
	x=e.get(i).getText();
		
		if(x.contentEquals(s1))
		{
			e.get(i).click();
			
			Thread.sleep(2000);
			break;
			
			
		}
		
	}
	
	try {
		Boolean e3=driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed();
		
		if(e3.TRUE)
		{
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			
			
		}
		

		
		
	}
	catch(Exception e3)
	{
		boolean status= !x.equals(s1);
		if(status)
		{
			System.out.println("no search");
			
			
		}

	
		break;
		
		
	}
	
		
		
	}
	
	
	}
	

	}


