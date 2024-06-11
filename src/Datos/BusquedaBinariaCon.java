package Datos;

public class BusquedaBinariaCon {
	

//se crea la busqueda binaria concurrente
    public static  int BusquedaBinaria(int arr[] , int x , int izquierda , int derecha) {
		  while(izquierda <= derecha) { // indica un blucle while indicando que izquierda en menor o igual a derecha
			  int medio = izquierda + (derecha - izquierda) / 2; //se crea la variable medio que tiene almacenada la suma de izquierda con la resta de derecha ,izquierda dividido dos
			  if(arr[medio] == x)  // si array ubicada en medio es igual a elemento a buscar
				  return medio; // retorna medio
			  
			  if(arr[medio]< x)  // si array ubicada en medio es menor a elemento a buscar
				  izquierda = medio + 1; //entonces izquierda va tener un valor de medio +1
			  else // sino
				  derecha = medio - 1; // derecha ava a tener un valor de medio -1
				  
			  }
		  return -1; // retona valor -1
		  }
}
