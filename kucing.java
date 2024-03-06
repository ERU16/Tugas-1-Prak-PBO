/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagus Duta Prasetya
 */
public class kucing extends Hewan implements mamalia {

    public kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing ini bernama " + nama);
        System.out.println("Suaranya Meow Meow!");
    }

    @Override
    public void bergerak() {
        System.out.println("Berjalan dengan empat kaki.");
    }

    @Override
    public void menyusui() {
        System.out.println("Kucing ini bernama " + nama);
        System.out.println("Menyusui anaknya.");
    }

    @Override
    public void getJumlahKaki() {
        System.out.println("Kucing berkaki 4");
    }
    
    @Override
    public void setwarna(String warna){
    super.setwarna(warna);
    System.out.println("Kucing ini berwarna " + getwarna());
    }
}


