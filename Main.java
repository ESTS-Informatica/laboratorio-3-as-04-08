
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        ShippingCompany shippingCompany = new ShippingCompany("RELIABLE-MOVING");
        
        shippingCompany.addTransport(new GroundTransportation("AB-123"));
        shippingCompany.addTransport(new AirTransportation("A", 1));
        shippingCompany.addTransport(new AirTransportation("B", 2));
        shippingCompany.addTransport(new Lorry(3, 4, "CD-456"));
        shippingCompany.addTransport(new Van(5, "EF-789"));
    }
}
