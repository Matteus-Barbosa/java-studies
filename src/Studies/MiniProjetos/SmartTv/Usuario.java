package Studies.MiniProjetos;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();
        System.out.println("Default:");
        System.out.println("TV ligada? "+smartTV.ligada);
        System.out.println("Canal atual? "+smartTV.canal);
        System.out.println("Volume atual? "+smartTV.volume);

        smartTV.ligar();
        System.out.println("\nNovo Status: \n TV ligada? "+smartTV.ligada);

        smartTV.avancarCanal();
        System.out.println(" Canal atual? "+smartTV.canal);

        smartTV.aumentarVolume();
        System.out.println(" Volume atual? "+smartTV.volume);

        smartTV.desligar();
        System.out.println("\nNovo Status: \n TV ligada? "+smartTV.ligada);

        smartTV.retornarCanal();
        System.out.println(" Canal atual? "+smartTV.canal);

        smartTV.diminuirVolume();
        System.out.println(" Volume atual? "+smartTV.volume);

        smartTV.ligar();
        System.out.println("\nNovo Status: \n TV ligada? "+smartTV.ligada);

        smartTV.mudarCanal(12);
        System.out.println(" Canal atual? "+smartTV.canal);

        smartTV.aumentarVolume();
        System.out.println(" Volume atual? "+smartTV.volume);
    }
}
