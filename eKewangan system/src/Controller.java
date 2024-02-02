import javax.swing.ComboBoxModel;

public class Controller {
	Database db = new Database();
	
	void getLogin(Login Login) {
		if(db.validateUser(Login.userText.getText(), Login.passwordText.getText()))
		Login.dispose();
		else
		Login.success.setText("Invalid username or password!");
		}
	
	String[] getInvoiceNo() {
		return db.getInvoiceNo();
	}
	
	String getAmount(int selectedIndex) {
		return db.getInvoiceAmount(selectedIndex);
	}
	
}
