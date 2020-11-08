package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class InfoController implements Initializable{

	
	@FXML
    private TableView<ModelTable> table;
    @FXML
    private TableColumn<ModelTable,String> col_ID;

    @FXML
    private TableColumn<ModelTable,String> col_Ime;

    @FXML
    private TableColumn<ModelTable,String> col_Spol;

    @FXML
    private TableColumn<ModelTable,String> col_Destinacija;

    @FXML
    private TableColumn<ModelTable,String> col_BrojKarti;

    @FXML
    private TableColumn<ModelTable,String> col_BrojTelefona;
    
    ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
	
    
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	
    	try {
    		    Connection con = DBConn.getConnection();
			
				ResultSet rs = con.createStatement().executeQuery("select * from lokacije");
			while (rs.next()) {
				oblist.add(new ModelTable(rs.getString("idRezervacije"),rs.getString("ImeIPrezime"),
						rs.getString("Spol"),rs.getString("Destinacija"),rs.getString("BrojKarti"),
						rs.getString("BrojTelefona")));
			}
    	} catch (SQLException ex) {
    		printStackTrace(ex);
    	}
    	
    	col_ID.setCellValueFactory(new PropertyValueFactory<>("id"));
		col_Ime.setCellValueFactory(new PropertyValueFactory<>("imePrezime"));
		col_Spol.setCellValueFactory(new PropertyValueFactory<>("spol"));
		col_Destinacija.setCellValueFactory(new PropertyValueFactory<>("destinacija"));
		col_BrojKarti.setCellValueFactory(new PropertyValueFactory<>("brojKarti"));
		col_BrojTelefona.setCellValueFactory(new PropertyValueFactory<>("brojTelefona"));
	    
		table.setItems(oblist);
	}



	private void printStackTrace(SQLException ex) {
		
	}
	

}
