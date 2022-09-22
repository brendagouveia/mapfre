package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Variaveis;
import support.VerificarElemento;

import java.util.List;

public class Tela03 extends Variaveis {

    public Tela03 (WebDriver navegador) {super(navegador);}

    public Tela03 AvaliacaoSegurado(List<Variaveis> listateste) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        Produto = listateste.get(0).getProduto();
        TipoPessoa = listateste.get(0).getTipoPessoa();
        SegeCond = listateste.get(0).getSegeCond();
        SexoSegur = listateste.get(0).getSexoSegur();
        EstCivil = listateste.get(0).getEstCivil();
        //TempHabit = listateste.get(0).getTempHabit();
        TipoResid = listateste.get(0).getTipoResid();
        Resid25 = listateste.get(0).getResid25();
        QtdVeic = listateste.get(0).getQtdVeic();



        //TESTANDO SE APARECE TELA DO PRODUTO
        if (VerificarElemento.verificarExiste(navegador, "//*[@id=\"formTrocaProduto:btOkTrocaProduto\"]", "XPATH", 3)) {
            navegador.findElement(By.xpath("//*[@id=\"formTrocaProduto:btOkTrocaProduto\"]")).click();
            Thread.sleep(100);
        }

        //VERIFICANDO QUE TIPO DE PRODUTO É AUTOMAIS OU GOLD
        WebElement elementoproduto = navegador.findElement(By.id("formResumo:produtoResumo"));
        Produto = elementoproduto.getText();
        Thread.sleep(100);


        if (Produto.contains("Gold")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()[normalize-space()='Perfil do Principal Condutor']]")));
            Thread.sleep(1000);
            //perfil sim
            if(TipoPessoa.contains("FISICA")) {
                navegador.findElement(By.xpath("(//span[@class='checked'])[1]")).click();
                Thread.sleep(1000);
            }else {
                //perfil nao
                navegador.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
                Thread.sleep(1000);
            }

            //principal condutor sim
            if (SegeCond.contains("PROPRIO")) {
                navegador.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
                Thread.sleep(1000);
                navegador.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
                Thread.sleep(1000);
                navegador.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
                Thread.sleep(2000);

                //Sexo do condutor Masculino
                if (SexoSegur.contains("M")) {
                    navegador.findElement(By.xpath("(//input[@checked='checked'])[3]")).click();
                    Thread.sleep(2000);
                } else {
                    //Sexo do condutor Feminino
                    navegador.findElement(By.xpath("(//input[@type='radio'])[5]")).click();
                    Thread.sleep(1000);
                }

            }else{
                    //principl condutor nao
                    navegador.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
                    Thread.sleep(1000);
                    navegador.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
                    Thread.sleep(1000);
                }

            //Estado Civil
            if (EstCivil.contains("C")) {
                //**Casado
                navegador.findElement(By.xpath("//option[@title='Casado ou reside há pelo menos dois anos com companheiro (a)']")).click();
                Thread.sleep(2000);
            }else if (EstCivil.contains("D")) {
                //**Divorciado
                navegador.findElement(By.xpath("//option[@title='Divorciado/Separado']")).click();
                Thread.sleep(1000);
            }else if (EstCivil.contains("O")) {
                //**Outros
                navegador.findElement(By.xpath("(//option[@title='Outros'])[1]")).click();
                Thread.sleep(1000);
            }else if (EstCivil.contains("S")) {
                //**Solteiro
                navegador.findElement(By.xpath("//option[@title='Solteiro']")).click();
                Thread.sleep(2000);
            }else if (EstCivil.contains("V")) {
                //**Viuvo
                navegador.findElement(By.xpath("//option[@title='Viúvo']")).click();
                Thread.sleep(1000);
            }

            //Profissao
            navegador.findElement(By.xpath("//option[@title='Administrador']")).click();
            Thread.sleep(2000);

            //Tempo de Habilitacao
            navegador.findElement(By.xpath("//option[@title='Acima de 10 anos']")).click();
            Thread.sleep(2000);

            //Tipo de Residencia
            if (TipoResid.contains("CASA")) {
                //**Casa
                navegador.findElement(By.xpath("//option[@title='Casa com acesso à garagem por meio de controle remoto']")).click();
                Thread.sleep(2000);
            }else if (TipoResid.contains("APTO")) {
                //**Apto
                navegador.findElement(By.xpath("//option[@title='Apartamento com acesso à garagem por meio de controle remoto ou porteiro']")).click();
                Thread.sleep(1000);
            }

