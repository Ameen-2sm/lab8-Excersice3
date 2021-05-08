/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;

public class ThreadUsingRunnableTwo implements Runnable{
    
    
    String arr[] = {"It", "is", "recommended", "to", "use", "Calender", "class"};

    @Override
    public void run(){
   
        if(Thread.currentThread().getName().equals("text")){
        
            System.out.println("Executing thread :"+Thread.currentThread().getName());
            
            printArrayInRandomOrder();
        }else if(Thread.currentThread().getName().equals("text1")){
        
            System.out.println("Executing thread :"+Thread.currentThread().getName());
            
            printArrayWithThreadNameRandomOrder();
        }
        else if(Thread.currentThread().getName().equals("word1")){
        
            
            System.out.println("Executing thread :"+Thread.currentThread().getName());
            
            
            extract("abcdefghijklmnopqrstuvwxy");
        
        }
       
    }

    public void extract(String text) {

        splitText(text, 10);
        
    }

    public void printArrayInRandomOrder() {

        String[] suffleArray = suffleArray(arr);
        for (String s : suffleArray) {

            System.out.println(s);

        }

    }
    
    public void printArrayWithThreadNameRandomOrder() {

        String[] suffleArray = suffleArray(arr);
        for (String s : suffleArray) {

            System.out.println(s +" Thread name :"+Thread.currentThread().getName());

        }

    }

    public String[] suffleArray(String[] array) {
        Random rgen = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            String temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
    }

    static void splitText(String str1, int n) {
        int str_size = str1.length();
        int part_size;
        part_size = str_size / n;
        for (int i = 0; i < str_size; i++) {
            if (i % part_size == 0) {
                System.out.println();
            }
            System.out.print(str1.charAt(i));
        }
    }
}
