public class Operadores {
    public static void main(String[] args) {
        System.out.println("Estudando sobre os operadores em Java");
        System.out.println("****************************************");
        System.out.println("Atribuição operador de  [=] ");
        int numero01 = 0;
        numero01 = 10;
        System.out.println(numero01);
        System.out.println("****************************************");

        System.out.println("****************************************");
        System.out.println("Concatenação  operador de [+], quando se trabalha com texto");
        String nome = "Lucas";
        String sobreNome = "Fernandes";
        String nomeCompleto = nome + sobreNome;
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + 1 + "1" + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1);
        System.out.println(concatenacao);

        System.out.println("****************************************");

        System.out.println("Operadores Unarios [+ ,-, --, ++ , !]");
        int valor01 = -1;
        valor01++;
        ++valor01;
        --valor01;
        valor01--;
        System.out.println(valor01);
        System.out.println("****************************************");

        //Realizar estudos nos operadores abaixo,
        System.out.println("Operadores de Igualdade == ");
        System.out.println("Operadores Aritmeticos + - * /  ");
        System.out.println("Operadores Relacionais  < > <= >=  !=");
        System.out.println("Operadores logicos  &&   ||   ");
        System.out.println("****************************************");
    }

}
