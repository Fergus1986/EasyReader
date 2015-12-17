package iteracion02.presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.JList;

public class VerListaNoticias_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textSearch;
	private JButton btnAddRss;
	private JButton btnActualizar;
	
	private JTree treeArticulos;
	private DefaultMutableTreeNode rootArticulos;
	private DefaultTreeModel modelArticulos;
	
	
	private JLabel lblCategoria;
	private JLabel lblArticulosSinLeer;
	private JButton btnSalir;
	private JButton btnBuscar;


	/**
	 * Create the frame.
	 */
	public VerListaNoticias_UI() {
		setTitle("EasyReader");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnAddRss = new JButton("Añadir RSS");
		
		btnSalir = new JButton("Salir");
		
		textSearch = new JTextField();
		textSearch.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		
		lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Dialog", Font.BOLD, 20));
		
		lblArticulosSinLeer = new JLabel("Articulos sin leer");
		
		rootArticulos = new DefaultMutableTreeNode("Todos");
		modelArticulos = new DefaultTreeModel(rootArticulos);
		
		treeArticulos = new JTree(modelArticulos);
		
		JList list = new JList();
		
		btnActualizar = new JButton("Actualizar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAddRss)
								.addComponent(treeArticulos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnActualizar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
											.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
											.addGap(77))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblArticulosSinLeer)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnBuscar))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblCategoria)
									.addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
									.addComponent(textSearch, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))))
						.addComponent(btnSalir))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddRss)
						.addComponent(btnActualizar)
						.addComponent(lblCategoria)
						.addComponent(textSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(treeArticulos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(24)
									.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
							.addComponent(btnSalir))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblArticulosSinLeer)
								.addComponent(btnBuscar))))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTextSearch() {
		return textSearch;
	}

	public void setTextSearch(JTextField textSearch) {
		this.textSearch = textSearch;
	}

	public JButton getBtnAddRss() {
		return btnAddRss;
	}

	public void setBtnAddRss(JButton btnAddRss) {
		this.btnAddRss = btnAddRss;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JTree getTreeArticulos() {
		return treeArticulos;
	}

	public void setTreeArticulos(JTree treeArticulos) {
		this.treeArticulos = treeArticulos;
	}

	public DefaultMutableTreeNode getRootArticulos() {
		return rootArticulos;
	}

	public void setRootArticulos(DefaultMutableTreeNode rootArticulos) {
		this.rootArticulos = rootArticulos;
	}

	public DefaultTreeModel getModelArticulos() {
		return modelArticulos;
	}

	public void setModelArticulos(DefaultTreeModel modelArticulos) {
		this.modelArticulos = modelArticulos;
	}

	public JLabel getLblCategoria() {
		return lblCategoria;
	}

	public void setLblCategoria(JLabel lblCategoria) {
		this.lblCategoria = lblCategoria;
	}

	public JLabel getLblArticulosSinLeer() {
		return lblArticulosSinLeer;
	}

	public void setLblArticulosSinLeer(JLabel lblArticulosSinLeer) {
		this.lblArticulosSinLeer = lblArticulosSinLeer;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}
}
