package pct_01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	public Double botao;
	public String operacao;
	public Double resultado;
	public double numero1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setFont(new Font("Dialog", Font.BOLD, 10));
		setBackground(Color.WHITE);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea taVisor = new JTextArea();
		taVisor.setEditable(false);
		taVisor.setForeground(new Color(0, 128, 0));
		taVisor.setLineWrap(true);
		taVisor.setFont(new Font("Monospaced", Font.BOLD, 35));
		taVisor.setBackground(new Color(0, 0, 0));
		taVisor.setBounds(15, 31, 707, 108);
		contentPane.add(taVisor);
		
		JButton btnN1 = new JButton("1");
		btnN1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				taVisor.setText("1");
				botao = (double) 1;
			}
		});
		btnN1.setBounds(15, 195, 92, 61);
		contentPane.add(btnN1);
		
		JButton btnN2 = new JButton("2");
		btnN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				taVisor.setText("2");
				botao = (double) 2;
			}
		});
		btnN2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN2.setBounds(130, 195, 92, 61);
		contentPane.add(btnN2);
		
		JButton btnN3 = new JButton("3");
		btnN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("3");
				botao = (double) 3;
			}
		});
		btnN3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN3.setBounds(254, 195, 92, 61);
		contentPane.add(btnN3);
		
		JButton btnN4 = new JButton("4");
		btnN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("4");
				botao = (double) 4;
			}
		});
		btnN4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN4.setBounds(15, 275, 92, 61);
		contentPane.add(btnN4);
		
		JButton btnN5 = new JButton("5");
		btnN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("5");
				botao = (double) 5;
			}
		});
		btnN5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN5.setBounds(130, 275, 92, 61);
		contentPane.add(btnN5);
		
		JButton btnN6 = new JButton("6");
		btnN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("6");
				botao = (double) 6;
			}
		});
		btnN6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN6.setBounds(254, 275, 92, 61);
		contentPane.add(btnN6);
		
		JButton btnN7 = new JButton("7");
		btnN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("7");
				botao = (double) 7;
			}
		});
		btnN7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN7.setBounds(15, 359, 92, 61);
		contentPane.add(btnN7);
		
		JButton btnN8 = new JButton("8");
		btnN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("8");
				botao = (double) 8;
			}
		});
		btnN8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN8.setBounds(130, 359, 92, 61);
		contentPane.add(btnN8);
		
		JButton btnN9 = new JButton("9");
		btnN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("9");
				botao = (double) 9;
			}
		});
		btnN9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN9.setBounds(254, 359, 92, 61);
		contentPane.add(btnN9);
		
		JButton btnN0 = new JButton("0");
		btnN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("0");
				botao = (double) 0;
			}
		});
		btnN0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN0.setBounds(130, 436, 92, 61);
		contentPane.add(btnN0);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("+");
				operacao = "soma";
				numero1 = botao;
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(375, 195, 92, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnSubtrao = new JButton("-");
		btnSubtrao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("-");
				operacao = "subtração";
				numero1 = botao;
			}
		});
		btnSubtrao.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSubtrao.setBounds(375, 359, 92, 61);
		contentPane.add(btnSubtrao);
		
		JButton btnMultiplicao = new JButton("x");
		btnMultiplicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("*");
				operacao = "multiplicação";
				numero1 = botao;
			}
		});
		btnMultiplicao.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMultiplicao.setBounds(375, 275, 92, 61);
		contentPane.add(btnMultiplicao);
		
		JButton btnDiviso = new JButton("/");
		btnDiviso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVisor.setText("/");
				operacao = "divisão";
			    numero1 = botao;
			}
		});
		btnDiviso.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDiviso.setBounds(375, 436, 92, 61);
		contentPane.add(btnDiviso);
		
		JButton btnApagar = new JButton("CE");
		btnApagar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				taVisor.setText("");
			}
		});
		btnApagar.setBounds(15, 436, 92, 61);
		contentPane.add(btnApagar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(499, 539, 133, 61);
		contentPane.add(btnSair);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		           
				switch(operacao){
				case "soma": resultado = numero1 + botao;
				     taVisor.setText(String.valueOf(resultado));break;  
				case "subtração": resultado = numero1 - botao;
				     taVisor.setText(String.valueOf(resultado));break;
				case "multiplicação": resultado = numero1 * botao;
				     taVisor.setText(String.valueOf(resultado));break;
				case "divisão": resultado = numero1 / botao;
				     taVisor.setText(String.valueOf(resultado));break;
				}
				    
			    
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnIgual.setBounds(254, 436, 92, 61);
		contentPane.add(btnIgual);
		
		JTextArea taDescrição = new JTextArea();
		taDescrição.setLineWrap(true);
		taDescrição.setFont(new Font("Microsoft JhengHei", Font.BOLD | Font.ITALIC, 20));
		taDescrição.setText("Autor: Guilherme Abreu\r\nCurso: Ci\u00EAncias da Computa\u00E7\u00E3o\r\nInstitui\u00E7\u00E3o: Universidade Paulista- UNIP");
		taDescrição.setBounds(15, 513, 443, 107);
		contentPane.add(taDescrição);
	}
}
