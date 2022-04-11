/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaapp;

/**
 *
 * @author flavi
 */
public class PlanoDeImunizacao {
    private String dataVacinacao, localVacinacao;
    private int idadeMin;
    
    public PlanoDeImunizacao() {
        this.dataVacinacao = "27/05/2021";
        this.localVacinacao = "Arena Corinthians";
        this.idadeMin = 49;
    }
    
    public void exibirDados(){
        System.out.println("------------------");
        System.out.println("Plano de Imunização:");
        System.out.println("Data: "+ this.dataVacinacao);
        System.out.println("Local: " + this.localVacinacao);
        System.out.println("Idade Mínima: "+ this.idadeMin);
        System.out.println("------------------");
        
    }
}
