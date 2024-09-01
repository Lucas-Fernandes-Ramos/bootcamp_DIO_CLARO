public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 50.50;
        double valorSolicitado = 20;

        if(valorSolicitado  < saldo){
              saldo = saldo - valorSolicitado;
        }
        System.out.println("Saldo atual: " + saldo);
    }
}
