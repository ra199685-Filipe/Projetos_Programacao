package Modelo;

public class FornecedorM {
    private String nome;
    private String regional;
    private EnderecoM enderecoM;
    private DadosFinanceirosM dadosFinanceirosM;

    public FornecedorM(String nome, String regional, EnderecoM enderecoM, DadosFinanceirosM dadosFinanceirosM) {
        this.nome = nome;
        this.regional = regional;
        this.enderecoM = enderecoM;
        this.dadosFinanceirosM = dadosFinanceirosM;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegional() {
        return regional;
    }
    public void setRegional(String regional) {
        this.regional = regional;
    }

    public EnderecoM getEnderecoM() {
        return enderecoM;
    }

    public void setEnderecoM(EnderecoM enderecoM) {
        this.enderecoM = enderecoM;
    }

    public DadosFinanceirosM getDadosFinanceirosM() {
        return dadosFinanceirosM;
    }

    public void setDadosFinanceirosM(DadosFinanceirosM dadosFinanceirosM) {
        this.dadosFinanceirosM = dadosFinanceirosM;
    }
    
}
