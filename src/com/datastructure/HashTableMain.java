package com.datastructure;

public class HashTableMain {
    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable = new MyHashTable();
        String sentence = "To be or not to be";
             /*  Storing given sentence in an array.
              Converting the sentence to lower case and removing spaces.*/
        String[] sentenceArray = sentence.toLowerCase().split(" ");

        for (String word : sentenceArray) {
            Integer value = hashTable.get(word);

            if( value == null)
                value = 1;
            else

                value = value + 1;
            hashTable.add(word , value);
        }
        System.out.println(hashTable);
    }
}