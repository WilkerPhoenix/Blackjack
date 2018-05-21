/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.view;

import blackjack.controller.BlackJackController;
import blackjack.util.Console;
import java.io.IOException;

public class View {

    public static void main(String[] args) throws IOException {
        BlackJackController controller = new BlackJackController();
        System.out.println("Olá, Bem Vindo ao BlackJackPot");
        System.out.println("Antes de iniciar o jogo, necessita-se de um cadastro, afim de recolher as pontuações dos jogadores!");
        System.out.println("- Seu nome de jogador -");
        System.out.println("Insira aqui: ");
        String nome = Console.readString();
        System.out.println("- Seu email -");
        System.out.println("Insira aqui:");
        String email = Console.readString();
        System.out.println("- Informe uma senha -");
        String senha = Console.readString();
        controller.cadastrarJogadores(nome, email, senha);
    }

}
