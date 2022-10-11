
public class PopulationMove {

    private int fromSido;
    private int toSido;

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public PopulationMove(String fromSido, String toSido){
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }
}
