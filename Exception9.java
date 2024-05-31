/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class Exception9 {

    public static void main(String[] args) {
        try {
            System.out.println(reverse("This is a string"));
        } catch (Exception e) {
            System.out.println("The String was blank");
        } finally {
            System.out.println("All done");
        }
    }

    public static String reverse(String s) throws Exception {
        if (s == null || s.isEmpty()) {
            throw new Exception("String cannot be blank");
        }
        StringBuilder reverseStr = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseStr.append(s.charAt(i));
        }
        return reverseStr.toString();
    }
}
