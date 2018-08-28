package mx.rafuru.collections;

public interface BList<T> {

    /**
     * Adds the element to the List
     * @param element
     */
    void add(T element);

    /**
     * returns the size of the current list
     * @return
     */
    int size();

    /**
     * return the element from the specified index, throws a InexOutOfBounds error if the specified index is greater
     * than the list size
     * @param index
     * @return
     */
    T get(int index);
}
