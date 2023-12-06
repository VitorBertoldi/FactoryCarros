
public class Main {
    public static void main(String[] args) {
        Customer customerOne = new Customer("B",true);
        Factory factory = getCarFactory(customerOne);
        Car carOne = factory.create(customerOne.getGradeRequest());
        carOne.startEngine();
    }

    private static Factory getCarFactory(Customer customer) {
        if(customer.isHasCompanyContract()) {
            return new ContratosFactory();
        }else{
            return new SemContratosFactory();
        }
    }


}