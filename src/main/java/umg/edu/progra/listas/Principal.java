package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);

        lista.visualizar();


        System.out.println("\n");
        System.out.println("primero: " + lista.leerPrimero());



        lista.eliminar(3);
        System.out.println("lista: " + lista);

        System.out.println("\n");

        Nodo dato = lista.buscarLista(4);
        System.out.println("dato: " + dato);

        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);

        dato = lista.buscarLista(5);
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);

        System.out.println("lista " + lista);

        lista.visualizar();

        // Ordenar la lista con el método de burbuja
        System.out.println("\nLista ordenada:");
        lista.ordenarBurbuja();
        lista.visualizar();

        // Crear segunda lista para unir
        Lista lista2 = new Lista();
        lista2.insertarCabezaLista(7);
        lista2.insertarCabezaLista(8);
        lista2.insertarCabezaLista(9);

        System.out.println("\nLista 2 antes de unir:");
        lista2.visualizar();

        // Unir listas
        lista.unirLista(lista2);

        System.out.println("\nLista unida:");
        lista.visualizar();

// Separar en listas de pares e impares
        Lista listaPares = new Lista();
        Lista listaImpares = new Lista();
        lista.separarParesImpares(listaPares, listaImpares);

        System.out.println("\nLista de números pares:");
        listaPares.visualizar();

        System.out.println("\nLista de números impares:");
        listaImpares.visualizar();

        lista.invertirLista();
        System.out.println("\nLista invertida:");
        lista.visualizar();

        System.out.println("\nElemento en la posición 2 desde el final: " + lista.obtenerDesdeFinal(2));

        lista.eliminarDuplicados();
        System.out.println("\nLista sin duplicados:");
        lista.visualizar();

        System.out.println("\nTamaño de la lista: " + lista.obtenerTamaño());

        /**
		 * Resolver lo que se solicita a continuacion
         * Ejercicio 1: Ordernar la lista de forma ascendente
         * Ejercicio 2: Unir dos listas enlazadas
         * Ejercicio 3: Separa numeros pares e impares en dos listas enlazadas diferentes
         */


    }

}
