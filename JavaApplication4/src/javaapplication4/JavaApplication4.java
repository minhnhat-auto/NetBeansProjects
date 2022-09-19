/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;

/**
 *
 * @author cu_bi
 */
public class JavaApplication4 {
static int i = 0;
    static int j = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
//        ArrayList<String> cars = new ArrayList<String>();
//        String ele = "red";
//        for (int i =0; i < list.size(); i++)
//            if (list.get(i).equals(ele)){
//                list.remove(ele);
//                i--;
//            }
    Fruit[] f = {new Fruit(2), new Fruit(3), new Fruit(1)};
    java.util.Arrays.sort(f);
   
          
    }
    
  
    
}
class Fruit{
    private double w;
    public Fruit(double w){
        this.w = w;
    }
}

