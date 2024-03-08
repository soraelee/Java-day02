package login.service;

import common.CommonService;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import login.dao.LoginDAO;
import login.dto.LoginDTO;
import member.main.MemberMain;

public class LoginServiceImpl implements LoginService{
	private LoginDAO dao;
	public LoginServiceImpl() {
		dao = new LoginDAO();
	}
	@Override
	public void loginFunc(TextField fxId, TextField fxPwd) {
		System.out.println("---- ���� �α��� Ȯ�� ----");
		
		System.out.println("id :" + fxId.getText());
		System.out.println("pwd :" + fxPwd.getText());
		//LoginDTO dto = LoginDAO.db.get(fxId.getText());
		
		LoginDTO dto = dao.getUser(fxId.getText());
		
		System.out.println("dto : " + dto); //�ִ� ���� ������ ��� ��ü��, ���� ��� null��
		
		String msg = null;
		
//		Alert alert =  new Alert(AlertType.INFORMATION);
			
		
		if (dto != null) {
			if(dto.getPwd().equals(fxPwd.getText())) {
				msg = dto.getName() + "�� ���� ����!";
			}else {
				msg = "��й�ȣ Ʋ��!";
			}
		}else {
			msg = "�������� �ʴ� ���̵� �Դϴ�";
		}
		CommonService.myAlert(msg);
//		alert.setContentText(msg); alert.show();
		
	}

	@Override
	public void cancleFunc(Parent root) {
		System.out.println("---- ���� â �ݱ� ----");
//		Stage stage = (Stage)root.getScene().getWindow();
//		stage.close(); //����ϸ� �����ϴ�
		CommonService.cancelFunc(root);
	}

	// ȸ������ â�� �����ϴ� �κ�
	@Override
	public void registerFunc() {
		System.out.println("---- ���� ȸ������ ���� ----");
		MemberMain member = new MemberMain();
		member.viewFx();
	}
	public void registerFunc(Parent root) {
		System.out.println("---- ���� ȸ������ ���� ----");
		MemberMain member = new MemberMain();
		//member.viewFx();
		member.viewFx(root);
	}
	
}
