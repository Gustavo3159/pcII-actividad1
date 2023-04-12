package universidad;

public class UniversidadMain {
	public static void main(String[] args) {
        Asignatura asignatura = new Asignatura("Calculo",
                "Ciro Lopez", 06, 8);
        Asignatura asignatura2 = new Asignatura("Fisica y laboratorio",
                "Mateo Uribe", 073, 18);

        System.out.println(asignatura.toString());
        System.out.println(asignatura2.toString());

        if (asignatura.getSalon() == asignatura2.getSalon())
            System.out.println("Las asignaturas " + asignatura.getNombre() + " y " + asignatura2.getNombre() +
                    "  son dictadas en el mismo salon  " + asignatura.getSalon());

        else{
            System.out.println(
                    "La asignatura " + asignatura.getNombre() + " es dictada en el salon " + asignatura.getSalon());
            System.out.println(
                    "La asignatura " + asignatura2.getNombre() + " es dictada en el salon " + asignatura2.getSalon());
        }
	}
}
