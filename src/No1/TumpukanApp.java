/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author Aliza Fitri Adilla
 */
public class TumpukanApp {
    public static void main(String args[]){
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(13);
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println("Nilai teratas = " + tumpukan.peek());
        System.out.println("Nama Saya Adalah Aliza Fitri Adilla");
        System.out.println("Nilai yang dihapus = " + tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(50);
        tumpukan.baca();
    }
}
    

