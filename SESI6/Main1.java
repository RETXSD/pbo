package praktikum.sesi6;

public class Main1 {
           public static void main(String[] args) {

            // Membuat objek mahasiswa3,kelas dan jurusan 1
            
            // Membuat objek Jurusan
            Jurusan1 jurusanInformatika = new Jurusan1("Informatika", "IF123");
    
            // Membuat objek Mahasiswa dengan nama objek 'mhsiswa'
            Mahasiswa3 mhsiswa1 = new Mahasiswa3("Ahmad", "12345678", 21, jurusanInformatika);
            Mahasiswa3 mhsiswa2 = new Mahasiswa3("Budi", "87654321", 22, jurusanInformatika);
    
            // Membuat objek Kelas
            Kelas kelasPemrograman = new Kelas("Pemrograman Java", "PJ101");
            Kelas kelasBasisData = new Kelas("Basis Data", "BD102");
    
            // Menambahkan Mahasiswa ke dalam Kelas
            kelasPemrograman.addMahasiswa(mhsiswa1);
            kelasPemrograman.addMahasiswa(mhsiswa2);
            kelasBasisData.addMahasiswa(mhsiswa1);
    
            // Menampilkan data Mahasiswa
            System.out.println("Informasi Mahasiswa:");
            mhsiswa1.displayInfo();
            mhsiswa2.displayInfo();
    
            // Menampilkan data Kelas
            System.out.println("\nInformasi Kelas:");
            kelasPemrograman.displayInfo();
            kelasBasisData.displayInfo();
            // Membuat objek mahasiswa3,kelas dan jurusan 1 selesai
        }
    }
    

