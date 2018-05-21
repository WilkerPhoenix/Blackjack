
package blackjack.model;


public class Partida {
    public Jogador[] jogadores;
    public int size;

    public Partida(int size) {
        this.jogadores = new Jogador[size];
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
}
