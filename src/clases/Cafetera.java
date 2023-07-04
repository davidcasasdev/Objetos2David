/**
 * 
 */
package clases;

/**
 * @author David
 *
 */
public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;
	
	private final static int CAPCIDADMAX = 1000;
	
	/**
	 * Constructor que crea una Cafetera con capacidad máxima 1000 y vacía
	 */
	public Cafetera() {
		this.capacidadMaxima=CAPCIDADMAX;
		this.cantidadActual=0;
	}
	
	/**
	 * Constructor que crea una cafetera con capacidad maxima capacidad y 
	 * llena
	 * @param capacidad int capacida de la máquina
	 */
	public Cafetera(int capacidad) {
		this.capacidadMaxima=capacidad;
		this.cantidadActual=capacidad;
	}
	
	/**
	 * Constructor de la clase que cre una máquina con una capacidad máxima 
	 * y y una capacidad actual pasada como parámetros.
	 * Si la capacidad actual sobrepasa la máxima se establecerá en capacidadMaxima
	 * @param capacidadMaxima int capacida máxima de la cafetera
	 * @param capcidadActual int capacidad actual
	 */
	public Cafetera(int capacidadMaxima, int capcidadActual) {
		this.capacidadMaxima=capacidadMaxima;
		this.setCantidadActual(capcidadActual);
		
		//this.cantidadActual =Math.min(capacidadMaxima, capcidadActual);
	}
	
	public void setCantidadActual(int cantidad) {
		this.cantidadActual=cantidad;
		if (this.cantidadActual>this.capacidadMaxima) {
			this.cantidadActual=this.capacidadMaxima;
		}
	}
	
	/**
	 * Método getter que devielve la capcaidad máxima de la cafetera
	 * @return
	 */
	public int getCapacidadMaxima() {
		return this.capacidadMaxima;
	}
	
	public int getCantidadActual() {
		return this.cantidadActual;
	}
	

	/**
	 * Rellena la cafetera de café
	 */
	public void llenarCafetera() {
		this.cantidadActual=this.capacidadMaxima;
	}
	
	/**
	 * Método que echa un café, restando las existencias de la cafetera.
	 * Si no hay suificiente café echará lop que haya devilviendo la cantidad
	 * En caso contrario devolverá la capacidad de la taza
	 * @param capacidadTaza int con la cpacidad del serivcio de café
	 * @return la capcidad servida
	 */
	public int servirTaza(int capacidadTaza) {
		if (this.cantidadActual<capacidadTaza) {
			int resto = this.cantidadActual;
			this.cantidadActual=0;
			return resto;
		}
		this.cantidadActual=this.cantidadActual-capacidadTaza;
		return capacidadTaza;
	}
	
	public void vaciarCafetera() {
		this.cantidadActual=0;
	}
	
	public void agregarCafe(int cantidad) {
		setCantidadActual(this.cantidadActual+cantidad);
	}

	@Override
	public String toString() {
		return  "capacidadMaxima=" + capacidadMaxima + 
				", cantidadActual=" + cantidadActual ;
	}

	
	
	
	
}
