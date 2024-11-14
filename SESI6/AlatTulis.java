package praktikum.sesi6;

public class AlatTulis {
    private String nama;
    private int stok;
    private int hargaSatuan;

    // Constructor
    public AlatTulis(String nama, int stok, int hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }
    public int getStok() {
        return stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    // Method to calculate the total price for this item
    public int getHargaTotal() {
        return stok * hargaSatuan;
    }

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }
    // Method to display the details of the item
    public void tampilkanDetail() {
        System.out.println("Nama Alat Tulis : " + nama);
        System.out.println("Stok : " + stok);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("Total Harga " + nama + " : " + getHargaTotal());
        System.out.println();
    }


}
