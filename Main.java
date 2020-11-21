package Trabalho;

public class Main {
    public static void main(String[] args) {
       BlackJack21 bj = new BlackJack21();
       bj.jogador1="Asaph";
       bj.jogador2="Alcemir";
       bj.carta1=3;
       bj.carta2=2;
       bj.carta3=4;
       bj.carta4=5;
       bj.Vencedor();
       bj.Derrota();
       bj.SomaDasCartas();
       bj.Pontuacao1jogador();
       bj.Pontuacao2jogador();
       bj.statusDoJogo();
    }
    
}
