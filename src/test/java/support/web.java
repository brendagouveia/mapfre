package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web  extends Variaveis{
    public web(WebDriver navegador) {
        super(navegador);
    }

    public static WebDriver abrir_mapfre() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "/home/" + nomepc + "/drivers/chromedriver");
    //WebDriver navegador = new ChromeDriver(chromeOptions);
    WebDriver navegador = new ChromeDriver();
    navegador.get("https://www2.mapfreconnect.com.br/novo-portal-web-1804/cotacao/index.xhtml?cod_cotacao=54552004378388736&cod_corretor=4378&Acao=recalcular");
    Thread.sleep(1000);
    navegador.manage().window().maximize();
    // navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    return navegador;
}
}
