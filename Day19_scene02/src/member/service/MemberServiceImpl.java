package member.service;

import common.CommonService;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberServiceImpl implements MemberService{
	Parent root;
	ComboBox<String> cmbAge;
	TextField fxName, fxId;
	PasswordField fxPwd, fxPwdChk;
	public CheckBox chkMusic, chkMovie, chkMung;
	public RadioButton rdoWoman;
	
	MemberDAO dao;

	public MemberServiceImpl() {
		dao = new MemberDAO();
	}
	
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
		
		rdoWoman = (RadioButton)root.lookup("#rdoWoman");
		
//		System.out.println(cmbAge.getValue());
		String msg = null;
		if (cmbAge.getValue() == null) {
//			System.out.println("�޺� �ڽ��� �����ϼ���");
			msg = "�޺� �ڽ��� �����ϼ���";
			cmbAge.requestFocus();
		}else if (fxId.getText().isEmpty()){
//			System.out.println("���̵� �Է��ϼ���");
			msg = "���̵� �Է��ϼ���";
			fxId.requestFocus();
		}else if (fxPwd.getText().isEmpty()){
			msg = "��й�ȣ�� �Է��ϼ���";
			fxId.requestFocus();
		}else if (fxPwdChk.getText() != fxPwd.getText()){
			msg = "��й�ȣ�� Ȯ�� �ϼ���";
			fxId.requestFocus();
		}
		CommonService.myAlert(msg);
		
		System.out.println("id : " + fxId.getText());
		System.out.println("name : " + fxName.getText());
		System.out.println("pwd : " + fxPwd.getText());
		System.out.println("pwd chk : " + fxPwdChk.getText());
		System.out.println("chkMusic : " + chkMusic.isSelected());
		System.out.println("chkMovie : " + chkMovie.isSelected());
		System.out.println("chkMung : " + chkMung.isSelected());
		//���� �ϳ��� ���õǾ�� ��
		//woman�� ���õǸ� true, �ƴϸ� false
		//false�� ������ man ���õǾ��ٰ� �Ǵ�
		
		
		MemberDTO dto = new MemberDTO();
		dto.setId(fxId.getText());
		dto.setName(fxName.getText());
		dto.setPwd(fxPwd.getText());
		dto.setGender(rdoWoman.isSelected() ? 1 : 0);
		dto.setAge(cmbAge.getValue());
		//���� : 1, ��ȭ : 2, �� : 4
		int hobby = 0;
		if(chkMusic.isSelected()) hobby += 1;
		if(chkMovie.isSelected()) hobby += 2;
		if(chkMung.isSelected()) hobby += 4;
		dto.setHobby(hobby);
		
		int result = dao.register(dto);
		msg = null;
		if (result == 1) {
//			System.out.println("���� ����");
			msg = "���� ����!";
			cancelFunc(); // �ش��ϴ� ���������� �ݾ���
		}else {
//			System.out.println("���� �߻�!!");
			msg = "���� �߻�!!";
		}
		CommonService.myAlert(msg);
	}

	@Override
	public void cancelFunc() {
		CommonService.cancelFunc(root);
		
	}
	
}
