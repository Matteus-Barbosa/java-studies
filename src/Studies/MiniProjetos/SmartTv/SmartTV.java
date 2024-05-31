package Studies.MiniProjetos;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
    public void avancarCanal(){
        canal ++;
    }
    public void retornarCanal(){
        canal --;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo volume para: " + volume);
    }
}

