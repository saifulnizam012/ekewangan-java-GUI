import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Profile extends JFrame {

	private static Container pane;
	private static JLabel pic_Profilepics;
	private static JPanel pnl_titleProfile;
	private static JLabel lbl_titleProfile;
	private static JPanel pnl_biodata;
	private static JLabel lbl_name;
	private static JLabel lbl_faculty;
	private static JLabel lbl_course;
	private static JPanel pnl_finance;
	private static JLabel lbl_advance;
	private static JLabel lbl_amountAdvance;
	private static JLabel lbl_Invoice;
	private static JLabel lbl_amountInvoice;
	private static JLabel lbl_eft;
	private static JLabel lbl_amountEFT;
	private static JPanel pnl_Profile;
	private static Profile frame;

	public Profile() {
		pane = getContentPane();
		pane.setLayout(null);
		pane.setBackground(Color.white);

		pic_Profilepics = new JLabel(new ImageIcon("./src/images/a179830.png"));
		pic_Profilepics.setBounds(10, 83, 144, 176);
		pane.add(pic_Profilepics);

		pnl_titleProfile = new JPanel();
		pnl_titleProfile.setBackground(new Color(135, 193, 72));
		pnl_titleProfile.setBounds(10, 11, 619, 45);
		pane.add(pnl_titleProfile);

		lbl_titleProfile = new JLabel("Student Profile");
		lbl_titleProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titleProfile.setForeground(Color.WHITE);
		lbl_titleProfile.setFont(new Font("Ebrima", Font.BOLD, 26));
		pnl_titleProfile.add(lbl_titleProfile);

		pnl_biodata = new JPanel();
		pnl_biodata.setBackground(Color.WHITE);
		pnl_biodata.setBounds(164, 83, 465, 77);
		pane.add(pnl_biodata);
		pnl_biodata.setLayout(new GridLayout(3, 1));

		lbl_name = new JLabel("MOHAMAD SAIFUL NIZAM BIN ABD AZIZ (A179830)");
		lbl_name.setFont(new Font("SansSerif", Font.BOLD, 14));
		pnl_biodata.add(lbl_name);

		lbl_faculty = new JLabel("FAKULTI TEKNOLOGI DAN SAINS MAKLUMAT(FTSM)");
		lbl_faculty.setFont(new Font("SansSerif", Font.PLAIN, 12));
		pnl_biodata.add(lbl_faculty);

		lbl_course = new JLabel("SARJANA MUDA SAINS KOMPUTER DENGAN KEPUJIAN");
		lbl_course.setFont(new Font("SansSerif", Font.PLAIN, 12));
		pnl_biodata.add(lbl_course);

		pnl_finance = new JPanel();
		pnl_finance.setBackground(new Color(135, 193, 72));
		pnl_finance.setBounds(164, 171, 465, 88);
		pane.add(pnl_finance);
		pnl_finance.setLayout(new GridLayout(3, 2));

		lbl_advance = new JLabel("Overdue Advancement");
		lbl_advance.setForeground(Color.WHITE);
		lbl_advance.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_advance.setBorder(new EmptyBorder(0, 10, 0, 0));
		pnl_finance.add(lbl_advance);

		lbl_amountAdvance = new JLabel("RM 0.00");
		lbl_amountAdvance.setForeground(Color.WHITE);
		lbl_amountAdvance.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_amountAdvance.setBorder(new EmptyBorder(0, 0, 0, 10));
		lbl_amountAdvance.setHorizontalAlignment(SwingConstants.RIGHT);
		pnl_finance.add(lbl_amountAdvance);

		lbl_Invoice = new JLabel("Overdue Invoice");
		lbl_Invoice.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_Invoice.setBorder(new EmptyBorder(0, 10, 0, 0));
		lbl_Invoice.setForeground(Color.WHITE);
		pnl_finance.add(lbl_Invoice);

		lbl_amountInvoice = new JLabel("RM 0.00");
		lbl_amountInvoice.setForeground(Color.WHITE);
		lbl_amountInvoice.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_amountInvoice.setBorder(new EmptyBorder(0, 0, 0, 10));
		lbl_amountInvoice.setHorizontalAlignment(SwingConstants.RIGHT);
		pnl_finance.add(lbl_amountInvoice);

		lbl_eft = new JLabel("EFT (For the last 3 months)");
		lbl_eft.setForeground(Color.WHITE);
		lbl_eft.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_eft.setBorder(new EmptyBorder(0, 10, 0, 0));
		pnl_finance.add(lbl_eft);

		lbl_amountEFT = new JLabel("RM 100.00");
		lbl_amountEFT.setForeground(Color.WHITE);
		lbl_amountEFT.setFont(new Font("Arial", Font.BOLD, 13));
		lbl_amountEFT.setBorder(new EmptyBorder(0, 0, 0, 10));
		lbl_amountEFT.setHorizontalAlignment(SwingConstants.RIGHT);
		pnl_finance.add(lbl_amountEFT);

		//navigation panel
		pnl_Profile = new JPanel();
		pnl_Profile.setLayout(null);
		pnl_Profile.setBackground(Color.WHITE);
		pnl_Profile.setBounds(10, 270, 660, 400);
		pane.add(pnl_Profile);

		Button btn_Invoice = new Button("Invoice");
		btn_Invoice.setBounds(150, 11, 89, 33);
		btn_Invoice.setBackground(new Color(135, 193, 72));
		btn_Invoice.setForeground(Color.WHITE);
		pnl_Profile.add(btn_Invoice);
		btn_Invoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Invoice iv = new Invoice();
				iv.setVisible(true);
				iv.setSize(660, 400);
				iv.setLocationRelativeTo(null);
				dispose();
			}
		});

		Button btn_Receipt = new Button("Receipt");
		btn_Receipt.setBounds(249, 11, 89, 33);
		btn_Receipt.setBackground(new Color(135, 193, 72));
		btn_Receipt.setForeground(Color.WHITE);
		pnl_Profile.add(btn_Receipt);
		btn_Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receipt rc = new Receipt();
				rc.setVisible(true);
				rc.setSize(660, 400);
				rc.setLocationRelativeTo(null);
				dispose();
			}
		});

		Button btn_Voucher = new Button("Voucher");
		btn_Voucher.setBounds(348, 11, 89, 33);
		btn_Voucher.setBackground(new Color(135, 193, 72));
		btn_Voucher.setForeground(Color.WHITE);
		pnl_Profile.add(btn_Voucher);
		btn_Voucher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voucher vc = new Voucher();
				vc.setVisible(true);
				vc.setSize(660, 400);
				vc.setLocationRelativeTo(null);
				dispose();
			}
		});

		Button btn_logout = new Button("Log Out");
		btn_logout.setBounds(520, 11, 89, 33);
		btn_logout.setBackground(new Color(135, 193, 72));
		btn_logout.setForeground(Color.WHITE);
		pnl_Profile.add(btn_logout);
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(pane, "Logout successful");
				Login lg = new Login();
				lg.setVisible(true);
				lg.setSize(660, 400);
				lg.setLocationRelativeTo(null);
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		frame = new Profile();
		frame.setBounds(100, 100, 660, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setTitle("Profile");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
	}
}
