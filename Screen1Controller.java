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

public class Screen1Controller implements Initializable {
	@FXML Button btn2open, btn3open, btn1close;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	// 2�� â ���� stage ���� scene ���
	public void btn2openAction(ActionEvent event) {
		try {

			// ����â ����
			Stage stage = (Stage) btn2open.getScene().getWindow();
			Parent root = FXMLLoader.load(getClass().getResource("screen2.fxml"));
			Scene sc2 = new Scene(root, 500, 500);
			sc2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(sc2);
			stage.setTitle("2�� â");
			stage.show();

			// ��â����
//			Stage stage = new Stage();
//			Parent root = FXMLLoader.load(getClass().getResource("screen2.fxml"));
//			Scene sc2 = new Scene(root,500,500);
//			sc2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			stage.setScene(sc2);
//			stage.setTitle("2�� â");
//			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 3�� â ����
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

	// 1�� â �ݱ�
	public void btn1closeAction(ActionEvent event) {
		Stage stage = (Stage) btn1close.getScene().getWindow();
		stage.close();

	}
}
