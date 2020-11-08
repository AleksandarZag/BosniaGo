package application;

import java.io.IOException;
import java.net.URL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ReservationController  implements Initializable {
	 @FXML
	    private TextField txtImeIPrezime;

	    @FXML
	    private TextField txtDestinacija;

	    @FXML
	    private TextField txtBrojKarti;

	    @FXML
	    private TextField txtBrojTelefona;

	    @FXML
	    private RadioButton rbnMan;

	    @FXML
	    private RadioButton rbnWoman;
	    

	    @FXML
	    private Button reservationinfo;
		
	
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
				
		}
public void SaveAction(ActionEvent e) throws Exception {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");

					Connection conn = DriverManager.getConnection("jdbc:mysql:"
							+ "//localhost:3306/"
							+ "bosniawhere?autoReconnect=true&useSSL=false" 
							,"root","");
					String sql  = "INSERT INTO lokacije "
							+ "(ImeIPrezime,Spol,Destinacija,BrojKarti,BrojTelefona) "
							+ "VALUES (?,?,?,?,?)";
					PreparedStatement statement = conn.prepareStatement(sql);
					
					
				statement.setString(1, txtImeIPrezime.getText());
				statement.setString(2, getGender());
				statement.setString(3, txtDestinacija.getText());
				statement.setString(4, txtBrojKarti.getText());				
				statement.setString(5, txtBrojTelefona.getText());
				int rows = statement.executeUpdate();
				if(rows > 0 ) {
					System.out.println("A row has been inserted");
				}
               statement.close();
               conn.close();
	          
	          } catch(SQLException e1) {
	        	  System.out.println("Oops");
	          }
}
	        	  
		public  String getGender() {
		    
			String Spol ="";
			
			if(rbnMan.isSelected())
			{
				Spol = "Musko";
			} else if (rbnWoman.isSelected())
			{
				Spol = "Zensko";
			}
			
			 return Spol;
		 }
		public void ReserveInfo(ActionEvent e1) throws IOException
		{
			
			reservationinfo.getScene().getWindow().hide();
			Stage info = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("ReservationInf.fxml"));
			Scene infoScene = new Scene(root);
			info.setScene(infoScene);
			info.show();
			info.setResizable(false);
			
			
		}
}
