package Modelo;

public class EquipamentoMecanicoM extends EquipamentosM {
    private boolean fluido;
    private String tipoFluido;
    private int rpm;
    private float vazao_real;
    private float deslocamento_volumetrico;
    private float vazao_teorica;
    private float eficiencia_volumetrica;

    public EquipamentoMecanicoM(int codigo, String fabricante, String nome, FornecedorM fornecedorM, boolean fluido,
            String tipoFluido, int rpm, float vazao_real, float deslocamento_volumetrico, float vazao_teorica, float eficiencia_volumetrica) {
        super(codigo, fabricante, nome, fornecedorM);
        this.fluido = fluido;
        this.tipoFluido = tipoFluido;
        this.rpm = rpm;
        this.vazao_real = vazao_real;
        this.deslocamento_volumetrico = deslocamento_volumetrico;
        this.vazao_teorica = vazao_teorica;
        this.eficiencia_volumetrica = eficiencia_volumetrica;
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
        return vazao_real;
    }
    public void setVazao_real(float vazao_real) {
        this.vazao_real = vazao_real;
    }
    public float getDeslocamento_volumetrico() {
        return deslocamento_volumetrico;
    }
    public void setDeslocamento_volumetrico(float deslocamento_volumetrico) {
        this.deslocamento_volumetrico = deslocamento_volumetrico;
    }
    public float getVazao_teorica() {
        return vazao_teorica;
    }
    public void setVazao_teorica(float vazao_teorica) {
        this.vazao_teorica = vazao_teorica;
    }
    public float getEficiencia_volumetrica() {
        return eficiencia_volumetrica;
    }
    public void setEficiencia_volumetrica(float eficiencia_volumetrica) {
        this.eficiencia_volumetrica = eficiencia_volumetrica;
    }
    /* ## EQUIPAMENTO MECANICO ##

=> calculo da vazão <=

     1. Acrescentar atributo
          a. Deslocamento Volumetrico(Vd)

     2. Vazão Teorica (Qt)
              vazaoTeorica(QT)= vd * RPM
     3. Vazão real (Qr)
            Qr = Qt * nv(eficiencia volumetrica)

           Eficiência Volumétrica para a pressão e fluido em questão é dado pelo fabricante, ou tabelado.*/
    public float calcula_Vazao_teorica(){
        this.vazao_teorica= this.deslocamento_volumetrico * this.rpm;
        return this.vazao_teorica; 
    }
    public float calcula_Vazao_real(){
        this.vazao_real= this.vazao_teorica * (this.eficiencia_volumetrica/100);
        return this.vazao_real; 
    }

    public void imprimir_todos_dados_mecanicos(){
        System.out.println("Codigo                      : " + this.getCodigo());
        System.out.println("Fabricante                  : " + this.getFabricante());
        System.out.println("Nome                        : " + this.getNome());
        System.out.println("Fornecedor                  : " + this.getFornecedorM().getNome());
        System.out.println("Fluido                      : " + (this.fluido ? "Sim" : "Não"));
        System.out.println("Tipo de Fluido              : " + this.tipoFluido);
        System.out.println("RPM                         : " + this.rpm);
        System.out.println("Vazão Real                  : " + this.vazao_real);
        System.out.println("Deslocamento Volumétrico    : " + this.deslocamento_volumetrico);
        System.out.println("Vazão Teórica               : " + this.vazao_teorica);
        System.out.println("Eficiência Volumétrica      : " + this.eficiencia_volumetrica);
    }
}
