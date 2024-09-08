import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        double mesada = 50.0;
        int totalDoce = 0;
        while(mesada > 0 ){
            Double valorDoce = valorAleatorio();
           /*  if(valorDoce > mesada){
                valorDoce = mesada;
            */
                System.out.println("Valor do doce = " + valorDoce + "Adicionado ao carrinho ");
                mesada = mesada - valorDoce;
                totalDoce++;
            
            System.out.println("Mesada = " + mesada ) ;
            System.out.println("Joazinho gastou toda sua mesada com doces ");
            System.out.println("Total de doces = " + totalDoce);
        }
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
    
}
