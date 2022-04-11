/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaapp;

import static coronaapp.CoronaApp.telaInicial;
import static coronaapp.CoronaApp.telaLogin;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Valdecir
 */
public class Paciente extends Pessoa{
    private String sintomas;
    Scanner tec = new Scanner(System.in);
    //funções comuns da classe pessoa
    @Override
    public void efetuarLogin(String usuario, String senha) {
        String usuarios[]= user.toArray(new String[user.size()]);
        String senhas[]= password.toArray(new String[password.size()]);
        String cpfAtual[]=cpfs.toArray(new String[cpfs.size()]);
        int validar =0;
        int i;
        for (i=0;i<user.size();i++) {
            if(usuario.equals(usuarios[i])){
                    if(senha.equals(senhas[i])){
                        validar=1;
                        System.out.println("Bem-vindo(a)");
                        setCpf(cpfAtual[i]);
                        menu();
                    }
                }
            }
        if(validar==0){
            System.out.println("Login inválido");
            telaInicial();
        }
    }

    @Override
    public void exibirPlanoImunizacao() {
        
    }

    @Override
    protected void acessarMensagens() {
        
    }

    @Override
    public void listarMensagens() {
        String mensagem[]= ProfissionalSaude.mensagens.toArray(new String[ProfissionalSaude.mensagens.size()]);
        String identificacao[]= ProfissionalSaude.destinatarios.toArray(new String[ProfissionalSaude.destinatarios.size()]);
        String remetente[]= ProfissionalSaude.remetentes.toArray(new String[ProfissionalSaude.remetentes.size()]);
        int i;
        System.out.println("Lista de mensagens:");
        for(i=0;i<mensagem.length;i++){
            if(this.cpf.equals(identificacao[i])){
                System.out.println("Mensagem: "+mensagem[i]+" Rementente: " + remetente[i]);
                System.out.println(" ");
            }
        }

    }
    
    @Override
    public void cadastrar() {
        System.out.println("Insira Seu nome");
        setNome(tec.nextLine());
        nomes.add(getNome());
        System.out.println("Insira sua idade");
        setIdade(tec.nextLine());
        idades.add(getIdade());
        System.out.println("Insira seu cpf");
        setCpf(tec.nextLine());
        cpfs.add(getCpf());
        System.out.println("Insira seu telefone");
        setTelefone(tec.nextLine());
        telefones.add(getTelefone());
        System.out.println("Insira sua cidade");
        setCidade(tec.nextLine());
        cidades.add(getCidade());
        System.out.println("Insira seu estado");
        setEstado(tec.nextLine());
        estados.add(getEstado());
        System.out.println("Insira seu nome de usuário");
        setNomeUsuario(tec.nextLine());
        user.add(getNomeUsuario());
        System.out.println("Insira sua senha");
        setSenha(tec.nextLine());
        password.add(getSenha());
        System.out.println("");
        System.out.println("");
        menu();
    }

    @Override
    public void exibirOrientacao() {
      
    }
    
    @Override
    public void menu() {
        int op=0;
        while(op!=6){
            System.out.println("Menu principal:");
            System.out.println("[1]Selecionar sintomas");
            System.out.println("[2]Acessar mensagens");
            System.out.println("[3]sair");
            op= tec.nextInt();
            switch(op){
                case 1:
                    selecionaSintomas();
                break;
                
                case 2:
                    listarMensagens();
                break;
                
                case 3:
                    telaInicial();
                break;
                
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
    
    //funções dos pacientes
    public void listarSintomas(){
        
    }
    
    public void folhaInformativa(){
        
    }
    
    public void selecionaSintomas(){
        String s;
        System.out.println(" ");
        System.out.println("Descreva seus sintomas:");
        System.out.println("Insira seus sintomas separados por espaço.");
        s=tec.nextLine();
        s= tec.nextLine();
        setSintomas(s);
        System.out.println(" ");
    }
    
    
    public void testes(){
        user.add("ttt");
        password.add("ttt");
        nomes.add("ttt");
        cpfs.add("123");
        
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuário) {
        this.nomeUsuario = nomeUsuário;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    
    
}
