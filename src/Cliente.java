public class Cliente {

    public static void main(String[] args) {

        SistemaAlugaCarro carro = new SistemaAlugaCarro();
        SistemaReservaPassagem passagem = new SistemaReservaPassagem();
        SistemaReservaHotel hotel = new SistemaReservaHotel();

        Facade facade = new Facade(hotel,passagem,carro);

        System.out.println(facade.Operation());


    }

}
