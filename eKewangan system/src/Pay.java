import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Pay extends JFrame {
	
	private static Container pane;
	private static JPanel pnl_titlePayment;
	private static JLabel lbl_title;
	private static JPanel pnl_Paymentform;
	private static JLabel lbl_category;
	private static JComboBox cmb_InvoiceNo;
	private static JLabel lbl_Paymentfor;
	private static JTextField txt_amount;
	private static JLabel lbl_amount;
	private static JTextField txt_amountToPay;
	private static JPanel pnl_button;
	private static JButton btn_Pay;
	private static JPanel pnl_backPayment;
	private static Pay frame;
	private static JLabel ok;
	
	Controller Controller = new Controller();
	
	public Pay() {
		pane = getContentPane();
		pane.setLayout(null);
		pane.setBackground(Color.white);
		
		pnl_titlePayment = new JPanel();
		pnl_titlePayment.setBackground(new Color(135, 193, 72));
		pnl_titlePayment.setBounds(10, 11, 619, 45);
		pane.add(pnl_titlePayment);
		
		lbl_title = new JLabel("Pay");
		lbl_title.setForeground(Color.WHITE);
		pnl_titlePayment.add(lbl_title);
		lbl_title.setFont(new Font("Ebrima", Font.BOLD, 26));
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		pnl_titlePayment.add(lbl_title);
		
		pnl_Paymentform = new JPanel();
		pnl_Paymentform.setBackground(Color.WHITE);
		pnl_Paymentform.setBounds(10, 67, 619, 87);
		pane.add(pnl_Paymentform);
		pnl_Paymentform.setLayout(new GridLayout(3, 2));
		
		lbl_category = new JLabel("Invoice No.");
		pnl_Paymentform.add(lbl_category);
		
		cmb_InvoiceNo = new JComboBox(Controller.getInvoiceNo());
		cmb_InvoiceNo.setBackground(Color.WHITE);
		pnl_Paymentform.add(cmb_InvoiceNo);
		
		lbl_Paymentfor = new JLabel("Amount Needed to Pay");
		pnl_Paymentform.add(lbl_Paymentfor);
		
		txt_amount = new JTextField();
		txt_amount.setColumns(10);
		pnl_Paymentform.add(txt_amount);
		
		lbl_amount = new JLabel("Amount to Pay(RM) *above RM5 only");
		pnl_Paymentform.add(lbl_amount);
		
		txt_amountToPay = new JTextField("0");
		txt_amountToPay.setColumns(10);
		pnl_Paymentform.add(txt_amountToPay);
		
		pnl_button = new JPanel();
		pnl_button.setBackground(Color.WHITE);
		pnl_button.setBounds(10, 165, 619, 55);
		pnl_button.setLayout(null);
		pane.add(pnl_button);
		
		ok = new JLabel("");
		ok.setBounds(280, 220, 200, 50);
		pane.add(ok);
		
		btn_Pay = new JButton("Pay");
		btn_Pay.setBackground(new Color(135, 193, 72));
		btn_Pay.setForeground(Color.WHITE);
		btn_Pay.setBounds(520, 11, 89, 33);
		pnl_button.add(btn_Pay);
		btn_Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount = Integer.parseInt(txt_amountToPay.getText());
				if(txt_amount.getText().equals("")) {
					JOptionPane.showMessageDialog(pane, "There is an error");					
				}
				else {
					if(amount > 4) {
						int success = JOptionPane.showConfirmDialog(pane, "Are you sure to continue this transaction?", "Confirm Payment", JOptionPane.YES_NO_OPTION);
						if (success==JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(pane, "Your Payment is successfully.");
							ok.setText("Payment successful");
						}
						else {
							ok.setText("Payment cancel");						}
						}
					else {
						ok.setText("Invalid amount");
					}
				}			
			}
		});
		
		pnl_backPayment = new JPanel();
		pnl_backPayment.setLayout(null);
		pnl_backPayment.setBackground(Color.WHITE);
		pnl_backPayment.setBounds(10, 267, 619, 55);
		pane.add(pnl_backPayment);
		
		Button btn_backPayment = new Button("Back");
		btn_backPayment.setBackground(new Color(135, 193, 72));
		btn_backPayment.setForeground(Color.WHITE);
		btn_backPayment.setBounds(267, 11, 89, 33);
		pnl_backPayment.add(btn_backPayment);
		btn_backPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Invoice iv = new Invoice();
				iv.setVisible(true);
				iv.setSize(660, 400);
				iv.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		cmb_InvoiceNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = cmb_InvoiceNo.getSelectedIndex();
				txt_amount.setText(Controller.getAmount(selectedIndex));
			}
		});
	}

	public static void main(String[] args) {
		frame = new Pay();
		frame.setBounds(100, 100, 660, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setTitle("Pay");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
	}
}