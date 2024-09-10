public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("123.123.12");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
            // TODO Auto-generated catch block
            System.out.println("O Cep nao corresponde com a formatação");
        }
        
    }


    static String formatarCep(String cep) throws CepInvalido{
        if(cep.length() !=8)
            throw new CepInvalido();
            //simulando um cep formatado
            return "23.765-064";        
    }
}
