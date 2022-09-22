package support;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PegarNrArquivo extends Variaveis {
    private static List<String> numlinha = new ArrayList<String>();
    private static List<String> list = new ArrayList<String>();

    public PegarNrArquivo(WebDriver navegador) {
        super(navegador);
    }

    public ArrayList<String> carregarArquivos() {
        ArrayList<String> listaNrlinha = new ArrayList<String>();

        File[] files = new File("/home/"+nomepc+"/mapfre_online/arquivos/").listFiles();
        try {
            for (File file : files) {
                listaNrlinha.add(file.getName());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaNrlinha;
    }

    public void deleteArquivo(String nrtxt) {
        File file = new File("/home/"+nomepc+"/mapfre_online/arquivos/" + nrtxt);

        if (file.exists() && file.isFile()) {
            boolean i=true;
            while (i){
                if (file.delete()) {
                    i=false;
                }else{
                    System.gc();
                }
            }


        }

    }

}
