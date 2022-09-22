package paginas;

import org.openqa.selenium.WebDriver;
import support.Variaveis;

public class Corpo_mapfreonline extends Variaveis {
    public Corpo_mapfreonline(WebDriver navegador) {
        super(navegador);
    }
    public Tela01 metodoVerificatela(){
        return new Tela01(navegador);
    }

    public Tela02 metodoFipe(){
        return new Tela02(navegador);
    }

    public Tela03 metodoAvaliacaoSegurado(){
        return new Tela03(navegador);
    }

    public Tela04 metodoCoberturas(){
        return new Tela04(navegador);
    }

    public Tela05 metodoImprimir(){
        return new Tela05(navegador);
    }


}

