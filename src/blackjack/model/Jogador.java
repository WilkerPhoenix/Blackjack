
package blackjack.model;

public class Jogador {
    private String email;
    private String nome;
    private int score;
    private int winlose;

    public Jogador(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWinlose() {
        return winlose;
    }

    public void setWinlose(int winlose) {
        this.winlose = winlose;
    }

    @Override
    public String toString() {
        return "Jogador:{" + nome + "\nScore:" + score + "\nPartidas vencidas:" + winlose;
    }

  
    
}
