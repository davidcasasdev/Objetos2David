package app;

import java.util.Scanner;

import clases.Cafetera;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Creando cafetera 1");
		Cafetera saimaza = new Cafetera();
		
		System.out.println("Creando cafetera 2");
		System.out.println("Introduce la capacidad de la cafetera: ");
		int capacidad = teclado.nextInt();
		
		Cafetera bonka = new Cafetera(capacidad);
		
		System.out.println("Creando cafetera 3");
		System.out.println("Capacidad Máxima: ");
		capacidad = teclado.nextInt();
		System.out.println("Capacidad Actual: ");
		int capActual = teclado.nextInt(); 
		
		Cafetera kopiLuwak = new Cafetera(capacidad, capActual);
		
		System.out.println("La cafetera 1 es: "+saimaza);
		System.out.println("La cafetera 2 es: "+bonka);
		System.out.println("La cafetera 3 es: "+kopiLuwak);
		
		Cafetera servicio=saimaza;
		int opcion =0;
		do {
			System.out.println("1. Seleccionar máquina");
			System.out.println("2. Llenar cafetera ");
			System.out.println("3. Servir taza");
			System.out.println("4. Vaciar cafetera");
			System.out.println("5. Agregar café");
			System.out.println("0. Salir");
			
			System.out.println("Elige una opción: ");
			opcion =teclado.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println(" Selecciona máquina");
					System.out.println("1. Saimaza "+saimaza);
					System.out.println("2. Bonka "+bonka);
					System.out.println("3. Kopi Luwak "+kopiLuwak);
					System.out.println("¿Qué máquina quieres?");
					int maquina = teclado.nextInt();
					switch(maquina) {
						case 1: servicio=saimaza; break;
						case 2: servicio=bonka; break;
						case 3: servicio=kopiLuwak; break;
						default: System.err.println("Máquina no encontrada");
					}
					break;
				case 2:
					System.out.println("Llenando cafetera...");
					servicio.llenarCafetera();
					System.out.println(servicio);
					break;
				case 3: 
					System.out.println("DE cuanta capacidad quieres la taza?");
					capacidad= teclado.nextInt();
					System.out.println("Sirviendo taza...");
					int servido= servicio.servirTaza(capacidad);
					if (servido==capacidad) {
						System.out.println("Café servido correctamente");
					} else {
						System.out.println("Café incompleto, servidos "+servido + "cc");
					}
					break;
				case 4:
					System.out.println("Vaciando cafetera....");
					servicio.vaciarCafetera();
					System.out.println("Máquina: "+servicio);
					break;
				case 5:
					System.out.println("Cuánto café quieres añadir?");
					capacidad = teclado.nextInt();
					System.out.println("Añadiendo café ....");
					servicio.agregarCafe(capacidad);
					System.out.println("Máquina: "+servicio);
					break;
				case 0: 
					System.out.println("Hasta luego"); break;
				default: System.out.println("Opción incorrecta");
			}
			
		} while (opcion!=0);
		
	}

}
