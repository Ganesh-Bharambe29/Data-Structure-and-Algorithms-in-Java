import java.util.ArrayList;

class HashTable 
{
    private int size;
    private ArrayList<ArrayList<Pair>> table;

    static class Pair 
    {
        int key;
        String value;

        Pair(int key, String value) //constructor to initialize objects
        {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(int size) 
    {
        this.size = size;
        this.table = new ArrayList<>(size);
        for (int i = 0; i < size; i++) 
        {
            table.add(new ArrayList<>());
        }
    }

    public HashTable() 
    {
        this(10); 
    }

    private int hashfunction(int key) 
    {
        return key % size;
    }

    public void insert(int key, String value) 
    {
        int index = hashfunction(key);
        ArrayList<Pair> bucket = table.get(index);

        for (Pair pair : bucket) 
        {
            if (pair.key == key) 
            {
                pair.value = value;
                System.out.println("Updated key " + key + " with value " + value);
                return;
            }
        }

        bucket.add(new Pair(key, value));
        System.out.println("Inserted key " + key + " with value " + value);
    }

    public String search(int key) 
    {
        int index = hashfunction(key);
        ArrayList<Pair> bucket = table.get(index);

        for (Pair pair : bucket) 
        {
            if (pair.key == key) 
            {
                return pair.value;
            }
        }
        return null;
    }

    public void delete(int key) 
    {
        int index = hashfunction(key);
        ArrayList<Pair> bucket = table.get(index);

        for (int i = 0; i < bucket.size(); i++) 
        {
            if (bucket.get(i).key == key) 
            {
                bucket.remove(i);
                System.out.println("Deleted key " + key);
                return;
            }
        }
        System.out.println("Key " + key + " not found for deletion.");
    }

    public void display() 
    {
        System.out.println("Hash Table:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Index " + i + ": ");
            ArrayList<Pair> bucket = table.get(i);
            for (Pair pair : bucket) 
            {
                System.out.print("[" + pair.key + ", " + pair.value + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        HashTable ht = new HashTable();

        ht.insert(15, "apple");
        ht.insert(25, "banana");  
        ht.insert(35, "cherry");
        ht.insert(24,"Guava");
        ht.display();

        System.out.println("Search 25: " + ht.search(25));  
        ht.delete(25);
        System.out.println("Search 25 after deletion: " + ht.search(25));  

        ht.display();
    }
}
