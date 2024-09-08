public class ExemploBreakContinue {
    public static void main(String[] args) {
       System.out.println("Usando Break.\n");
        for(int cont=0; cont<10; cont++){
            if(cont == 3 ){
                break;
            }
            System.out.println("\nnumero = " + cont);

        }

        System.out.println("Usando Continue.\n");
        for(int cont=0; cont<10; cont++){
            if(cont == 3 ){
                continue;
            }
            System.out.println("\nnumero = " + cont);

        }
    }
    
}
