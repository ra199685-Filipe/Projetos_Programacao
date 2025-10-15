package Modelo;

public class EquipamentosM {
    private int codigo;
    private String fabricante;
    private String nome;
    private FornecedorM fornecedorM;

    public EquipamentosM(int codigo, String fabricante, String nome, 
            FornecedorM fornecedorM) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.nome = nome;
        this.fornecedorM = fornecedorM;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public FornecedorM getFornecedorM() {
        return fornecedorM;
    }
    public void setFornecedorM(FornecedorM fornecedorM) {
        this.fornecedorM = fornecedorM;
    }
    
    
}
