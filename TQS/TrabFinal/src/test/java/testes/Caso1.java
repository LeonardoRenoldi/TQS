package testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caso1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("chromedriver", "\"C:\\Users\\Tecnico - TI\\Desktop\\chromedriver.exe\"");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void teste1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kabum.com.br/");
		WebElement barraDeBusca = driver.findElement(By.id("input-busca"));
		barraDeBusca.click();
		barraDeBusca.sendKeys("arroz123");
		barraDeBusca.sendKeys(Keys.ENTER);
	}

}
