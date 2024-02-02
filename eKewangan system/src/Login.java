import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener {

	private static JLabel userLabel;
	static JTextField userText;
	private static JLabel passwordLabel;
	static JPasswordField passwordText;
	static JLabel success;
	private static Container panel;
	private static JLabel pic_ukmpics;
	private static Login frame;
	private static Controller Controller = new Controller();

	public Login() {
		panel = getContentPane();
		panel.setLayout(null);
		panel.setBackground(Color.white);

		panel.setLayout(null);
		pic_ukmpics = new JLabel(new ImageIcon("./src/images/ukm.png"));
		pic_ukmpics.setBounds(250, 50, 190, 107);
		panel.add(pic_ukmpics);

		userLabel = new JLabel("Username");
		userLabel.setBounds(210, 160, 80, 25);
		panel.add(userLabel);

		userText = new JTextField();
		userText.setBounds(300, 160, 165, 25);
		panel.add(userText);

		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(210, 190, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(300, 190, 165, 25);
		panel.add(passwordText);

		Button btn_Login = new Button("Login");
		btn_Login.setBounds(210, 220, 255, 25);
		btn_Login.setBackground(new Color(135, 193, 72));
		btn_Login.setForeground(Color.BLACK);
		panel.add(btn_Login);
		success = new JLabel("");
		success.setBounds(210, 240, 300, 25);
		panel.add(success);
		btn_Login.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Controller.getLogin(this);
	}

	public static void main(String[] args) {
		frame = new Login();
		frame.setBounds(100, 100, 660, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("UKM e-Kewangan System");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
	}
}