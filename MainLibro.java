package biblioteca;

public class MainLibro {
	 public static void main (String[]args){
		  Libro libro = new Libro();
		  libro.parametros("Don Quijote", 3, 1);

		  //Obtener valores del libro
		  System.out.println(libro.getTituloLibro());
		  System.out.println(libro.getEjemplares());
		  System.out.println(libro.getPrestados());

		  //Modificar valores del libro
		  libro.setEjemplares(5);
		  libro.setPrestados(2);

		  //Métodos préstamo y devolvolución
		  libro.prestamo();
		  libro.devolucion();

		  //Método toString
		  System.out.println(libro.toString());
	 }

}
