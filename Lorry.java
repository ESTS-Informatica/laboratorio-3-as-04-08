/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation {
    
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(int numberOfPallets, int trailers, String licensePlate) {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    public int getNumberOfPallets() {
        return numberOfPallets;
    }
    public int getTrailers() {
        return trailers;
    }
    
    public void setNumberOfPallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;        
    }
    public void setTrailers(int trailers) {
        this.trailers = trailers;
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
