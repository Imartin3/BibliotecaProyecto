package biblioteca;

public class Libro {
	 private String tituloLibro;
	 private int ejemplares;
	 private int prestados;

	 Libro() {
	 }

	 public void parametros(String tituloLibro, int ejemplares, int prestados) {
		  this.tituloLibro = tituloLibro;
		  this.ejemplares = ejemplares;
		  this.prestados = prestados;
	 }

	 //Setter
	 public void setTituloLibro(String tituloLibro) {
		  this.tituloLibro = tituloLibro;
	 }
	 public void setEjemplares(int ejemplares) {
		  this.ejemplares = ejemplares;
	 }
	 public void setPrestados(int prestados) {
		  this.prestados = prestados;
	 }

	 //Getter
	 public String  getTituloLibro(){
		  return tituloLibro;
	 }
	 public int  getEjemplares(){
		  return ejemplares;
	 }
	 public int  getPrestados(){
		  return prestados;
	 }

	 public boolean prestamo(){
		  boolean respuesta;
		  if(ejemplares>0){
				ejemplares--;
				prestados++;
				System.out.println("Préstamo realizado correctamente.");
				respuesta=true;
		  }else{
				System.out.println("No se ha podido realizar el préstamo, no hay ejemplares disponibles.");
				respuesta=false;
		  }
		  return respuesta;
	 }

	 public boolean devolucion(){
		  boolean respuesta;
		  if(prestados>0){
				ejemplares++;
				prestados--;
				System.out.println("Devolución correcta.");
				respuesta=true;
		  }else{
				System.out.println("No hay libros prestados para devolver.");
				respuesta=false;
		  }
		  return respuesta;
	 }

	 public String toString(){
		  return "Título: " + tituloLibro + ", Copias disponibles: " + ejemplares + ", Prestados: "+prestados;
	 }
}

