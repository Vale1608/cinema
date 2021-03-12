package cinema.repository;

import java.util.List;

import cinema.model.Attori;
import cinema.model.Film;

public interface AttoriRepository {
	



    boolean aggiungi(Attori attori);
    boolean update(Attori attori);
    boolean delete(Integer codAttore);
    Attori cerca(String nome,int codAttore);
    List<Attori> attori();
    //get qualcosa in base ai paramentri film
    Attori getAttori(Integer id);
    Attori getAttori(String nome, int annoNascita);



}
