/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modullanjutan;

import java.util.Scanner;

/**
 *
 * @author Farrel
 */
public class FungsiPengembalianNilai {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int a, b, c;
        System.out.println("Program Menjumlahkan 2 nilai");
        System.out.print("Masukkan nilai a : ");
        a = m.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = m.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = m.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b = "+ (jumlah(a,b)));
        System.out.println("Jumlah b + c = "+ (jumlah(b,c)));
        System.out.println("Jumlah c + a = "+ (jumlah(c,a)));
    }
    private static int jumlah(int a, int b){
      int hasil = a + b;
      return hasil;
    }
}