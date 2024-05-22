package calculadora_cfca;
import java.util.*;

/**
 * 
 */
public class Multiplicacion extends Calculadora {

    @Override
    public float calcular() {
        return (getNum1() * numero2);
    }
    
    /**
     * Default constructor
     */
    public Multiplicacion() {

    }

    public Multiplicacion(int val1, int val2) {
        setNum1(val1);
        numero2 = val2;
    }
    

}