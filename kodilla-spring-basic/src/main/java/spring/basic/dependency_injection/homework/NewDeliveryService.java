package spring.basic.dependency_injection.homework;

public class NewDeliveryService implements DeliveryService{

    @Override
    public boolean deliveryPackage(String address, double weight) {
        if (weight > 30){
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}
