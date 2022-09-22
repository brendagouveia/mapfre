package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Variaveis;

import java.util.List;

public class Tela02 extends Variaveis {

    public Tela02 (WebDriver navegador){
        super(navegador);
    }

    public Tela02 Fipe(List<Variaveis> listateste) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        Fipe = listateste.get(0).getFipe();
        AnoModelo = listateste.get(0).getAnoModelo();
        AnoFabric = listateste.get(0).getAnoFabric();
        Zero = listateste.get(0).getZero();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formVeiculo:fipeMolicar")));
        Thread.sleep(1000);
        //vai colocar o fipe
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).click();
        Thread.sleep(2000);
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).sendKeys(Fipe);
        Thread.sleep(2000);
        navegador.findElement(By.id("formVeiculo:fipeMolicar")).sendKeys(Keys.TAB);
        Thread.sleep(2000);

        // vai colocar o ano de fabricação
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formVeiculo:anoDeFabricacao")));
        Thread.sleep(2000);
        navegador.findElement(By.id("formVeiculo:anoDeFabricacao")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formVeiculo:anoDeFabricacao")).sendKeys(AnoFabric);
        Thread.sleep(1000);
        navegador.findElement(By.id("formVeiculo:anoDeFabricacao")).sendKeys(Keys.TAB);
        Thread.sleep(1000);

        // vai colocar o ano modelo
        navegador.findElement(By.id("formVeiculo:modelo")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formVeiculo:modelo")).sendKeys(AnoModelo);
        Thread.sleep(1000);
        navegador.findElement(By.id("formVeiculo:modelo")).sendKeys(Keys.TAB);
        Thread.sleep(1000);

        // zero
        if (Zero.contains("S")) {
            navegador.findElement(By.id("uniform-formVeiculo:zeroKm:0")).click();
            Thread.sleep(1000);
            //data de saida
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formVeiculo:dataSaida")));
            Thread.sleep(1000);
            navegador.findElement(By.id("formVeiculo:dataSaida")).click();
            Thread.sleep(1000);
            navegador.findElement(By.id("formVeiculo:dataSaida")).sendKeys("30/10/2020");
            Thread.sleep(1000);
            navegador.findElement(By.id("formVeiculo:dataSaida")).sendKeys(Keys.TAB);
            Thread.sleep(1000);
        }
        if (Zero.contains("N")) {
            navegador.findElement(By.id("uniform-formVeiculo:zeroKm:1")).click();
            Thread.sleep(1000);
        }

        return this;
    }

    public Tela02 Utilizacao(List<Variaveis> listateste) throws InterruptedException {
        Utilizacao = listateste.get(0).getUtilizacao();
        Fatajust = listateste.get(0).getFatajust();

        //utilização
        if (Utilizacao.contains("NaoUtilizTrab")) {
            navegador.findElement(By.xpath("//option[@title='Particular']")).click();
            Thread.sleep(3000);
        }
        //if comercial
        //navegador.findElement(By.xpath("(//option[@title='Visitar Clientes/Fornecedores']")).click();
        //Thread.sleep(1000);
        //if taxi
        //navegador.findElement(By.xpath("//option[@title='Taxi']")).click();
        //Thread.sleep(1000);

        // fator de ajuste
        navegador.findElement(By.id("formVeiculo:fatorAjuste")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formVeiculo:fatorAjuste")).clear();
        Thread.sleep(2000);
        navegador.findElement(By.id("formVeiculo:fatorAjuste")).sendKeys(Fatajust);
        Thread.sleep(1000);
        navegador.findElement(By.id("formVeiculo:fatorAjuste")).sendKeys(Keys.TAB);
        Thread.sleep(1000);


        return this;
    }

    public Corpo_mapfreonline clicaravancar2() throws InterruptedException {

        //clicar no botao pra proxima tela
        navegador.findElement(By.id("formVeiculo:btoProximo")).click();
        Thread.sleep(1000);


        return new Corpo_mapfreonline(navegador);
    }



}
