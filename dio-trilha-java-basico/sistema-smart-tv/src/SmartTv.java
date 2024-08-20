public class SmartTv {
    // Declarando as variaveis
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    // definindo os metodos
    void mudaCanal(int novoCanal) {
        canal = novoCanal;
    }

    void aumentarCanal() {
        canal++;
    }

    void diminuirCanal() {
        canal--;
    }

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;

    }

    void aumentarVolume() {
        volume++;
    }

    void diminuirVolume() {
        volume--;
    }
}
