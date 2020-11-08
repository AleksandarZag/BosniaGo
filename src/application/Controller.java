package application;

import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class Controller implements Initializable {
    @FXML
    private Button Pregledaj;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

	    
			
	}
	public void More(ActionEvent actionEvent) throws IOException
	{
	
		Pregledaj.getScene().getWindow().hide();
		Stage more = new Stage();
	   
	    Parent root = FXMLLoader.load(getClass().getResource("WhereTo.fxml"));
		Scene moreScene = new Scene(root);
		more.setScene(moreScene);
		more.show();
		more.setResizable(false);
		
		
	}
	
}
