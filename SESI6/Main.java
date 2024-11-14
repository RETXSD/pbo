package praktikum.sesi6;

public class Main {
    public static void main(String[] args) {
        // intansiasi objek Alat Tulis

        AlatTulis bolpoint = new AlatTulis("Bolpoint", 20, 2000);
        AlatTulis pensil = new AlatTulis("Pensil", 15, 1000);

        bolpoint.tampilkanDetail();
        pensil.tampilkanDetail();

        //instansiasi objek Alat Tulis Selesai
        //instansiasi objek Hewan
        
        Hewan SAPI = new Hewan("Sapi","mamalia");
        SAPI.displayInfo();

        //instansiasi objek hewan selesai

        //instansiasi objek mahasiswa1

        Mahasiswa1 mahasiswa1 = new Mahasiswa1 ("Ahmad", "12345678", 21);
        // Mengakses dan menampilkan data 
        mahasiswa1.displayInfo();
        // Mengubah data Mahasiswa
        mahasiswa1.setNama("Budi");
        mahasiswa1.setNim("87654321");
        mahasiswa1.setUsia(22);
        // Menampilkan data setelah diubah
        mahasiswa1.displayInfo();

        //instansiasi objek mahasiswa1 selesai

        // intansiasi objek mahasiswa2 beserta jurusan1
        // Membuat objek Jurusan
        Jurusan1 jurusanInformatika = new Jurusan1("Informatika", "IF123");
        // Membuat objek Mahasiswa dengan Jurusan
        Mahasiswa2 mhs1 = new Mahasiswa2("Ahmad", "12345678", 21, jurusanInformatika);
        // Menampilkan data Mahasiswa beserta 
        mhs1.displayInfo();
        // Mengubah data Jurusan Mahasiswa
        Jurusan1 jurusanSistemInformasi = new 
        Jurusan1("Sistem Informasi", "SI456");
        
        mhs1.setJurusan(jurusanSistemInformasi);
        // Menampilkan data setelah perubahan
        mhs1.displayInfo();
        }       

        // intansiasi objek mahasiswa2 beserta jurusan1 selesai

        
        
        
}
