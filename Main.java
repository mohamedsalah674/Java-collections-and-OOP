package Training;

import java.util.ArrayList ;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;


public class Main {


    public static void main(String[] args) {

        
        // ArrayList Definition
        ArrayList <Car> list = new ArrayList();
        
        // LinkedList Definition
        LinkedList <Car> Llist = new LinkedList();

        // PriorityQueue Definition
       try{
        PriorityQueue <Car> pq = new PriorityQueue<Car>();
        Car car1 = new Car("Civic1" , "2020" , "Red","Honda" , "800" , true , false);
      /*  Car car2 = new Car("Civic2" , "2021" , "Blue","Honda" , "800" , false , false);
        Car car3 = new Car("Civic3" , "2022" , "Green","Honda" , "800" , false , false);
        Car car4 = new Car("Civic4" , "2023" , "Yellow","Honda" , "800" , false , false);
        Car car5 = new Car("Civic5" , "2024" , "Orange","Honda" , "800" , false , false);
       */
        pq.add(car1);
       /* pq.add(car2);
        pq.add(car3);
        pq.add(car4);
        pq.add(car5);*/
        
         System.out.println("test" + pq);
        
       }catch(Exception e ){
           System.err.println("error :"+e.getMessage());}
        
        // HashSet Definition
        HashSet HSet = new HashSet();

        // LinkedHashList Definition
        LinkedHashSet LHSet = new LinkedHashSet();

        
        // HashMap Definition
        HashMap <Integer , Bike> TempHMap = new HashMap ();

        HashMap <Integer , Bike> HMap = new HashMap ();

        
        // LinkedHashMap Definition
        LinkedHashMap <Integer , Bike> LHMap = new LinkedHashMap();
        
        // HashTable
        Hashtable <Integer , Bike > Htable = new Hashtable(); 
        
        
        
        
 
        // Add Objects to ArrayList
     /*   list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);*/
        
        System.out.println("ArrayList is ---> " + list);


        // Loop on arrayList to get car model of each object
        for (int i = 0; i < list.size(); i++) {
            Car get = list.get(i);
            System.out.println("ArrayList --- > "  + get.model);
        }
        
        
        // Add objects to linkedList
/*        Llist.add(car1);
        Llist.add(car2);
        Llist.add(car3);
        Llist.add(car4);
        Llist.add(2, car5);*/
        
        // Loop on LinkedList to get model 
        for (int i = 0; i < Llist.size(); i++) {
            Car get = Llist.get(i);
            System.out.println("LinkedList ---- > " + get.model);
        }
        
        
        
        
        
        
        Bike bike1 = new Bike("Civic1" , "2020" , "Red","Honda" , "800" , true );
        Bike bike2 = new Bike("Civic2" , "2021" , "Red","Honda" , "810" , true );
        Bike bike3 = new Bike("Civic3" , "2022" , "Red","Honda" , "820" , false );
        Bike bike4 = new Bike("Civic4" , "2023" , "Red","Honda" , "830" , true );

//        pq.add(car1);
//        
//        
//        System.out.println("Priority Queue --> " + pq);
        
        
        // Add ArrayList to HashSet
        HSet.addAll(list);
        
        
        // Add different type of object to HashSet
        HSet.add(bike1);
        HSet.add(bike2);
        HSet.add(bike2);
        HSet.add(bike3);
        HSet.add(bike4);

        System.out.println("HashSet is ---> " + HSet);
        
        // LinkedHashSet does not allow duplication so it will remove duplicate record
        LHSet.add(bike1);
        LHSet.add(bike2);
        LHSet.add(bike2);
        LHSet.add(bike3);
        LHSet.add(bike4);

        System.out.println("LinkedHashSet is --> " + LHSet);
        
        
        TempHMap.put(1, bike1);
        TempHMap.put(2, bike2);
        TempHMap.put(3, bike3);
        TempHMap.put(4, bike4);
        
        
        System.out.println(" ");
        System.out.println("TempHashMap");
        
        
        
        for (Map.Entry<Integer, Bike> entry : TempHMap.entrySet()) {
            Integer key = entry.getKey();
            Bike value = entry.getValue();
            System.out.println(key + " " + value.model);
            
        }
        
        System.out.println(" ");

               
        HMap.putAll(TempHMap);
        
        
        
        System.out.println("Hashmap is ----> " + HMap);
       
        
        // Loop on hashmap to retrieve all data
        for (Map.Entry<Integer, Bike> entry : HMap.entrySet()) {
            Integer key = entry.getKey();
            Bike value = entry.getValue();
            System.out.println( "HashMap ---> "+ value.model);
            
        }
        
        System.out.println(" ");
        
        LHMap.putAll(HMap);
  
        
        for (Map.Entry<Integer, Bike> entry : LHMap.entrySet()) {
            Integer key = entry.getKey();
            Bike value = entry.getValue();
            
            System.out.println("LinkedHashMap is ------>" +  value.model);
        }


        
        System.out.println(" ");
        
        System.out.println("HashTable");
        // Insert Objects in HashTable
        Htable.putAll(LHMap);
        
        for (Map.Entry<Integer, Bike> entry : Htable.entrySet()) {
            Integer key = entry.getKey();
            Bike value = entry.getValue();
            
            System.out.println(key + " " + value.model);
            
        }
        
        System.out.println(" ");
        System.out.println("LinkedHashSet after sorting");
        
        LHMap.putAll(Htable);
        for (Map.Entry<Integer, Bike> entry : LHMap.entrySet()) {
            Integer key = entry.getKey();
            Bike value = entry.getValue();
        
            System.out.println(key + " " + value.model);
        }
        
    }
}
