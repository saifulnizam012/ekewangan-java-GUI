import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Voucher extends JFrame {
	
	private static Container pane;
	private static JPanel pnl_titleVoucher;
	private static JLabel lbl_titleVoucher;
	private static JPanel pnl_allVoucher;
	private static JScrollPane sp_allVoucher;
	private static JTable tbl_allVoucher;
	private static JPanel pnl_backVoucher;
	private static Voucher frame;
	
	public Voucher() {
		pane = getContentPane();
		pane.setLayout(null);
		pane.setBackground(Color.white);
		
		pnl_titleVoucher = new JPanel();
		pnl_titleVoucher.setBackground(new Color(135, 193, 72));
		pnl_titleVoucher.setBounds(10, 11, 619, 45);
		pane.add(pnl_titleVoucher);
		
		lbl_titleVoucher = new JLabel("Voucher");
		lbl_titleVoucher.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titleVoucher.setForeground(Color.WHITE);
		lbl_titleVoucher.setFont(new Font("Ebrima", Font.BOLD, 26));
		pnl_titleVoucher.add(lbl_titleVoucher);
		
		pnl_allVoucher = new JPanel();
		pnl_allVoucher.setLayout(null);
		pnl_allVoucher.setBackground(Color.WHITE);
		pnl_allVoucher.setBounds(10, 67, 619, 95);
		pane.add(pnl_allVoucher);
		
		sp_allVoucher = new JScrollPane();
		sp_allVoucher.setBounds(0, 0, 619, 55);
		pnl_allVoucher.add(sp_allVoucher);
		
		tbl_allVoucher = new JTable();
		tbl_allVoucher.setEnabled(false);
		tbl_allVoucher.setShowGrid(true);
		tbl_allVoucher.setFillsViewportHeight(true);
		tbl_allVoucher.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "21/07/2021", "BCR 1288527", "EFT -UKM21072100573 : BAYARAN LEBIHAN TAJAAN PENAJA LP15580 - TABUNG AMANAH ZAKAT UKM", "Telah Dikreditkan", "200.00"},
				{"2", "13/11/2020", "BCR 1169377", "EFT -UKM20111401787 : Bayaran Pemberian Bantuan Kewangan sebanyak RM50 secara one-off kepada pelajar baharu Universiti Awam", "Telah Dikreditkan", "50.00"},
			},
			new String[] {
				"No", "Date", "Receipt No.", "Payment Information", "Status", "Amount(RM)"
			}
		));
		tbl_allVoucher.getColumnModel().getColumn(0).setPreferredWidth(20);
		tbl_allVoucher.getColumnModel().getColumn(1).setPreferredWidth(25);
		tbl_allVoucher.getColumnModel().getColumn(2).setPreferredWidth(27);
		tbl_allVoucher.getColumnModel().getColumn(3).setPreferredWidth(100);
		tbl_allVoucher.getColumnModel().getColumn(4).setPreferredWidth(40);
		tbl_allVoucher.getColumnModel().getColumn(5).setPreferredWidth(20);
		sp_allVoucher.setViewportView(tbl_allVoucher);
		
		pnl_backVoucher = new JPanel();
		pnl_backVoucher.setLayout(null);
		pnl_backVoucher.setBackground(Color.WHITE);
		pnl_backVoucher.setBounds(10, 267, 619, 55);
		pane.add(pnl_backVoucher);
		
		Button btn_backVoucher = new Button("Back");
		btn_backVoucher.setBackground(new Color(135, 193, 72));
		btn_backVoucher.setForeground(Color.WHITE);
		btn_backVoucher.setBounds(267, 11, 89, 33);
		pnl_backVoucher.add(btn_backVoucher);
		btn_backVoucher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile pf = new Profile();
				pf.setVisible(true);
				pf.setSize(660, 400);
				pf.setLocationRelativeTo(null);
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		frame = new Voucher();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setBounds(100, 100, 660, 400);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Voucher");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);

	}
}