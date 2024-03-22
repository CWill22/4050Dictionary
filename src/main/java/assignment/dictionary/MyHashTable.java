package assignment.dictionary;


/*


 */


//
import java.util.*;
import java.io.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.LinkedList;
/**


 */


public class MyHashTable<K,V>
//
//
{
    private final static int DEFAULT_CAPACITY = 25;
    private AList<V>[] mytable;
    private int size = 0;
    public MyHashTable() {
        mytable = new AList[DEFAULT_CAPACITY];
        for (int i=0; i< DEFAULT_CAPACITY; i++) {
            mytable[i] = new AList<>();
        }
    }
    public V put(K key, V value) {
        int index = hash(key);
        mytable[index].add(value);
        size++;
        return null;
    }


    public V remove(K key) {
        int index = hash(key);
        V temp = mytable[index].getEntry((int)key);
        mytable[index].remove((int)key);
        size--;
        return temp;
    }


    public V get(K key) {
        int index = hash(key);
        return mytable[index].getEntry((int)key);
    }


    public boolean containsKey(Object key) {
        int index = hash((K)key);
        return !mytable[index].isEmpty();
    }


    public Iterable<Object> keySet() {
    }


    public Iterable<Object> values() {
    }


    public boolean isEmpty() {
        return (size==0);
    }


    public int size() {
        return size;
    }


    public void clear() {
    }
    public int hash(K key) {
        return (int)key % DEFAULT_CAPACITY;
    }
    // You need to implement this class without using the
    // Hashtable class from Java (“java.util.Hashtable<K,V>”).


}

