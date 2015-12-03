package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTree;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AdministrarRSS extends JFrame implements TreeSelectionListener {

	JFrame frame;
	private JTextField textField;
	private JTree arbol;
	private JPanel panel_1, panel_2;
	private DefaultListModel modelo2 = new DefaultListModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministrarRSS window = new AdministrarRSS();
					window.frame.setVisible(true);
					window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdministrarRSS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 792, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 15;
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnAadirRss = new JButton("A\u00F1adir RSS");
		btnAadirRss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AniadirRSS rss=new AniadirRSS();
				rss.ejecucion();
			}
		});
		GridBagConstraints gbc_btnAadirRss = new GridBagConstraints();
		gbc_btnAadirRss.insets = new Insets(0, 0, 5, 0);
		gbc_btnAadirRss.fill = GridBagConstraints.BOTH;
		gbc_btnAadirRss.gridwidth = 8;
		gbc_btnAadirRss.gridx = 0;
		gbc_btnAadirRss.gridy = 0;
		panel.add(btnAadirRss, gbc_btnAadirRss);
			
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 15;
		gbc_scrollPane_1.gridwidth = 8;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 1;
		panel.add(scrollPane_1, gbc_scrollPane_1);
		
		/**Construimos los nodos del arbol que seran ramas u hojas*/
		/**Definimos cual será el directorio principal o la raiz de nuestro arbol*/
		  DefaultMutableTreeNode carpetaRaiz = new DefaultMutableTreeNode("Carpeta General");
		 /**Definimos el modelo donde se agregaran los nodos*/
		  DefaultTreeModel modelo = new DefaultTreeModel(carpetaRaiz);
		 /**agregamos el modelo al arbol, donde previamente establecimos la raiz*/
		 arbol = new JTree(modelo);
		 /**definimos los eventos*/
		 arbol.getSelectionModel().addTreeSelectionListener(this);
		         
		 /**Definimos mas nodos del arbol y se lo agregamos al modelo*/
		 DefaultMutableTreeNode carpeta2 = new DefaultMutableTreeNode("Categoria");
		 DefaultMutableTreeNode archivo1 = new DefaultMutableTreeNode("Fuente");
		 DefaultMutableTreeNode archivo2 = new DefaultMutableTreeNode("Fuente");
		 DefaultMutableTreeNode archivo3 = new DefaultMutableTreeNode("Fuente");
		 /**Definimos donde se agrega el nodo, dentro de que rama y que posicion*/
		 modelo.insertNodeInto(carpeta2, carpetaRaiz, 0);
		 modelo.insertNodeInto(archivo1, carpetaRaiz, 1);
		 modelo.insertNodeInto(archivo2, carpetaRaiz, 2);
		 
		 /**Creamos las hojas del arbol*/
		 DefaultMutableTreeNode archivo4 = new DefaultMutableTreeNode("Fuente");
		 DefaultMutableTreeNode archivo5 = new DefaultMutableTreeNode("Fuente");
		 DefaultMutableTreeNode archivo6 = new DefaultMutableTreeNode("Fuente");
		         
		 modelo.insertNodeInto(archivo3, carpeta2, 0);
		 modelo.insertNodeInto(archivo4, carpeta2, 1);
		 modelo.insertNodeInto(archivo5, carpeta2, 2);
		 modelo.insertNodeInto(archivo6, carpeta2, 3);
		
		 scrollPane_1.setViewportView(arbol);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridwidth = 19;
		gbc_panel_1.gridheight = 15;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 5;
		gbc_panel_1.gridy = 0;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					panel_1.setVisible(true);
					panel_2.setVisible(false);
					modelo2.removeAllElements();
					for(int i = 0; i<100; i++){
				        modelo2.addElement((i+1)+" Resultado Busqueda");
					}
				}
			}
		});
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridwidth = 6;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 11;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				modelo2.removeAllElements();
				for(int i = 0; i<100; i++){
			        modelo2.addElement((i+1)+" Resultado Busqueda");
				}
			}
		});
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBuscar.gridwidth = 5;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 0);
		gbc_btnBuscar.gridx = 17;
		gbc_btnBuscar.gridy = 0;
		panel_1.add(btnBuscar, gbc_btnBuscar);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
		gbc_lblCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCategoria.gridwidth = 10;
		gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategoria.gridx = 1;
		gbc_lblCategoria.gridy = 0;
		panel_1.add(lblCategoria, gbc_lblCategoria);
		
		JLabel lblNumeroarticulos = new JLabel("NumeroArticulos");
		lblNumeroarticulos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNumeroarticulos = new GridBagConstraints();
		gbc_lblNumeroarticulos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNumeroarticulos.gridwidth = 21;
		gbc_lblNumeroarticulos.insets = new Insets(0, 0, 5, 0);
		gbc_lblNumeroarticulos.gridx = 1;
		gbc_lblNumeroarticulos.gridy = 1;
		panel_1.add(lblNumeroarticulos, gbc_lblNumeroarticulos);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 18;
		gbc_scrollPane.gridwidth = 22;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		JList listarNoticias = new JList();
		listarNoticias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		for(int i = 0; i<100; i++){
		        modelo2.addElement((i+1)+" Noticia");
		}
		listarNoticias.setModel(modelo2);
		scrollPane.setViewportView(listarNoticias);
		
		
		panel_2 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridwidth = 19;
		gbc_panel_2.gridheight = 15;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 5;
		gbc_panel_2.gridy = 0;
		frame.getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		panel_2.setVisible(false);
		
		JTextField textField2 = new JTextField();
		textField2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					panel_1.setVisible(true);
					panel_2.setVisible(false);
					modelo2.removeAllElements();
					for(int i = 0; i<100; i++){
				        modelo2.addElement((i+1)+" Resultado Busqueda");
					}
				}
			}
		});
		GridBagConstraints gbc_textField2 = new GridBagConstraints();
		gbc_textField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField2.gridwidth = 6;
		gbc_textField2.insets = new Insets(0, 0, 5, 5);
		gbc_textField2.gridx = 11;
		gbc_textField2.gridy = 0;
		panel_2.add(textField2, gbc_textField2);
		textField2.setColumns(10);
		
		JButton btnBuscar2 = new JButton("Buscar");
		btnBuscar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				modelo2.removeAllElements();
				for(int i = 0; i<100; i++){
			        modelo2.addElement((i+1)+" Resultado Busqueda");
				}
			}
		});
		GridBagConstraints gbc_btnBuscar2 = new GridBagConstraints();
		gbc_btnBuscar2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBuscar2.gridwidth = 5;
		gbc_btnBuscar2.insets = new Insets(0, 0, 5, 0);
		gbc_btnBuscar2.gridx = 17;
		gbc_btnBuscar2.gridy = 0;
		panel_2.add(btnBuscar2, gbc_btnBuscar2);
		
		JLabel lblCategoria2 = new JLabel("Categoria");
		lblCategoria2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblCategoria2 = new GridBagConstraints();
		gbc_lblCategoria2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCategoria2.gridwidth = 10;
		gbc_lblCategoria2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategoria2.gridx = 1;
		gbc_lblCategoria2.gridy = 0;
		panel_2.add(lblCategoria2, gbc_lblCategoria2);
		
		JLabel lblNumeroarticulos2 = new JLabel("NumeroArticulos");
		lblNumeroarticulos2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNumeroarticulos2 = new GridBagConstraints();
		gbc_lblNumeroarticulos2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNumeroarticulos2.gridwidth = 21;
		gbc_lblNumeroarticulos2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNumeroarticulos2.gridx = 1;
		gbc_lblNumeroarticulos2.gridy = 1;
		panel_2.add(lblNumeroarticulos2, gbc_lblNumeroarticulos2);
		
		JLabel lblTitular = new JLabel("Titular");
		lblTitular.setFont(new Font("Tahoma", Font.BOLD, 32));
		GridBagConstraints gbc_lblTitular = new GridBagConstraints();
		gbc_lblTitular.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTitular.gridwidth = 20;
		gbc_lblTitular.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitular.gridx = 0;
		gbc_lblTitular.gridy = 2;
		panel_1.add(lblTitular, gbc_lblTitular);
		
		JLabel lblSubtitulo = new JLabel("Subtitulo");
		lblSubtitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lblSubtitulo = new GridBagConstraints();
		gbc_lblSubtitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSubtitulo.gridwidth = 20;
		gbc_lblSubtitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubtitulo.gridx = 0;
		gbc_lblSubtitulo.gridy = 3;
		panel_1.add(lblSubtitulo, gbc_lblSubtitulo);
		
		JScrollPane scrollPane2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane2 = new GridBagConstraints();
		gbc_scrollPane2.gridheight = 7;
		gbc_scrollPane2.gridwidth = 21;
		gbc_scrollPane2.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane2.gridx = 0;
		gbc_scrollPane2.gridy = 4;
		panel_2.add(scrollPane2, gbc_scrollPane2);
		
		JLabel lblImagen = new JLabel("Imagen");
		
		lblImagen.setIcon(new ImageIcon(""));
		
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane2.setViewportView(lblImagen);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.gridheight = 8;
		gbc_scrollPane_2.gridwidth = 21;
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 11;
		panel_2.add(scrollPane_2, gbc_scrollPane_2);
		
		JTextArea txtrTexto = new JTextArea();
		txtrTexto.setWrapStyleWord(true);
		txtrTexto.setLineWrap(true);
		txtrTexto.setText("Texto");
		txtrTexto.setEditable(false);
		scrollPane_2.setViewportView(txtrTexto);
		
		panel_1.setVisible(false);
		panel_2.setVisible(false);
	}

	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		DefaultMutableTreeNode nodoSeleccionado=(DefaultMutableTreeNode)arbol.getLastSelectedPathComponent();
		panel_1.setVisible(true);
		panel_2.setVisible(false);
		modelo2.removeAllElements();
		for(int i = 0; i<100; i++){
	        modelo2.addElement((i+1)+" Noticia");
		}
	}
}