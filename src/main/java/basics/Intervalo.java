package basics;

public class Intervalo {
    public Intervalo(int min, int max) {
    }

    public Intervalo() {
    }

    public int getMin() {
        return 0;
    }

    public int getMax() {
        return 0;
    }
    
    public boolean incluido(Intervalo otro){
        return false;
    }
    
    public boolean solapado(Intervalo otro){
        return false;
    }
    
    public boolean concatenado(Intervalo otro){
        return false;
    }
}
