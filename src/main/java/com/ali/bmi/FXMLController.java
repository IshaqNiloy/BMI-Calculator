package com.ali.bmi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML private Label label, label1;
    @FXML private TextField xField,yField;
    
    @FXML
    public void handleButtonAction(ActionEvent event) {
        Test Ob = new Test();
        double x = Double.parseDouble(xField.getText());
        double y = Double.parseDouble(yField.getText());
        Ob.setter(x, y);
        if(Ob.getter() < 18.5){
            label.setText(""+ Ob.getter());
            label1.setText("You are underweight.");
        }else if( Ob.getter() >= 18.5 && Ob.getter() <= 24.9){
            label.setText(""+ Ob.getter());
            label1.setText("You are healthy.");
        }else if(Ob.getter() >= 25.0 && Ob.getter() <= 29.9){
            label.setText(""+ Ob.getter());
            label1.setText("You are overweight.");
        }else{
            label.setText(""+ Ob.getter());
            label1.setText("You are obese.");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         // TODO
       }    
   }
