/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    String nama, nobp, kelas, prodi, jurusan;
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Mahasiswa mhs1 = new Mahasiswa();
        
        mhs.nama = "Chantika Tri Amanda";
        mhs.nobp = "2101091002";
        mhs.kelas = "B";
        mhs.prodi = "MI";
        mhs.jurusan = "Teknologi Informasi";
        
        mhs1.nama = "Elvi Susanti";
        mhs1.nobp = "2101092046";
        mhs1.kelas = "B";
        mhs1.prodi = "TRPL";
        mhs1.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama        : "+mhs.nama+"\n"+"No BP       : "+mhs.nobp+"\n"
                +"Prodi       : "+mhs.prodi+"\n"+"Jurusan     : "+mhs.jurusan+"\n"+"Kelas       : "+mhs.kelas+"\n");
        
        System.out.println("Nama        : "+mhs1.nama+"\n"+"No BP       : "+mhs1.nobp+"\n"
                +"Prodi       : "+mhs1.prodi+"\n"+"Jurusan     : "+mhs1.jurusan+"\n"+"Kelas       : "+mhs1.kelas+"\n");
    }
}
