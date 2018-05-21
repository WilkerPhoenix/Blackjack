
package blackjack.controller;

import blackjack.model.Jogador;
import blackjack.model.Login;
import blackjack.util.LinkedList;


public class BlackJackController {
    
    private LinkedList login;
    private LinkedList cartas;
    private LinkedList jogadores;
    
    public BlackJackController(){
        this.jogadores = new LinkedList();
        this.login = new LinkedList();
        this.cartas = new LinkedList();
    }
    
    public void cadastrarJogadores(String nome, String email, String senha){
            Jogador jogador = new Jogador(nome,email);
            Login loginJogador = new Login(email,senha);
            
            this.login.inserirFinal(loginJogador);
            this.jogadores.inserirFinal(jogador);
    } 
}
