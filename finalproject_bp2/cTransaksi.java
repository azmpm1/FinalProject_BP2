package finalproject_bp2;
public class cTransaksi {
    //data
    private cProduk produk;
    private cPembeli pembeli;
    int jumlah;
    //method
    cTransaksi(){
        System.out.println("Constructor default...");
    }
    cTransaksi(cProduk p, cPembeli pb, int jml){
        produk=p;
        pembeli=pb;
        jumlah=jml;
    }
    public void setProduk(cProduk p){ produk=p; }
    public void setPembeli(cPembeli pb){ pembeli=pb; }
    public void setJumlah(int jml){ jumlah=jml; }
    public void detailTransaksi(){
        System.out.println("Nama: "+pembeli.getNama());
        System.out.println("Alamat: "+pembeli.getAlamat());
        System.out.println("Produk: "+produk.getNama());
        System.out.println("Harga: "+produk.getHarga());
        System.out.println("Jumlah: "+jumlah);
        System.out.println("Total: Rp"+(produk.getHarga()*jumlah));
    }
}
