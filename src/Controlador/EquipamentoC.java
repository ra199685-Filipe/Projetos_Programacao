package Controlador;

import Modelo.EquipamentoEletricoM;
import Modelo.EquipamentoMecanicoM;
import Modelo.EquipamentosM;
import java.util.ArrayList;

public class EquipamentoC {
    public ArrayList<EquipamentoEletricoM> vet_equipamento_eletrico;
    public ArrayList<EquipamentoMecanicoM> vet_equipamento_mecanico;

    public EquipamentoC() {
        vet_equipamento_eletrico = new ArrayList<>();
        vet_equipamento_mecanico = new ArrayList<>();
    }

    public void Adiciona_equipamento_Eletrico(EquipamentoEletricoM equipamento) {
        vet_equipamento_eletrico.add(equipamento);
    }
    public void Adiciona_equipamento_Mecanico(EquipamentoMecanicoM equipamento) {
        vet_equipamento_mecanico.add(equipamento);
    }

    //Função para buscar por campo chave
    public EquipamentosM Busca_por_campo(int cod){
        for(EquipamentoEletricoM equipamento : vet_equipamento_eletrico){
            if(equipamento.getCodigo() == cod){
                return equipamento;
            }
        }
        for(EquipamentoMecanicoM equipamento : vet_equipamento_mecanico){
            if(equipamento.getCodigo() == cod){
                return equipamento;
            }
        }
        return null;
    }

    //Função para remover por campo chave
    public boolean Remove_por_campo(int cod){
        for(EquipamentoEletricoM equipamento : vet_equipamento_eletrico){
            if(equipamento.getCodigo() == cod){
                vet_equipamento_eletrico.remove(equipamento);
                return true;
            }
        }
        for(EquipamentoMecanicoM equipamento : vet_equipamento_mecanico){
            if(equipamento.getCodigo() == cod){
                vet_equipamento_mecanico.remove(equipamento);
                return true;
            }
        }
        return false;
    }

    //função para imprimir todos os dados
    public void imprimir_todos_dados(){
        System.out.println("Equipamentos Eletricos:");
        if(vet_equipamento_eletrico.isEmpty()){
            System.out.println("Nenhum equipamento eletrico cadastrado.");
        }else{
            for(EquipamentoEletricoM equipamento : vet_equipamento_eletrico){
            equipamento.imprimir_todos_dados_eletricos();
            System.out.println("-----------------------");
            }
        }
        
        System.out.println("Equipamentos Mecanicos:");
        if(vet_equipamento_mecanico.isEmpty()){
            System.out.println("Nenhum equipamento mecanico cadastrado.");
        }else{
            for(EquipamentoMecanicoM equipamento : vet_equipamento_mecanico){
            equipamento.imprimir_todos_dados_mecanicos();
            System.out.println("-----------------------");
            }
        }   
    }
    //função para contagem de dados
    public int contagem_dados(){
        return vet_equipamento_eletrico.size() + vet_equipamento_mecanico.size();
    }
}
