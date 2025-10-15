package Modelo;

public class DadosFinanceirosM {
    private int centro_de_custo;
    private String data_compra;
    private int total_unidades;
    private float valor_unitario;

    public DadosFinanceirosM(int centro_de_custo, String data_compra, int total_unidades, float valor_unitario) {
        this.centro_de_custo = centro_de_custo;
        this.data_compra = data_compra;
        this.total_unidades = total_unidades;
        this.valor_unitario = valor_unitario;
    }
    
    public int getCentro_de_custo() {
        return centro_de_custo;
    }
    public void setCentro_de_custo(int centro_de_custo) {
        this.centro_de_custo = centro_de_custo;
    }
    public String getData_compra() {
        return data_compra;
    }
    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }
    public int getTotal_unidades() {
        return total_unidades;
    }
    public void setTotal_unidades(int total_unidades) {
        this.total_unidades = total_unidades;
    }
    public float getValor_unitario() {
        return valor_unitario;
    }
    public void setValor_unitario(float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    
}
