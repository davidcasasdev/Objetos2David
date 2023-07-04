package app;

import clases.Cafetera;

public class Principal2 {

	public static void main(String[] args) {
		Cafetera c1= new Cafetera();
		
		System.out.println("La cafetera creada es "+c1);
		c1 = new Cafetera(2000);
		System.out.println("La cafetera creada es "+c1);
		System.out.println("Creando cafetera 2000,3600");
		c1= new Cafetera(2000,3600);
		System.out.println("La cafetera creada es "+c1);
		
		
		System.out.println("VAciando cafetera...");
		c1.vaciarCafetera();
		System.out.println("La cafetera es "+c1);
		
		System.out.println("agregando 250 cc de cafe");
		c1.agregarCafe(250);
		
		System.out.println("Sirviendo taza de 200 cc");
		c1.servirTaza(200);
		System.out.println("La cafetera es "+c1);
		
		System.out.println("Sirviendo taza de 100 cc cuando solo hay 50cc");
		int servido = c1.servirTaza(200);
		if (servido<200) {
			System.out.println("Sólo se han servido "+servido+" cc");
		}
		System.out.println("La cafetera es "+c1);
		
		System.out.println("Llenando cafetera...");
		c1.llenarCafetera();
		System.out.println("La cafetera es "+c1);
		

	}

}
