package utils;

public class TimePoint extends Point {
    private int t;

    public TimePoint(int x, int y, int t) {
        super(x, y); // Si no se especifica, es: super();
        this.setT(t);
    }

    public TimePoint() {
        this(0, 0, 0);
    }

    public int getT() {
        return this.t;
    }

    private void setT(int t) {
        assert t >= 0 : "tiempo negativo es inválido";
        this.t = t;
    }

    public void addTime(int t) {
        this.setT(this.t + t);
    }

    public double speed() {
        return this.module() / this.getT();
    }

}
