package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

public class MostrarRSS {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarRSS window = new MostrarRSS();
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
	public MostrarRSS() {
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
		gbl_panel.columnWidths = new int[]{181, 0};
		gbl_panel.rowHeights = new int[]{473, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 0;
		panel.add(scrollPane_2, gbc_scrollPane_2);
		
		JPanel panel_1 = new JPanel();
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
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridwidth = 6;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 10;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBuscar.gridwidth = 5;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 0);
		gbc_btnBuscar.gridx = 16;
		gbc_btnBuscar.gridy = 0;
		panel_1.add(btnBuscar, gbc_btnBuscar);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
		gbc_lblCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCategoria.gridwidth = 10;
		gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategoria.gridx = 0;
		gbc_lblCategoria.gridy = 0;
		panel_1.add(lblCategoria, gbc_lblCategoria);
		
		JLabel lblNumeroarticulos = new JLabel("NumeroArticulos");
		lblNumeroarticulos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNumeroarticulos = new GridBagConstraints();
		gbc_lblNumeroarticulos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNumeroarticulos.gridwidth = 21;
		gbc_lblNumeroarticulos.insets = new Insets(0, 0, 5, 0);
		gbc_lblNumeroarticulos.gridx = 0;
		gbc_lblNumeroarticulos.gridy = 1;
		panel_1.add(lblNumeroarticulos, gbc_lblNumeroarticulos);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 7;
		gbc_scrollPane.gridwidth = 21;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 4;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		JLabel lblImagen = new JLabel("Imagen");
		
		lblImagen.setIcon(new ImageIcon(""));
		
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setViewportView(lblImagen);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 8;
		gbc_scrollPane_1.gridwidth = 21;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 11;
		panel_1.add(scrollPane_1, gbc_scrollPane_1);
		
		JTextArea txtrTexto = new JTextArea();
		txtrTexto.setWrapStyleWord(true);
		txtrTexto.setLineWrap(true);
		txtrTexto.setText("Texto");
		txtrTexto.setEditable(false);
		scrollPane_1.setViewportView(txtrTexto);
	}
}
