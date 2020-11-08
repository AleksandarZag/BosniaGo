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



public class WhereToController implements Initializable {
	
	@FXML
    private Button reservation;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	    
	}
	public void Reserve(ActionEvent e) throws IOException
	{
		reservation.getScene().getWindow().hide();
		Stage reserve = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Rezervacija.fxml"));
		Scene reserveScene = new Scene(root);
		reserve.setScene(reserveScene);
		reserve.show();
		reserve.setResizable(false);
		
		
	}
	
}
