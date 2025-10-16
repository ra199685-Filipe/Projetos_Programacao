
import Modelo.DadosFinanceirosM;
import Modelo.EnderecoM;
import Modelo.EquipamentoEletricoM;
import Modelo.EquipamentoMecanicoM;
import Modelo.FornecedorM;

public class main {
    public static void main(String[] args) {
        DadosFinanceirosM dadosFinanceiros1 = new DadosFinanceirosM(123456, "Banco X", 1234, 
                56789.2f);
        EnderecoM endereco1 = new EnderecoM("Rua A", "Bairro B", "Estado C", "123");
        FornecedorM fornecedor1 = new FornecedorM("Filipe", "R1", endereco1, dadosFinanceiros1);
        EquipamentoEletricoM equipamento1 = new EquipamentoEletricoM(1, "Siemens", "Motor", fornecedor1, 220,
        710, 2200, "CA");

        EquipamentoMecanicoM equipamento2 = new EquipamentoMecanicoM(2, "Bosch", "Bomba",
         fornecedor1, true, "Óleo", 1500, 300.0f, 0.5f, 
        450.0f, 85.0f);
        
        System.out.println("CALCULO PORTENCIA");
        System.out.println("P1:"+ equipamento1.calcular_potencia(equipamento1)+"W");
        System.out.println("P2:"+ equipamento1.calcular_potencia()+"W");
        System.out.println("CALCULO VAZAO");
        System.out.println("Qt: "+ equipamento2.calcula_Vazao_teorica()+"L/s");
        System.out.println("Qr: "+ equipamento2.calcula_Vazao_real()+"L/s");
       
    }
}
