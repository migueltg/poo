package utils;

public class Test {

    public void herencia() {
        Point p = new TimePoint(1, 2, 3);

        // Error: TimePoint pt = new Point(3,2);
        p.getX();
        // Error con p.setT(3);
        ((TimePoint) p).addTime(3); // Error con (TimePoint)p.addTime(3);
    }

    public static void main(String[] args) {
        TimePoint tp = new TimePoint(1, 1, 0);
        System.out.println("velocidad:" + tp.speed());
        System.out.println("ok");
    }

}
