/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadora_cfca.Calculadora;
import calculadora_cfca.Division;
import calculadora_cfca.Multiplicacion;
import calculadora_cfca.Resta;
import calculadora_cfca.Suma;

/**
 *
 * @author lenovo
 */
public class ModeloCalculadora {
    
    public double suma(int num1, int num2){
        Calculadora objCalculadora = new Suma(num1, num2);
        return (objCalculadora.calcular());
    }
    
    public double resta(int num1, int num2){
        Calculadora objCalculadora = new Resta(num1, num2);
        return (objCalculadora.calcular());
    }
    
    public double multiplicacion(int num1, int num2){
        Calculadora objCalculadora = new Multiplicacion(num1, num2);
        return (objCalculadora.calcular());
    }
    
    public double division(int num1, int num2){
        Calculadora objCalculadora = new Division(num1, num2);
        return (objCalculadora.calcular());
    }
    
}
