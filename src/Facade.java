public class Facade {

    protected SistemaReservaHotel sysHotel;
    protected SistemaReservaPassagem sysPassagem;
    protected SistemaAlugaCarro sysAlugaCarro;

    public Facade(SistemaReservaHotel sysHotel,SistemaReservaPassagem sysPassagem,SistemaAlugaCarro sysAlugaCarro){
        this.sysAlugaCarro=sysAlugaCarro;
        this.sysHotel=sysHotel;
        this.sysPassagem=sysPassagem;
    }

    public String Operation(){
        String result="Facade inicializa subsistemas: \n";
        result+=this.sysAlugaCarro.operation1();
        result+=this.sysPassagem.operation1();
        result+=this.sysHotel.operation1();

        result+="Facade orders subsistemas to perform the action : \n";

        result+=this.sysHotel.operationN();
        result+=this.sysAlugaCarro.operationX();
        result+=this.sysPassagem.operationH();

        return result;

    }


}
