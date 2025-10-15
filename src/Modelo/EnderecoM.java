package Modelo;

public class EnderecoM {
    private String rua;
    private String bairro;
    private String estado;
    private String cep;

    public EnderecoM(String rua, String bairro, String estado, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    

}
