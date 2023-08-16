package org.example.abstractfactory.array;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> places = new LinkedList<>();
        addInOrder(places,"Quang Nam");
        addInOrder(places,"Ha Noi");
        addInOrder(places,"Da Nang");
        addInOrder(places,"Can Tho");
        addInOrder(places,"Quang Ninh");
        addInOrder(places,"Quang Binh");
        addInOrder(places,"Quang Tri");
        addInOrder(places,"Quang Ngai");
        addInOrder(places,"Ha Giang");
        addInOrder(places,"Quang Ngai");

        printList(places);



    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> ele = linkedList.iterator();
        while (ele.hasNext()) {
            System.out.println("the next place is " + ele.next());
        }
        System.out.println("================================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newPlace){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newPlace);
            if(comparison==0){
                System.out.println("existed");
                return false;
            }
            else if (comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newPlace);
                return true;
            }
        }
        stringListIterator.add(newPlace);
        return true;
    }

}
