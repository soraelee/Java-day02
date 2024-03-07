package member.service;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MemberServiceImpl implements MemberService{
	Parent root;
	ComboBox<String> cmbAge;
	TextField fxName, fxId;
	PasswordField fxPwd, fxPwdChk;
	public CheckBox chkMusic, chkMovie, chkMung;
	public RadioButton rdoWoman;

	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void registerFunc() { 
		cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		fxId = (TextField)root.lookup("#fxId");
		fxName = (TextField)root.lookup("#fxName");

		fxPwd = (PasswordField)root.lookup("#fxPwd");
		fxPwdChk = (PasswordField)root.lookup("#fxPwdChk");
		
		chkMusic = (CheckBox)root.lookup("#chkMusic");
		chkMovie = (CheckBox)root.lookup("#chkMovie");
		chkMung = (CheckBox)root.lookup("#chkMung");
		
		
		System.out.println(cmbAge.getValue());
		if (cmbAge.getValue() == null) {
			System.out.println("콤보 박스를 선택하세요");
			cmbAge.requestFocus();
		}else if (fxId.getText().isEmpty()){
			System.out.println("아이디를 입력하세요");
			fxId.requestFocus();
		}
		System.out.println("id : " + fxId.getText());
		System.out.println("name : " + fxName.getText());
		System.out.println("pwd : " + fxPwd.getText());
		System.out.println("pwd chk : " + fxPwdChk.getText());
		System.out.println("chkMusic : " + chkMusic.isSelected());
		System.out.println("chkMovie : " + chkMovie.isSelected());
		System.out.println("chkMung : " + chkMung.isSelected());
		//둘중 하나는 선택되어야 함
		//woman이 선택되면 true, 아니면 false
		//false가 나오면 man 선택되었다고 판단
	}

	@Override
	public void cancelFunc() {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
		
	}
	
}
