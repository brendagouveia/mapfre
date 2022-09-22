package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import paginas.Corpo_mapfreonline;
import support.LerArquivoObjetos;
import support.PegarNrArquivo;
import support.Variaveis;
import support.web;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class mapfre_online {
    private WebDriver navegador;
    private String nrlinha;

    @Before
    public void AbrirSite() throws IOException, InterruptedException {
        navegador = web.abrir_mapfre();
        //  GerenciaLogar.CriarArquivoLogar();
        //  GerenciaErro.DeletarArquivoerro();
    }

    @Test
    public void inicioMapfre() throws InterruptedException {
        List<Variaveis> listaTesteResumo;
        try {
            PegarNrArquivo nrlinha1 = new PegarNrArquivo(navegador);

            ArrayList<String> listaNr = nrlinha1.carregarArquivos();
            nrlinha = listaNr.get(0);

            LerArquivoObjetos arquivo = new LerArquivoObjetos(navegador);

            List<Variaveis> listateste;
            //setar no objeto as informações contida no arquivo
            listateste = arquivo.lerArquivoNr(nrlinha);
            System.out.println(nrlinha1);

            new Corpo_mapfreonline(navegador)
                    .metodoVerificatela()
                    .Duplicar()
                    .Segurado(listateste)
                    .TipoSeguro(listateste)
                    .clicaravancar1()
                    .metodoFipe()
                    .Fipe(listateste)
                    .Utilizacao(listateste)
                    .clicaravancar2()
                    .metodoAvaliacaoSegurado()
                    .AvaliacaoSegurado(listateste)
                    .Cep(listateste)
                    .Uso(listateste)
                    .Garagem(listateste)
                    .clicaravancar3()
                    .metodoCoberturas()
                    .Coberturas(listateste)
                    .clicaravancar4()
                    .metodoImprimir()
                    .Comissao()
                    .Imprimir();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
