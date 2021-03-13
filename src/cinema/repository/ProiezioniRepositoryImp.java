package cinema.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Proiezioni;

public class ProiezioniRepositoryImp implements ProiezioniRepository {

	@Override
	public boolean aggiungi(Proiezioni proiezione) {
		
		Connection conn = ConnectionDatabase.getConnection();
		PreparedStatement preparedStatement = null;
		int cercato=0;
		try {
			preparedStatement = conn.prepareStatement("INSERT INTO proiezioni VALUES(?,?,?,?,?)");
			//public Proiezioni(int codFilm, int codSala,int proiezione, int incasso, String data_proiezione)
			//controllare se set int o Integer
	        preparedStatement.setInt(1, proiezione.getCodFilm());
	        preparedStatement.setInt(2, proiezione.getCodSala());
			preparedStatement.setInt(3, proiezione.getCodProiezione());
	        preparedStatement.setInt(4, film.getIncasso());
	        preparedStatement.setString(5, film.getDataProiezione());
	        
		} catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		return cercato!=0;
	}

	@Override
	public boolean update(Film film) {
		
		Connection conn = ConnectionDatabase.getConnection();
		PreparedStatement preparedStatement = null;
		int modificato=0;
		try {
			//controllare scritte stringa 
			preparedStatement = conn.prepareStatement("UPDATE proiezioni  codFilm = ?, codSala = ?, incasso = ?, data_proiezione = ?, WHERE CodProiezioni = ?");
			
	        preparedStatement.setInt(1, proiezione.getCodFilm());
	        preparedStatement.setInt(2, proiezione.getCodSala());
			
	        preparedStatement.setInt(4, film.getIncasso());
	        preparedStatement.setString(5, film.getDataProiezione());
			preparedStatement.setInt(3, proiezione.getCodProiezione());
		} catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		
		
		
		return modificato!=0;
	}

	@Override
	public boolean delete(Integer CodProiezioni) {
		
		Connection conn = ConnectionDatabase.getConnection();
		PreparedStatement preparedStatement = null;
		int isDeleted = 0;
        try {
            preparedStatement = conn.prepareStatement("DELETE FROM Film WHERE CodProiezioni = ?");

            preparedStatement.setInt(3, CodProiezioni);

            isDeleted = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isDeleted != 0;
	}
//public Proiezioni(int codFilm, int codSala,int proiezione, int incasso, String data_proiezione)
	@Override
	public Proiezioni cerca(String data_proiezione, int codFilm) {
		
		Connection conn = ConnectionDatabase.getConnection();
		Proiezioni p=null;
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement=conn.prepareStatement("SELECT * FROM proiezioni WHERE data_proiezione=? and codFilm=?");
			preparedStatement.setString(5, data_proiezione);
			preparedStatement.setInt(1, codFilm);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				Proiezioni p=new Proiezioni();
				
				 p.setCodFilm(resultSet.getInt("codFilm"));
				 p.setCodSala(resultSet.getInt("codSala"));
	             p.setCodProiezioni(resultSet.getInt("codProiezioni"));
	             p.setIncasso( resultSet.getInt("incasso") );
	             p.setData_proiezione( resultSet.getString("data_proiezione") );
	             
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return p;
		
		
		
		
		
	}

	@Override
	public List<Proiezioni> proiezioni() {
		
		Connection conn = ConnectionDatabase.getConnection();
		PreparedStatement preparedStatement = null;
		List<Proiezioni> proiezioni = new ArrayList<>();
	    Statement statement = null;
	    ResultSet resultSet = null;
	        try {
	            statement = conn.createStatement();

	            resultSet = statement.executeQuery("SELECT * FROM proiezioni");
	            while(resultSet.next()) {
	                Proiezioni p = new Proiezioni();
	                
					p.setCodFilm(resultSet.getInt("codFilm"));
					p.setCodSala(resultSet.getInt("codSala"));
					p.setCodProiezioni(resultSet.getInt("codProiezioni"));
					p.setIncasso( resultSet.getInt("incasso") );
					p.setData_proiezione( resultSet.getString("data_proiezione") );
	               

	                p.add(p);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                statement.close();
	                resultSet.close();
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }

	        return p;

		
		
	}

	

	@Override
	public Proiezione getFilm(int codFilm, String data_produzione) {
		
		Connection conn = ConnectionDatabase.getConnection();
		Proiezioni p=null;
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = conn.prepareStatement("SELECT * FROM film WHERE codFilm=? and data_proiezione=?");
			preparedStatement.setInt(1,codFilm );
			preparedStatement.setString(3,data_proiezione);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				p=new Proiezioni();
				
				p.setCodFilm(resultSet.getInt("codFilm"));
				p.setCodSala(resultSet.getInt("codSala"));
	            p.setCodProiezioni(resultSet.getInt("codProiezioni"));
	            p.setIncasso( resultSet.getInt("incasso") );
	            p.setData_proiezione( resultSet.getString("data_proiezione") );
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try{
				preparedStatement.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		return p;
			
	}
	@override	
	public Proiezione getFilm(int codSala, String data_produzione) {
		
		Connection conn = ConnectionDatabase.getConnection();
		Proiezioni p=null;
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = conn.prepareStatement("SELECT * FROM film WHERE codSala=? and data_proiezione=?");
			preparedStatement.setInt(2,codSala );
			preparedStatement.setString(3,data_proiezione);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				p=new Proiezioni();
				
				p.setCodFilm(resultSet.getInt("codFilm"));
				p.setCodSala(resultSet.getInt("codSala"));
	            p.setCodProiezioni(resultSet.getInt("codProiezioni"));
	            p.setIncasso( resultSet.getInt("incasso") );
	            p.setData_proiezione( resultSet.getString("data_proiezione") );
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try{
				preparedStatement.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		return p;
			
	}
	@Override
	public Proiezione getFilm(int codFilm, int codSala) {
		
		Connection conn = ConnectionDatabase.getConnection();
		Proiezioni p=null;
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = conn.prepareStatement("SELECT * FROM film WHERE codSala=? and data_proiezione=?");
			preparedStatement.setInt(1,codFilm );
			preparedStatement.setString(3,data_proiezione);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				p=new Proiezioni();
				
				p.setCodFilm(resultSet.getInt("codFilm"));
				p.setCodSala(resultSet.getInt("codSala"));
	            p.setCodProiezioni(resultSet.getInt("codProiezioni"));
	            p.setIncasso( resultSet.getInt("incasso") );
	            p.setData_proiezione( resultSet.getString("data_proiezione") );
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try{
				preparedStatement.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		return p;
			
	}
}

