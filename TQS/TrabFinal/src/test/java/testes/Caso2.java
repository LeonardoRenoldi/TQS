package testes;

import java.util.concurrent.TimeUnit;

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

public class Caso2 {

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
	public void test2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nossaslojas.americanas.com.br/?chave=o2o_hm_00_0_0_nossaslojas");
		WebElement barraDePesquisa = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div/div/div/div[1]/input"));
		barraDePesquisa.click();
		barraDePesquisa.sendKeys("91430220");
		barraDePesquisa.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement resultadoPesquisa = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[1]/span"));
		String resultado = resultadoPesquisa.getText();
	    System.out.println(resultado);
	}

}
