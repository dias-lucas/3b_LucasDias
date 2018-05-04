package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class PrincipalController implements Initializable {

    @FXML
    private TextField txtNum1, txtNum2, txtResultado;
    
    @FXML
    private Button btnSoma, btnSubtraçao, btnMultiplicaçao, btnDivisao;
    
    @FXML
    private void somar(ActionEvent ae){
        Double num1 = Double.parseDouble(txtNum1.getText());
        Double num2 = Double.parseDouble(txtNum2.getText());
        Double resultado = num1 + num2;
        
        txtResultado.setText(resultado.toString());
    }
    
    @FXML
    private void subtrair(ActionEvent ae){
        Double num1 = Double.parseDouble(txtNum1.getText());
        Double num2 = Double.parseDouble(txtNum2.getText());
        Double resultado = num1 - num2;
        
        txtResultado.setText(resultado.toString());
    }
    
    @FXML
    private void dividir(ActionEvent ae){
        Double num1 = Double.parseDouble(txtNum1.getText());
        Double num2 = Double.parseDouble(txtNum2.getText());
        Double resultado = num1 / num2;
        
        txtResultado.setText(resultado.toString());
    }
    
    @FXML
    private void multiplicar(ActionEvent ae){
        Double num1 = Double.parseDouble(txtNum1.getText());
        Double num2 = Double.parseDouble(txtNum2.getText());
        Double resultado = num1 * num2;
        
        txtResultado.setText(resultado.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
