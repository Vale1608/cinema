package cinema.model;

public class Sala {
	
	private int codSala;
	private int postiASedere;
	private String nome;
	private String citta;
	
	public Sala() {
		
	}
	
	public Sala(int codSala) {
		this.codSala = codSala;
	}
	
	public Sala(int postiASedere, String nome, String citta) {
		this.postiASedere= postiASedere;
		this.nome = nome;
		this.citta = citta;
	}
	
	public Sala(Sala sala) {
		this(sala.postiASedere, sala.nome, sala.citta);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Sala))return false;
		if(this == obj)return true;
		
		Sala sala = (Sala)obj;
		return this.codSala == sala.codSala;
	}
	
	@Override
	public String toString() {
		String s = ""+this.nome+" "+this.postiASedere+" "+this.citta;
		return s;
	}

	public int getCodSala() {
		return codSala;
	}

	public void setCodSala(int codSala) {
		this.codSala = codSala;
	}

	public int getPostiASedere() {
		return postiASedere;
	}

	public void setPostiASedere(int postiASedere) {
		this.postiASedere = postiASedere;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	
}
