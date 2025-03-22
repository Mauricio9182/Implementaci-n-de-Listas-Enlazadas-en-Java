package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Lista {

    private Nodo primero;

    @Override
    public String toString() {
        return "=>" + primero;
    }

    /**
     * Constructor para inicializar una lista
     */
    public Lista() {
        primero = null;
    }

    /**
     * Devuelve el nodo inicial
     *
     * @return
     */
    public Nodo leerPrimero() {
        return primero;
    }

    /**
     * Inserta valores a la lista
     *
     * @param entrada
     */
    public void insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
    }

    /**
     * inserta un elemento a partir de anterior
     *
     * @param anterior
     * @param entrada
     */
    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;
    }

    /**
     * elimina el elemento entrada
     *
     * @param entrada
     */
    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        // Bucle de búsqueda
        while ((actual != null) && !(actual.dato == entrada)) {
            if (!(actual.dato == entrada)) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            // Se distingue entre que el nodo sea el cabecera
            // o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }

    /**
     * busca el elemento destino
     *
     * @param destino
     * @return
     */
    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (indice.dato == destino) {
                return indice;
            }
        }
        return null;
    }

    /**
     * recorre la lista y muestra cada dato
     */
    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
    }

    /**
     * Ordena la lista enlazada de forma ascendente usando el método de burbuja
     */
    public void ordenarBurbuja() {
        if (primero == null || primero.enlace == null) {
            return; // La lista está vacía o tiene un solo elemento, ya está ordenada.
        }

        boolean huboIntercambio;
        do {
            huboIntercambio = false;
            Nodo actual = primero;
            while (actual.enlace != null) {
                if (actual.dato > actual.enlace.dato) {
                    // Intercambio de valores
                    int temp = actual.dato;
                    actual.dato = actual.enlace.dato;
                    actual.enlace.dato = temp;
                    huboIntercambio = true;
                }
                actual = actual.enlace;
            }
        } while (huboIntercambio);
    }
    public void unirLista(Lista otraLista) {
        if (primero == null) {
            primero = otraLista.primero; // Si la primera lista está vacía, tomamos la segunda como propia
            return;
        }

        Nodo actual = primero;
        while (actual.enlace != null) {
            actual = actual.enlace; // Avanzamos hasta el último nodo de la primera lista
        }
        actual.enlace = otraLista.primero; // Conectamos la segunda lista al final de la primera
    }
    public void separarParesImpares(Lista listaPares, Lista listaImpares) {
        Nodo actual = primero;

        while (actual != null) {
            if (actual.dato % 2 == 0) {
                listaPares.insertarCabezaLista(actual.dato);
            } else {
                listaImpares.insertarCabezaLista(actual.dato);
            }
            actual = actual.enlace;
        }
    }

    public void invertirLista() {
        Nodo anterior = null;
        Nodo actual = primero;
        Nodo siguiente;

        while (actual != null) {
            siguiente = actual.enlace;  // Guarda el siguiente nodo
            actual.enlace = anterior;   // Invierte el enlace
            anterior = actual;          // Mueve 'anterior' un paso adelante
            actual = siguiente;         // Mueve 'actual' un paso adelante
        }
        primero = anterior; // El último nodo recorrido será el nuevo primero
    }



    public int obtenerDesdeFinal(int n) {
        int tamaño = obtenerTamaño(); // Calculamos el tamaño de la lista
        int posicion = tamaño - n; // Determinamos la posición desde el inicio

        if (posicion < 0) {
            throw new IllegalArgumentException("La posición es inválida.");
        }

        Nodo actual = primero;
        for (int i = 0; i < posicion; i++) {
            actual = actual.enlace;
        }

        return actual.dato;
    }

    public void eliminarDuplicados() {
        Nodo actual = primero;

        while (actual != null && actual.enlace != null) {
            Nodo temp = actual;
            while (temp.enlace != null) {
                if (actual.dato == temp.enlace.dato) {
                    temp.enlace = temp.enlace.enlace; // Eliminamos el nodo duplicado
                } else {
                    temp = temp.enlace;
                }
            }
            actual = actual.enlace;
        }
    }

    public int obtenerTamaño() {
        int contador = 0;
        Nodo actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.enlace;
        }
        return contador;
    }



    /**
    * Crear los metodos que se solicitan
    /**
     * 1 - Método para invertir la lista enlazada
     */

    /**
     * 2 - Método para obtener el elemento en la posición n desde el final
     */

    /**
     * 3 - Método para eliminar duplicados en una lista enlazada
     */


    /**
     * 4 - Método para obtener el tamaño de la lista enlazada
     */


    
}
