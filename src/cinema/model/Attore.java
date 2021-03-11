package cinema.model;

public class Attore {
	
	private int codAttore;
	private String nome;
	private String annoNascita;
	private String nazionalita;
	
	public Attore() {		
	}
	
	public Attore(int codAttore) {
		
		this.codAttore = codAttore;
	}
	
	public Attore(String nome, String annoNascita, String nazionalita) {
		
		this.nome = nome;
		this.annoNascita = annoNascita;
		this.nazionalita = nazionalita;
	}
	
	public Attore(Attore attore) {
		this(attore.nome, attore.annoNascita, attore.nazionalita);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Attore))return false;
		if(this == obj)return true;
		
		Attore attore = (Attore)obj;		
		return this.codAttore == attore.codAttore;		
	}
	
	@Override
	public String toString() {
		
		String s = ""+this.nome+" "+this.annoNascita+" "+this.nazionalita;
		return s;
		
	}

	public int getCodAttore() {
		return codAttore;
	}

	public void setCodAttore(int codAttore) {
		this.codAttore = codAttore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(String annoNascita) {
		this.annoNascita = annoNascita;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}	

}
