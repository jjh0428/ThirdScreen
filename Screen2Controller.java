package application;

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

public class Screen2Controller implements Initializable {
	@FXML Button btn1open, btn3open, btn2close;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	//1��â����
    public void btn1openAction(ActionEvent event) {
    	try {
			// ����â ����
			Stage stage = (Stage) btn1open.getScene().getWindow();
			Parent root = FXMLLoader.load(getClass().getResource("screen1.fxml"));
			Scene sc1 = new Scene(root, 500, 500);
			sc1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(sc1);
			stage.setTitle("1�� â");
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    //3��â����
    public void btn3openAction(ActionEvent event) {
    	try {
			// ����â ����
			Stage stage = (Stage) btn3open.getScene().getWindow();
			Parent root = FXMLLoader.load(getClass().getResource("screen3.fxml"));
			Scene sc3 = new Scene(root, 500, 500);
			sc3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(sc3);
			stage.setTitle("3�� â");
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    //2��â�ݱ�
    public void btn2closeAction(ActionEvent event) {
    	Stage stage = (Stage) btn2close.getScene().getWindow();
    	stage.close();
    }
	
}
