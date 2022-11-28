package pages;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisaSapopema {

	static WebDriver driver;
	
	
	public PesquisaSapopema(WebDriver driver) {
		PesquisaSapopema.driver = driver;	
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("chromedriver", "\"C:\\Users\\Tecnico - TI\\Desktop\\chromedriver.exe\"");
	}
	
	public void acessarPagina() {
		driver.get("https://nossaslojas.americanas.com.br/?chave=o2o_hm_00_0_0_nossaslojas");
		driver.manage().window().maximize();
		
	}
	
	public void pesquisarNaBarra() throws AWTException {
		Robot robot = new Robot();
		WebElement PesquisaSapopema = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div/div/div/div[1]/input"));
		PesquisaSapopema.click();
		PesquisaSapopema.sendKeys("Sapopema ");
		PesquisaSapopema.sendKeys(Keys.ENTER);
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			}
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	public void capturarResultado() {
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		WebElement resultadoSapopema = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[2]/span"));
		String resutaldoSapopema = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[2]/span")).getText();
		System.out.println(resutaldoSapopema);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
