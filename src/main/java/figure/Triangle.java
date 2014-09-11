package figure;

public class Triangle extends Figure {

    private int base;

    private int height;

    public Triangle(String description, int base, int height) {
        super(description);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }

}
