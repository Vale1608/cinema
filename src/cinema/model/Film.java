package cinema.model;

public class Film {
	
	private int codFilm;
	private String titolo;
	private String annoProduzione;
	private String nazionalita;
	private String regista;
	private String genere;
	
	public Film() {
		
	}
	
	public Film(int codFilm) {
		this.codFilm = codFilm;
	}
	
	public Film(String titolo, String annoProduzione, String nazionalita,String regista, String genere) {
		this.titolo = titolo;
		this.annoProduzione = annoProduzione;
		this.nazionalita = nazionalita;
		this.regista = regista;
		this.genere = genere;
	}
	
	public Film (Film film) {
		this(film.titolo, film.annoProduzione, film.nazionalita, film.regista, film.genere);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Film))return false;
		if(this == obj)return true;
		
		Film film = (Film)obj;
		return this.codFilm == film.codFilm; 
	}
	@Override
	public String toString() {
		String s = ""+this.titolo+" "+this.annoProduzione+" "+this.nazionalita+" "+this.regista+" "+this.genere;
		return s;
	}

	public int getCodFilm() {
		return codFilm;
	}

	public void setCodFilm(int codFilm) {
		this.codFilm = codFilm;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(String annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
}
