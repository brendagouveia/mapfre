package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Variaveis;

import java.security.Key;
import java.util.List;

public class Tela04 extends Variaveis {

    public Tela04 (WebDriver navegador){super(navegador);}

    public Tela04 Coberturas(List<Variaveis> listateste) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        Produto = listateste.get(0).getProduto();
        Franquia = listateste.get(0).getFranquia();
        Dmo = listateste.get(0).getDmo();
        Dm = listateste.get(0).getDm();
        Dc = listateste.get(0).getDc();
        Vidros = listateste.get(0).getVidros();
        CarroReserva = listateste.get(0).getCarroReserva();
        AppMorte = listateste.get(0).getAppMorte();
        AppInval = listateste.get(0).getAppInval();

        //VERIFICANDO QUE TIPO DE PRODUTO É AUTOMAIS OU GOLD
        WebElement elementoproduto = navegador.findElement(By.id("formResumo:produtoResumo"));
        Produto = elementoproduto.getText();
        Thread.sleep(100);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Coberturas básicas']")));
        Thread.sleep(1000);
        //Franquia
        if (Franquia.contains("NORMAL")) {
            //**Normal
            navegador.findElement(By.xpath("//option[@title='Normal']")).click();
            Thread.sleep(1000);
            //**Reduzida
        }else if (Franquia.contains("REDUZIDA")) {
            navegador.findElement(By.xpath("//option[@title='Reduzida']")).click();
            Thread.sleep(1000);
        }

        //**DMO
        navegador.findElement(By.id("uniform-formCoberturas:coberturasList_0:1:idOpcao_0")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasList_0:1:idOpcao_0")).sendKeys(Keys.HOME);
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasList_0:1:idOpcao_0")).sendKeys(Dmo);
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasList_0:1:idOpcao_0")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        //**DM
        navegador.findElement(By.id("uniform-formCoberturas:coberturasList_0:2:idOpcao_0")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasList_0:2:idOpcao_0")).sendKeys(Keys.HOME);
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasList_0:2:idOpcao_0")).sendKeys(Dm);
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasList_0:2:idOpcao_0")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        //**DC
        navegador.findElement(By.id("uniform-formCoberturas:coberturasList_0:3:idOpcao_0")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasList_0:3:idOpcao_0")).sendKeys(Keys.HOME);
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasList_0:3:idOpcao_0")).sendKeys(Dc);
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasList_0:3:idOpcao_0")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        //**VIDROS
        if (Produto.contains("Gold")) {
            //**GOLD COMPLETO
            if (Vidros.contains("BASICO")) {
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
                //GOLD NAO
            }else if (Vidros.contains("COMPLETO")){
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }else {
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }
        }else {
            //AUTOMAIS
            if (Vidros.contains("BASICO")) {
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
                //GOLD NAO
            }else if (Vidros.contains("COMPLETO")){
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }else {
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:0:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }
        }

        //**CARRO RESERVA
        if(Produto.contains("Gold")) {
            if (CarroReserva.contains("7")) {
                //**GOLD
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys("15");
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }else if(CarroReserva.contains("15")){
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys("15");
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }else if (CarroReserva.contains("30")){
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys("30");
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }else {
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys("N");
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }
        }else {
            //AUTOMAIS
            if (CarroReserva.contains("7")) {
                //**GOLD
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys("7");
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }else if(CarroReserva.contains("15")){
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys("15");
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }else if (CarroReserva.contains("30")){
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys("30");
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }else {
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).click();
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.HOME);
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys("N");
                Thread.sleep(1000);
                navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:2:idOpcaoFavoritaAdicional_0")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
            }
        }


        //**APP
        navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:4:idOpcaoTextAdicional_0")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:4:idOpcaoTextAdicional_0")).clear();
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:4:idOpcaoTextAdicional_0")).sendKeys(AppMorte + ",00");
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:4:idOpcaoTextAdicional_0")).sendKeys(Keys.TAB);
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:5:idOpcaoTextAdicional_0")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:5:idOpcaoTextAdicional_0")).clear();
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:5:idOpcaoTextAdicional_0")).sendKeys(AppInval + "00");
        Thread.sleep(1000);
        navegador.findElement(By.id("formCoberturas:coberturasAdicionais_0:5:idOpcaoTextAdicional_0")).sendKeys(Keys.TAB);
        Thread.sleep(1000);

        return this;
    }

    public Corpo_mapfreonline clicaravancar4() throws InterruptedException {

        //clicar no botao pra proxima tela
        navegador.findElement(By.id("formCoberturas:save")).click();
        Thread.sleep(1000);

        return new Corpo_mapfreonline(navegador);
    }





}
