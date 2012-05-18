/**
INTERFAZ COMPLEJO
	PROPIEDADES:
	i : TIPO: real
		Consultable:SI
		Modificable:SI
		Derivado:NO
		
		double geti();
		void seti(double i);	
		
	j : TIPO: real
		Consultable:SI
		Modificable:SI
		Derivado:NO

		double getj();
		void setj(double j);
		
	Producto: Tipo: Complejo
		Consultable:SI
		Modificable:NO
		Derivado:SI
		
		Complejo getProducto();
		
	Division: Tipo: Complejo
		Consultable:SI
		Modificable:NO
		Derivado:SI
*/
public class Complejo {

	private double i;
	private double j;

	
	public Complejo(){
		i=0;
		j=0;
	}
	public Complejo(double i,double j){
		this.i=i;
		this.j=j;
	}
	
	//METODOS SET
	public void seti(double i){
		this.i=i;
	}
	public void setj(double j){
		this.j=j;
	}
	//METODOS GET
	public double geti(){
		return i;
	}
	public double getj(){
		return j;
	}
	/*
	 Multiplicación

    	(ac - bd, ad + bc) 
	 */
	public Complejo getproducto(Complejo pro){
		this.i= ((this.i*pro.geti())-(this.j*pro.getj()));
		this.j=((this.i*pro.getj())+(this.j*pro.geti()));
		return this;
	}
	public Complejo getDivision(Complejo div){
		this.i=(this.i*div.geti())+(this.j*div.getj())/((div.geti()*div.geti())+(div.getj()*div.getj()));
		this.j=(this.j*div.geti())+(this.i*div.getj())/((div.geti()*div.geti())+(div.getj()*div.getj()));
		return this;
	}
	
	public String toString() {
		String s = "(" + geti() + "," + getj() +")";
		return s;
	}

	public void mostrar(String s, Object p) {
		System.out.println(s + p);
		System.out.println("Esto es una prueba para egit");
	}
	public void cancion(String s, Object p){
		System.out.println("Habia una vez un circoooo que alegraba siempre el corazoooon");
	}
	public static void main(String[] args) {
		System.out.println("Hola la otra rama es de mariquitas");
		System.out.println("seguimos en master");
	}

}
