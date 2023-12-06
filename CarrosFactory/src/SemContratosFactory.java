public class SemContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)) {
            return new Brasilia(200,"gasolina","amarelo");
        } else {
            return new Renegade(120,"diesel","verde");
        }
    }
}
