package Modelo;

public class EquipamentoEletricoM extends EquipamentosM{
    private int alimentacao;
    private int corrente;
    private int potencia;
    private boolean fonteCA;
    private boolean fonteCC;

    
    public EquipamentoEletricoM(int codigo, String fabricante, String nome, FornecedorM fornecedorM, int alimentacao,
            int corrente, int potencia, boolean fonteCA, boolean fonteCC) {
        super(codigo, fabricante, nome, fornecedorM);
        this.alimentacao = alimentacao;
        this.corrente = corrente;
        this.potencia = potencia;
        this.fonteCA = fonteCA;
        this.fonteCC = fonteCC;
    }
    public int getAlimentacao() {
        return alimentacao;
    }
    public void setAlimentacao(int alimentacao) {
        this.alimentacao = alimentacao;
    }
    public int getCorrente() {
        return corrente;
    }
    public void setCorrente(int corrente) {
        this.corrente = corrente;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public boolean isFonteCA() {
        return fonteCA;
    }
    public void setFonteCA(boolean fonteCA) {
        this.fonteCA = fonteCA;
    }
    public boolean isFonteCC() {
        return fonteCC;
    }
    public void setFonteCC(boolean fonteCC) {
        this.fonteCC = fonteCC;
    }
 
    
}
