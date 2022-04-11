/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaapp;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Valdecir
 */
public abstract class Pessoa {
    public static ArrayList<String> nomes= new ArrayList<>();
    public static ArrayList<String> cpfs= new ArrayList<>();
    public static ArrayList<String> telefones= new ArrayList<>();
    public static ArrayList<String> sintomas= new ArrayList<>();
    public static ArrayList<String> cidades= new ArrayList<>();
    public static ArrayList<String> estados= new ArrayList<>();
    public static ArrayList<String> user= new ArrayList<>();
    public static ArrayList<String> password= new ArrayList<>();
    public static ArrayList<String> idades= new ArrayList<>();
    
    public static ArrayList<String> mensagens= new ArrayList<>();
    public static ArrayList<String> destinatarios= new ArrayList<>();
    public static ArrayList<String> remetentes= new ArrayList<>();
    
    Scanner tec = new Scanner(System.in);
    protected String nome;
    protected String telefone;
    protected String cpf;
    protected String cidade;
    protected String estado;
    protected String nomeUsuario;
    protected String senha;
    protected String idade;
    
    public abstract void cadastrar();
    public abstract void efetuarLogin(String usuario, String senha);
    public abstract void exibirPlanoImunizacao();
    protected abstract void acessarMensagens();
    public abstract void listarMensagens();
    public abstract void exibirOrientacao();
    public abstract void menu();
}

