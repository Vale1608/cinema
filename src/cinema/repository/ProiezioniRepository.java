package cinema.repository;

import java.util.List;

import cinema.model.Proiezioni;

public interface ProiezioniRepository {
	



    boolean aggiungi(Proiezione proiezione);
    boolean update(Proiezioni proiezione);
    boolean delete(Integer CodProiezioni);
    Proiezioni cerca(String dataProiezione,int codFilm);
    List<Proiezioni> proiezioni();
    //get qualcosa in base ai paramentri film
    
    Proiezioni getProeizioni(int codFilm, String dataProiezione);
	Proiezioni getProeizioni(int codSala, String dataProiezione);
	Proiezioni getProeizioni(int codFilm, int codSala);
	



}
