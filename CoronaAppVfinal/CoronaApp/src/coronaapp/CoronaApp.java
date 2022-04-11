/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Valdecir
 */

public class CoronaApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        telaInicial();
    }
    
    public static void telaInicial(){
        int op;
        boolean k =true;
        while(k){
            Scanner tec = new Scanner(System.in);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("CoronaApp");
            System.out.println("-----------------");
            System.out.println("[1]Login");
            System.out.println("[2]Cadastro");
            System.out.println("[3]Plano de imunização");
            System.out.println("[4]Orientações");
            System.out.println("[5]listar sintomas");
            System.out.println("[6]Folha informativa");
            System.out.println("[7]Sair");
            System.out.println("-----------------");
            op = tec.nextInt();
            switch(op){
                case 1:
                   telaLogin();    
                break;

                case 2:
                    telaCadastro();
                break;

                case 3:
                    System.out.println("");
                    PlanoDeImunizacao pi = new PlanoDeImunizacao();
                    pi.exibirDados();
                break;

                case 4:
                    System.out.println("");
                    System.out.println("1- Orientações Profissional de Saúde");
                    System.out.println("2- Orientações Pacientes");
                    System.out.println("");
                    int op2 = tec.nextInt();
                    if(op2==1){
                        OrientacoesPS p = new OrientacoesPS();
                        p.listarOrientacoes();
                    }else{
                        OrientacoesPA p = new OrientacoesPA();
                        p.listarOrientacoes();
                    }
                break;

                case 5:
                    System.out.println("");
                    Sintomas s = new Sintomas();
                    s.listarSintomas();
                break;

                case 6:
                    System.out.println("");
                    FolhaInformativa f = new FolhaInformativa();
                    f.exibirDados();
                break;

                case 7:
                    System.out.println("Saindo do sistema");
                    k=false;
                    System.exit(0);
                break;


                default:
                    System.out.println("Erro");
            }
        }
    }
    
    public static void telaLogin(){
        String user1;
        String password1;
        int op;
        Scanner tec = new Scanner(System.in);
        System.out.println("Tela de login");
        Paciente sessao1 = new Paciente();
        ProfissionalSaude sessao2 = new ProfissionalSaude();
        System.out.println("Insira seu usuário");
        user1 = tec.nextLine();
        System.out.println("Insira sua senha");
        password1 = tec.nextLine();
        System.out.println("Profissional de saude[1] ou paciente[2]?");
        op= tec.nextInt();
        //sessao1.testes();
        //sessao2.testes();
        switch(op){
            case 1:
                sessao2.efetuarLogin(user1, password1);    
            break;
            
            case 2:
                sessao1.efetuarLogin(user1, password1);
            break;
            
            default:
                System.out.println("Erro");
        }
    }
    
    public static void telaCadastro(){
        int op;
        Scanner tec = new Scanner(System.in);
        System.out.println("Tela de Cadastro:");
        System.out.println("Insira a opção: [1]paciente [2]profissional da saúde");
        op = tec.nextInt();
        switch(op){
            case 1:
               cadastroPA();    
            break;
            
            case 2:
                cadastroPS();
            break;
            
            default:
                System.out.println("Erro");
        }
    }
    
    public static void cadastroPS(){
        ProfissionalSaude saude = new ProfissionalSaude();
        saude.cadastrar();
    }
    
    public static void cadastroPA(){
        Paciente paciente = new Paciente();
        paciente.cadastrar();
    }
}
