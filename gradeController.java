package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class gradeController implements Initializable {

	@FXML Label lblText, lblName, lblKor, lblEng, lblSum, lblAvg;
	@FXML Button btnSum, btnAvg;
	@FXML TextField txtName, txtKor, txtEng;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	public void btnSumAction(ActionEvent event) {

		int tmpKor = Integer.parseInt(txtKor.getText());
		int tmpEng = Integer.parseInt(txtEng.getText());

		Ex11901Model model = new Ex11901Model();
		DecimalFormat df = new DecimalFormat("#,###");
		
		int tmpSum = model.mul(tmpKor, tmpEng);
		
		lblSum.setText(df.format(tmpSum));
	}
	public void btnAvgAction(ActionEvent event) {

		int tmpKor = Integer.parseInt(txtKor.getText());
		int tmpEng = Integer.parseInt(txtEng.getText());

		Ex11901Model model = new Ex11901Model();
		DecimalFormat df = new DecimalFormat("#,###");
		
		int tmpAvg = model.mul2(tmpKor, tmpEng);
		
		lblAvg.setText(df.format(tmpAvg));
	}
}
