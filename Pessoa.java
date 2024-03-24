public class Pessoa implements Paciente {
    private String nome;
    private int idade;
    private double peso;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String dizerOla() {
        return "Ola! Meu nome é " + nome + ", Possuo " + idade + " anos e peso " + peso + " KGs";
    }

    public String dizerDoenca() {
        return "Estou me sentindo febril.\n";
    }
}
