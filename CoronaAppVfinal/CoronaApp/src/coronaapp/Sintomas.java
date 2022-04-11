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
public class Sintomas {
    private String[] sintomas = new String[12];
    
    public Sintomas() {
        this.sintomas[0] = "febre";
        this.sintomas[1] = "tosse seca";
        this.sintomas[2] = "dores e desconfortos";
        this.sintomas[3] = "dor de garganta";
        this.sintomas[4] = "diarreia";
        this.sintomas[5] = "conjuntivite";
        this.sintomas[6] = "dor de cabeça";
        this.sintomas[7] = "perda de paladar ou olfato";
        this.sintomas[8] = "erupção cutânea na pele ou descoloração dos dedos das mãos ou dos pés";
        this.sintomas[9] = "dificuldade de respirar ou falta de ar";
        this.sintomas[10] = "dor ou pressão no peito";
        this.sintomas[11] = "perda de fala ou movimento";
    }
    
    public void listarSintomas(){
        System.out.println("-----------------");
        System.out.println("Sintomas:");
        for(int i=0; i<sintomas.length;i++){
            System.out.println(" - " + this.sintomas[i]);
        }
        System.out.println("-----------------");
        System.out.println("Caso apresente algum dos sintomas, se casdastre aqui e espera que um profissional entrará em contato.");
    }
    
}
