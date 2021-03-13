package guiCinema;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cinema.Film;
import repositoryCinema.FilmRepository;
import repositoryCinema.FilmRepositoryImp;

public class AggiungiFilm extends JPanel {
	
	private JLabel labelCodFilm = new JLabel("CodFilm");
    private JLabel labelTitolo = new JLabel("Titolo");
    private JLabel labelAnnoProduzione = new JLabel("AnnoProduzione");
    private JLabel labelNazionalita= new JLabel("Nazionalita");
    private JLabel labelRegista = new JLabel("Regista");
    private JLabel labelGenere= new JLabel("Genere");

    private JTextField textCodFilm = new JTextField(12);
    private JTextField textTitolo = new JTextField(12);
    private JTextField textAnnoProduzione = new JTextField(12);
    private JTextField textNazionalita = new JTextField(12);
    private JTextField textRegista = new JTextField(12);
    private JTextField textGenere = new JTextField(12);



    private JPanel jPanelNorth = new JPanel();
    private JPanel jPanelSouth = new JPanel();
	private JLabel crediti=new JLabel("Crediti");
	private JLabel crditi2=new JLabel("nostri nomi");
	
	

    private PanelSwitcher panelSwitcher;

    private Film film;

    private FilmRepository filmRepository = new FilmRepositoryImp();
    
    public AggiungiFilm(PanelSwitcher panelSwitcher) {
    	
    	this.panelSwitcher = panelSwitcher;

        jPanelNorth.add(labelCodFilm);
        jPanelNorth.add(labelTitolo);
        jPanelNorth.add(labelAnnoProduzione);
        jPanelNorth.add(labelNazionalita);
        jPanelNorth.add(labelRegista);
        jPanelNorth.add(labelGenere);

        jPanelNorth.setLayout(new GridLayout(2,2));

        JButton salva = new JButton("Salva");
        JButton indietro = new JButton("Indietro");
        jPanelSouth.add(salva);
        jPanelSouth.add(indietro);

        indietro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelSwitcher.pannelloTabella();
            }
        });

        salva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(film != null) {

                    film.setTitolo(textTitolo.getText());
                    film.setAnnoProduzione(textAnnoProduzione.getText());
                    film.setNazionalità(textNazionalita.getText());
                    film.setRegista(textRegista.getText());
                    film.setGenere(textGenere.getText());
                    String codiceFilm=textCodFilm.getText();
                    film.setCodFilm(Integer.parseInt(codiceFilm));


                    filmRepository.update(film);
                }

                else {

                    String titolo = textTitolo.getText();
                    String codiceFilm=textCodFilm.getText();
                    int codFilm = Integer.parseInt(codiceFilm);
                    String annoProduzione = textAnnoProduzione.getText();
                    String Nazionalita = textNazionalita.getText();
                    String regista = textRegista.getText();
                    String genere = textGenere.getText();

                    Film film = new Film(titolo, codFilm, annoProduzione, Nazionalita,regista,genere);
                    filmRepository.aggiungi(film);
                }


            }
        });

        this.setLayout(new BorderLayout());
        this.add(jPanelNorth, BorderLayout.NORTH);
        this.add(jPanelSouth, BorderLayout.SOUTH);
    }
    public Film getfilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        if(film != null) {
            this.film = film;

            String titolo = textTitolo.getText();
            String codiceFilm=textCodFilm.getText();
            int codFilm = Integer.parseInt(codiceFilm);
            String annoProduzione = textAnnoProduzione.getText();
            String nazionalita = textNazionalita.getText();
            String regista = textRegista.getText();
            String genere = textGenere.getText();
        }
    }
}
