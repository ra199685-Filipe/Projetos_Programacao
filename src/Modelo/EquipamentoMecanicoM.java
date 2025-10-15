package Modelo;

public class EquipamentoMecanicoM extends EquipamentosM {
    private boolean fluido;
    private String tipoFluido;
    private int rpm;
    private float vazao;

    public EquipamentoMecanicoM(int codigo, String fabricante, String nome, FornecedorM fornecedorM, boolean fluido,
            String tipoFluido, int rpm, float vazao) {
        super(codigo, fabricante, nome, fornecedorM);
        this.fluido = fluido;
        this.tipoFluido = tipoFluido;
        this.rpm = rpm;
        this.vazao = vazao;
    }
    public boolean isFluido() {
        return fluido;
    }
    public void setFluido(boolean fluido) {
        this.fluido = fluido;
    }
    public String getTipoFluido() {
        return tipoFluido;
    }
    public void setTipoFluido(String tipoFluido) {
        this.tipoFluido = tipoFluido;
    }
    public int getRpm() {
        return rpm;
    }
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    public float getVazao() {
        return vazao;
    }
    public void setVazao(float vazao) {
        this.vazao = vazao;
    }
    
}
