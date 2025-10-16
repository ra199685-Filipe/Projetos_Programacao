package Modelo;

public class EquipamentoEletricoM extends EquipamentosM{
    private int alimentacao;
    private int corrente;
    private int potencia;
    private String tipo_fonte;//variavel que define se a fonte é CA ou CC
    private boolean fonteCA;
    private boolean fonteCC;

    
    public EquipamentoEletricoM(int codigo, String fabricante, String nome, FornecedorM fornecedorM, int alimentacao,
            int corrente, int potencia, String tipo_fonte) {
        super(codigo, fabricante, nome, fornecedorM);
        this.alimentacao = alimentacao;
        this.corrente = corrente;
        this.potencia = potencia;
        //Define o tipo de fonte e seta as variaveis booleanas
        this.tipo_fonte = tipo_fonte;
        if ( tipo_fonte.equals("CC")){
            this.fonteCA = false;
            this.fonteCC = true;
        }else if ( tipo_fonte.equals("CA")){ 
            this.fonteCA = true;
            this.fonteCC = false;
        }else{
            //Criar uma nova exceção onde se o usuario nao inserir CA ou CC, o sistema avisa e da um erro até 
            //que ele insira corretamente.
            throw new IllegalArgumentException("Tipo de fonte inválido. Use 'CA' ou 'CC'.");
        }
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
    public String getTipo_fonte() {
        return tipo_fonte;
    }
    public void setTipo_fonte(String tipo_fonte) {
        this.tipo_fonte = tipo_fonte;
    }

    public int calcular_potencia(EquipamentoEletricoM eqpt){
        eqpt.potencia = eqpt.corrente * eqpt.alimentacao;
        return eqpt.potencia;
    }
    public int calcular_potencia(){
        this.potencia = this.corrente * this.alimentacao;
        return this.potencia;
    }
    
}
