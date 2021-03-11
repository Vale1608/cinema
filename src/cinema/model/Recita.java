package cinema.model;

public class Recita {
	
	private Attore codAttore;
	private Film codFilm;
	
	public Recita() {
		
	}
	
	public Recita(Attore codAttore,Film codFilm) {
		this.codAttore = codAttore;
		this.codFilm = codFilm;
	}
	
	public Recita(Recita recita) {
		this(recita.codAttore, recita.codFilm);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Recita))return true;
		if(this == obj)return true;
		Recita recita = (Recita)obj;
		return this.codAttore == recita.codAttore && this.codFilm==recita.codFilm;
	}
	
	@Override
	public String toString() {
		String s = ""+this.codAttore+" "+this.codFilm;
		return s;
	}

	public Attore getCodAttore() {
		return codAttore;
	}

	public void setCodAttore(Attore codAttore) {
		this.codAttore = codAttore;
	}

	public Film getCodFilm() {
		return codFilm;
	}

	public void setCodFilm(Film codFilm) {
		this.codFilm = codFilm;
	}
	
}
