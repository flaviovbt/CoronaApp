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
public class FolhaInformativa {
    private String medidasPrevencao;
    private int taxaRecuperacao, pacientesInternados, ocupacaoLeitos;

    public FolhaInformativa() {
        this.taxaRecuperacao = 85;
        this.pacientesInternados = 21869;
        this.ocupacaoLeitos = 79;
        this.medidasPrevencao = "Lave suas mãos com frequência. Use sabão e água ou álcool em gel.\n" +
                                "Mantenha uma distância segura de pessoas que estiverem tossindo ou espirrando.\n" +
                                "Use máscara quando não for possível manter o distanciamento físico.\n" +
                                "Não toque nos olhos, no nariz ou na boca.\n" +
                                "Cubra seu nariz e boca com o braço dobrado ou um lenço ao tossir ou expirar.\n" +
                                "Fique em casa se você se sentir indisposto.\n" +
                                "Procure atendimento médico se tiver febre, tosse e dificuldade para respirar.";
    }
    
    public void exibirDados(){
        System.out.println("--------------------------------");
        System.out.println("Folha Informativa:");
        System.out.println("Taxa de Recuperação do CoronaVírus: "+ this.taxaRecuperacao + " %");
        System.out.println("Quantidade de pacientes internados em São Paulo: "+ this.pacientesInternados + " pacientes");
        System.out.println("Taxa de Leitos ocupados em São Paulo: "+ this.ocupacaoLeitos + " %");
        System.out.println("Medidas de Prevenção:");
        System.out.println(this.medidasPrevencao);
    }
}
