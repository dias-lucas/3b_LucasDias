package br.edu.ifro;

import br.edu.ifro.modelo.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class AlunoController implements Initializable {

    @FXML
    private TextField txtNome;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void fecharTela(ActionEvent event) {
        
    }

    @FXML
    private void salvarCadastro(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome(txtNome.getText());
        
        em.getTransaction().begin();
        
        
        em.getTransaction().commit();
    }

    @FXML
    private void txtNome(ActionEvent event) {
    }
    
}
