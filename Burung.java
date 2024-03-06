/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagus Duta Prasetya
 */
public class Burung extends Hewan {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Burung ini bernama " + nama);
        System.out.println("Suaranya Cip! Cip!");
    }

    @Override
    public void bergerak() {
        System.out.println("Terbang dengan dua sayap.");
    }
    
    @Override
    public void setwarna(String warna){
    super.setwarna(warna);
    System.out.println("Burung ini berwarna " + getwarna());
    }
}

