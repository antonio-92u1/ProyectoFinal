package arquetype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Ventana_clientes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_clientes window = new Ventana_clientes();
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
	public Ventana_clientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    frame = new JFrame();
	    frame.getContentPane().setBackground(new Color(158, 9, 15));
	    frame.setBounds(100, 100, 630, 320);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);

	    JLabel lblNewLabel = new JLabel("¡Bienvenido de nuevo!");
	    lblNewLabel.setForeground(new Color(214, 175, 41));
	    lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 40));
	    lblNewLabel.setBounds(131, 41, 394, 49);
	    frame.getContentPane().add(lblNewLabel);

	    JLabel lblNewLabel_1 = new JLabel("Inicia sesión o registrate para hacer tu orden ");
	    lblNewLabel_1.setForeground(new Color(255, 255, 255));
	    lblNewLabel_1.setFont(new Font("Dubai", Font.BOLD, 22));
	    lblNewLabel_1.setBounds(111, 86, 429, 38);
	    frame.getContentPane().add(lblNewLabel_1);

	    JPanel panelUsuarios = new JPanel();
	    panelUsuarios.setLayout(new java.awt.GridLayout(0, 1, 0, 6));
	    panelUsuarios.setBackground(new Color(158, 9, 15));

	    BaseDatos bd = BaseDatos.getInstancia();
	    java.util.ArrayList<String> clientes = bd.obtenerNombresClientes();

	    for (String nombre : clientes) {
	        int idCliente = bd.obtenerIdCliente(nombre);
	        String estado = bd.obtenerUltimoEstadoPedido(idCliente);

	        JPanel fila = new JPanel(null);
	        fila.setBackground(new Color(120, 5, 10));
	        fila.setPreferredSize(new java.awt.Dimension(330, 35));

	        JButton btnNombre = new JButton(nombre);
	        btnNombre.setBounds(5, 3, 200, 28);
	        btnNombre.setBackground(new Color(214, 175, 41));
	        btnNombre.setForeground(Color.WHITE);
	        btnNombre.setFont(new Font("Dubai", Font.BOLD, 13));
	        btnNombre.addActionListener(e -> {
	            frame.dispose();
	            new VentanaMenus(idCliente).getFrame().setVisible(true);
	        });
	        fila.add(btnNombre);

	        JLabel lblEstado = new JLabel("● " + estado);
	        lblEstado.setBounds(215, 3, 150, 28);
	        lblEstado.setFont(new Font("Dubai", Font.BOLD, 12));
	        lblEstado.setForeground(colorEstado(estado));
	        fila.add(lblEstado);

	        if (!estado.equals("Sin pedidos")) {
	            JButton btnVer = new JButton("Ver");
	            btnVer.setBounds(355, 3, 45, 28);
	            btnVer.setBackground(Color.WHITE);
	            btnVer.setFont(new Font("Dubai", Font.PLAIN, 11));
	            btnVer.addActionListener(e -> {
	                new VentanaPedido(idCliente).getFrame().setVisible(true);
	            });
	            fila.add(btnVer);
	        }

	        panelUsuarios.add(fila);
	    }

	    JScrollPane scroll = new JScrollPane(panelUsuarios);
	    scroll.setBounds(150, 135, 350, 92);
	    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    frame.getContentPane().add(scroll);

	    JButton btnNewButton = new JButton("Registrate");
	    btnNewButton.setBackground(new Color(214, 175, 41));
	    btnNewButton.setForeground(new Color(255, 255, 255));
	    btnNewButton.setFont(new Font("Dubai", Font.BOLD, 15));
	    btnNewButton.setBounds(258, 238, 128, 22);
	    btnNewButton.addActionListener(e -> {
	        frame.dispose();
	        Ventana_registro ventReg = new Ventana_registro();
	        ventReg.getFrame().setVisible(true);
	    });
	    frame.getContentPane().add(btnNewButton);
	}

	private Color colorEstado(String estado) {
	    switch (estado) {
	        case "Pendiente":       return new Color(255, 200, 0);
	        case "En preparación":  return new Color(255, 140, 0);
	        case "Entregado":       return new Color(50, 200, 50);
	        default:                return Color.GRAY;
	    }
	}

	public JFrame getFrame() { return frame; }
}