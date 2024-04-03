/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{
    
    private int packages;
    
    public Van(int packages) {
        this.packages = packages;
        licensePlate = getLicensePlate();
    }

    public int getPackages() {
        return packages;
    }
    
    public void setPackages(int packages) {
        this.packages = packages;
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
