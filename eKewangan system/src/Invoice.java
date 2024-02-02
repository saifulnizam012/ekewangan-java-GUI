import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Invoice extends JFrame {
	
	private static Container pane;
	private static JPanel pnl_titleReceipt;
	private static JLabel lbl_titleReceipt;
	private static JPanel pnl_2021;
	private static JLabel lbl_2021;
	private static JScrollPane sp_2021;
	private static JTable tbl_2021;
	private static JPanel pnl_2020;
	private static JLabel lbl_2020;
	private static JScrollPane sp_2020;
	private static JTable tbl_2020;
	private static JPanel pnl_backReceipt;
	private static Invoice frame;
	
	public Invoice() {
		pane = getContentPane();
		pane.setLayout(null);
		pane.setBackground(Color.white);
		
		pnl_titleReceipt = new JPanel();
		pnl_titleReceipt.setBackground(new Color(135, 193, 72));
		pnl_titleReceipt.setBounds(10, 11, 619, 45);
		pane.add(pnl_titleReceipt);
		
		lbl_titleReceipt = new JLabel("Invoice");
		lbl_titleReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titleReceipt.setForeground(Color.WHITE);
		lbl_titleReceipt.setFont(new Font("Ebrima", Font.BOLD, 26));
		pnl_titleReceipt.add(lbl_titleReceipt);
		
		pnl_2021 = new JPanel();
		pnl_2021.setBackground(Color.WHITE);
		pnl_2021.setBounds(10, 59, 619, 95);
		pane.add(pnl_2021);
		pnl_2021.setLayout(null);
		
		lbl_2021 = new JLabel("2021");
		lbl_2021.setBounds(10, 11, 36, 19);
		pnl_2021.add(lbl_2021);
		lbl_2021.setFont(new Font("Arial", Font.BOLD, 16));
					
		sp_2021 = new JScrollPane();
		sp_2021.setBounds(0, 35, 619, 55);
		pnl_2021.add(sp_2021);
		
		tbl_2021 = new JTable();
		tbl_2021.setEnabled(false);
		tbl_2021.setShowGrid(true);
		tbl_2021.setFillsViewportHeight(true);
		tbl_2021.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "17/10/2021", "INV 1284480", "Pembayaran hutang melalui EPayment : Bayaran ePayment melalui Portal eKewangan pada 17/10/2021 No Order ID : 202186836", "752.00"},
				{"2", "12/04/2021", "INV 1198025", "Pembayaran hutang melalui EPayment : Bayaran ePayment melalui Portal eKewangan pada 12/04/2021 No Order ID : 202123932", "831.00"},
			},
			new String[] {
				"No", "Date", "Invoice No.", "Payment Information", "Amount (RM)"
			}
		));
		tbl_2021.getColumnModel().getColumn(0).setPreferredWidth(20);
		tbl_2021.getColumnModel().getColumn(3).setPreferredWidth(272);
		sp_2021.setViewportView(tbl_2021);
		
		pnl_2020 = new JPanel();
		pnl_2020.setBackground(Color.WHITE);
		pnl_2020.setLayout(null);
		pnl_2020.setBounds(10, 165, 619, 95);
		pane.add(pnl_2020);
		
		lbl_2020 = new JLabel("2020");
		lbl_2020.setFont(new Font("Arial", Font.BOLD, 16));
		lbl_2020.setBounds(10, 11, 36, 19);
		pnl_2020.add(lbl_2020);
		
		sp_2020 = new JScrollPane();
		sp_2020.setBounds(0, 35, 619, 55);
		pnl_2020.add(sp_2020);
		
		tbl_2020 = new JTable();
		tbl_2020.setEnabled(false);
		tbl_2020.setFillsViewportHeight(true);
		tbl_2020.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "11/11/2020", "INV 1128142", "BAYARAN OLEH PENAJA LP15389 - (PTPTN) SP 40227", "940.00"},
				{"2", "01/09/2020", "INV 1098467", "Pembayaran hutang melalui EPayment : [infoline] bayaran yuran - INP698505 pada 01/09/2020 No Order ID : 202034477", "1,200.00"},
			},
			new String[] {
				"No", "Date", "Invoice No.", "Payment Information", "Amount (RM)"
			}
		));
		tbl_2020.getColumnModel().getColumn(0).setPreferredWidth(20);
		tbl_2020.getColumnModel().getColumn(3).setPreferredWidth(272);
		sp_2020.setViewportView(tbl_2020);
		
		pnl_backReceipt = new JPanel();
		pnl_backReceipt.setLayout(null);
		pnl_backReceipt.setBackground(Color.WHITE);
		pnl_backReceipt.setBounds(10, 267, 619, 55);
		pane.add(pnl_backReceipt);
		
		//button
		Button btn_Pay = new Button("Pay");
		btn_Pay.setBounds(211, 11, 89, 33);
		btn_Pay.setBackground(new Color(135, 193, 72));
		btn_Pay.setForeground(Color.WHITE);
		pnl_backReceipt.add(btn_Pay);
		btn_Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pay py = new Pay();
				py.setVisible(true);
				py.setSize(660, 400);
				py.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		Button btn_backReceipt = new Button("Back");
		btn_backReceipt.setBounds(310, 11, 89, 33);
		btn_backReceipt.setBackground(new Color(135, 193, 72));
		btn_backReceipt.setForeground(Color.WHITE);
		pnl_backReceipt.add(btn_backReceipt);
		btn_backReceipt.addActionListener(new ActionListener() {
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
		frame = new Invoice();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setBounds(100, 100, 660, 400);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Invoice");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
	}
}
