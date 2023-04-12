package universidad;

public class Asignatura {
	 private String nombre;
	    private String profesor;
	    private int codigoMateria;
	    private int salon;

	    public Asignatura(String nombre, String profesor, int codigoMateria, int salon) {
	        this.nombre = nombre;
	        this.profesor = profesor;
	        this.codigoMateria = codigoMateria;
	        this.salon = salon;
	    }

	    public String toString(){
	        return  "La asignatura " + nombre + " con codigo " + codigoMateria + " es dictada por el profesor " 
	        + profesor + " en el salon " + salon;
	    }

	    public String getNombre() {
	        return nombre;
	    }
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public String getProfesor() {
	        return profesor;
	    }
	    public void setProfesor(String profesor) {
	        this.profesor = profesor;
	    }
	    public int getCodigoMateria() {
	        return codigoMateria;
	    }
	    public void setCodigoMateria(int codigoMateria) {
	        this.codigoMateria = codigoMateria;
	    }
	    public int getSalon() {
	        return salon;
	    }
	    public void setSalon(int salon) {
	        this.salon = salon;
	    }
}
