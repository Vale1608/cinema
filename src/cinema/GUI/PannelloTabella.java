package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.*;
import repository.*;

public class PannelloTabella extends JPanel{
		
	private JScrollPane sp;
	/*private JTable attori;
	private String colonna1[]={"CodAttore","Nome","AnnoNascita", "Nazionalita"};
	private Object[][] data1 = new Object[0][0];*/
	
	private JTable film ;
	private String colonna2[]={"CodFilm","Titotlo","AnnoProduzione", "Nazionalità","Regista","Genere"};
	private Object[][] data2 = new Object[0][0];
	private FilmRepository filmRepository = new FilmRepositoryImp();
	
	
	
	/*private JTable proiezioni;
	private String colonna3[]={"CodProiezione","CodFilm","CodFilm", "CodSala","Incasso","DataProiezione"};
	private Object[][] data3 = new Object[0][0];
	
	private JTable recita;
	private String colonna4[]={"CodAttore","CodFilm"};
	private Object[][] data4 = new Object[0][0];
	
	private JTable sale;
	private String colonna5[]={"CodSala","Posti","Nomi","Città"};
	private Object[][] data5 = new Object[0][0];*/
	
	private PanelSwitcher panelSwitcher;
	
	public PannelloTabella(PanelSwitcher panelSwitcher) {
        this.panelSwitcher = panelSwitcher;

       // this.attori = new JTable(data1, colonna1);
        this.film=new JTable(data2,colonna2);
        //this.proiezioni=new JTable(data3,colonna3);
       // this.recita=new JTable(data4,colonna4);
        //this.sale=new JTable(data5,colonna5);
      
        
        //this.sp=new JScrollPane(this.attori);
        this.sp=new JScrollPane(this.film);
       // this.sp=new JScrollPane(this.proiezioni);
       // this.sp=new JScrollPane(this.recita);
        //this.sp=new JScrollPane(this.sale);

        this.add(sp);
    }

	public void cercaTable() {
		// TODO Auto-generated method stub
		List<Film> film= filmRepository.film();

        this.data2 = new Object[film.size()][6];
        Iterator<Film> ia = film.iterator();
        int i = 0;
        while(ia.hasNext()) {
           Film f = ia.next();
            System.out.println(f);
            if(f != null) {
                this.data2[i][0] = f.getCodFilm();
                this.data2[i][1] = f.getTitolo();
                this.data2[i][2] = f.getAnnoProduzione();
                this.data2[i][3] = f.getNazionalità();
                this.data2[i][4] = f.getRegista();
                this.data2[i][5] = f.getGenere();
            }

            i++;
        }
	
	this.remove(this.sp);

    this.film = new JTable(data2, colonna2);
    this.sp = new JScrollPane(this.film);
    this.add(this.sp);
	}
}
