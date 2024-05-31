/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Exception6 {
    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba THrow");
        throw t;
        // System.out.println("iniTIdak lagi dicetak"); // This line is unreachable
    }
    
    public static void main(String[] args) {
        try {
            demo();
            // System.out.println will not be reached if an exception is thrown
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        System.out.println("Program continues after catch block");
    }
}

