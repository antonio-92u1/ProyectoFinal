package arquetype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class VentanaPedido {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPedido window = new VentanaPedido();
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
	public VentanaPedido() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 630, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(158, 9, 15));
		panel.setBounds(0, 0, 606, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pedido");
		lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(255, 11, 108, 43);
		panel.add(lblNewLabel);
		
		JLabel lblPreprateParaDisfrutar = new JLabel("Prepárate para disfrutar");
		lblPreprateParaDisfrutar.setForeground(Color.WHITE);
		lblPreprateParaDisfrutar.setFont(new Font("Dubai", Font.BOLD, 15));
		lblPreprateParaDisfrutar.setBounds(230, 36, 171, 43);
		panel.add(lblPreprateParaDisfrutar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(141, 114, 357, 92);
		frame.getContentPane().add(scrollPane);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setForeground(new Color(158, 9, 15));
		btnNewButton.setBackground(new Color(214, 175, 41));
		btnNewButton.setBounds(141, 238, 88, 22);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setForeground(new Color(158, 9, 15));
		btnFinalizar.setBackground(new Color(214, 175, 41));
		btnFinalizar.setBounds(404, 238, 88, 22);
		frame.getContentPane().add(btnFinalizar);
	}

}
