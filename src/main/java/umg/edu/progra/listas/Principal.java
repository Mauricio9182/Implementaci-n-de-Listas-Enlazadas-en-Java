package umg.edu.progra.listas;

import umg.edu.progra.listas.doblementeEnlazada.DoblementeEnlazada;

/**
 *
 * @author Walter Cordova
 */
public class Principal {
    public static void main(String[] args) {

        //creamos la lista doblemente enlazada
        DoblementeEnlazada lista = new DoblementeEnlazada();


        lista.insertAtEnd(10);
        lista.insertAtEnd(20);
        lista.insertAtEnd(30);
        lista.insertAtEnd(40);
        lista.insertAtEnd(50);

        // Mostrar la lista original
        System.out.println("Lista original:");
        lista.displayForward();

        // Contar el número de nodos en la lista
        System.out.println("\nNúmero de nodos en la lista: " + lista.countNodes());

        // Insertar un nodo después de un valor específico
        System.out.println("\nInsertando 25 después del 20:");
        lista.insertAfter(20, 25);
        lista.displayForward();

        // Revertir la lista
        System.out.println("\nRevirtiendo la lista:");
        lista.reverse();
        lista.displayForward();



        Lista listaOriginal = new Lista();
        listaOriginal.insertarCabezaLista(1);
        listaOriginal.insertarCabezaLista(2);
        listaOriginal.insertarCabezaLista(3);
        listaOriginal.insertarCabezaLista(4);
        listaOriginal.insertarCabezaLista(5);
        listaOriginal.insertarCabezaLista(6);

        listaOriginal.visualizar();
        System.out.println("\n");

        // Mostrar el primer valor de la lista
        System.out.println("Primero: " + listaOriginal.leerPrimero());

        // Eliminar el valor 3
        listaOriginal.eliminar(3);
        System.out.println("Lista después de eliminar el 3:");
        listaOriginal.visualizar();
        System.out.println("\n");

        // Buscar un valor y luego insertar uno nuevo después
        Nodo dato = listaOriginal.buscarLista(4);
        System.out.println("Nodo encontrado: " + dato);
        listaOriginal.insertarLista(dato, 10);
        listaOriginal.visualizar();

        dato = listaOriginal.buscarLista(5);
        System.out.println("Nodo encontrado: " + dato);
        listaOriginal.insertarLista(dato, 600);
        listaOriginal.visualizar();

        // Ordenar la lista
        System.out.println("\nLista ordenada:");
        listaOriginal.ordenarBurbuja();
        listaOriginal.visualizar();

        // Crear y unir una segunda lista
        Lista lista2 = new Lista();
        lista2.insertarCabezaLista(7);
        lista2.insertarCabezaLista(8);
        lista2.insertarCabezaLista(9);

        System.out.println("\nLista 2 antes de unir:");
        lista2.visualizar();

        listaOriginal.unirLista(lista2);
        System.out.println("\nLista unida:");
        listaOriginal.visualizar();

        // Separar la lista en pares e impares
        Lista listaPares = new Lista();
        Lista listaImpares = new Lista();
        listaOriginal.separarParesImpares(listaPares, listaImpares);

        System.out.println("\nLista de números pares:");
        listaPares.visualizar();

        System.out.println("\nLista de números impares:");
        listaImpares.visualizar();

        // Invertir la lista
        listaOriginal.invertirLista();
        System.out.println("\nLista invertida:");
        listaOriginal.visualizar();

        // Obtener el elemento desde el final
        System.out.println("\nElemento en la posición 2 desde el final: " + listaOriginal.obtenerDesdeFinal(2));

        // Eliminar duplicados
        listaOriginal.eliminarDuplicados();
        System.out.println("\nLista sin duplicados:");
        listaOriginal.visualizar();

        // Mostrar el tamaño de la lista
        System.out.println("\nTamaño de la lista: " + listaOriginal.obtenerTamaño());
    }
}