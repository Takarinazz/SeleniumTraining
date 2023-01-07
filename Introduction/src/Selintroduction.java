import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// chamando o Browser
		//Chrome - ChromeDriver -> Metodos
		
		System.setProperty("webdriver.chromer.driver","\"C:\\Users\\Rodri\\OneDrive\\Área de Trabalho\\SeleniumTraining\\chromedriver.exe\"" );
		// chromedriver.exe -> chromer browser
		
		//Firefox Launch
		//geckodriver
		
		//webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver","\"C:\\Users\\Rodri\\OneDrive\\Área de Trabalho\\SeleniumTraining\\geckodriver.exe\"" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close(); // driver.quit(); Fecha todas as janelas abertas atravez do Selenium,
		//enquanto o close  fecha especificamente a janela atual de teste 
		
		
	}

}
