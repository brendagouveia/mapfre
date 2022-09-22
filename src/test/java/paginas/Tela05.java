package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import support.Variaveis;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Tela05 extends Variaveis {

    public Tela05 (WebDriver navegador) {super(navegador);}

    public Tela05 Comissao() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()[normalize-space()='Descontos / Campanha']]")));
        Thread.sleep(1000);
        //Comissao
        navegador.findElement(By.id("frmCalculoCotacao:codigoComissao")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("frmCalculoCotacao:codigoComissao")).clear();
        Thread.sleep(1000);
        navegador.findElement(By.id("frmCalculoCotacao:codigoComissao")).sendKeys("25");
        Thread.sleep(1000);
        navegador.findElement(By.id("frmCalculoCotacao:codigoComissao")).sendKeys(Keys.TAB);
        Thread.sleep(1000);

        //Calcular
        navegador.findElement(By.id("frmCalculoCotacao:btnCalcular")).click();
        Thread.sleep(1000);



        return this;
    }

    public Tela05 Imprimir() throws InterruptedException, IOException, FindFailed {
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("success")));
        //navegador.findElement(By.className("success"));
        //imprimir
        navegador.findElement(By.id("frmCalculoCotacao:linkImprimir")).click();
        Thread.sleep(3000);
        //Escolhendo a franquia para imprimir
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formImprimir")));
        //Reduzida
        navegador.findElement(By.xpath("(//input[@class='chkImpressaoModal'])[1]")).click();
        Thread.sleep(2000);
        //Normal
        //navegador.findElement(By.xpath("(//input[@class='chkImpressaoModal'])[2]")).click();
        //Thread.sleep(2000);
        //Imprimir
        navegador.findElement(By.id("formImprimir:btImprimirModal")).click();
        Thread.sleep(3000);

        ArrayList<String> tabs2 = new ArrayList<String>(navegador.getWindowHandles());

        navegador.switchTo().window(tabs2.get(1));

        //comando imprimir sikulis
        Pattern salvarpdf = new Pattern("/home/" + nomepc + "/mapfre_online/images/imprimirpdf.png");
        Pattern SalvarBotao = new Pattern("/home/" + nomepc + "/mapfre_online/images/SalvarBotao.png");
        Pattern salvarbtnlinux = new Pattern("/home/" + nomepc + "/mapfre_online/images/salvarbtnlinux.png");
        Screen screen = new Screen();
        screen.click(salvarpdf);
        Thread.sleep(4000);
        screen.click(SalvarBotao);
        Thread.sleep(3000);
        screen.type("/home/" + nomepc + "/mapfre_online/pdf/1");
        int y = 0;
        while (y <= 3) {
            screen.type(Key.BACKSPACE);
            y++;
        }
        Thread.sleep(3000);
        screen.click(salvarbtnlinux);
        screen.click(salvarbtnlinux);
        Thread.sleep(3000);

        //cria arquivo txt para validar se o arquivo calculou
        FileWriter arq = new FileWriter("/home/" + nomepc + "/mapfre_online/txt/1");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.flush();
        gravarArq.close();

        //fechar janela de impresso e selecionar janela de calculo
        navegador.close();
        navegador.switchTo().window(tabs2.get(0));
        System.out.println("fechei a pagina de impressao vou tentar encontrar elemento comissao");




        return this;
    }



}
