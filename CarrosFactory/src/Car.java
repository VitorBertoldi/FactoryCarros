public abstract class Car {

    private int hoursePower;
    private String fuelSource;
    private String color;

    public Car(int hoursePower, String fuelSource, String color) {
        this.hoursePower = hoursePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("O motor a " + fuelSource + "inicializou e esta pronto para usar " + hoursePower + "cavalos de potencia.");
    }

    public void clean() {
        System.out.println("O carro foi lavado e a cor "+ color+" esta brilhando");
    }

    public void mechanicCheck(){
        System.out.println("O carro foi observado por um mecanico e esta tudo certo!");
    }

    public void fuelCar() {
        System.out.println("O carro foi abastecido com "+ fuelSource);
    }
}
