import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Paciente paciente;

        do{
            System.out.println("Escolha o tipo de paciente:");
            System.out.println("1 - Pessoa");
            System.out.println("2 - Cachorro");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    paciente = new Pessoa("", 0, 0);
                    break;

                case 2:
                    paciente = new Cachorro("", 0, 0);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    paciente = null;
                    break;

            }

            if (paciente != null) {
                System.out.println("Digite o nome do paciente: ");
                paciente.setNome(scanner.next());

                System.out.println("Digite a idade do paciente: ");
                paciente.setIdade(scanner.nextInt());

                System.out.println("Digite o peso do paciente: ");
                paciente.setPeso(scanner.nextDouble());

                qualOSeuNome(paciente);
                qualOSeuProblema(paciente);
            }
        }while (opcao != 3);

        scanner.close();
    }

    public static void qualOSeuNome(Paciente paciente) {
        System.out.println(paciente.dizerOla());
    }

    public static void qualOSeuProblema(Paciente paciente) {
        System.out.println(paciente.dizerDoenca());
    }
}