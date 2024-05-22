package calculadora_cfca;

import java.util.*;

/**
 * 
 */
public abstract class Calculadora {
    
    private int numero1;
    int numero2;

    /**
     * Default constructor
     */
    public Calculadora() {
        
    }   
    
    public abstract float calcular();

    public int getNum1() {
        return numero1;
    }

    public void setNum1(int num1) {
        this.numero1 = num1;
    }

    public int getNum2() {
        return numero2;
    }

    public void setNum2(int num2) {
        this.numero2 = num2;
    }
    
}