            //Reside 25
            if (Resid25.contains("N")) {
                //**NAO
                navegador.findElement(By.xpath("(//input[@checked='checked'])[4]")).click();
                Thread.sleep(2000);
            }else {
                //**SIM
                navegador.findElement(By.xpath("//span[@class='focused']//input[1]")).click();
                Thread.sleep(2000);
            }

            //Dirige 25
            if (Resid25.contains("N")) {
                //**NAO
                navegador.findElement(By.xpath("(//input[@checked='checked'])[5]")).click();
                Thread.sleep(2000);
            }else {
                //**SIM
                navegador.findElement(By.xpath("//span[@class='focused']//input[1]")).click();
                Thread.sleep(2000);
            }

            //Quantidade de Veiculos
            navegador.findElement(By.xpath("(//option[@selected='selected'])[5]")).click();
            Thread.sleep(2000);

        } else{
            //automais

            //principal condutor sim
            if (SegeCond.contains("PROPRIO")) {
                navegador.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
                Thread.sleep(1000);
                navegador.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
                navegador.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
                Thread.sleep(3000);

                //Sexo do condutor Masculino
                if (SexoSegur.contains("M")) {
                    navegador.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
                    Thread.sleep(2000);
                } else {
                    //Sexo do condutor Feminino
                    navegador.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
                    Thread.sleep(1000);
                }

            }else{
                //principl condutor nao
                navegador.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
                Thread.sleep(2000);

            }

            //Estado Civil
            if (EstCivil.contains("C")) {
                //**Casado
                navegador.findElement(By.xpath("//option[@title='Casado ou reside há pelo menos dois anos com companheiro (a)']")).click();
                Thread.sleep(2000);
            }else if (EstCivil.contains("D")) {
                //**Divorciado
                navegador.findElement(By.xpath("//option[@title='Divorciado/Separado']")).click();
                Thread.sleep(1000);
            }else if (EstCivil.contains("O")) {
                //**Outros
                navegador.findElement(By.xpath("(//option[@title='Outros'])[1]")).click();
                Thread.sleep(1000);
            }else if (EstCivil.contains("S")) {
                //**Solteiro
                navegador.findElement(By.xpath("//option[@title='Solteiro']")).click();
                Thread.sleep(2000);
            }else if (EstCivil.contains("V")) {
                //**Viuvo
                navegador.findElement(By.xpath("//option[@title='Viúvo']")).click();
                Thread.sleep(1000);
            }

            //Profissao
            navegador.findElement(By.xpath("//option[@title='Administrador']")).click();
            Thread.sleep(2000);

            //Tempo de Habilitacao
            navegador.findElement(By.xpath("//option[@title='Acima de 10 anos']")).click();
            Thread.sleep(2000);

            //Tipo de Residencia
            if (TipoResid.contains("CASA")) {
                //**Casa
                navegador.findElement(By.xpath("//option[@title='Casa com acesso à garagem por meio de controle remoto']")).click();
                Thread.sleep(2000);
            }else if (TipoResid.contains("APTO")) {
                //**Apto
                navegador.findElement(By.xpath("//option[@title='Apartamento com acesso à garagem por meio de controle remoto ou porteiro']")).click();
                Thread.sleep(1000);
            }

            //Reside 25
            if (Resid25.contains("N")) {
                //**NAO
                navegador.findElement(By.xpath("(//input[@type='radio'])[5]")).click();
                Thread.sleep(2000);
            }else {
                //**SIM
                navegador.findElement(By.xpath("//span[@class='focused']//input[1]")).click();
                Thread.sleep(2000);
            }

            //Dirige 25
            if (Resid25.contains("N")) {
                //**NAO
                navegador.findElement(By.xpath("(//input[@value='146'])[2]")).click();
                Thread.sleep(2000);
            }else {
                //**SIM
                navegador.findElement(By.xpath("//span[@class='focused']//input[1]")).click();
                Thread.sleep(2000);
            }

            //Quantidade de Veiculos
            navegador.findElement(By.xpath("//option[@title='Até 2']")).click();
            Thread.sleep(2000);
        }

        return this;
    }

    public Tela03 Cep(List<Variaveis> listateste) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        Cep = listateste.get(0).getCep();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'placeholder mask-cep')]")));
        Thread.sleep(1000);
        //INSERIR O CEP
        navegador.findElement(By.xpath("//input[contains(@class,'placeholder mask-cep')]")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//input[contains(@class,'placeholder mask-cep')]")).sendKeys(Cep);
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//input[contains(@class,'placeholder mask-cep')]")).sendKeys(Keys.TAB);
        Thread.sleep(2000);

        return this;
    }

    public Tela03 Uso(List<Variaveis> listateste) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        Produto = listateste.get(0).getProduto();
        Utilizacao = listateste.get(0).getUtilizacao();
        Alienado = listateste.get(0).getAlienado();
        SegeCond = listateste.get(0).getSegeCond();

        //VERIFICANDO QUE TIPO DE PRODUTO É AUTOMAIS OU GOLD
        WebElement elementoproduto = navegador.findElement(By.id("formResumo:produtoResumo"));
        Produto = elementoproduto.getText();
        Thread.sleep(100);

        if (Produto.contains("Gold")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@title='Próprio; proprietário ou sócio']")));
            Thread.sleep(1000);
            //Relacao do veiculo
            //**Proprio
            if (SegeCond.contains("PROPRIO")){
                navegador.findElement(By.xpath("//label[text()='Relação do Segurado com o Proprietário Legal do Veículo']")).click();
                Thread.sleep(2000);
            } else{
                navegador.findElement(By.xpath("//label[text()='Relação do Segurado com o Proprietário Legal do Veículo']")).click();
                Thread.sleep(2000);
            }
        }else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Relação do Segurado com o Proprietário Legal do Veículo']")));
            Thread.sleep(1000);
            //Relacao do veiculo
            //**Proprio
            if (SegeCond.contains("PROPRIO")) {
                navegador.findElement(By.xpath("//option[@title='Próprio; proprietário ou sócio']")).click();
                Thread.sleep(2000);
            }else {
                navegador.findElement(By.xpath("(//option[@title='Outros'])[4]")).click();
                Thread.sleep(2000);
            }
        }

        //Veiculo presta serviço?
        if (Utilizacao.contains("NaoUtilizTrab")) {
            //**NAO
            navegador.findElement(By.xpath("(//input[@value='146'])[3]")).click();
            Thread.sleep(2000);
        }else {
            //**SIM
            navegador.findElement(By.xpath("//span[@class='focused']//input[1]")).click();
            Thread.sleep(2000);
        }


        //Veiculo alienado?
        if (Alienado.contains("NAO")) {
            //**NAO
            navegador.findElement(By.xpath("(//input[@value='146'])[4]")).click();
            Thread.sleep(2000);
        }else {
            //**SIM
            navegador.findElement(By.xpath("//span[@class='checked focused']//input[1]")).click();
            Thread.sleep(2000);
        }

        return this;
    }

    public Tela03 Garagem(List<Variaveis> listateste) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(navegador, 30);
        Produto = listateste.get(0).getProduto();
        GrgResid = listateste.get(0).getGrgResid();
        GrgTrab = listateste.get(0).getGrgTrab();
        GrgEscola = listateste.get(0).getGrgEscola();
        AntiFurto = listateste.get(0).getAntiFurto();

        //VERIFICANDO QUE TIPO DE PRODUTO É AUTOMAIS OU GOLD
        WebElement elementoproduto = navegador.findElement(By.id("formResumo:produtoResumo"));
        Produto = elementoproduto.getText();
        Thread.sleep(100);

        if (Produto.contains("Gold")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='helpPerfil'])[5]")));
            Thread.sleep(1000);
            if (GrgResid.contains("Sim")) {
                //garagem sim
                navegador.findElement(By.xpath("(//label[text()=' Não existe']/following::input)[1]")).click();
                Thread.sleep(2000);

            //garagem residencia sim
            if (GrgResid.contains("Sim")) {
                navegador.findElement(By.xpath("(//option[@title='Sim'])[1]")).click();
                Thread.sleep(2000);
            }else {
                //garagem residencia nao
                navegador.findElement(By.xpath("(//option[@title='Não'])[1]")).click();
                Thread.sleep(2000);
            }
            //garagem trabalho sim
            if (GrgTrab.contains("Sim")) {
                navegador.findElement(By.xpath("(//option[@title='Sim'])[2]")).click();
                Thread.sleep(2000);
            }else if(GrgTrab.contains("NaoUtiliza")) {
                //garagem nao trabaçha ou utiliza
                navegador.findElement(By.xpath("//option[@title='Não trabalha ou não utiliza o veículo para ir ao trabalho']")).click();
                //navegador.findElement(By.xpath("(//option[@title='Não'])[2]")).click();
                Thread.sleep(2000);
            }else {
                //garagem nao
                navegador.findElement(By.xpath("(//option[@title='Não'])[2]")).click();
                Thread.sleep(2000);
            }
            if (GrgEscola.contains("Sim")) {
                //garagem escola sim
                navegador.findElement(By.xpath("(//option[@title='Sim'])[3]")).click();
                Thread.sleep(2000);
            }else if (GrgEscola.contains("NaoUtiliza")) {
                //garagem  nao estuda ou utiliza
                navegador.findElement(By.xpath("//option[@title='Não estuda ou não utiliza o veículo para ir a faculdade, pós-graduação, MBA']")).click();
                Thread.sleep(2000);
            }else  {
                //garagem nao estuda
                navegador.findElement(By.xpath("(//option[@title='Não'])[3]")).click();
                Thread.sleep(2000);
            }

        }else {
            //garagem nao
            navegador.findElement(By.xpath("//input[@value='608']")).click();
            Thread.sleep(2000);
        }
            //Rastreador
            if (AntiFurto.contains("Nao")) {
                //**NAO
                navegador.findElement(By.xpath("(//input[@value='146'])[5]")).click();
                Thread.sleep(2000);
            }else {
                //**SIM
                navegador.findElement(By.xpath("//span[@class='focused']//input[1]")).click();
                Thread.sleep(2000);
            }

        }else {
            //AUTOMAIS
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='helpPerfil'])[4]")));
            Thread.sleep(1000);
            if (GrgResid.contains("Sim")) {
                //garagem sim
                navegador.findElement(By.xpath("(//label[text()=' Não existe']/following::input)[1]")).click();
                Thread.sleep(2000);

                //garagem residencia sim
                if (GrgResid.contains("Sim")) {
                    navegador.findElement(By.xpath("(//option[@title='Sim'])[1]")).click();
                    Thread.sleep(2000);
                }else {
                    //garagem residencia nao
                    navegador.findElement(By.xpath("(//option[@title='Não'])[1]")).click();
                    Thread.sleep(2000);
                }
                //garagem trabalho sim
                if (GrgTrab.contains("Sim")) {
                    navegador.findElement(By.xpath("(//option[@title='Sim'])[2]")).click();
                    Thread.sleep(2000);
                }else if(GrgTrab.contains("NaoUtiliza")) {
                    //garagem nao trabaçha ou utiliza
                    navegador.findElement(By.xpath("//option[@title='Não trabalha ou não utiliza o veículo para ir ao trabalho']")).click();
                    //navegador.findElement(By.xpath("(//option[@title='Não'])[2]")).click();
                    Thread.sleep(2000);
                }else {
                    //garagem nao
                    navegador.findElement(By.xpath("(//option[@title='Não'])[2]")).click();
                    Thread.sleep(2000);
                }
                if (GrgEscola.contains("Sim")) {
                    //garagem escola sim
                    navegador.findElement(By.xpath("(//option[@title='Sim'])[3]")).click();
                    Thread.sleep(2000);
                }else if (GrgEscola.contains("NaoUtiliza")) {
                    //garagem  nao estuda ou utiliza
                    navegador.findElement(By.xpath("//option[@title='Não estuda ou não utiliza o veículo para ir a faculdade, pós-graduação, MBA']")).click();
                    Thread.sleep(2000);
                }else  {
                    //garagem nao
                    navegador.findElement(By.xpath("(//option[@title='Não'])[3]")).click();
                    Thread.sleep(2000);
                }

            }else {
                //garagem nao
                navegador.findElement(By.xpath("//input[@value='608']")).click();
                Thread.sleep(2000);
            }
            //Rastreador
            if (AntiFurto.contains("Nao")) {
                //**NAO
                navegador.findElement(By.xpath("(//input[@value='146'])[5]")).click();
                Thread.sleep(2000);
            }else {
                //**SIM
                navegador.findElement(By.xpath("//span[@class='focused']//input[1]")).click();
                Thread.sleep(2000);
            }

        }

        return this;
    }

    public Corpo_mapfreonline clicaravancar3() throws InterruptedException {

        //clicar no botao pra proxima tela
        navegador.findElement(By.xpath("//input[@value='Próximo →']")).click();
        Thread.sleep(1000);

        return new Corpo_mapfreonline(navegador);
    }



}
