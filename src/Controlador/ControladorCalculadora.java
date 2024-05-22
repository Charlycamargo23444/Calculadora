/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FrmCalculadora;
import Modelo.ModeloCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class ControladorCalculadora implements ActionListener{
    
    FrmCalculadora _view;
    ModeloCalculadora _model;
    String leyenda;
    double resultado;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == _view.btnSuma) {
            resultado = _model.suma(Integer.parseInt(_view.txtNum1.getText()), Integer.parseInt(_view.txtNum2.getText()));
            leyenda = String.valueOf(resultado);
            _view.txtResultado.setText(leyenda);
            System.out.println(_view.txtNum1.getText() + " " + _view.txtNum2.getText());
            System.out.println(resultado);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }

        if (e.getSource() == _view.btnResta) {
            resultado = _model.resta(Integer.parseInt(_view.txtNum1.getText()), Integer.parseInt(_view.txtNum2.getText()));
            leyenda = String.valueOf(resultado);
            _view.txtResultado.setText(leyenda);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }

        if (e.getSource() == _view.btnMult) {
            resultado = _model.multiplicacion(Integer.parseInt(_view.txtNum1.getText()), Integer.parseInt(_view.txtNum2.getText()));
            leyenda = String.valueOf(resultado);
            _view.txtResultado.setText(leyenda);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }

        if (e.getSource() == _view.btnDiv) {
            resultado = _model.division(Integer.parseInt(_view.txtNum1.getText()), Integer.parseInt(_view.txtNum2.getText()));
            leyenda = String.valueOf(resultado);
            _view.txtResultado.setText(leyenda);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
    
    public ControladorCalculadora(FrmCalculadora view, ModeloCalculadora model){
        this._model = model;
        this._view = view;
        this._view.btnSuma.addActionListener(this);
        this._view.btnResta.addActionListener(this);
        this._view.btnMult.addActionListener(this);
        this._view.btnDiv.addActionListener(this);
    }
    
    public void limpiar(){
        _view.txtNum1.setText(null);
        _view.txtNum2.setText(null);
        _view.txtResultado.setText(null);
    }
}

