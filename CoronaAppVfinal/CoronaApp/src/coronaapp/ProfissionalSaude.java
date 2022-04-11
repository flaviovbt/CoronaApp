/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaapp;

import static coronaapp.CoronaApp.telaInicial;
import static coronaapp.CoronaApp.telaLogin;
import java.util.ArrayList;

/**
 *
 * @author Valdecir
 */
public class ProfissionalSaude extends Pessoa{
    private String profissao;
    ArrayList<String> profissoes= new ArrayList<>();
    //funções comuns da classe pessoa
    @Override
    public void efetuarLogin(String usuario, String senha) {
        String usuarios[]= user.toArray(new String[user.size()]);
        String senhas[]= password.toArray(new String[password.size()]);
        int validar =0;
        int i;
        for (i=0;i<usuarios.length;i++) {
            if(usuario.equals(usuarios[i])){
                    if(senha.equals(senhas[i])){
                        validar=1;
                        System.out.println("Bem-vindo(a)");
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
        
    }
    
    @Override
    public void cadastrar() {
        System.out.println("Insira Seu nome");
        setNome(tec.nextLine());
        nomes.add(getNome());
        System.out.println("Isira sua idade");
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
        System.out.println("Isira seu estado");
        setEstado(tec.nextLine());
        estados.add(getEstado());
        System.out.println("Isira sua profissão");
        setProfissao(tec.nextLine());
        profissoes.add(getProfissao());
        System.out.println("Isira seu nome de usuário");
        setNomeUsuario(tec.nextLine());
        user.add(getNomeUsuario());
        System.out.println("Insira sua senha");
        setSenha(tec.nextLine());
        password.add(getSenha());
        menu();
    }

    @Override
    public void exibirOrientacao() {
        
    }
    
    @Override
    public void menu() {
        int op=0;
        String teste;
        while(op!=8){
            System.out.println("Menu principal:");
            System.out.println("[1]Orientações");
            System.out.println("[2]Entrar em contato");
            System.out.println("[3]Filtrar cadastros");
            System.out.println("[4]sair");
            op= tec.nextInt();
            teste= tec.nextLine();
            switch(op){
                case 1:
                    System.out.println("");
                    OrientacoesPS p = new OrientacoesPS();
                    p.listarOrientacoes();
                    System.out.println("");
                break;
                             
                case 2:
                    entarEmContato();
                break;
                
                case 3:
                    filtrarCadastros();
                break;
                
                case 4:
                    telaInicial();
                break;
                
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
    
    //funções do profissional de saúde 
    public void entarEmContato(){
        String cpf;
        String mensagem;
        String remetente;
        System.out.println("Insira o cpf do paciente a receber a mesnagem");
        cpf= tec.nextLine();
        System.out.println("Insira a mensagem [enter] para enviar");
        mensagem = tec.nextLine();
        System.out.println("Descreva quem mandou essa mensagem");
        remetente=tec.nextLine();
        mensagens.add(mensagem);
        destinatarios.add(cpf);
        remetentes.add(remetente);
    }
    
    public void filtrarCadastros(){
        int i;
        String nomePac[]= Paciente.nomes.toArray(new String[Paciente.nomes.size()]);
        
        
        System.out.println("Lista de pacientes:");
        for(i=0;i<nomePac.length;i++){
            System.out.println("Nome: "+ nomePac[i]);
        }
    }
    
    public void testes(){
        user.add("ttt");
        password.add("ttt");
        nomes.add("ttt");
     
        //remetentes.add("alguem");   
        //mensagens.add("algo");
        //destinatarios.add("123");
    }


    //getters e setters 
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
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

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
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
