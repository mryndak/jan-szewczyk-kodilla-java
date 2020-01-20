package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> EmptyList = new ArrayList<>();
        EmptyList.add(7);
        EmptyList.add(9);
        EmptyList.add(10);
        EmptyList.add(1);
        EmptyList.add(243);
        EmptyList.add(2);
        EmptyList.add(6);
        EmptyList.add(15);
        EmptyList = oddNumbersExterminator.exterminate(EmptyList);
        if(EmptyList.size()>0){
            System.out.println("Lista nie jest pusta");
        }else{
            System.out.println("Lista jest pusta");
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList (){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> NormalList = new ArrayList<>();
        NormalList.add(7);
        NormalList.add(9);
        NormalList.add(10);
        NormalList.add(1);
        NormalList.add(243);
        NormalList.add(2);
        NormalList.add(6);
        NormalList.add(15);
        NormalList = oddNumbersExterminator.exterminate(NormalList);
        boolean odd = false;
        boolean even = false;
        for(int i : NormalList){
            if(i%2==0){
                even = true;
            }else{
                odd = true;
            }
            if(even && odd){
                System.out.println("Lista posiada liczby parzyste i nieparzyste");
                break;
            }
        }
        if(!odd || !even){
            System.out.println("Lista nie posiada liczb parzystych lub nieparzystych");
        }
    }

}