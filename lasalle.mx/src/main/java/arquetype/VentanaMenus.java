package arquetype;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class VentanaMenus {
    private JFrame frame;
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
    private InterComida tacoSel;
    private InterSushiEnsalda sushiSel;
    private InterSushiEnsalda ensaladaSel;
    private InterPostre postreSel;
    private InterPan panSel;
    private InterBebida bebidaSel;
    private InterComida burgerSel;
    private JScrollPane scrollPane_1;
    private JLabel lblNewLabel_2;
    private JPanel panel_2;
    

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
        //frame.setBounds(100, 100, 630, 320);
        frame.setBounds(100, 100, 630, 540);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        panel = new JPanel();
        panel.setForeground(new Color(158, 9, 15));
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(549, 630));
        
        JScrollPane scrollPane = new JScrollPane(panel);
        
        ArrayList<CATaco> tacos = new ArrayList<>(Arrays.asList(
                MenuTaco.tacoPastor(),
                MenuTaco.tacoBistec(),
                MenuTaco.tacoArracherra(),
                MenuTaco.tacoSuadero(),
                MenuTaco.tacoLonganiza(),
                MenuTaco.tacoPollo(),
                MenuTaco.tacoCecina(),
                MenuTaco.tacoCostilla(),
                MenuTaco.tacoChuleta(),
                MenuTaco.tacoVegetariano()
            ));
        JPanel tacosPanel = new JPanel();
        tacosPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(179, 70, 34)));
        tacosPanel.setLayout(null);
        tacosPanel.setBackground(new Color(255, 255, 255));
        int alturaFila = 30;
        int totalAltura = tacos.size() * alturaFila + 10;
        tacosPanel.setPreferredSize(new Dimension(150, totalAltura));
        ButtonGroup grupoTacos = new ButtonGroup();
        for (int i = 0; i < tacos.size(); i++) {
            CATaco taco = tacos.get(i);
            int yPos = 5 + i * alturaFila;
            JRadioButton rb = new JRadioButton(taco.getNombre() + "  $" + taco.getPrecio());
            rb.setBounds(3, yPos, 190, 25);
            rb.setBackground(new Color(255, 255, 255));
            rb.setFont(new Font("Dubai", Font.PLAIN, 10));
            rb.setForeground(new Color(50, 50, 50));
            rb.addActionListener(e -> {tacoExtras(taco);});
            grupoTacos.add(rb);
            tacosPanel.add(rb);
        }
        tacos_scroll = new JScrollPane(tacosPanel);
        tacos_scroll.setBounds(33, 116, 152, 125);
        panel.add(tacos_scroll);
        tacos_scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        tacos_scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        
        ArrayList<CASushi> sushis = new ArrayList<>(Arrays.asList(
                MenuSushi.californiaRoll(),
                MenuSushi.filadelfiaRoll(),
                MenuSushi.spicytunaRoll(),
                MenuSushi.ebiRoll(),
                MenuSushi.tampicoRoll(),
                MenuSushi.avocadoRoll(),
                MenuSushi.dragonRoll(),
                MenuSushi.mangoRoll()
            ));
        JPanel sushiPanel = new JPanel();
        sushiPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(179, 70, 34)));
        sushiPanel.setLayout(null);
        sushiPanel.setBackground(new Color(255, 255, 255));
        alturaFila = 30;
        totalAltura = sushis.size() * alturaFila + 10;
        sushiPanel.setPreferredSize(new Dimension(150, totalAltura));
        ButtonGroup grupoSushi = new ButtonGroup();
        for (int i = 0; i < sushis.size(); i++) {
            CASushi sushi = sushis.get(i);
            int yPos = 5 + i * alturaFila;
            JRadioButton rb = new JRadioButton(sushi.getNombre() + "  $" + sushi.getPrecio());
            rb.setBounds(3, yPos, 190, 25);
            rb.setBackground(new Color(255, 255, 255));
            rb.setFont(new Font("Dubai", Font.PLAIN, 10));
            rb.setForeground(new Color(50, 50, 50));
            rb.addActionListener(e -> {sushiExtras(sushi);});
            grupoSushi.add(rb);
            sushiPanel.add(rb);
        }
        sushi_scroll = new JScrollPane(sushiPanel);
        sushi_scroll.setBounds(219, 116, 152, 125);
        panel.add(sushi_scroll);
        sushi_scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        sushi_scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        
        ArrayList<CAPan> panes = new ArrayList<>(Arrays.asList(
                MenuPan.conchaChocolate(),
                MenuPan.chocolatin(),
                MenuPan.muffinChocolate(),
                MenuPan.donaAzucar()
            ));
        JPanel panPanel = new JPanel();
        panPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(179, 70, 34)));
        panPanel.setLayout(null);
        panPanel.setBackground(new Color(255, 255, 255));
        alturaFila = 30;
        totalAltura = panes.size() * alturaFila + 10;
        panPanel.setPreferredSize(new Dimension(150, totalAltura));
        ButtonGroup grupoPan = new ButtonGroup();
        for (int i = 0; i < panes.size(); i++) {
            CAPan pan = panes.get(i);
            int yPos = 5 + i * alturaFila;
            JRadioButton rb = new JRadioButton(pan.getNombre() + "  $" + pan.getPrecio());
            rb.setBounds(3, yPos, 190, 25);
            rb.setBackground(new Color(255, 255, 255));
            rb.setFont(new Font("Dubai", Font.PLAIN, 10));
            rb.setForeground(new Color(50, 50, 50));
            rb.addActionListener(e -> {panExtras(pan);});
            grupoPan.add(rb);
            panPanel.add(rb);
        }
        pan_scroll = new JScrollPane(panPanel);
        pan_scroll.setBounds(413, 116, 152, 125);
        panel.add(pan_scroll);
        pan_scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        
        ArrayList<CAHamburguesa> burgers = new ArrayList<>(Arrays.asList(
                MenuHamburguesa.hamburguesaClasica(),
                MenuHamburguesa.bbqBaconBurger(),
                MenuHamburguesa.dobleQuesoBurger(),
                MenuHamburguesa.chickenBurger(),
                MenuHamburguesa.burgerMexicana(),
                MenuHamburguesa.burgerHawaiana(),
                MenuHamburguesa.burgerChampinon(),
                MenuHamburguesa.burgerVegetal()
            ));
        JPanel burgerPanel = new JPanel();
        burgerPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(179, 70, 34)));
        burgerPanel.setLayout(null);
        burgerPanel.setBackground(new Color(255, 255, 255));
        alturaFila = 30;
        totalAltura = burgers.size() * alturaFila + 10;
        burgerPanel.setPreferredSize(new Dimension(150, totalAltura));
        ButtonGroup grupoHamburguesa = new ButtonGroup();
        for (int i = 0; i < burgers.size(); i++) {
            CAHamburguesa burger = burgers.get(i);
            int yPos = 5 + i * alturaFila;
            JRadioButton rb = new JRadioButton(burger.getNombre() + "  $" + burger.getPrecio());
            rb.setBounds(3, yPos, 190, 25);
            rb.setBackground(new Color(255, 255, 255));
            rb.setFont(new Font("Dubai", Font.PLAIN, 10));
            rb.setForeground(new Color(50, 50, 50));
            rb.addActionListener(e -> {burgerExtras(burger);});
            grupoHamburguesa.add(rb);
            burgerPanel.add(rb);
        }
        hamburguesas_scroll = new JScrollPane(burgerPanel);
        hamburguesas_scroll.setBounds(33, 290, 152, 125);
        panel.add(hamburguesas_scroll);

        
        ArrayList<CAEnsalada> salads = new ArrayList<>(Arrays.asList(
                MenuEnsalada.ensaladaCesar(),
                MenuEnsalada.ensaladaPollo(),
                MenuEnsalada.ensaladaAtun(),
                MenuEnsalada.ensaladaVeggie(),
                MenuEnsalada.ensaladaCaprese()
            ));
        JPanel saladPanel = new JPanel();
        saladPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(179, 70, 34)));
        saladPanel.setLayout(null);
        saladPanel.setBackground(new Color(255, 255, 255));
        alturaFila = 30;
        totalAltura = salads.size() * alturaFila + 10;
        saladPanel.setPreferredSize(new Dimension(150, totalAltura));
        ButtonGroup grupoEnsalada = new ButtonGroup();
        for (int i = 0; i < salads.size(); i++) {
            CAEnsalada salad = salads.get(i);
            int yPos = 5 + i * alturaFila;
            JRadioButton rb = new JRadioButton(salad.getNombre() + "  $" + salad.getPrecio());
            rb.setBounds(3, yPos, 190, 25);
            rb.setBackground(new Color(255, 255, 255));
            rb.setFont(new Font("Dubai", Font.PLAIN, 10));
            rb.setForeground(new Color(50, 50, 50));
            rb.addActionListener(e -> {saladExtras(salad);});
            grupoEnsalada.add(rb);
            saladPanel.add(rb);
        }
        ensaladas_scroll = new JScrollPane(saladPanel);
        ensaladas_scroll.setBounds(219, 290, 152, 125);
        panel.add(ensaladas_scroll);
        ensaladas_scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        ensaladas_scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        
        ArrayList<CAPostre> postres = new ArrayList<>(Arrays.asList(
                MenuPostres.cheesecakeFresa(),
                MenuPostres.cheesecakeLotus(),
                MenuPostres.brownie(),
                MenuPostres.churros(),
                MenuPostres.flanNapolitano(),
                MenuPostres.pastelZanahoria()
            ));
        JPanel postrePanel = new JPanel();
        postrePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(179, 70, 34)));
        postrePanel.setLayout(null);
        postrePanel.setBackground(new Color(255, 255, 255));
        alturaFila = 30;
        totalAltura = postres.size() * alturaFila + 10;
        postrePanel.setPreferredSize(new Dimension(180, totalAltura));
        ButtonGroup grupoPostres = new ButtonGroup();
        for (int i = 0; i < postres.size(); i++) {
            CAPostre postre = postres.get(i);
            int yPos = 5 + i * alturaFila;
            JRadioButton rb = new JRadioButton(postre.getNombre() + "  $" + postre.getPrecio());
            rb.setBounds(3, yPos, 190, 25);
            rb.setBackground(new Color(255, 255, 255));
            rb.setFont(new Font("Dubai", Font.PLAIN, 10));
            rb.setForeground(new Color(50, 50, 50));
            rb.addActionListener(e -> {postreExtras(postre);});
            grupoEnsalada.add(rb);
            postrePanel.add(rb);
        }
        postres_scroll = new JScrollPane(postrePanel);
        postres_scroll.setBounds(413, 290, 152, 125);
        panel.add(postres_scroll);
        
        
        ArrayList<CABebida> bebidas = new ArrayList<>(Arrays.asList(
        		MenuBebida.cocaCola(),
        		MenuBebida.cocaColaZero(),
        		MenuBebida.aguaMineral(),
        		MenuBebida.cafeAmericano(),
        		MenuBebida.capuccino(),
        		MenuBebida.jugoVerde(),
        		MenuBebida.jugoNaranja(),
        		MenuBebida.malteadaChocolate()
            ));
        JPanel bebidaPanel = new JPanel();
        bebidaPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(179, 70, 34)));
        bebidaPanel.setLayout(null);
        bebidaPanel.setBackground(new Color(255, 255, 255));
        alturaFila = 30;
        totalAltura = postres.size() * alturaFila + 10;
        bebidaPanel.setPreferredSize(new Dimension(150, totalAltura));
        ButtonGroup grupoBebidas = new ButtonGroup();
        for (int i = 0; i < bebidas.size(); i++) {
            CABebida bebida = bebidas.get(i);
            int yPos = 5 + i * alturaFila;
            JRadioButton rb = new JRadioButton(bebida.getNombre() + "  $" + bebida.getPrecio());
            rb.setBounds(3, yPos, 190, 25);
            rb.setBackground(new Color(255, 255, 255));
            rb.setFont(new Font("Dubai", Font.PLAIN, 10));
            rb.setForeground(new Color(50, 50, 50));
            rb.addActionListener(e -> {bebidaExtras(bebida);});
            grupoBebidas.add(rb);
            bebidaPanel.add(rb);
        }
        bebidas_scroll = new JScrollPane(bebidaPanel);
        bebidas_scroll.setBounds(33, 460, 152, 125);
        panel.add(bebidas_scroll);
        
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(214, 175, 41));
        panel_1.setBounds(0, 0, 597, 64);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        
        //Labels
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
        lblTacos.setForeground(new Color(158, 9, 15));
        lblTacos.setFont(new Font("Dubai", Font.BOLD, 15));
        lblTacos.setBounds(33, 101, 80, 14);
        panel.add(lblTacos);
        
        lblSushi = new JLabel("Sushi");
        lblSushi.setForeground(new Color(158, 9, 15));
        lblSushi.setFont(new Font("Dubai", Font.BOLD, 15));
        lblSushi.setBounds(219, 101, 80, 14);
        panel.add(lblSushi);
        
        lblPan = new JLabel("Pan");
        lblPan.setForeground(new Color(158, 9, 15));
        lblPan.setFont(new Font("Dubai", Font.BOLD, 15));
        lblPan.setBounds(413, 101, 80, 14);
        panel.add(lblPan);
        
        lblHamburguesa = new JLabel("Hamburguesas");
        lblHamburguesa.setForeground(new Color(158, 9, 15));
        lblHamburguesa.setFont(new Font("Dubai", Font.BOLD, 15));
        lblHamburguesa.setBounds(33, 275, 110, 14);
        panel.add(lblHamburguesa);

        lblEnsaladas = new JLabel("Ensaladas");
        lblEnsaladas.setForeground(new Color(158, 9, 15));
        lblEnsaladas.setFont(new Font("Dubai", Font.BOLD, 15));
        lblEnsaladas.setBounds(219, 275, 80, 14);
        panel.add(lblEnsaladas);

        lblPostres = new JLabel("Postres");
        lblPostres.setForeground(new Color(158, 9, 15));
        lblPostres.setFont(new Font("Dubai", Font.BOLD, 15));
        lblPostres.setBounds(413, 275, 80, 14);
        panel.add(lblPostres);

        lblBebidas = new JLabel("Bebidas");
        lblBebidas.setForeground(new Color(158, 9, 15));
        lblBebidas.setFont(new Font("Dubai", Font.BOLD, 15));
        lblBebidas.setBounds(33, 445, 80, 14);
        panel.add(lblBebidas);
        
        JButton btnNewButton = new JButton("FINALIZAR");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(158, 9, 15));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setBounds(304, 580, 98, 22);
        panel.add(btnNewButton);
        
        JButton btnAadir = new JButton("AÑADIR");
        btnAadir.setForeground(new Color(158, 9, 15));
        btnAadir.setBackground(new Color(214, 175, 41));
        btnAadir.setBounds(435, 580, 88, 22);
        panel.add(btnAadir);
        
        scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(219, 437, 346, 97);
        panel.add(scrollPane_1);
        
        panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 255));
        scrollPane_1.setViewportView(panel_2);
        
        lblNewLabel_2 = new JLabel("Así va tu pedido");
        lblNewLabel_2.setForeground(new Color(158, 9, 15));
        lblNewLabel_2.setFont(new Font("Dubai", Font.BOLD, 20));
        lblNewLabel_2.setBounds(219, 538, 152, 20);
        panel.add(lblNewLabel_2);

        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //scrollPane.setBounds(0, 0, 616, 287);
        scrollPane.setBounds(0, 0, 616, 507);
        frame.getContentPane().add(scrollPane);
    }
    
    private void tacoExtras(CATaco taco) {
        JDialog dialog = new JDialog(frame, "Extras para " + taco.getNombre(), true);
        dialog.setBounds(200, 200, 300, 380);
        dialog.getContentPane().setLayout(null);

        JLabel lblTitulo = new JLabel("Selecciona tus extras:");
        lblTitulo.setFont(new Font("Dubai", Font.BOLD, 14));
        lblTitulo.setForeground(new Color(179, 70, 34));
        lblTitulo.setBounds(20, 10, 250, 20);
        dialog.getContentPane().add(lblTitulo);
        String[] nombresExtras = {"Aderezo Ranch", "Aguacate", "Cebolla Caramelizada",
            "Champiñones", "Jalapeños", "Piña","Queso", "Salsa BBQ", "Salsa Chipotle", "Tocino"};
        JCheckBox[] checkboxes = new JCheckBox[nombresExtras.length];
        for (int i = 0; i < nombresExtras.length; i++) {
            checkboxes[i] = new JCheckBox(nombresExtras[i]);
            checkboxes[i].setBounds(20, 40 + i * 25, 200, 20);
            checkboxes[i].setFont(new Font("Dubai", Font.PLAIN, 12));
            dialog.getContentPane().add(checkboxes[i]);
        }
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBackground(new Color(158, 9, 15));
        btnConfirmar.setForeground(new Color(255, 255, 255));
        btnConfirmar.setBounds(90, 300, 110, 25);
        dialog.getContentPane().add(btnConfirmar);
        btnConfirmar.addActionListener(e -> {
            InterComida tacoConExtras = taco;
            for (int i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].isSelected()) {
                    switch (i) {
                    case 0: tacoConExtras = new ExtraCAderezoRanch(tacoConExtras); break;
                    case 1: tacoConExtras = new ExtraCAguacate(tacoConExtras); break;  
                    case 2: tacoConExtras = new ExtraCCebollaCaramelizada(tacoConExtras); break;
                    case 3: tacoConExtras = new ExtraCChampinones(tacoConExtras); break;
                    case 4: tacoConExtras = new ExtraCJalapenos(tacoConExtras); break;
                    case 5: tacoConExtras = new ExtraCPina(tacoConExtras); break;
                    case 6: tacoConExtras = new ExtraCQueso(tacoConExtras); break;
                    case 7: tacoConExtras = new ExtraCSalsaBBQ(tacoConExtras); break;
                    case 8: tacoConExtras = new ExtraCSalsaChipotle(tacoConExtras); break;
                    case 9: tacoConExtras = new ExtraCTocino(tacoConExtras); break;
                    }
                }
            }
            tacoSel = tacoConExtras;
            dialog.dispose();
        });
        dialog.setVisible(true);
    }
    
    private void sushiExtras(CASushi sushi) {
        JDialog dialog = new JDialog(frame, "Extras para " + sushi.getNombre(), true);
        dialog.setBounds(200, 200, 300, 380);
        dialog.getContentPane().setLayout(null);
        JLabel lblTitulo = new JLabel("Selecciona tus extras:");
        lblTitulo.setFont(new Font("Dubai", Font.BOLD, 14));
        lblTitulo.setForeground(new Color(179, 70, 34));
        lblTitulo.setBounds(20, 10, 250, 20);
        dialog.getContentPane().add(lblTitulo);
        String[] nombresExtras = {"Camarón","Queso crema","Salmón","Surimi","Tampico"};
        JCheckBox[] checkboxes = new JCheckBox[nombresExtras.length];
        for (int i = 0; i < nombresExtras.length; i++) {
            checkboxes[i] = new JCheckBox(nombresExtras[i]);
            checkboxes[i].setBounds(20, 40 + i * 25, 200, 20);
            checkboxes[i].setFont(new Font("Dubai", Font.PLAIN, 12));
            dialog.getContentPane().add(checkboxes[i]);
        }
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBackground(new Color(158, 9, 15));
        btnConfirmar.setForeground(new Color(255, 255, 255));
        btnConfirmar.setBounds(90, 300, 110, 25);
        dialog.getContentPane().add(btnConfirmar);
        btnConfirmar.addActionListener(e -> {
            InterSushiEnsalda sushiConExtras = sushi;
            for (int i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].isSelected()) {
                    switch (i) {
                    case 0: sushiConExtras = new ExtraSECamaron(sushiConExtras); break;
                    case 1: sushiConExtras = new ExtraSEQuesoCrema(sushiConExtras); break;  
                    case 2: sushiConExtras = new ExtraSESalmon(sushiConExtras); break;
                    case 3: sushiConExtras = new ExtraSESurimi(sushiConExtras); break;
                    case 4: sushiConExtras = new ExtraSETampico(sushiConExtras); break;
                    }
                }
            }
            sushiSel = sushiConExtras;
            dialog.dispose();
        });
        dialog.setVisible(true);
    }
    
    private void panExtras(CAPan pan) {
        JDialog dialog = new JDialog(frame, "Extras para " + pan.getNombre(), true);
        dialog.setBounds(200, 200, 300, 380);
        dialog.getContentPane().setLayout(null);
        JLabel lblTitulo = new JLabel("Selecciona tus extras:");
        lblTitulo.setFont(new Font("Dubai", Font.BOLD, 14));
        lblTitulo.setForeground(new Color(179, 70, 34));
        lblTitulo.setBounds(20, 10, 250, 20);
        dialog.getContentPane().add(lblTitulo);
        String[] nombresExtras = {"Azúcar Glass", "Cajeta", "Chocolate"};
        JCheckBox[] checkboxes = new JCheckBox[nombresExtras.length];
        for (int i = 0; i < nombresExtras.length; i++) {
            checkboxes[i] = new JCheckBox(nombresExtras[i]);
            checkboxes[i].setBounds(20, 40 + i * 25, 200, 20);
            checkboxes[i].setFont(new Font("Dubai", Font.PLAIN, 12));
            dialog.getContentPane().add(checkboxes[i]);
        }
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBackground(new Color(158, 9, 15));
        btnConfirmar.setForeground(new Color(255, 255, 255));
        btnConfirmar.setBounds(90, 300, 110, 25);
        dialog.getContentPane().add(btnConfirmar);
        btnConfirmar.addActionListener(e -> {
            InterPan panConExtras = pan;
            for (int i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].isSelected()) {
                    switch (i) {
                    case 0: panConExtras = new ExtraPAAzucarGlass(panConExtras); break;
                    case 1: panConExtras = new ExtraPACajeta(panConExtras); break;  
                    case 2: panConExtras = new ExtraPAChocolate(panConExtras); break;
                    }
                }
            }
            panSel = panConExtras;
            dialog.dispose();
        });
        dialog.setVisible(true);
    }
    
    private void burgerExtras(CAHamburguesa burger) {
        JDialog dialog = new JDialog(frame, "Extras para " + burger.getNombre(), true);
        dialog.setBounds(200, 200, 300, 380);
        dialog.getContentPane().setLayout(null);
        JLabel lblTitulo = new JLabel("Selecciona tus extras:");
        lblTitulo.setFont(new Font("Dubai", Font.BOLD, 14));
        lblTitulo.setForeground(new Color(179, 70, 34));
        lblTitulo.setBounds(20, 10, 250, 20);
        dialog.getContentPane().add(lblTitulo);
        String[] nombresExtras = {"Aderezo Ranch", "Aguacate", "Cebolla Caramelizada",
                "Champiñones", "Jalapeños", "Piña","Queso", "Salsa BBQ", "Salsa Chipotle", "Tocino"};
        JCheckBox[] checkboxes = new JCheckBox[nombresExtras.length];
        for (int i = 0; i < nombresExtras.length; i++) {
            checkboxes[i] = new JCheckBox(nombresExtras[i]);
            checkboxes[i].setBounds(20, 40 + i * 25, 200, 20);
            checkboxes[i].setFont(new Font("Dubai", Font.PLAIN, 12));
            dialog.getContentPane().add(checkboxes[i]);
        }
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBackground(new Color(158, 9, 15));
        btnConfirmar.setForeground(new Color(255, 255, 255));
        btnConfirmar.setBounds(90, 300, 110, 25);
        dialog.getContentPane().add(btnConfirmar);
        btnConfirmar.addActionListener(e -> {
            InterComida burgerConExtras = burger;
            for (int i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].isSelected()) {
                    switch (i) {
                    case 0: burgerConExtras = new ExtraCAderezoRanch(burgerConExtras); break;
                    case 1: burgerConExtras = new ExtraCAguacate(burgerConExtras); break;  
                    case 2: burgerConExtras = new ExtraCCebollaCaramelizada(burgerConExtras); break;
                    case 3: burgerConExtras = new ExtraCChampinones(burgerConExtras); break;
                    case 4: burgerConExtras = new ExtraCJalapenos(burgerConExtras); break;
                    case 5: burgerConExtras = new ExtraCPina(burgerConExtras); break;
                    case 6: burgerConExtras = new ExtraCQueso(burgerConExtras); break;
                    case 7: burgerConExtras = new ExtraCSalsaBBQ(burgerConExtras); break;
                    case 8: burgerConExtras = new ExtraCSalsaChipotle(burgerConExtras); break;
                    case 9: burgerConExtras = new ExtraCTocino(burgerConExtras); break;
                    }
                }
            }
            burgerSel = burgerConExtras;
            dialog.dispose();
        });
        dialog.setVisible(true);
    }
    
    private void saladExtras(CAEnsalada salad) {
        JDialog dialog = new JDialog(frame, "Extras para " + salad.getNombre(), true);
        dialog.setBounds(200, 200, 300, 380);
        dialog.getContentPane().setLayout(null);
        JLabel lblTitulo = new JLabel("Selecciona tus extras:");
        lblTitulo.setFont(new Font("Dubai", Font.BOLD, 14));
        lblTitulo.setForeground(new Color(179, 70, 34));
        lblTitulo.setBounds(20, 10, 250, 20);
        dialog.getContentPane().add(lblTitulo);
        String[] nombresExtras = {"Camarón","Queso crema","Salmón","Surimi","Tampico"};
        JCheckBox[] checkboxes = new JCheckBox[nombresExtras.length];
        for (int i = 0; i < nombresExtras.length; i++) {
            checkboxes[i] = new JCheckBox(nombresExtras[i]);
            checkboxes[i].setBounds(20, 40 + i * 25, 200, 20);
            checkboxes[i].setFont(new Font("Dubai", Font.PLAIN, 12));
            dialog.getContentPane().add(checkboxes[i]);
        }
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBackground(new Color(158, 9, 15));
        btnConfirmar.setForeground(new Color(255, 255, 255));
        btnConfirmar.setBounds(90, 300, 110, 25);
        dialog.getContentPane().add(btnConfirmar);
        btnConfirmar.addActionListener(e -> {
            InterSushiEnsalda saladConExtras = salad;
            for (int i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].isSelected()) {
                    switch (i) {
                    case 0: saladConExtras = new ExtraSECamaron(saladConExtras); break;
                    case 1: saladConExtras = new ExtraSEQuesoCrema(saladConExtras); break;  
                    case 2: saladConExtras = new ExtraSESalmon(saladConExtras); break;
                    case 3: saladConExtras = new ExtraSESurimi(saladConExtras); break;
                    case 4: saladConExtras = new ExtraSETampico(saladConExtras); break;
                    }
                }
            }
            ensaladaSel = saladConExtras;
            dialog.dispose();
        });
        dialog.setVisible(true);
    }
    
    private void postreExtras(CAPostre postre) {
        JDialog dialog = new JDialog(frame, "Extras para " + postre.getNombre(), true);
        dialog.setBounds(200, 200, 300, 380);
        dialog.getContentPane().setLayout(null);
        JLabel lblTitulo = new JLabel("Selecciona tus extras:");
        lblTitulo.setFont(new Font("Dubai", Font.BOLD, 14));
        lblTitulo.setForeground(new Color(179, 70, 34));
        lblTitulo.setBounds(20, 10, 250, 20);
        dialog.getContentPane().add(lblTitulo);
        String[] nombresExtras = {"Cajeta","Chocolate","Fresa","Helado","Nuez"};
        JCheckBox[] checkboxes = new JCheckBox[nombresExtras.length];
        for (int i = 0; i < nombresExtras.length; i++) {
            checkboxes[i] = new JCheckBox(nombresExtras[i]);
            checkboxes[i].setBounds(20, 40 + i * 25, 200, 20);
            checkboxes[i].setFont(new Font("Dubai", Font.PLAIN, 12));
            dialog.getContentPane().add(checkboxes[i]);
        }
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBackground(new Color(158, 9, 15));
        btnConfirmar.setForeground(new Color(255, 255, 255));
        btnConfirmar.setBounds(90, 300, 110, 25);
        dialog.getContentPane().add(btnConfirmar);
        btnConfirmar.addActionListener(e -> {
            InterPostre postreConExtras = postre;
            for (int i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].isSelected()) {
                    switch (i) {
                    case 0: postreConExtras = new ExtraPCajeta(postreConExtras); break;
                    case 1: postreConExtras = new ExtraPChocolate(postreConExtras); break;  
                    case 2: postreConExtras = new ExtraPFresa(postreConExtras); break;
                    case 3: postreConExtras = new ExtraPHelado(postreConExtras); break;
                    case 4: postreConExtras = new ExtraPNuez(postreConExtras); break;
                    }
                }
            }
            postreSel = postreConExtras;
            dialog.dispose();
        });
        dialog.setVisible(true);
    }
    
    private void bebidaExtras(CABebida bebida) {
        JDialog dialog = new JDialog(frame, "Extras para " + bebida.getNombre(), true);
        dialog.setBounds(200, 200, 300, 380);
        dialog.getContentPane().setLayout(null);
        JLabel lblTitulo = new JLabel("Selecciona tus extras:");
        lblTitulo.setFont(new Font("Dubai", Font.BOLD, 14));
        lblTitulo.setForeground(new Color(179, 70, 34));
        lblTitulo.setBounds(20, 10, 250, 20);
        dialog.getContentPane().add(lblTitulo);
        String[] nombresExtras = {"Crema batida", "Jarabe Vainilla", "Leche Almendra", "Leche Deslactosada"};
        JCheckBox[] checkboxes = new JCheckBox[nombresExtras.length];
        for (int i = 0; i < nombresExtras.length; i++) {
            checkboxes[i] = new JCheckBox(nombresExtras[i]);
            checkboxes[i].setBounds(20, 40 + i * 25, 200, 20);
            checkboxes[i].setFont(new Font("Dubai", Font.PLAIN, 12));
            dialog.getContentPane().add(checkboxes[i]);
        }
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBackground(new Color(158, 9, 15));
        btnConfirmar.setForeground(new Color(255, 255, 255));
        btnConfirmar.setBounds(90, 300, 110, 25);
        dialog.getContentPane().add(btnConfirmar);
        btnConfirmar.addActionListener(e -> {
            InterBebida bebidaConExtras = bebida;
            for (int i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].isSelected()) {
                    switch (i) {
                    case 0: bebidaConExtras = new ExtraBCremaBatida(bebidaConExtras); break;
                    case 1: bebidaConExtras = new ExtraBJarabeVainillla(bebidaConExtras); break;  
                    case 2: bebidaConExtras = new ExtraBLecheAlmendra(bebidaConExtras); break;
                    case 3: bebidaConExtras = new ExtraBLecheDeslasctosada(bebidaConExtras); break;
                    }
                }
            }
            bebidaSel = bebidaConExtras;
            dialog.dispose();
        });
        dialog.setVisible(true);
    }
}