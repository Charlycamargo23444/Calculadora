package calculadora_cfca;
import java.util.*;

/**
 * 
 */
public class Suma extends Calculadora {

    /**
     * Default constructor
     */
    public Suma() {
    }

    @Override
    public float calcular() {
        return (getNum1() + numero2);
    }
    
    public Suma(int val1, int val2) {
        setNum1(val1);
        numero2 = val2;
    }

}