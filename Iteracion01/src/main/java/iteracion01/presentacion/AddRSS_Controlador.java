package iteracion01.presentacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import iteracion01.dominio.CanalErrorCode;
import iteracion01.dominio.CanalException;
import iteracion01.dominio.Categoria;
import iteracion01.dominio.GestionarCanal;

public class AddRSS_Controlador {
	
	private GestionarCanal reader;
	private AddRSS_UI frame;
	
	public AddRSS_Controlador(){
		setReader(new GestionarCanal());
		setFrame(new AddRSS_UI());
	}
	
	public AddRSS_Controlador(GestionarCanal reader){
		
		setReader(reader);
		setFrame(new AddRSS_UI());
	}

	public void start(){
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				
		 // make the frame half the height and width
		getFrame().setSize(screenSize.width/2, screenSize.height/4);
		
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
		
		getFrame().getBtnAdd().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				addCanal();
				
			}
		});
		
		// Load categorias from the DB
		
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
		
		try{
			
			getReader().addCanal(getFrame().getTxtURL().getText(), getFrame().getComboBoxCategoria().getSelectedItem().toString());
			
		}catch(CanalException e){
			
			if (e.getErrorCode() == CanalErrorCode.BAD_URL )
			{
				JOptionPane.showMessageDialog(
						getFrame(),
						"No se ha introducido una URL válida",
						"Error",
					    JOptionPane.ERROR_MESSAGE);
				
			}else if (e.getErrorCode() == CanalErrorCode.BAD_FEED){
				
				JOptionPane.showMessageDialog(
						getFrame(),
						"Se ha encontrado un error en el canal",
						"Error",
					    JOptionPane.ERROR_MESSAGE);
				
				
			}else if (e.getErrorCode() == CanalErrorCode.BAD_DUPLICATED){
				
				JOptionPane.showMessageDialog(
						getFrame(),
						"El canal ya se había añadido anteriormente",
						"Advertencia",
					    JOptionPane.WARNING_MESSAGE);				

				
			}else if (e.getErrorCode() == CanalErrorCode.BAD_UNDEFINED){
				
				JOptionPane.showMessageDialog(
						getFrame(),
						"Se ha encontrado un error indeterminado",
						"Advertencia",
					    JOptionPane.ERROR_MESSAGE);

			}
		}
	}
	
	public void close(){
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
