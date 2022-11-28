package pages;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidarMensagem {
	
	static WebDriver driver;
	
	public ValidarMensagem(WebDriver driver) {
		ValidarMensagem.driver = driver;	
	}

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
	
	
	public void acessarSite() {
		driver.get("https://www.cea.com.br/");
		driver.manage().window().maximize();
	}
	
	public void buscarElemento() {
		WebElement barraDeBusca = driver.findElement(By.xpath("//*[@id=\"downshift-0-input\"]"));
		barraDeBusca.click();
		barraDeBusca.sendKeys("arroz123");
		barraDeBusca.sendKeys(Keys.ENTER);
	}

	@Test
	public void teste1() {
	
	}

}
