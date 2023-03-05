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
public class Pendaftaran {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nama = "Chantika Tri Amanda";
        mhs.nobp = "2101091002";
        mhs.kelas = "B";
        mhs.prodi = "MI";
        mhs.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama        : "+mhs.nama+"\n"+"No BP       : "+mhs.nobp+"\n"
                +"Prodi       : "+mhs.prodi+"\n"+"Jurusan     : "+mhs.jurusan+"\n"+"Kelas       : "+mhs.kelas);
    }
}
