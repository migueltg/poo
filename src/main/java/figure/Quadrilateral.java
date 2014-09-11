package figure;

public class Quadrilateral extends Figure {
    private int lado;

    public Quadrilateral(String description, int lado) {
        super(description);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrilateral [lado=" + lado + "]";
    }
    
}
