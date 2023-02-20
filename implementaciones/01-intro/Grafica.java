import java.util.*;

//Clase que modela una grafica
public class Grafica{

	//Atributos de la clase grafica
	ArrayList<Vertice> vertices;
	ArrayList<Arista> aristas;
	String id;

	//Metodo constructor de una grafica
	public Grafica(ArrayList<Vertice> vertices, ArrayList<Arista> aristas, String id){
		this.vertices = vertices;
		this.aristas = aristas;
		this.id = id;
		for(Vertice v : this.vertices){
			for(Arista a : this.aristas){
				if(a.getEX1().equals(v)){
					v.vecinos.add(a.getEX2());
				}else if(a.getEX2().equals(v)){
					v.vecinos.add(a.getEX1());
				}
			}
		}
	}

	//Metodo que nos devuelva una representacion en cadena de la grafica
	public String toString(){
		//Crea una representacion en cadena del conjunto de vertices
		String vert = "{";
		for(Vertice v : this.vertices){
			vert = vert + ", " +v.toString();
		}
		vert = vert + "}";

		//Crea una representacion en cadena del conjunto de las aristas
		String arist = "{";
		for(Arista a : this.aristas){
			arist = arist + ", " + a.toString();
		}
		arist = arist + "}";

		return "El conjunto de vertices es: " +  vert + "\n" + "El conjunto de aristas es: " + arist;
	}

	//Metodo que elimina un vertice de la grafica
	public void eliminaV(Vertice v){
		//Aquí va tu codigo
	}

	//Metodo que elimine una arista
	public void eliminaA(Arista a){
		//Aquí va tu codigo
	}




}
