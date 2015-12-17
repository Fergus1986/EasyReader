package iteracion01.presentacion;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;


public class AddRSS_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField txtURL;
	private JButton btnSalir;
	private JComboBox<String> comboBoxCategoria;
	private JButton btnAdd;
	
	/**
	 * Create the frame.
	 */
	public AddRSS_UI() {
		setTitle("Añadir RSS");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblIntroduceLaUrl = new JLabel("URL de la fuente de noticias");
		
		txtURL = new JTextField();
		txtURL.setColumns(10);
		
		btnSalir = new JButton("Salir");
		
		JLabel lblCategoria = new JLabel("Categoria");
		
		comboBoxCategoria = new JComboBox<String>();
		
		btnAdd = new JButton("Añadir");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblIntroduceLaUrl)
						.addComponent(lblCategoria)
						.addComponent(comboBoxCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdd))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(txtURL, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalir)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIntroduceLaUrl)
						.addComponent(txtURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblCategoria)
					.addGap(18)
					.addComponent(comboBoxCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(btnSalir))
					.addGap(108))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTxtURL() {
		return txtURL;
	}

	public void setTxtURL(JTextField txtURL) {
		this.txtURL = txtURL;
	}

	public JComboBox<String> getComboBoxCategoria() {
		return comboBoxCategoria;
	}

	public void setComboBoxCategoria(JComboBox<String> comboBoxCategoria) {
		this.comboBoxCategoria = comboBoxCategoria;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
}
