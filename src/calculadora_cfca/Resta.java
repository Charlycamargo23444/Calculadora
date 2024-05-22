package calculadora_cfca;
import java.util.*;

/**
 * 
 */
public class Resta extends Calculadora {

    /**
     * Default constructor
     */
    public Resta() {
    }

    @Override
    public float calcular() {
        return (getNum1() - numero2);
    }
    
    public Resta(int val1, int val2) {
        setNum1(val1);
        numero2 = val2;
    }

}