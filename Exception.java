/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
//public class Exception {
 //   public static void main(String[] args) {
  //  int a[]=new int[5];
   // a[5]=100;
   // }
//}
public class Exception {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[5] = 100; // Ini akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi pelanggaran memory");
        }
    }

    Exception(String heres_my_Exception) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void printStackTrace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

