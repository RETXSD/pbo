package praktikum.sesi6;
public class Mahasiswa1 {
    // Atribut private
    private String nama;
    private String nim;
    private int usia;
    // Constructor
    public Mahasiswa1(String nama, String nim, int usia) 
   {
    this.nama = nama;
    this.nim = nim;
    this.usia = usia;
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
    // Metode untuk menampilkan data mahasiswa
    public void displayInfo() {
    System.out.println("");
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("Usia: " + usia);
    }
   }
   
