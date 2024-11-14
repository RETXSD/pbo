package praktikum.sesi6;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa3 {
    private String nama;
    private String nim;
    private int usia;
    private Jurusan1 jurusan;
    private List<Kelas> kelasList;  // Ubah 'kelas' menjadi 'Kelas'

    // Konstruktor
    public Mahasiswa3(String nama, String nim, int usia, Jurusan1 jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.jurusan = jurusan;
        this.kelasList = new ArrayList<>();
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk daftar kelas
    public List<Kelas> getKelasList() {  // Ubah 'kelas' menjadi 'Kelas'
        return kelasList;
    }

    // Metode untuk menambahkan Kelas ke dalam daftar Mahasiswa
    public void addKelas(Kelas kelas) {  // Ubah 'kelas' menjadi 'Kelas'
        if (!kelasList.contains(kelas)) {
            kelasList.add(kelas);        // Menambahkan kelas ke dalam daftar kelas yang diikuti oleh mahasiswa ini
            kelas.addMahasiswa(this);    // Menambahkan mahasiswa ini ke dalam daftar mahasiswa di kelas tersebut
        }
    }

    // Metode untuk menampilkan informasi Mahasiswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        
        if (jurusan != null) {
            System.out.println("Jurusan: " + jurusan.getNama());
        }
        
        System.out.println("Kelas yang diikuti:");
        for (Kelas kelas : kelasList) {  // Ubah 'kelas' menjadi 'Kelas'
            System.out.println("- " + kelas.getNamaKelas());
        }
    }
}
