/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagus Duta Prasetya
 */
public abstract class Hewan {
    protected String nama;
    private String warna;
    
    public Hewan(String nama) {
        this.nama = nama;
        this.warna = warna;
    }

    public abstract void bersuara();

    public abstract void bergerak();

    public String getwarna() {
        return warna;
    }
    public void setwarna(String warna){
        this.warna = warna;
    }
}