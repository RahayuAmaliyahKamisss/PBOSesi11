/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
//public class Exception3 {
  //  public static void main(String[] args) {
    //int bil=10;
    //System.out.println(bil/0);
   // }
//}
public class Exception3 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: pembagian dengan nol.");
        }
    }
}



