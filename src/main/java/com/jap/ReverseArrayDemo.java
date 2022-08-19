package com.jap;

public class ReverseArrayDemo {
    
    public static void main ( String[] args ) {
        
        //Declare and initialize values of an array.
        int[] array = { 23 , 34 , 43 , 56 , 67 , 78 , 43 , 35 };
        
        //Create an object of the class ReverseArrayDemo.
        ReverseArrayDemo reverseArrayDemo = new ReverseArrayDemo ( );
        
        //Call the method getReverseArray and pass the array as parameter
        int[] getReverseArray = reverseArrayDemo.getReverseArray ( array );
        for ( int i = 0 ; i < getReverseArray.length ; i++ ) {
            System.out.print ( getReverseArray[ i ] + " " );
        }
    }
    
    //Write the logic to reverse the given array inside the below
    // method and return the reverse array.
    public int[] getReverseArray ( int[] array ) {
        int[] reverse = new int[ array.length ];
        int counter = 0;
        for ( int i = array.length - 1 ; i >= 0 ; i-- ) {
            reverse[ counter ] = array[ i ];
            counter++;
        }
        return reverse;
    }
}
