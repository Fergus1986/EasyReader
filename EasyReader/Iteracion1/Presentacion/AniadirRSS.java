package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AniadirRSS {

	private JFrame frame;
	private JTextField txtUrl;
	private JTextField txtNuevacategoria;
	private JButton btnAtras;
	private JLabel lblCrearNuevaCategoria;

	/**
	 * Launch the application.
	 */
	public void ejecucion() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AniadirRSS window = new AniadirRSS();
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
	public AniadirRSS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				frame.setDefaultCloseOperation (WindowConstants.DISPOSE_ON_CLOSE);
			}
			@Override
			public void windowClosing(WindowEvent e) {
				frame.setDefaultCloseOperation (WindowConstants.DISPOSE_ON_CLOSE);
			}
		});
		frame.setBounds(100, 100, 503, 308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		final JButton btnGuardarCategoria = new JButton("Guardar Categoria");
		btnGuardarCategoria.setVisible(false);
		
		lblCrearNuevaCategoria = new JLabel("Crear Nueva Categoria");
		lblCrearNuevaCategoria.setVisible(false);
		GridBagConstraints gbc_lblCrearNuevaCategoria = new GridBagConstraints();
		gbc_lblCrearNuevaCategoria.fill = GridBagConstraints.BOTH;
		gbc_lblCrearNuevaCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearNuevaCategoria.gridx = 2;
		gbc_lblCrearNuevaCategoria.gridy = 3;
		frame.getContentPane().add(lblCrearNuevaCategoria, gbc_lblCrearNuevaCategoria);
		GridBagConstraints gbc_btnGuardarCategoria = new GridBagConstraints();
		gbc_btnGuardarCategoria.fill = GridBagConstraints.BOTH;
		gbc_btnGuardarCategoria.gridwidth = 4;
		gbc_btnGuardarCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarCategoria.gridx = 4;
		gbc_btnGuardarCategoria.gridy = 6;
		frame.getContentPane().add(btnGuardarCategoria, gbc_btnGuardarCategoria);
		
		final JLabel lblText = new JLabel("Introduce la URL de la Fuente de Noticias:");
		GridBagConstraints gbc_lblText = new GridBagConstraints();
		gbc_lblText.insets = new Insets(0, 0, 5, 5);
		gbc_lblText.gridx = 2;
		gbc_lblText.gridy = 2;
		frame.getContentPane().add(lblText, gbc_lblText);
		
		txtUrl = new JTextField();
		GridBagConstraints gbc_txtUrl = new GridBagConstraints();
		gbc_txtUrl.insets = new Insets(0, 0, 5, 5);
		gbc_txtUrl.fill = GridBagConstraints.BOTH;
		gbc_txtUrl.gridx = 2;
		gbc_txtUrl.gridy = 4;
		frame.getContentPane().add(txtUrl, gbc_txtUrl);
		txtUrl.setColumns(10);
		
		txtNuevacategoria = new JTextField();
		txtNuevacategoria.setVisible(false);
		
		GridBagConstraints gbc_txtNuevacategoria = new GridBagConstraints();
		gbc_txtNuevacategoria.insets = new Insets(0, 0, 5, 5);
		gbc_txtNuevacategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNuevacategoria.gridx = 2;
		gbc_txtNuevacategoria.gridy = 6;
		frame.getContentPane().add(txtNuevacategoria, gbc_txtNuevacategoria);
		txtNuevacategoria.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem().toString().equalsIgnoreCase("Nueva Categoria")){
					txtNuevacategoria.setVisible(true);
					btnGuardarCategoria.setVisible(true);
					btnAtras.setVisible(true);
					txtUrl.setVisible(false);
					comboBox.setVisible(false);
					lblCrearNuevaCategoria.setVisible(true);
					lblText.setVisible(false);
				}
			}
		});
		comboBox.addItem(" ");
		comboBox.addItem("Nueva Categoria");
		comboBox.setSelectedItem(" ");
				
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 4;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.BOTH;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 4;
		frame.getContentPane().add(comboBox, gbc_comboBox);
		
		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNuevacategoria.setVisible(false);
				btnGuardarCategoria.setVisible(false);
				btnAtras.setVisible(false);
				txtUrl.setVisible(true);
				comboBox.setVisible(true);
				comboBox.setSelectedItem(" ");
				lblCrearNuevaCategoria.setVisible(false);
				lblText.setVisible(true);
			}
		});
		btnAtras.setVisible(false);
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.fill = GridBagConstraints.BOTH;
		gbc_btnAtras.gridwidth = 4;
		gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras.gridx = 4;
		gbc_btnAtras.gridy = 7;
		frame.getContentPane().add(btnAtras, gbc_btnAtras);
		
		
		
	}

}
