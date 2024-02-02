
public class Database {
	String username="A179830";
	String password="akmal";
	String invoiceNo[]= {"INV 1128142", "INV 1098467"};
	String invoiceAmount[]= {"RM 940.00", "RM 1,200.00"};
	Login lg = new Login();

	String getUsername() {
		return username;	
	}

	String getPassword() {
		return password;
	}

	boolean validateUser(String username, String password) {
		if(username.equalsIgnoreCase(getUsername()) && password.equals(getPassword())) {
			Profile home = new Profile();
			home.setVisible(true);
			home.setSize(660, 400);
			home.setLocationRelativeTo(null);
			return true;
		}
		else
			return false;
	}

	String[] getInvoiceNo() {
		return invoiceNo.clone();
	}
	
	String getInvoiceAmount(int selectedIndex) {
		return invoiceAmount[selectedIndex];
	}
}
