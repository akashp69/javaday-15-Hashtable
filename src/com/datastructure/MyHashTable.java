package com.datastructure;


import java.util.ArrayList;

public class MyHashTable<K, V> {
    MyMapNode<K, V> head;
    MyMapNode<K, V> tail;
    private final int numOfBuckets;
    ArrayList<MyMapNode<K, V>> myBucketArray;

    public MyHashTable() {
        this.numOfBuckets = 10;
        this.myBucketArray = new ArrayList<>(numOfBuckets);

        for (int i = 0; i < numOfBuckets; i++)
            this.myBucketArray.add(null);
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        if (this.myBucketArray.get(index) == null)
            return null;
        MyMapNode<K, V> myNode = search(key);
        return (myNode == null) ? null : myNode.getValue();
    }

    public MyMapNode<K, V> search(K word) {
        MyMapNode<K, V> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getKey().equals(word)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        MyMapNode<K, V> myNode = this.myBucketArray.get(index);
        if (myNode == null) {
            myNode = new MyMapNode<>(key, value);
            this.myBucketArray.set(index, myNode);
        } else
            myNode.setValue(value);
        myNode = search(key);
        if (myNode == null) {
            myNode = new MyMapNode<>(key, value);
            this.append(myNode);
        } else
            myNode.setValue(value);
    }


    public int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numOfBuckets;

        return index;
    }
}