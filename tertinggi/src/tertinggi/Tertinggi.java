/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tertinggi;

/**
 *zada azmi a
 * 5160411313
 */
public class Tertinggi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 10, num2 = 23, num3 = 5, nmax;
        System.out.println("Number 1\t="+num1);
        System.out.println("Number 2\t="+num2);
        System.out.println("Number 3\t="+num3);
        nmax = (num2>num3)?(num2>num1)? num2:num1:num3;
        System.out.println("Nilai Tertingginya Adalah= "+nmax);

        // TODO code application logic here
    }
    
}
