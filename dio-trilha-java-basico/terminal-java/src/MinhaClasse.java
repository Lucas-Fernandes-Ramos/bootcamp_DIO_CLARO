import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Trababalhando com a Classe Scanner\n");

       Scanner in = new Scanner(System.in);
       System.out.println("Digite seu nome:");
       String nome = in.nextLine();

       System.out.println("Digite seu sobrenome:");
       String sobreNome = in.nextLine();

       System.out.println("Digite sua idade:");
       int idade = in.nextInt();


       System.out.println("Meu nome é " + nome + " "+ sobreNome + " e " + " tenho " + idade + " lucasluanos");
    }
}
