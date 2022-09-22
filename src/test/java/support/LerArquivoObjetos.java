package support;

import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoObjetos extends Variaveis {
    private ArrayList<Variaveis> listaPessoa;
    private static List<String> numlinha = new ArrayList<String>();
    private static List<String> listDentrotxt = new ArrayList<String>();

    public LerArquivoObjetos(WebDriver navegador) {
        super(navegador);
    }


    public List<Variaveis> lerArquivoNr(String nrlinha) throws IOException {
        this.nrlinha = nrlinha;
        Variaveis v = new Variaveis(navegador);
        File file = new File("/home/"+ nomepc +"/mapfre_online/arquivos/" + nrlinha);
        System.out.println(file);
        if (file.exists()) {
            Scanner ler = new Scanner("/home/"+ nomepc +"/mapfre_online/arquivos/" + nrlinha);
            String arquivo = ler.nextLine();
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            listaPessoa=new ArrayList<Variaveis>();
            v.setNomeSegur(lerArq.readLine());
            v.setCpf(lerArq.readLine());
            v.setCep(lerArq.readLine());
            v.setDataSegur(lerArq.readLine());
            v.setEstCivil(lerArq.readLine());
            v.setSexoSegur(lerArq.readLine());
            v.setTipoSeguro(lerArq.readLine());
            v.setBonus(lerArq.readLine());
            v.setFranquia(lerArq.readLine());
            v.setAnoModelo(lerArq.readLine());
            v.setZero(lerArq.readLine());
            v.setTipoCarro(lerArq.readLine());
            v.setMarca(lerArq.readLine());
            v.setFipe(lerArq.readLine());
            v.setCongenere(lerArq.readLine());
            v.setDm(lerArq.readLine());
            v.setChassi(lerArq.readLine());
            v.setIs(lerArq.readLine());
            v.setDc(lerArq.readLine());
            v.setComissao(lerArq.readLine());
            v.setAss24(lerArq.readLine());
            v.setModalidade(lerArq.readLine());
            v.setFatajust(lerArq.readLine());
            v.setVidros(lerArq.readLine());
            v.setGrgResid(lerArq.readLine());
            v.setGrgTrab(lerArq.readLine());
            v.setGrgEscola(lerArq.readLine());
            v.setUtilizacao(lerArq.readLine());
            v.setTipoResid(lerArq.readLine());
            v.setAppMorte(lerArq.readLine());
            v.setCarroReserva(lerArq.readLine());
            v.setResid25(lerArq.readLine());
            v.setQtdVeic(lerArq.readLine());
            v.setTipoPessoa(lerArq.readLine());
            lerArq.readLine();
            v.setSinistro(lerArq.readLine());
            v.setAppInval(lerArq.readLine());
            v.setAntiFurto(lerArq.readLine());
            v.setNomeCond(lerArq.readLine());
            v.setDataCond(lerArq.readLine());
            v.setDmo(lerArq.readLine());
            v.setProduto(lerArq.readLine());
            v.setCpfCond(lerArq.readLine());
            //v.setAlienado(lerArq.readLine());
            v.setSegeCond(lerArq.readLine());
            lerArq.readLine();
            v.setKitGas(lerArq.readLine());
            v.setDespesas(lerArq.readLine());
            v.setBlindagem(lerArq.readLine());
            v.setTempHabit(lerArq.readLine());
            v.setDmh(lerArq.readLine());
            v.setDiarias(lerArq.readLine());
            v.setKmMes(lerArq.readLine());
            v.setAnoFabric(lerArq.readLine());




            listaPessoa.add(v);

        }
        //return v;
        return listaPessoa;

    }
}
