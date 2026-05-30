package arquetype;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_registro {
    private JFrame frame;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana_registro window = new Ventana_registro();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Ventana_registro() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setFont(new Font("Dubai", Font.BOLD, 12));
        frame.getContentPane().setBackground(new Color(158, 9, 15));
        frame.setBounds(100, 100, 630, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("¿Primera vez aquí?");
        lblNewLabel.setBounds(151, 11, 354, 59);
        lblNewLabel.setForeground(new Color(214, 175, 41));
        lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 40));
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("regístrate para comenzar a disfrutar");
        lblNewLabel_1.setBounds(144, 64, 344, 26);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Dubai", Font.BOLD, 22));
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("NOMBRE:");
        lblNewLabel_2.setBounds(80, 103, 81, 14);
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Dubai", Font.BOLD, 15));
        frame.getContentPane().add(lblNewLabel_2);

        textField = new JTextField();
        textField.setBounds(171, 101, 368, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblAlergenos = new JLabel("ALERGENOS:");
        lblAlergenos.setBounds(61, 163, 100, 14);
        lblAlergenos.setForeground(Color.WHITE);
        lblAlergenos.setFont(new Font("Dubai", Font.BOLD, 15));
        frame.getContentPane().add(lblAlergenos);

        ArrayList<String> alergenos = new ArrayList<>(Arrays.asList(
            "Gluten", "Lácteos", "Huevo", "Pescado",
            "Mariscos", "Sésamo", "Soya", "Nueces", "Frutos Secos"
        ));

        JPanel panel_al = new JPanel(new GridLayout(alergenos.size(), 1, 0, 2));
        panel_al.setBackground(Color.WHITE);
        panel_al.setPreferredSize(new Dimension(155, alergenos.size() * 22 + 10));

        for (String alergeno : alergenos) {
            JCheckBox cb = new JCheckBox(alergeno);
            cb.setBackground(Color.WHITE);
            cb.setFont(new Font("Dubai", Font.PLAIN, 12));
            panel_al.add(cb);
        }

        JScrollPane scrollPane = new JScrollPane(panel_al);
        scrollPane.setBounds(171, 143, 178, 79);
        frame.getContentPane().add(scrollPane);

        ArrayList<String> ingredientes = new ArrayList<>(Arrays.asList(
            "Aceite", "Aderezo césar", "Aguacate", "Ajonjoli", "Albahaca",
            "Alga nori", "Apio", "Arrachera", "Arroz", "Atún",
            "Azúcar", "Canela", "Carne", "Camarón", "Cecina",
            "Cebolla", "Cerdo", "Cilantro", "Cocoa", "Costilla",
            "Chocolate", "Chícharo", "Champiñones", "Elote", "Espinaca",
            "Fresa", "Galleta", "Guacamole", "Harina", "Huevo",
            "Jalapeño", "Jamón", "Jengibre", "Jitomate", "Leche",
            "Lechuga", "Legumbres", "Manteca", "Mantequilla", "Mango",
            "Mayonesa", "Nuez", "Pan", "Pasas", "Pepino",
            "Piña", "Pimentón", "Pimiento", "Pollo", "Queso",
            "Res", "Salmón", "Salsa BBQ", "Surimi", "Tocino",
            "Tofu", "Tomate cherry", "Tortilla", "Vainilla", "Zanahoria"
        ));

        JPanel panel_in = new JPanel(new GridLayout(ingredientes.size(), 1, 0, 2));
        panel_in.setBackground(Color.WHITE);
        panel_in.setPreferredSize(new Dimension(155, ingredientes.size() * 22 + 10));

        for (String ingrediente : ingredientes) {
            JCheckBox cb = new JCheckBox(ingrediente);
            cb.setBackground(Color.WHITE);
            cb.setFont(new Font("Dubai", Font.PLAIN, 12));
            panel_in.add(cb);
        }

        JScrollPane scrollPane_1 = new JScrollPane(panel_in);
        scrollPane_1.setBounds(361, 143, 178, 79);
        frame.getContentPane().add(scrollPane_1);
        
        JButton btnNewButton = new JButton("AÑADIR");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnNewButton.setBackground(new Color(214, 175, 41));
        btnNewButton.setBounds(298, 237, 100, 22);
        frame.getContentPane().add(btnNewButton);
    }
}