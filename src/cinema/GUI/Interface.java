package gui;

import javax.swing.event.AncestorListener;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Interface  extends JFrame implements PanelSwitcher
{
	private final int WIDTH = 800;
    private final int HEIGTH = 600;
    private PannelloTabella pannelloTabella;
    
    public Interface(String title)
    {
         setTitle(title);
         setSize(WIDTH, HEIGTH);
         setLocation(new Point(50,200));
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         JMenuBar menuBar = new JMenuBar();
         JMenu comandi = new JMenu("Menu");
         JMenu comandi1 = new JMenu("Attori");
         JMenu comandi2 = new JMenu("Film");
         JMenu comandi3 = new JMenu("Recita");
         JMenu comandi4 = new JMenu("Proiezioni");
         JMenu comandi5 = new JMenu("Sale");
         JMenuItem load = new JMenuItem("Carica Menu");
         JMenuItem load1 = new JMenuItem("Carica Attori");
         JMenuItem load2 = new JMenuItem("Carica Film");
         JMenuItem load3 = new JMenuItem("Carica Recita");
         JMenuItem load4 = new JMenuItem("Carica Proiezioni");
         JMenuItem load5 = new JMenuItem("Sale");
         JMenuItem chiusura = new JMenuItem("Close");
         JMenu menuinterno= new JMenu("Filtra per");
         JMenuItem a = new JMenuItem("Filtra per ");
         JMenuItem b = new JMenuItem("Filtra per");
         JMenuItem c = new JMenuItem("Filtra per");
         JMenuItem d = new JMenuItem("Filtra per");
         JMenuItem e = new JMenuItem("Filtra per");
         menuinterno.add(a);
         menuinterno.add(b);
         menuinterno.add(c);
         menuinterno.add(d);
         menuinterno.add(e);
      
         
         comandi.add(menuinterno);
         comandi1.add(load1);
         comandi2.add(load2);
         comandi3.add(load3);
         comandi4.add(load4);
         comandi5.add(load5);
         
         chiusura.addActionListener(new ActionListener() 
         {

 			@Override
 			public void actionPerformed(ActionEvent e) 
 			{

 				System.exit(-1);
 			}
         	
          });
         
         comandi.add(chiusura);
         menuBar.add(comandi);
         menuBar.add(comandi1);
         menuBar.add(comandi2);
         menuBar.add(comandi3);
         menuBar.add(comandi4);
         menuBar.add(comandi5);
         
         this.setJMenuBar(menuBar);
     }
     public static void main(String[] args) 
     {
         EventQueue.invokeLater(new Runnable() 
         { //classe interna anonima
             @Override
             public void run() 
             {
                 JFrame f = new Interface("Finestra con MenuBar");
                 f.setVisible(true);
             }
         });
     }
    
    @Override
    public void pannelloTabella() 
    {
 		
 		// TODO Auto-generated method stub
 		switchTo(pannelloTabella);
 	}
 	private void switchTo(PannelloTabella pannelloTabella1) 
 	{
 		// TODO Auto-generated method stub
 		this.setContentPane(pannelloTabella1);
         this.pack();
 	}
}