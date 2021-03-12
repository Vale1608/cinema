package model;
public class Attori {
	
	private int CodAttore;
	private String Nome;
	private int AnnoNascita;
	private String Nazionalità;
	
	public Attori() {
		
	}
	
	public Attori(int CodAttore,String Nome,int AnnoNscita,String Nazionalità) {
		this.CodAttore=CodAttore;
		this.Nome=Nome;
		this.AnnoNascita=AnnoNascita;
		this.Nazionalità=Nazionalità;
	}

	public int getCodAttore() {
		return CodAttore;
	}

	public void setCodAttore(int codAttore) {
		CodAttore = codAttore;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getAnnoNascita() {
		return AnnoNascita;
	}

	public void setAnnoNascita(int annoNascita) {
		AnnoNascita = annoNascita;
	}

	public String getNazionalità() {
		return Nazionalità;
	}

	public void setNazionalità(String Nazionalità) {
		Nazionalità = Nazionalità;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Attori)) return false;
		if(this==o) return true;
		Attori a=(Attori) o;
		return this.CodAttore == a.CodAttore;
	}
	
	@Override
	public String toString() {
		
		String s = ""+this.Nome+" "+this.AnnoNascita+" "+this.Nazionalità;
		return s;
		
	}
}

