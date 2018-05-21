
package blackjack.model;


public class MaoDeCarta {
    private Jogador jogador;
    private Carta[] carta = new Carta[10];
    private static int prox;
    
    public MaoDeCarta(Carta carta, Jogador jogador){
        this.jogador = jogador;
        this.carta[prox] = carta;
        prox++;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void addCarta(Carta carta) {
        this.carta[prox] = carta;
        prox++;
    }

    public static int getProx() {
        return prox;
    }

    public static void setProx(int prox) {
        MaoDeCarta.prox = prox;
    }
    
    
}
