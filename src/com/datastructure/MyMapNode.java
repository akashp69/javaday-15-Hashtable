package com.datastructure;
public class MyMapNode<K,V> {
    K key;
    V value;
    MyMapNode<K, V> next;
    /* Create constructor name as MyMapNode and passing key and value here */

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }
    /* we use getter and setter 1st get key and set key getkey is return
     *  key setkey is set the key */

    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;

    }
    /**
     * here we used getvalue method and setvalue set is set the value and get
     * value is return value */
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
    public MyMapNode<K, V> getNext() {
        return next;
    }
    public void setNext(MyMapNode<K, V> next) {
        this.next = (MyMapNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("MyMapNode: " + " Key= ").append(key)
                .append(" Value= ").append(value);
        if (next != null)
            nodeString.append("\n").append(next);
        return nodeString.toString();
    }
}

