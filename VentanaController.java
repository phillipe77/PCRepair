package projeto7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

public class VentanaController implements Initializable {

    private Label label;
    @FXML
    private Circle btnClose;
    @FXML
    private StackPane pnlStack;
    @FXML
    private Pane pnlSignUp;
    @FXML
    private ImageView btnBack;
    @FXML
    private TextField tfEmail;
    @FXML
    private PasswordField tfPass;
    @FXML
    private Button btnSignIn;
    @FXML
    private Button btnSignUp;
    @FXML
    private Label lblForgot;
    @FXML
    private Label lblForgot1;
    @FXML
    private Button btnSignIn1;
    @FXML
    private TextField tfEmail1;
    @FXML
    private Label lblForgot11;
    @FXML
    private Pane pnlSignIn;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource().equals(btnSignIn)) 
        {        
        
            pnlSignIn.toFront();
        } 
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }

     
    @FXML
    private void handleMouseEvent(MouseEvent event) {
        if(event.getSource() == btnClose) {
            System.exit(0);
        }
        if(event.getSource().equals(btnBack)) 
        {    
       
            pnlSignUp.toFront();
        }
            
    }
    
}  


        
    
