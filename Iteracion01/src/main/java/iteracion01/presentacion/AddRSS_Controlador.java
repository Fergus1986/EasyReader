package iteracion01.presentacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import iteracion01.dominio.Categoria;
import iteracion01.dominio.GestionarCanal;

public class AddRSS_Controlador {
	
	private GestionarCanal reader;
	private AddRSS_UI frame;
	
	public void startApplication(){
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setReader(new GestionarCanal());
		setFrame(new AddRSS_UI());
		
		 // make the frame half the height and width
		getFrame().setSize(screenSize.width/2, screenSize.height/2);
		
		// center the JFrame on screen
		getFrame().setLocationRelativeTo(null);
		
		getFrame().setVisible(true);
		
		// Connect events
		
		getFrame().getBtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		
		getFrame().getTxtURL().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addCanal();
			}
		});
		
		getCategorias();
	}
	
	public void getCategorias(){
		
		getFrame().getComboBoxCategoria().removeAllItems();
		
		List<Categoria> categorias = getReader().getCategorias();
				
		for (Categoria categoria: categorias){
			getFrame().getComboBoxCategoria().addItem(categoria.getNombre());
		}
	}
	
	public void addCanal(){
		
		getReader().addCanal(getFrame().getTxtURL().getText(), getFrame().getComboBoxCategoria().getSelectedItem().toString());		
	}
	
	public void close(){
		//System.exit(0);
		frame.dispose();
	}

	public GestionarCanal getReader() {
		return reader;
	}

	public void setReader(GestionarCanal reader) {
		this.reader = reader;
	}

	public AddRSS_UI getFrame() {
		return frame;
	}

	public void setFrame(AddRSS_UI frame) {
		this.frame = frame;
	}

}
