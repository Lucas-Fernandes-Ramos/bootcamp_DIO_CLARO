public class PlanoOperadora {
    public static void main(String[] args) {
        String plano="M";

        switch (plano) {
            case "T":
                System.out.println("5Gb youtube");
                break;
                case "M":
                System.out.println("whats e intagram gratis");
                break;
                case "B":
                System.out.println("100 minutos de ligação");
                break;
        
            default:
            System.out.println("Pacote nao disponivel");
                break;
        }
    }
    
}
