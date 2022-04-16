package view;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;

public class Finestra {

	private JFrame frame;
	private JPanel start;
	private JButton btnGioca;
	private JLabel lblTitolo;
	private JLabel lblSfondoStart;
	private JPanel importo;
	private JLabel lblImporto;
	private JTextField textImporto;
	private JButton btnInizia;
	private JLabel lblSfondoInizia;
	private JPanel tavolo;
	private JLabel lblSfondoTavolo;
	private JPanel perdita;
	private JLabel lblPerdita;
	private JLabel lblSfondoPerdita;

	public Finestra() {
		
		frame = new JFrame("Planckjack");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		start = new JPanel();
		start.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(start);
		start.setLayout(null);
		
		btnGioca = new JButton("Gioca");
		btnGioca.setBounds(173, 188, 89, 23);
		btnGioca.setBackground(new Color(255, 255, 255));
		start.add(btnGioca);
		start.setLayout(null);
		
		lblTitolo = new JLabel("Planckjack");
		lblTitolo.setBounds(157, 92, 118, 23);
		lblTitolo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitolo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitolo.setForeground(Color.YELLOW);
		start.add(lblTitolo);
		
		lblSfondoStart = new JLabel("");
		lblSfondoStart.setBounds(0, 0, 434, 261);
		lblSfondoStart.setIcon(new ImageIcon("C:\\Users\\dnric\\git\\Planckjack\\Planckjack\\img\\sfondo.jpg"));
		start.add(lblSfondoStart);
		
		importo = new JPanel();
		importo.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(importo);
		importo.setLayout(null);
		
		lblImporto = new JLabel("Importo: ");
		lblImporto.setForeground(new Color(0, 0, 0));
		lblImporto.setBounds(129, 94, 61, 14);
		importo.add(lblImporto);
		
		textImporto = new JTextField();
		textImporto.setBounds(200, 91, 86, 20);
		importo.add(textImporto);
		textImporto.setColumns(10);
		
		btnInizia = new JButton("Inizia");
		btnInizia.setBounds(166, 188, 89, 23);
		importo.add(btnInizia);
		
		lblSfondoInizia = new JLabel("");
		lblSfondoInizia.setIcon(new ImageIcon("C:\\Users\\dnric\\git\\Planckjack\\Planckjack\\img\\sfondo.jpg"));
		lblSfondoInizia.setBounds(0, 0, 434, 261);
		importo.add(lblSfondoInizia);
		
		tavolo = new JPanel();
		tavolo.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(tavolo);
		tavolo.setLayout(null);
		
		lblSfondoTavolo = new JLabel("");
		lblSfondoTavolo.setIcon(new ImageIcon("C:\\Users\\dnric\\git\\Planckjack\\Planckjack\\img\\tavolo_ph.jpg"));
		lblSfondoTavolo.setBounds(0, 0, 434, 261);
		tavolo.add(lblSfondoTavolo);
		
		perdita = new JPanel();
		perdita.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(perdita);
		perdita.setLayout(null);
		
		lblPerdita = new JLabel("HAI PERSO!");
		lblPerdita.setForeground(Color.YELLOW);
		lblPerdita.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPerdita.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerdita.setBounds(129, 102, 164, 33);
		perdita.add(lblPerdita);
		
		lblSfondoPerdita = new JLabel("");
		lblSfondoPerdita.setIcon(new ImageIcon("C:\\Users\\dnric\\git\\Planckjack\\Planckjack\\img\\sfondo.jpg"));
		lblSfondoPerdita.setBounds(0, 0, 434, 261);
		perdita.add(lblSfondoPerdita);
		
		frame.setVisible(true);
	}
}
