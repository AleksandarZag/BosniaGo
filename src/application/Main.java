package application;
	
import javafx.application.Application;

import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
	
		Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
		
		Scene scene = (new Scene(root,800,500));
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
			
		 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

