package com.atguigu.java;

import com.atguigu.bean.Cutstomer;

import java.util.ArrayList;
import java.util.Arrays;

public class TemplatesTest {
    private static final Cutstomer cust = new Cutstomer();
    public static final  int NUM = 1;
    public static final int NUM2 = 2;
    public static final String NATION = "china";
    public static void main(String[] args) {
        System.out.println("hello!!");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");

        int num = 10;
        System.out.println("num = " + num);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num);

        String[] arr = new String[]{"Tom","Jerry","Hanmeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);


        }
        for (String s : arr) {
            System.out.println(s);

        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        ArrayList list = new ArrayList(); 
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
                   
        
        
        


    }
    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list == null) {
            
        }
        if (list == null) {
            
        }


    }
}
