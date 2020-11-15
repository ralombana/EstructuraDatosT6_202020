package model.data_structures;

public interface TablaSimbolosOrdenada<K extends Comparable<K>,V> 
{
	/**
	 * Retornar el n�mero de parejas [Llave,Valor] del �rbol
	 * @return n�mero parejas llave-valor
	 */
	public int size();
	
	/**
	 * Informa si el �rbol es vac�o
	 */
	public boolean isEmpty ();
	
	/**
	 * Retorna el valor V asociado a la llave key dada. Si la llave no seencuentra se retorna el valor null.
	 */
	public V get(K key);
	
	/**
	 * Retorna la altura del camino desde la raiz para llegar a la llave key (si la llave existe). Retorna valor �1 si la llave No existe.
	 */
	public int getHeight(K key);
	
	/**
	 * Indica si la llave key se encuentra en el �rbol
	 */
	public boolean contains(K key);
	
	/**
	 * Inserta la pareja [key, val] en el �rbol. Si la llave ya existe se reemplaza el valor. 
	 */
	public void put(K key, V val);

	/**
	 * Retorna la altura del �rbol definida como la altura de la rama m�s alta (aquella que tenga mayor n�mero de enlaces desde la ra�z a una hoja).
	 */
	public int height();
	
	/**
	 * Retorna la llave m�s peque�a del �rbol. Valor null si �rbol vac�o
	 */
	public K min();
	
	/**
	 * Retorna la llave m�s grande del �rbol. Valor null si �rbol vac�o
	 */
	public K max();
	
	/**
	 * Retorna las llaves del �rbol. Para su implementaci�n en BST o RBT deben retornarse usando un recorrido en Inorden.
	 */
	public ListaEncadenada<K> keySet();
	
	/**
	 * Retorna todas las llaves K en el �rbol que se encuentran en el rango
	 *	de llaves dado. Las llaves en el rango deben retornarse en orden
	 *	ascendente. Por eficiencia, debe intentarse No recorrer todo el �rbol.
	 */
	public ListaEncadenada<K> keysInRange(K init, K end);
	
	/**
	 * Retorna todos los valores V en el �rbol que est�n asociados al rango
	 * de llaves dado.
	 * Por eficiencia, debe intentarse No recorrer todo el �rbol.
	 */
	public ListaEncadenadaSinComparable<V> valuesInRange(K init, K end);

	
}
