package support;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Variaveis {
    public Variaveis(WebDriver navegador) {
        this.navegador = navegador;
    }

    protected WebDriver navegador;
    protected static String nomepc="rayssou";
    protected String nrlinha;
    protected String NomeSegur;
    protected String Cpf;
    protected String Cep;
    protected String DataSegur;
    protected String EstCivil;
    protected String SexoSegur;
    protected String TipoSeguro;
    protected String Bonus;
    protected String Franquia;
    protected String AnoModelo;
    protected String Zero;
    protected String TipoCarro;
    protected String Marca;
    protected String Fipe;
    protected String Congenere;
    protected String Dm;
    protected String Chassi;
    protected String Is;
    protected String Dc;
    protected String Comissao;
    protected String Ass24;
    protected String Modalidade;
    protected String Fatajust;
    protected String Vidros;
    protected String GrgResid;
    protected String GrgTrab;
    protected String GrgEscola;
    protected String Utilizacao;
    protected String TipoResid;
    protected String AppMorte;
    protected String CarroReserva;
    protected String Resid25;
    protected String QtdVeic;
    protected String TipoPessoa;
    protected String Sinistro;
    protected String AppInval;
    protected String AntiFurto;
    protected String NomeCond;
    protected String DataCond;
    protected String Dmo;
    protected String Produto;
    protected String CpfCond;
    protected String Alienado;
    protected String SegeCond;
    protected String KitGas;
    protected String Despesas;
    protected String Blindagem;
    protected String TempHabit;
    protected String Dmh;
    protected String Diarias;
    protected String KmMes;
    protected String AnoFabric;



















    protected static List<String> numlinha = new ArrayList<String>();

    public static List<String> getNumlinha() {
        return numlinha;
    }

    public static void setNumlinha(List<String> numlinha) {

        Variaveis.numlinha = numlinha;
    }




    public String getNrlinha() {
        return nrlinha;
    }

    public void setNrlinha(String nrlinha) {
        this.nrlinha = nrlinha;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getNomeSegur() {
        return NomeSegur;
    }

    public void setNomeSegur(String nomeSegur) {
        NomeSegur = nomeSegur;
    }

    public String getDataSegur() {
        return DataSegur;
    }

    public void setDataSegur(String dataSegur) {
        DataSegur = dataSegur;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getEstCivil() {
        return EstCivil;
    }

    public void setEstCivil(String estCivil) {
        EstCivil = estCivil;
    }

    public String getSexoSegur() {
        return SexoSegur;
    }

    public void setSexoSegur(String sexoSegur) {
        SexoSegur = sexoSegur;
    }

    public String getTipoSeguro() {
        return TipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        TipoSeguro = tipoSeguro;
    }

    public String getBonus() {
        return Bonus;
    }

    public void setBonus(String bonus) {
        Bonus = bonus;
    }

    public String getFranquia() {
        return Franquia;
    }

    public void setFranquia(String franquia) {
        Franquia = franquia;
    }

    public String getAnoModelo() {
        return AnoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        AnoModelo = anoModelo;
    }

    public String getTipoCarro() {
        return TipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        TipoCarro = tipoCarro;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getFipe() {
        return Fipe;
    }

    public void setFipe(String fipe) {
        Fipe = fipe;
    }

    public String getCongenere() {
        return Congenere;
    }

    public void setCongenere(String congenere) {
        Congenere = congenere;
    }

    public String getDc() {
        return Dc;
    }

    public void setDc(String dc) {
        Dc = dc;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    public String getIs() {
        return Is;
    }

    public void setIs(String is) {
        Is = is;
    }

    public String getDm() {
        return Dm;
    }

    public void setDm(String dm) {
        Dm = dm;
    }

    public String getComissao() {
        return Comissao;
    }

    public void setComissao(String comissao) {
        Comissao = comissao;
    }

    public String getAss24() {
        return Ass24;
    }

    public void setAss24(String ass24) {
        Ass24 = ass24;
    }

    public String getModalidade() {
        return Modalidade;
    }

    public void setModalidade(String modalidade) {
        Modalidade = modalidade;
    }

    public String getFatajust() {
        return Fatajust;
    }

    public void setFatajust(String fatajust) {
        Fatajust = fatajust;
    }

    public String getVidros() {
        return Vidros;
    }

    public void setVidros(String vidros) {
        Vidros = vidros;
    }

    public String getGrgResid() {
        return GrgResid;
    }

    public void setGrgResid(String grgResid) {
        GrgResid = grgResid;
    }

    public String getGrgTrab() {
        return GrgTrab;
    }

    public void setGrgTrab(String grgTrab) {
        GrgTrab = grgTrab;
    }

    public String getGrgEscola() {
        return GrgEscola;
    }

    public void setGrgEscola(String grgEscola) {
        GrgEscola = grgEscola;
    }

    public String getUtilizacao() {
        return Utilizacao;
    }

    public void setUtilizacao(String utilizacao) {
        Utilizacao = utilizacao;
    }

    public String getTipoResid() {
        return TipoResid;
    }

    public void setTipoResid(String tipoResid) {
        TipoResid = tipoResid;
    }

    public String getAppMorte() {
        return AppMorte;
    }

    public void setAppMorte(String appMorte) {
        AppMorte = appMorte;
    }

    public String getCarroReserva() {
        return CarroReserva;
    }

    public void setCarroReserva(String carroReserva) {
        CarroReserva = carroReserva;
    }

    public String getResid25() {
        return Resid25;
    }

    public void setResid25(String resid25) {
        Resid25 = resid25;
    }

    public String getQtdVeic() {
        return QtdVeic;
    }

    public void setQtdVeic(String qtdVeic) {
        QtdVeic = qtdVeic;
    }

    public String getTipoPessoa() {
        return TipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        TipoPessoa = tipoPessoa;
    }

    public String getSinistro() {
        return Sinistro;
    }

    public void setSinistro(String sinistro) {
        Sinistro = sinistro;
    }

    public String getAppInval() {
        return AppInval;
    }

    public void setAppInval(String appInval) {
        AppInval = appInval;
    }

    public String getAntiFurto() {
        return AntiFurto;
    }

    public void setAntiFurto(String antiFurto) {
        AntiFurto = antiFurto;
    }

    public String getNomeCond() {
        return NomeCond;
    }

    public void setNomeCond(String nomeCond) {
        NomeCond = nomeCond;
    }

    public String getDataCond() {
        return DataCond;
    }

    public void setDataCond(String dataCond) {
        DataCond = dataCond;
    }

    public String getDmo() {
        return Dmo;
    }

    public void setDmo(String dmo) {
        Dmo = dmo;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public String getCpfCond() {
        return CpfCond;
    }

    public void setCpfCond(String cpfCond) {
        CpfCond = cpfCond;
    }

    public String getAlienado() {
        return Alienado;
    }

    public void setAlienado(String alienado) {
        Alienado = alienado;
    }

    public String getSegeCond() {
        return SegeCond;
    }

    public void setSegeCond(String segeCond) {
        SegeCond = segeCond;
    }

    public String getKitGas() {
        return KitGas;
    }

    public void setKitGas(String kitGas) {
        KitGas = kitGas;
    }

    public String getDespesas() {
        return Despesas;
    }

    public void setDespesas(String despesas) {
        Despesas = despesas;
    }

    public String getBlindagem() {
        return Blindagem;
    }

    public void setBlindagem(String blindagem) {
        Blindagem = blindagem;
    }

    public String getTempHabit() {
        return TempHabit;
    }

    public void setTempHabit(String tempHabit) {
        TempHabit = tempHabit;
    }

    public String getDmh() {
        return Dmh;
    }

    public void setDmh(String dmh) {
        Dmh = dmh;
    }

    public String getDiarias() {
        return Diarias;
    }

    public void setDiarias(String diarias) {
        Diarias = diarias;
    }

    public String getKmMes() {
        return KmMes;
    }

    public void setKmMes(String kmMes) {
        KmMes = kmMes;
    }

    public String getAnoFabric() {
        return AnoFabric;
    }

    public void setAnoFabric(String anoFabric) {
        AnoFabric = anoFabric;
    }

    public String getZero() {
        return Zero;
    }

    public void setZero(String zero) {
        Zero = zero;
    }
}

