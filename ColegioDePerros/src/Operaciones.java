/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import java.sql.SQLException;
/**
 *
 * @author Jeison
 */
public class Operaciones {
     private static CrearNuevo formulario;
     private  static Perro registro[];
     private static int contador;
     
    
    public static  void  main(String[] args) throws SQLException{  
   formulario=new CrearNuevo();
   registro =new Perro[100];
    for (int i=0;i<100;i++){
       registro[i]=new Perro();
        
    }
    
   contador=0;
   
   formulario.setVisible(true);
   
   
    
     }
    static void recolectar (Dao<Perro,Integer> Basadatos) throws SQLException{
     String url ="jdbc:h2:./Datos";
    ConnectionSource conn = new JdbcConnectionSource(url);
    Dao<Perro,Integer>Basedatos= DaoManager.createDao(conn, Perro.class);
    }
   public  static void guardar(int CD, String N, String R,String L,int CC,String D){
        registro[contador].setCodigo(CD);
        registro[contador].setNombre(N);
        registro[contador].setRaza(R);
        registro[contador].setLocalidad(L);
        registro[contador].setCedula(CC);
        registro[contador].setNombre_Dueño(D);
        contador++;
   }
   public  static void buscar(String bus){
      
       for (int j=0;j<registro.length;j++){
           
           if (registro[j].getNombre().equals(bus)){
               formulario.cargardatos(registro[j]);
               
           }
       }
   }
}
