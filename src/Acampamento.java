public class Acampamento {
    private String nome;
    private char equipe;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println("nome = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
        System.out.println("===================================");
    }

    public void separarGrupo() {
        if (idade >= 6 && idade <= 10) {
            equipe = 'A';
        } else if (idade >= 11 && idade <= 20) {
            equipe = 'B';
        } else if (idade >= 21) {
            equipe = 'C';
        }
    }
}
