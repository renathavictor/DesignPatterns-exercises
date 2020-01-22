package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SmartHomeTela {

	private JFrame frame;
	private JTextField tfCenario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmartHomeTela window = new SmartHomeTela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SmartHomeTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCriarCenrio = new JButton("Criar cen\u00E1rio");
		btnCriarCenrio.setBounds(30, 220, 159, 42);
		frame.getContentPane().add(btnCriarCenrio);
		
		tfCenario = new JTextField();
		tfCenario.setBounds(30, 123, 160, 34);
		frame.getContentPane().add(tfCenario);
		tfCenario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome do cenário");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(30, 82, 159, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rbComum = new JRadioButton("Simples");
		rbComum.setBounds(30, 164, 109, 23);
		frame.getContentPane().add(rbComum);
		
		JRadioButton rbEspecial = new JRadioButton("Especial");
		rbEspecial.setBounds(30, 190, 109, 23);
		frame.getContentPane().add(rbEspecial);
		
		JList listCenarios = new JList();
		listCenarios.setBounds(490, 82, 259, 326);
		frame.getContentPane().add(listCenarios);
		
		JLabel label = new JLabel("Cenários cadastrados");
		label.setBounds(490, 24, 159, 34);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("SMART HOME");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_1.setBounds(30, 11, 321, 57);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Novo dispositivo");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(246, 82, 159, 34);
		frame.getContentPane().add(label_2);
		
		Choice choiceDispositivoNovo = new Choice();
		choiceDispositivoNovo.setBounds(246, 143, 159, 34);
		frame.getContentPane().add(choiceDispositivoNovo);
		
		JLabel lblDispositivo = new JLabel("Dispositivo");
		lblDispositivo.setBounds(246, 123, 118, 14);
		frame.getContentPane().add(lblDispositivo);
		
		JLabel label_3 = new JLabel("Cor");
		label_3.setBounds(246, 169, 118, 14);
		frame.getContentPane().add(label_3);
		
		Choice choiceCor = new Choice();
		choiceCor.setBounds(246, 189, 159, 20);
		frame.getContentPane().add(choiceCor);
		
		JButton btnNovoDispositivo = new JButton("Novo dispositivo");
		btnNovoDispositivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNovoDispositivo.setBounds(246, 220, 159, 42);
		frame.getContentPane().add(btnNovoDispositivo);
		
		JLabel label_4 = new JLabel("Adicionar dispositivo no cen\u00E1rio");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(30, 311, 278, 34);
		frame.getContentPane().add(label_4);
		
		Choice choiceDispositivo = new Choice();
		choiceDispositivo.setBounds(246, 371, 159, 20);
		frame.getContentPane().add(choiceDispositivo);
		
		JLabel label_5 = new JLabel("Dispositivo");
		label_5.setBounds(246, 351, 118, 14);
		frame.getContentPane().add(label_5);
		
		Choice choiceCenario = new Choice();
		choiceCenario.setBounds(30, 371, 159, 20);
		frame.getContentPane().add(choiceCenario);
		
		JLabel label_6 = new JLabel("Cenario");
		label_6.setBounds(30, 351, 118, 14);
		frame.getContentPane().add(label_6);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(246, 408, 159, 42);
		frame.getContentPane().add(btnAdicionar);
	}
}
