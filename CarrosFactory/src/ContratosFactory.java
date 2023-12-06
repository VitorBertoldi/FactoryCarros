public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)) {
            return new CorolaCar(100,"gasolina","preto");
        } else {
            return new unoCar(60,"gasolina","vermelho");
        }
    }
}
