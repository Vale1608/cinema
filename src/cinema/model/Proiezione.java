package cinema.model;

public class Proiezione {
	
	private int codProiezione;
	private Film codFilm;
	private Sala codSala;
	private int incasso;
	private String dataProiezione;
	
	public Proiezione() {
		
	}
	
	public Proiezione(int codProiezione) {
		this.codProiezione = codProiezione;
	}
	
	public Proiezione(Film codFilm, Sala codSala, int incasso, String dataProiezione) {
		this.codFilm = codFilm;
		this.codSala = codSala;
		this.incasso = incasso;
		this.dataProiezione = dataProiezione;
	}
	
	public Proiezione(Proiezione proiezione) {
		this(proiezione.codFilm, proiezione.codSala, proiezione.incasso, proiezione.dataProiezione);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Proiezione))return false;
		if(this == obj)return true;
		Proiezione proiezione = (Proiezione)obj;
		return this.codProiezione == proiezione.codProiezione;
	}
	
	@Override
	public String toString() {
		String s = ""+this.codFilm+" "+this.codSala+" "+this.incasso+" "+this.dataProiezione;
		return s;
	}

	public int getCodProiezione() {
		return codProiezione;
	}

	public void setCodProiezione(int codProiezione) {
		this.codProiezione = codProiezione;
	}

	public Film getCodFilm() {
		return codFilm;
	}

	public void setCodFilm(Film codFilm) {
		this.codFilm = codFilm;
	}

	public Sala getCodSala() {
		return codSala;
	}

	public void setCodSala(Sala codSala) {
		this.codSala = codSala;
	}

	public int getIncasso() {
		return incasso;
	}

	public void setIncasso(int incasso) {
		this.incasso = incasso;
	}

	public String getDataProiezione() {
		return dataProiezione;
	}

	public void setDataProiezione(String dataProiezione) {
		this.dataProiezione = dataProiezione;
	} 

}
