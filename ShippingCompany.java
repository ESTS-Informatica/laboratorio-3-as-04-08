import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany extends HashSet<Transport>
{

    private String name;
    private ArrayList<Transport> inService;

    /**
     * Constructor for objects of class ShippingCompany
     */
    public ShippingCompany(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        String transports = "";
        for (Transport transport : inService) {
            transports += transport.toString() + "\n";
        }
        return transports;
    }
    
    public void addTransport(Transport transport) {
        inService.add(transport);
    }
}
