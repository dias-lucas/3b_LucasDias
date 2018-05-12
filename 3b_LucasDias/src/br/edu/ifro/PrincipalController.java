package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


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

    @FXML
    private void abrirCadastros(ActionEvent event) {
        try {
    FXMLLoader fxmlLoader =  new FXMLLoader ();
    fxmlLoader . setLocation (getClass().getResource ("aluno.fxml"));
    Scene scene =  new  Scene (fxmlLoader.load(), 900 , 682 );
    Stage stage =  new  Stage ();
    stage.setTitle("Cadastrar Aluno");
    stage.setScene(scene);
    stage.show();
}
catch ( IOException e) {

}
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
        
    }
    
}
