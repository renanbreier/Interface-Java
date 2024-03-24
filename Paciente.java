import java.util.Scanner;

public interface Paciente {
    void setNome(String nome);
    void setIdade(int idade);
    void setPeso(double peso);
    String dizerOla();
    String dizerDoenca();
}
