package praktikum.sesi6;

import java.util.ArrayList;
import java.util.List;

public class Kelas {  // Ubah 'kelas' menjadi 'Kelas'
    private String namaKelas;
    private String kodeKelas;
    private List<Mahasiswa3> mahasiswaList;

    // Konstruktor
    public Kelas(String namaKelas, String kodeKelas) {
        this.namaKelas = namaKelas;
        this.kodeKelas = kodeKelas;
        this.mahasiswaList = new ArrayList<>();
    }

    // Getter dan Setter untuk nama dan kode kelas
    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public List<Mahasiswa3> getMahasiswaList() {
        return mahasiswaList;
    }

    // Metode untuk menambahkan Mahasiswa ke dalam Kelas
    public void addMahasiswa(Mahasiswa3 mahasiswa) {
        if (!mahasiswaList.contains(mahasiswa)) {
            mahasiswaList.add(mahasiswa);  // Menambahkan mahasiswa ke dalam daftar mahasiswa di kelas ini
            mahasiswa.addKelas(this);      // Menambahkan kelas ini ke daftar kelas yang diikuti oleh mahasiswa
        }
    }

    // Metode untuk menampilkan informasi Kelas
    public void displayInfo() {
        System.out.println("Kelas: " + namaKelas + " (" + kodeKelas + ")");
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa3 mhs : mahasiswaList) {
            System.out.println("- " + mhs.getNama());
        }
    }
}
