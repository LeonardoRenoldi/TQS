package testes;

import static org.junit.Assert.*;

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

public class Caso3 {

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
	public void test4() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nossaslojas.americanas.com.br/?chave=o2o_hm_00_0_0_nossaslojas");
		WebElement Pesquisa4 = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div/div/div/div[1]/input"));
		Pesquisa4.click();
		Pesquisa4.sendKeys("Sapopema ");
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Pesquisa4.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement resultadoPesquisa = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[2]/span"));
		String resultado = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[2]/span")).getText();
		assertTrue(resultado.contains("Não encontramos nenhuma loja próxima a você. Tente um novo endereço"));
	    System.out.println(resultado);
	}

}
