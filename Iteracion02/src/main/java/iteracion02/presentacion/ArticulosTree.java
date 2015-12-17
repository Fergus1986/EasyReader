package iteracion02.presentacion;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import iteracion01.dominio.Categoria;

public class ArticulosTree implements TreeSelectionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTree tree;
	private DefaultMutableTreeNode root;
	private DefaultTreeModel model;
	
	public ArticulosTree(String rootName){
		
		super();
		
		root = new DefaultMutableTreeNode(rootName);
		model = new DefaultTreeModel(root);
		
		//model.addTreeModelListener(this);
		
		tree = new JTree(model);
		tree.setEditable(true);
		
		// Create a tree that allows one selection at a time
		getTree().getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		tree.setShowsRootHandles(true);
		
		// Listen for when the selection changes
		getTree().addTreeSelectionListener(this);
		
	}
	
	public void createCategoria(Categoria categoria){
		
		System.out.println(categoria.getNombre());
		
		DefaultMutableTreeNode category = new DefaultMutableTreeNode(categoria.getNombre());
		model.insertNodeInto(category, getRoot(), 0);
	}
	
	

	public void valueChanged(TreeSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public JTree getTree() {
		return tree;
	}

	public void setTree(JTree tree) {
		this.tree = tree;
	}

	public DefaultMutableTreeNode getRoot() {
		return root;
	}

	public void setRoot(DefaultMutableTreeNode root) {
		this.root = root;
	}

	public DefaultTreeModel getModel() {
		return model;
	}

	public void setModel(DefaultTreeModel model) {
		this.model = model;
	}
}
