package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import repository.FilmRepository;
import repository.FilmRepositoryImp;

public abstract class PannelloTabella extends JPanel {
	
	protected Object[][] data = new Object[0][0];
	
	
	protected PanelSwitcher panelSwitcher;
	
	
	public abstract void cercaTable() ;
	
}
