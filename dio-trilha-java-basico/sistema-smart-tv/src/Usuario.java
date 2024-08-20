public class Usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema Claro Smart-TV");

        SmartTv objTv = new SmartTv();

        System.out.println("Status da TV:\n");
        objTv.ligada = true;

        System.out.println("TV está ligada? " + objTv.ligada);
        System.out.println("Canal =  " + objTv.canal);
        System.out.println("Volume =  " + objTv.volume);

        System.out.println("Desligandoa a TV.");
        objTv.desligar();

        System.out.println("TV está ligada? " + objTv.ligada);
        System.out.println("Canal =  " + objTv.canal);
        System.out.println("Volume =  " + objTv.volume);

        System.out.println("Ligando a TV.");
        objTv.ligar();
        System.out.println("Aumentando o volume");
        objTv.aumentarVolume();
        objTv.aumentarVolume();
        objTv.aumentarVolume();
        objTv.aumentarVolume();
        objTv.aumentarVolume();
        objTv.aumentarVolume();

        System.out.println("diminuindo o volume");
        objTv.diminuirVolume();
        objTv.diminuirVolume();
        objTv.diminuirVolume();


        System.out.println("TV está ligada? " + objTv.ligada);
        System.out.println("Canal =  " + objTv.canal);
        System.out.println("Volume =  " + objTv.volume);

        System.err.println("Novo Canal");
        objTv.mudaCanal(10);
        System.out.println("Canal =  " + objTv.canal);

    }
}
