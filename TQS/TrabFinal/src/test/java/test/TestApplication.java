package test;

import java.awt.AWTException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LocalizarLoja;
import pages.PesquisaMarte;
import pages.PesquisaSapopema;
import pages.ValidarMensagem;

public class TestApplication {
	
	static WebDriver driver;
	static ValidarMensagem validarMensagem;
	static PesquisaMarte pesquisaMarte;
	static LocalizarLoja localizarLoja;
	static PesquisaSapopema pesquisaSapopema;
	
	
   @BeforeClass
   public static void setUpBeforeClass() throws Exception {
	   System.setProperty("chromedriver", "\"C:\\Users\\Técnico - TI\\Desktop\\chromedriver.exe\"");
	   driver = new ChromeDriver();
		validarMensagem = new ValidarMensagem(driver);
		pesquisaSapopema = new PesquisaSapopema(driver);
		pesquisaMarte = new PesquisaMarte(driver);
		localizarLoja = new LocalizarLoja(driver);
   }
   
	
	@Test
	public void test() throws AWTException {
		
	}

}
