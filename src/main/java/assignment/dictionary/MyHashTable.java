package assignment.dictionary;


/*


 */


//
import java.util.*;
/**


 */


public class MyHashTable<K,V>
//
//
{
    private final static int DEFAULT_CAPACITY = 25;
    private AList<V>[] mytable;
    ArrayList<K> KeySet = new ArrayList<>();
    ArrayList<V> ValueSet = new ArrayList<>();
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
        //ValueSet.add(value);
        KeySet.add(key);
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
        for (K K : KeySet) {
            if (K == key) {
                return true;
            }
        }
        return false;
    }


    public Iterable<K> keySet() {
        return KeySet;
    }


    public Iterable<V> values() {
        return ValueSet;
    }


    public boolean isEmpty() {
        return (size==0);
    }


    public int size() {
        return size;
    }


    public void clear() {
        for (int i = 0; i<DEFAULT_CAPACITY; i++) {
            mytable[i].clear();
        }
    }
    public int hash(K key) {
        return (int)key % DEFAULT_CAPACITY;
    }
    // You need to implement this class without using the
    // Hashtable class from Java (“java.util.Hashtable<K,V>”).


}

