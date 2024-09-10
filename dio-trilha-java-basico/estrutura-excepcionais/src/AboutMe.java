import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);

            System.out.println("digite seu nome ");
            String nome = entrada.nextLine();
            System.out.println("digite seu sobrenome ");
            String sobre_nome = entrada.nextLine();
            System.out.println("digite sua idade ");
            int idade = entrada.nextInt();
            System.out.println("digite sua Altura ");
            double altura = entrada.nextDouble();

            // imprindo os dados obtidos pelo usuario
            System.out.println("Olá me chamo " + nome.toUpperCase() + " " + sobre_nome + "\n");
            System.out.println("Tenho " + idade + " anos \n");
            System.out.println("Minha altura é " + altura + "cm \n");

        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numericos:");

        }

    }
}
