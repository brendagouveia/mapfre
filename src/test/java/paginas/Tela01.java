package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Variaveis;

import java.util.ArrayList;
import java.util.List;

public class Tela01 extends Variaveis {

    public Tela01(WebDriver navegador) {
        super(navegador);
    }

    public Tela01 Duplicar() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formSeguroSegurado:cpfCnpj")));
        Thread.sleep(1000);
        // vai clicar para duplicar
        navegador.findElement(By.id("5")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='item']//a)[1]")));
        Thread.sleep(1000);
        navegador.findElement(By.xpath("(//span[@class='item']//a)[1]")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formSeguroSegurado:cpfCnpj")));
        Thread.sleep(3000);
        // vai fechar a aba de valor de seguro
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"formSeguroSegurado:cpfCnpj\"]")));
        ArrayList<String> tabs2 = new ArrayList<String>(navegador.getWindowHandles());
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"formSeguroSegurado:btoProximo\"]")));
        Thread.sleep(1000);
        navegador.switchTo().window(tabs2.get(0));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='item']//a)[1]")));
        navegador.close();
        navegador.switchTo().window(tabs2.get(1));

        return this;
    }

    public Tela01 Segurado(List<Variaveis> listateste) throws InterruptedException {

        System.out.println("entrei no dados seguro");
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        Cpf = listateste.get(0).getCpf();
        NomeSegur = listateste.get(0).getNomeSegur();
        DataSegur = listateste.get(0).getDataSegur();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formSeguroSegurado:cpfCnpj")));
        Thread.sleep(1000);
        //vai colocar o cpf
        navegador.findElement(By.id("formSeguroSegurado:cpfCnpj")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:cpfCnpj")).clear();
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:cpfCnpj")).sendKeys(Cpf);
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:cpfCnpj")).sendKeys(Keys.TAB);
        Thread.sleep(1000);

        //vai colocar o nome do segurado
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formSeguroSegurado:nomeProponente")));
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:nomeProponente")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:nomeProponente")).clear();
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:nomeProponente")).sendKeys(NomeSegur);
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:nomeProponente")).sendKeys(Keys.TAB);
        Thread.sleep(1000);

        //vai colocar a data de nascimento
        navegador.findElement(By.id("formSeguroSegurado:dataNascimento")).click();
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:dataNascimento")).clear();
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:dataNascimento")).sendKeys(DataSegur);
        Thread.sleep(1000);
        navegador.findElement(By.id("formSeguroSegurado:dataNascimento")).sendKeys(Keys.TAB);
        Thread.sleep(1000);

        //celular
        navegador.findElement(By.id("formSeguroSegurado:dddCelular")).clear();
        navegador.findElement(By.id("formSeguroSegurado:dddCelular")).sendKeys("99");
        navegador.findElement(By.id("formSeguroSegurado:telefoneCelular")).clear();
        navegador.findElement(By.id("formSeguroSegurado:telefoneCelular")).sendKeys("99889-8899");
        navegador.findElement(By.id("formSeguroSegurado:dddResidencial")).clear();
        navegador.findElement(By.id("formSeguroSegurado:dddResidencial")).sendKeys("41");
        navegador.findElement(By.id("formSeguroSegurado:telefoneResidencial")).clear();
        navegador.findElement(By.id("formSeguroSegurado:telefoneResidencial")).sendKeys("3289-5566");
        navegador.findElement(By.id("formSeguroSegurado:telefoneResidencial")).sendKeys(Keys.TAB);
        Thread.sleep(1000);

        return this;

    }

    public Tela01 TipoSeguro(List<Variaveis> listateste) throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        TipoSeguro = listateste.get(0).getTipoSeguro();
        Bonus = listateste.get(0).getBonus();
        Sinistro = listateste.get(0).getSinistro();
        Congenere = listateste.get(0).getCongenere();

        //vai colocar tipo de seguro novo ou renova
        if (TipoSeguro.contains("NOVO")) {
            navegador.findElement(By.xpath("(//option[@selected='selected'])[1]")).click();
            Thread.sleep(1000);
        }
        if (TipoSeguro.contains("RENOVA")) {
            navegador.findElement(By.xpath("//option[@title='Ren. Congênere']")).click();
            Thread.sleep(1000);
        }

        //sinistro
        if (TipoSeguro.contains("RENOVA") && Sinistro.contains("SinistroNao")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-formSeguroSegurado:classeBonus")));
            Thread.sleep(1000);
            navegador.findElement(By.id("uniform-formSeguroSegurado:selectSinistroUltimaVigencia:1")).click();
            Thread.sleep(1000);
        }
        if (TipoSeguro.contains("RENOVA") && Sinistro.contains("SinistroSim")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-formSeguroSegurado:classeBonus")));
            navegador.findElement(By.id("uniform-formSeguroSegurado:selectSinistroUltimaVigencia:0")).click();
            Thread.sleep(1000);
        }

        //Classe de Bonus
        if (TipoSeguro.contains("RENOVA")) {
            navegador.findElement(By.id("formSeguroSegurado:classeBonus")).click();
            Thread.sleep(1000);
        }
        if (TipoSeguro.contains("RENOVA") && Bonus.contains("0")) {
            //bonus 0
            navegador.findElement(By.id("formSeguroSegurado:classeBonus")).sendKeys("0");
            navegador.findElement(By.id("formSeguroSegurado:classeBonus")).sendKeys(Keys.TAB);
            Thread.sleep(1000);
        } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("1")) {
            //bonus 1
              navegador.findElement(By.xpath("//option[@title='Classe 1']")).click();
              Thread.sleep(1000);
             //bonus 2
            } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("2")) {
                navegador.findElement(By.xpath("//option[@title='Classe 2']")).click();
                Thread.sleep(1000);
                //bonus 3
                } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("3")) {
                  navegador.findElement(By.xpath("//option[@title='Classe 3']")).click();
                  Thread.sleep(1000);
                  //bonus 4
                    } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("4")) {
                        navegador.findElement(By.xpath("//option[@title='Classe 4']")).click();
                        Thread.sleep(1000);
                        } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("5")) {
                    //bonus 5
                            navegador.findElement(By.xpath("//option[@title='Classe 5']")).click();
                            Thread.sleep(1000);
                            } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("6")) {
                        //bonus 6
                                navegador.findElement(By.xpath("//option[@title='Classe 6']")).click();
                                Thread.sleep(1000);
                            //bonus 7
                                } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("7")) {
                                    navegador.findElement(By.xpath("//option[@title='Classe 7']")).click();
                                    Thread.sleep(1000);
                                    //bonus 8
                                        } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("8")) {
                                            navegador.findElement(By.xpath("//option[@title='Classe 8']")).click();
                                            Thread.sleep(1000);
                                        //bonus 9
                                            } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("9")) {
                                            navegador.findElement(By.xpath("//option[@title='Classe 9']")).click();
                                            Thread.sleep(1000);
                                            //bonus 10
                                                } else if (TipoSeguro.contains("RENOVA") && Bonus.contains("10")) {
                                                    navegador.findElement(By.xpath("//option[@title='Classe 10']")).click();
                                                     Thread.sleep(1000);
                                                 }

        //congenere
     if (TipoSeguro.contains("RENOVA")) {
         navegador.findElement(By.id("formSeguroSegurado:seguradoraAnterior")).click();
         Thread.sleep(1000);
         navegador.findElement(By.id("formSeguroSegurado:seguradoraAnterior")).sendKeys(Congenere);
         Thread.sleep(1000);
         navegador.findElement(By.id("formSeguroSegurado:seguradoraAnterior")).sendKeys(Keys.ENTER);
         Thread.sleep(1000);
     }



        return this;
    }

    public Corpo_mapfreonline clicaravancar1() throws InterruptedException {

        //clicar no botao pra proxima tela
        navegador.findElement(By.id("formSeguroSegurado:btoProximo")).click();
        Thread.sleep(1000);

        return new Corpo_mapfreonline(navegador);
    }



}




