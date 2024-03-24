public class Cachorro implements Paciente {
    private String nome;
    private int idade;
    private double peso;

    public Cachorro(String nome, int idade, double peso) {
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
        return "Au... Au...";
    }

    public String dizerDoenca() {
        return "Cainnn...";
    }
}
