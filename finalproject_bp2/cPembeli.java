package finalproject_bp2;
public class cPembeli {
    //data
    private String nama, alamat;
    //method
    cPembeli(){
        System.out.println("Cosntructor default...");
    }
    cPembeli(String n, String alm){
        nama=n; alamat=alm;
    }
    public void setNama(String n){ nama=n; }
    public void setAlamat(String alm){ alamat=alm; }
    public String getNama(){ return nama; }
    public String getAlamat(){ return alamat; }
    public String ToString(){
        return nama+" Alamat:"+alamat;
    }    
}
