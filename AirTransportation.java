/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport {
    
    private String name;
    private int numberOfContainers;
    private final double FEES = 0.04;

    /**
     * Constructor for objects of class AirTransportation
     */
    public AirTransportation() {
        
    }
    
    public AirTransportation(String name, int numberOfContainers) {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        super.setFees(FEES);
    }

    public String getName() {
        return name;
    }
    public int getNumberOfContainers() {
            return numberOfContainers;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
    
    @Override
    public double getPriceWithFees() {
        return this.getPrice() + (this.getPrice() * this.getFees());
    }
    
    public String getTransportType() {
        return "Air Transport";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", this.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", this.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", this.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", this.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
}
