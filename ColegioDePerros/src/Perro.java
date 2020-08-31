import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeison
 */
@DatabaseTable
public class Perro {
	@DatabaseField
    private String Nombre;
	@DatabaseField
    private String Raza;
	@DatabaseField
    private String Localidad;
	@DatabaseField
    private int Cedula;
	@DatabaseField
    private String Nombre_Dueño;
	@DatabaseField(id=true)
    private int Codigo;

    public Perro() {
    }

    public Perro(String Nombre, String Raza, String Localidad, int Cedula, String Nombre_Dueño, int Codigo) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Localidad = Localidad;
        this.Cedula = Cedula;
        this.Nombre_Dueño = Nombre_Dueño;
        this.Codigo = Codigo;
    }

    
    
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     * @param Raza the Raza to set
     */
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    /**
     * @return the Localidad
     */
    public String getLocalidad() {
        return Localidad;
    }

    /**
     * @param Localidad the Localidad to set
     */
    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    /**
     * @return the Cedula
     */
    public int getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the Nombre_Dueño
     */
    public String getNombre_Dueño() {
        return Nombre_Dueño;
    }

    /**
     * @param Nombre_Dueño the Nombre_Dueño to set
     */
    public void setNombre_Dueño(String Nombre_Dueño) {
        this.Nombre_Dueño = Nombre_Dueño;
    }

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

	

}