/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_cfca;

import Controlador.ControladorCalculadora;
import Modelo.ModeloCalculadora;
import Vista.FrmCalculadora;

/**
 *
 * @author lenovo
 */
public class Calculadora_CFCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmCalculadora objVista = new FrmCalculadora();
        ModeloCalculadora objModelo = new ModeloCalculadora();
        objVista.setVisible(true);
        ControladorCalculadora objControlador = new ControladorCalculadora(objVista, objModelo);
    }
    
}
