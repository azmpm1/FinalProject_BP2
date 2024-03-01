package finalproject_bp2;
public class cProduk {
    //data
    private String nama, kode;
    private int harga;
    
    //method
    cProduk(){
        System.out.println("Constructor default..");
    }
    cProduk(String n, int h){
        nama=n; harga=h;
    }
    public void setHarga(int h){ harga=h; }
    public String getNama(){ return nama; }
    public int getHarga(){ return harga; }
    public String ToString(){
        return nama+" Harga: Rp"+harga;
    }
}