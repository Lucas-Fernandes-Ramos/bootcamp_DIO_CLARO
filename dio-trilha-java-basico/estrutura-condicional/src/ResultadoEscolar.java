public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if (nota >= 7) {
            System.out.println("\nAprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("\nRecuperação");
        }else{
            System.out.println("\nReprovado");
        }
    }
}
