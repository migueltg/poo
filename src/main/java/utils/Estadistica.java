package utils;

public interface Estadistica {
    public static final int MAX_VALORES = 10;

    public void addMuestra(double muestra);

    public int numMuestras();  
    public void limpiar();
    public int positivos();
    public int negativos();
    public int ceros();
    public double mayor();
    public double menor();
    public double media();//Suma de valores dividido por el número de valores
    public double varianza();//suma de lor (valores)al cuadrado dividido por el numero de valores - media al cuadrado
}
