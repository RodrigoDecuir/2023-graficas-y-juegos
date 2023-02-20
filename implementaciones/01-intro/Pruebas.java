import java.util.*;

public class Pruebas{

	public static void main (String args []){

		//Vertices
		Vertice v1 = new Vertice("v1");
		Vertice v2 = new Vertice("v2");
		Vertice v3 = new Vertice("v3");
		Vertice v4 = new Vertice("v4");

		//Aristas
		Arista a1 = new Arista(v1,v2);
		Arista a2 = new Arista(v2,v3);
		Arista a3 = new Arista(v3,v4);
		Arista a4 = new Arista(v4,v1);

		//Conjunto de vertices de la grafica
		ArrayList<Vertice> vertices = new ArrayList<>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);

		//Conjunto de aristas de la grafica
		ArrayList<Arista> aristas = new ArrayList<>();
		aristas.add(a1);
		aristas.add(a2);
		aristas.add(a3);
		aristas.add(a4);

		//Grafica
		Grafica g = new Grafica(vertices, aristas, "G");

		//Imprimimos
		System.out.println(g);
	}

}
