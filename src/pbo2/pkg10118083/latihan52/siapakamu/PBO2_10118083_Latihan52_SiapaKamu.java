/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan52.siapakamu;

/**
 *
 * @author     
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas : Siapa Kamu
 */
public class PBO2_10118083_Latihan52_SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118083");
        mahasiswa.setNama("Tendy Hermansyah");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("PBO2");
        
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println("\nNIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();

    }
    
}
