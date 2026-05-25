package arquetype;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class VentanaMenus {
    private JFrame frame;
    private JFrame frameVentanaPedido;
    private JPanel panel; 
    private JScrollPane tacos_scroll;
    private JScrollPane sushi_scroll;
    private JScrollPane pan_scroll;
    private JScrollPane hamburguesas_scroll;
    private JScrollPane ensaladas_scroll;
    private JScrollPane postres_scroll;
    private JScrollPane bebidas_scroll;
    private JPanel panel_1;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel;
    private JLabel lblTacos;
    private JLabel lblSushi;
    private JLabel lblPan;
    private JLabel lblHamburguesa;
    private JLabel lblEnsaladas;
    private JLabel lblPostres;
    private JLabel lblBebidas;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaMenus window = new VentanaMenus();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VentanaMenus() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(100, 100, 580, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        frameVentanaPedido = new JFrame();
        frameVentanaPedido.setBounds(100, 100, 580, 320);
        frameVentanaPedido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameVentanaPedido.getContentPane().setLayout(null);

        panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(549, 620));

        JScrollPane scrollPane = new JScrollPane(panel);
        
        tacos_scroll = new JScrollPane();
        tacos_scroll.setBounds(33, 106, 110, 105);
        panel.add(tacos_scroll);
        tacos_scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        sushi_scroll = new JScrollPane();
        sushi_scroll.setBounds(219, 106, 110, 105);
        panel.add(sushi_scroll);
        sushi_scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        pan_scroll = new JScrollPane();
        pan_scroll.setBounds(413, 106, 110, 105);
        panel.add(pan_scroll);
        pan_scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        hamburguesas_scroll = new JScrollPane();
        hamburguesas_scroll.setBounds(33, 250, 110, 105);
        panel.add(hamburguesas_scroll);

        ensaladas_scroll = new JScrollPane();
        ensaladas_scroll.setBounds(219, 250, 110, 105);
        panel.add(ensaladas_scroll);

        postres_scroll = new JScrollPane();
        postres_scroll.setBounds(413, 250, 110, 105);
        panel.add(postres_scroll);

        bebidas_scroll = new JScrollPane();
        bebidas_scroll.setBounds(33, 390, 110, 105);
        panel.add(bebidas_scroll);
        
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(214, 175, 41));
        panel_1.setBounds(0, 0, 549, 64);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        lblNewLabel_1 = new JLabel("Arma tu combo perfecto");
        lblNewLabel_1.setForeground(new Color(158, 9, 15));
        lblNewLabel_1.setFont(new Font("Dubai", Font.BOLD, 30));
        lblNewLabel_1.setBounds(25, 11, 434, 22);
        panel_1.add(lblNewLabel_1);
        
        lblNewLabel = new JLabel("Escoge hasta 1 elemento por grupo");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 15));
        lblNewLabel.setBounds(25, 31, 434, 22);
        panel_1.add(lblNewLabel);
        
        lblTacos = new JLabel("Tacos");
        lblTacos.setForeground(new Color(179, 70, 34));
        lblTacos.setFont(new Font("Dubai", Font.BOLD, 15));
        lblTacos.setBounds(33, 91, 80, 14);
        panel.add(lblTacos);
        
        lblSushi = new JLabel("Sushi");
        lblSushi.setForeground(new Color(179, 70, 34));
        lblSushi.setFont(new Font("Dubai", Font.BOLD, 15));
        lblSushi.setBounds(219, 91, 80, 14);
        panel.add(lblSushi);
        
        lblPan = new JLabel("Pan");
        lblPan.setForeground(new Color(179, 70, 34));
        lblPan.setFont(new Font("Dubai", Font.BOLD, 15));
        lblPan.setBounds(413, 91, 80, 14);
        panel.add(lblPan);
        
        lblHamburguesa = new JLabel("Hamburguesas");
        lblHamburguesa.setForeground(new Color(179, 70, 34));
        lblHamburguesa.setFont(new Font("Dubai", Font.BOLD, 15));
        lblHamburguesa.setBounds(33, 235, 110, 14);
        panel.add(lblHamburguesa);

        lblEnsaladas = new JLabel("Ensaladas");
        lblEnsaladas.setForeground(new Color(179, 70, 34));
        lblEnsaladas.setFont(new Font("Dubai", Font.BOLD, 15));
        lblEnsaladas.setBounds(219, 235, 80, 14);
        panel.add(lblEnsaladas);

        lblPostres = new JLabel("Postres");
        lblPostres.setForeground(new Color(179, 70, 34));
        lblPostres.setFont(new Font("Dubai", Font.BOLD, 15));
        lblPostres.setBounds(413, 235, 80, 14);
        panel.add(lblPostres);

        lblBebidas = new JLabel("Bebidas");
        lblBebidas.setForeground(new Color(179, 70, 34));
        lblBebidas.setFont(new Font("Dubai", Font.BOLD, 15));
        lblBebidas.setBounds(33, 375, 80, 14);
        panel.add(lblBebidas);

        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 0, 566, 403);
        frame.getContentPane().add(scrollPane);
    }
    
    public void ventanaPedido() {
    	frame.setVisible(false);
    	frameVentanaPedido.setVisible(true);
    	
    }
}