package cinema.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.AncestorListener;

import cinema.repository.FilmRepository;
import cinema.repository.FilmRepositoryImp;



public class MondoCinemaGui implements PanelSwitcher{
	
	private final int WIDTH = 800;
    private final int HEIGTH = 600;
    private JFrame frame;
    
    private PannelloTabella pannelloTabella;
    private FilmRepository filmRepository = new FilmRepositoryImp();
    
    
    
    public MondoCinemaGui(String title) {
    	this.frame = new JFrame();
    	this.frame.setTitle(title);
    	this.frame.setSize(WIDTH, HEIGTH);
    	this.frame.setLocation(new Point(50,200));
    	this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();

        JMenu comandi = new JMenu("Comandi");
        JMenu attori=new JMenu("Attori");
        JMenuItem caricaAttori=new JMenuItem("Carica");
        JMenu film=new JMenu("Film");
        JMenuItem caricaFilm=new JMenuItem("Carica");
        JMenu recita=new JMenu("Recita");
        JMenuItem caricaRecita=new JMenuItem("Carica");
        JMenu proiezioni=new JMenu("Proiezioni");
        JMenuItem caricaProiezioni=new JMenuItem("Carica");
        JMenu sale=new JMenu("Sale");
        JMenuItem caricaSale=new JMenuItem("Carica");
        film.add(caricaFilm);
        sale.add(caricaSale);
        recita.add(caricaRecita);
        proiezioni.add(caricaProiezioni);
        attori.add(caricaAttori);

        
        JMenuItem close = new JMenuItem("Close");
        JMenu filtraper= new JMenu("Filtra per");
        JMenuItem titoloeCod = new JMenuItem("Titolo e CodFilm");
        JMenuItem listafilm = new JMenuItem("ListaFilm");
        JMenuItem codFilm=new JMenuItem("CodFilm");
        JMenuItem titoloeanno=new JMenuItem("Titolo e Anno");
        
        filtraper.add(titoloeCod);
        filtraper.add(listafilm);
        filtraper.add(codFilm);
        filtraper.add(titoloeanno);
        
        comandi.add(filtraper);
        
        
        
        close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(-1);
			}
        	
         });
        
        
        
        
        caricaFilm.addActionListener(new MondoCinemaGui.cercaTable());
         
        
       
        comandi.add(close);
        menuBar.add(comandi);
        menuBar.add(attori);
        menuBar.add(film);
        menuBar.add(recita);
        menuBar.add(proiezioni);
        menuBar.add(sale);
        this.frame.setJMenuBar(menuBar);
        
        this.pannelloTabella = new PannelloTabella(this);
        this.frame.add(this.pannelloTabella, BorderLayout.CENTER);
        this.pannelloTabella();
        this.frame.setVisible(true);
       
     
    }
 
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() { //classe interna anonima
            @Override
            public void run() {
                PanelSwitcher mondoCinema = new MondoCinemaGui("MondoCinema");
            }
        });
    }

	@Override
	public void pannelloTabella() {
		
		// TODO Auto-generated method stub
		switchTo(pannelloTabella);
	}
	private void switchTo(PannelloTabella pannelloTabella1) {
		// TODO Auto-generated method stub
		this.frame.setContentPane(pannelloTabella1);
        this.frame.pack();
	}
	
	 private class cercaTable implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	           MondoCinemaGui.this.pannelloTabella.cercaTable();
	            switchTo(MondoCinemaGui.this.pannelloTabella);

	        }
	    }


}
