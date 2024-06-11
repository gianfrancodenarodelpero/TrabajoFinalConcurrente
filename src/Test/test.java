package Test;

import java.util.Random;
import java.util.Arrays;
import Datos.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos variables para calcular el tiempo que tarda cada algoritmo en ordenar el array
		double tiempoInicial;
		double tiempoFinal;
		
		Random random = new Random();
		// Diferentes tamaños del array para diferentes pruebas
				 int n = 10;
				 // int n = 1000;
				// int n = 100000;
				// int n = 1000000;
				         
				 
				// Declaración del array para las pruebas
					int[] array = new int[n];

					// Se carga al array con números randoms de 0 a 100.000
					for (int i = 0; i < n; i++) {
						array[i] = random.nextInt(100000);
					}
					/*
		// Creamos y cargamos el arreglo 'array' con numeros aleatorios
		int[] array = Funciones.generarArrayAleatorio(1000000, 1, 10000);
		
		// Copiamos el arreglo 'array' en 'array2', manteniendo la misma longitud
		int[] array2 = Arrays.copyOf(array, array.length);*/
		 int x = 10;		
		
		 
		 // Definir los límites del arreglo para la búsqueda concurrente
	        int izquierda = 0, derecha = array.length - 1;
		
	        
	        System.out.println("------------------------CONCURRENTE--------------------");
		 tiempoInicial = System.nanoTime();	// Comenzamos a calcular el tiempo
		 Thread hilo = new Thread(() -> { //creo un hilo
			
			Arrays.sort(array);// Llamamos al método 'Sort' para ordenar el array
			int resultado = BusquedaBinariaCon.BusquedaBinaria(array, x, izquierda, derecha);  //se pone en una variable el resultado de la busqueda binaria concurrente
        	if(resultado == -1) { // si el resultado da negativo arroja un mensaje
        		System.out.println("El elemnto no se encuentra en el arreglo");
        	}else {
        		System.out.println("El elemento " + x + " se encontro en el arreglo en la posicion " + resultado ); // si se encuentra el numero muestra el numero y la posicion
        	}	
		 });
		tiempoFinal = System.nanoTime() - tiempoInicial;	// Terminamos de calcular el tiempo
		// Mostramos cuanto tiempo tardó el algoritmo concurrente
        		System.out.println("- Concurrente: Demore "+ tiempoFinal/1000+ " microSegundos\n");
		

		

		
		
		
        		System.out.println("------------------------SECUENCIAL--------------------");
		tiempoInicial = System.nanoTime();	// Comenzamos a calcular el tiempo
		Arrays.sort(array);// Llamamos al método 'Sort' para ordenar el array
		int resultado1 = busquedaBinariaSec.busquedaBinaria(array, x);//se pone en una variable el resultado de la busqueda binaria secuencial
    	if(resultado1 == -1) {// si el resultado da negativo arroja un mensaje
    		System.out.println("El elemnto no se encuentra en el arreglo");
    	}else {
    		System.out.println("El elemento " + x + " se encontro en el arreglo en la posicion " + resultado1 );	// si se encuentra el numero muestra el numero y la posicion
    		
    	}
    	tiempoFinal = System.nanoTime() - tiempoInicial;	// Terminamos de calcular el tiempo
    	// Mostramos cuanto tiempo tardó el algoritmo secuencial
    		System.out.println("- SECUENCIAL: Demore "+ tiempoFinal/1000+ " microSegundos\n");
    	
    	
    	
    	
	}
	
	

}
