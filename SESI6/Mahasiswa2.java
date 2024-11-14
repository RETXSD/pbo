package praktikum.sesi6;

public class Mahasiswa2 {
    private String nama;
    private String nim;
    private int usia;
    private Jurusan1 jurusan; // Relasi "has-a" dengan jurusan

    // Constructor
    public Mahasiswa2(String nama, String nim, int usia, Jurusan1 jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public Jurusan1 getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan1 jurusan) {
        this.jurusan = jurusan;
    }

    // Metode untuk menampilkan info Mahasiswa
    public void displayInfo() {

        System.out.println("");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        
        if (jurusan != null) {
            System.out.println("Jurusan: ");
            jurusan.displayInfo();
            System.out.println("");
        } 
    }
    
}