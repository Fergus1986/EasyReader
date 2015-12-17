package iteracion02.presentacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

import iteracion01.dominio.Canal;
import iteracion01.dominio.Categoria;
import iteracion01.dominio.GestionarCanal;
import iteracion01.presentacion.AddRSS_Controlador;

public class VerListaNoticias_Controlador {
	
	private GestionarCanal reader;
	private VerListaNoticias_UI frame;
	private AddRSS_Controlador addRSSControlador;
	
	public VerListaNoticias_Controlador(){
		
		setReader(new GestionarCanal());
		setFrame(new VerListaNoticias_UI());
		setAddRSSControlador(new AddRSS_Controlador(getReader()));
	}
	
	public VerListaNoticias_Controlador(GestionarCanal reader, VerListaNoticias_UI frame ){
		
		setReader(reader);
		setFrame(frame);
	}
	
	public void start(){
		

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		 // make the frame half the height and width
		getFrame().setSize(2 * screenSize.width/3, 2 * screenSize.height/3);
		
		// center the JFrame on screen
		getFrame().setLocationRelativeTo(null);
		
		getFrame().setVisible(true);
		
		// Connect events
		
		getFrame().getBtnAddRss().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addRSS();
			}
		});
		
		getFrame().getBtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		
		getFrame().getBtnActualizar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
		
		// Update data from the DB
		
		update();
	}
	
	public void addRSS(){
		getAddRSSControlador().start();
	}
	
	public void update(){
				
		List<Categoria> categorias = getReader().getCategorias();
		
		getFrame().getRootArticulos().removeAllChildren();
		getFrame().getModelArticulos().reload(); 
				
		for (Categoria categoria: categorias){
			
			DefaultMutableTreeNode category = new DefaultMutableTreeNode(categoria.getNombre());
			getFrame().getModelArticulos().insertNodeInto(category, getFrame().getRootArticulos(), categorias.indexOf(categoria));
			
			List<Canal> canales = getReader().getCanales(categoria.getId());
			
			for (Canal canal: canales){
				
				if (canal != null){
					DefaultMutableTreeNode channel = new DefaultMutableTreeNode(canal.getTitulo());
					System.out.println(canal);
					getFrame().getModelArticulos().insertNodeInto(channel, category, canales.indexOf(canal));	
				}
			}
			
		}
		
		for (int i = 0; i < getFrame().getTreeArticulos().getRowCount(); i++) {
			getFrame().getTreeArticulos().expandRow(i);
		}
	}
	
	public void close(){
		System.exit(0);
	}

	public GestionarCanal getReader() {
		return reader;
	}

	public void setReader(GestionarCanal reader) {
		this.reader = reader;
	}

	public VerListaNoticias_UI getFrame() {
		return frame;
	}

	public void setFrame(VerListaNoticias_UI frame) {
		this.frame = frame;
	}

	public AddRSS_Controlador getAddRSSControlador() {
		return addRSSControlador;
	}

	public void setAddRSSControlador(AddRSS_Controlador addRSSControlador) {
		this.addRSSControlador = addRSSControlador;
	}
}
