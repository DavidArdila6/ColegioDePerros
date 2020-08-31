
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeison
 */
public class CrearTablaPerro {
public static  void  main(String[] args) throws SQLException{
   
    
    String url ="jdbc:h2:./Datos";
    
    ConnectionSource conn = new JdbcConnectionSource(url);
    TableUtils.createTable(conn,Perro.class);
    System.out.println("la tabla fue creada");
    
}  

    
    
}
