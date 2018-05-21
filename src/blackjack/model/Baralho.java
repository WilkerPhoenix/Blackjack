package blackjack.model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Baralho {

    private ArrayList<Carta> cartas;
    private int numeroBaralhos;

    public Baralho() {
        this.cartas = new ArrayList<>();
    }

    public void criaBaralho() {
        this.lerNumeroBaralhos();
        for (int i = 0; i < numeroBaralhos; i++) {
            for (Naipe cartaNaipe : Naipe.values()) {
                for (Numero cartaNumero : Numero.values()) {
                    adicionaCarta(new Carta(cartaNaipe, cartaNumero));
                }
            }
        }
    }

    public void lerNumeroBaralhos() {
        System.out.print("\nVoce deseja jogar com (U)m ou (D)ois baralhos? <U/D> ");
        Scanner sc = new Scanner(System.in);
        char baralho;
        while (true) {
            baralho = sc.next().toUpperCase().charAt(0);
            if (baralho != 'U' && baralho != 'D') {
                System.out.println("\nDigite somente U ou D.");
            } else {
                break;
            }
            System.out.print("\nVoce deseja jogar com (U)m ou (D)ois baralhos? <U/D> ");
        }
        if (baralho == 'U') {
            this.numeroBaralhos = 1;
        } else {
            this.numeroBaralhos = 2;
        }
    }

    public void embaralha() {
        Random random = new Random();
        ArrayList<Carta> temp = new ArrayList<Carta>();
        int j = 0;
        int numeroCartas = cartas.size();
        for (int i = 0; i < numeroCartas; i++) {
            j = random.nextInt(cartas.size());
            temp.add(cartas.get(j));
            cartas.remove(j);
        }
        cartas = temp;
    }

    private void adicionaCarta(Carta carta) {
        cartas.add(carta);
    }

    private Carta getCarta(int i) {
        return this.cartas.get(i);
    }

    public Carta getUltimaCarta() {
        return this.cartas.get(this.cartas.size() - 1);
    }

    public void entregaCarta(Baralho baralho) {
        cartas.add(baralho.getCarta(0));
        baralho.removeCarta(0);
    }

    private void removeCarta(int i) {
        cartas.remove(i);
    }

    public int valorCarta() {
        int total = 0;
        int as = 0;
        for (Carta carta : cartas) {
            switch (carta.getNumero()) {
                case AS:
                    as += 1;
                    break;
                case DOIS:
                    total += 2;
                    break;
                case TRES:
                    total += 3;
                    break;
                case QUATRO:
                    total += 4;
                    break;
                case CINCO:
                    total += 5;
                    break;
                case SEIS:
                    total += 6;
                    break;
                case SETE:
                    total += 7;
                    break;
                case OITO:
                    total += 8;
                    break;
                case NOVE:
                    total += 9;
                    break;
                case DEZ:
                    total += 10;
                    break;
                case VALETE:
                    total += 10;
                    break;
                case DAMA:
                    total += 10;
                    break;
                case REI:
                    total += 10;
                    break;
            }
        }
        // Um as vale 1 se a soma ultrapssar 21 e vale 11 caso contrario
        for (int i = 0; i < as; i++) {
            // Se a soma das outras cartas eh maior que 10, o as nao pode valer
            // 11, senao o jogador perde o jogo
            if (total > 10) {
                total += 1;
            } else {
                total += 11;
            }
        }
        return total;
    }

    @Override
    public String toString() {
        String listaCartas = "";
        for (Carta carta : cartas) {
            listaCartas += carta.toString() + "\n";
        }
        return listaCartas;
    }

    public String toString(boolean esconderPrimeira) {
        if (!esconderPrimeira) {
            return this.toString();
        } else {
            String listaCartas = "X DE X\n";
            for (int i = 1; i < this.cartas.size(); i++) {
                listaCartas += cartas.get(i).toString();
            }
            return listaCartas;
        }
    }

    public void restartBaralho(Baralho baralho) {
        int tamanhoBaralho = cartas.size();
        for (int i = 0; i < tamanhoBaralho; i++) {
            baralho.adicionaCarta(getCarta(i));
        }
        for (int i = 0; i < tamanhoBaralho; i++) {
            removeCarta(0);
        }
    }

}
