package operations;

public class Operations {
    // MAL DISEÑADO... MAL CODIFICADO
    public int total(Object[] operandos) {
        int result = 0;
        for (Object operando : operandos) {
            if (operando.getClass().getName().equals("Addition")) {
                result += ((Addition) operando).add();
            } else if (operando.getClass().getName().equals("Subtraction")) {
                result += ((Subtraction) operando).subtract();
            }
        }
        return result;
    }
}
