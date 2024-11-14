package praktikum.sesi6;

public class Hewan {
    private String nama;
    private String jenis;

    public Hewan(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getJenis(){
        return jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void displayInfo(){
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis Hewan: " + jenis);
    }
}
