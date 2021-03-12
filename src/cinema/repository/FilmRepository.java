package repository;

import java.util.List;

import model.Film;

public interface FilmRepository {
	



    boolean aggiungi(Film film);
    boolean update(Film film);
    boolean delete(Integer CodFilm);
    Film cerca(String titolo,int codFilm);
    List<Film> film();
    //get qualcosa in base ai paramentri film
    Film getFilm(Integer id);
    Film getFilm(String titolo, String annoProduzione);



}
