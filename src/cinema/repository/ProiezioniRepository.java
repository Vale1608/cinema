package cinema.repository;

import java.util.List;

import cinema.model.Film;

public interface ProeizioniRepository {
	



    boolean aggiungi(Proiezione proiezione);
    boolean update(Proiezioni proiezione);
    boolean delete(Integer CodProiezioni);
    Proiezioni cerca(String dataProiezione,int codFilm);
    List<Proiezioni> proiezioni();
    //get qualcosa in base ai paramentri film
    
    Proeizioni getProeizioni(int codFilm, String dataProiezione);
	Proeizioni getProeizioni(int codSala, String dataProiezione);
	Proeizioni getProeizioni(int codFilm, int codSala);
	



}
