public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Teve ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? : " +smartTv.canal);
        System.out.println("Volume Atual? : " +smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual? : " +smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual? : " +smartTv.canal);

        System.out.println("Volume Atual? :" +smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> Teve Ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> Teve Ligada? " + smartTv.ligada);

    }
}