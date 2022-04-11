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
public abstract class Orientacoes {
    public String descOrientacoes;

    public void listarOrientacoes(){
        System.out.println("-----------------------");
        System.out.println("Orientações: "+ this.descOrientacoes);
        System.out.println("-----------------------");
    }

    public Orientacoes() {
    }
}
