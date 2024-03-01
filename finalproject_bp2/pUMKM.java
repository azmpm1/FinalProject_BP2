package finalproject_bp2;
import java.util.Scanner;
public class pUMKM {
    public static void main(String[] args) {
        cProduk p = new cProduk("Nasi Goreng",15000);
        cPembeli pb = new cPembeli("Itadori Yudi", "Gunung Anyar");
        cTransaksi tr = new cTransaksi(p, pb, 2);
        Scanner sc = new Scanner(System.in);
        int pilih=0;
        do{
            System.out.println("\nMENU");
            System.out.println("1. Produk");
            System.out.println("2. Pembeli");
            System.out.println("3. Transaksi");
            System.out.println("4. Exit");
            System.out.print("Pilih = ");
            pilih=sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("[Produk]");
                    System.out.println("  1.Tambah");
                    System.out.println("  2.Ubah");
                    System.out.println("  3.Hapus");
                    System.out.println("  4.Detail");
                    System.out.print("  Pilih = ");
                    int pilih2=sc.nextInt();
                    switch(pilih2){
                        case 1:
                            sc = new Scanner(System.in);
                            System.out.print("  Nama: ");
                            String nm=sc.nextLine();
                            System.out.print("  Harga: ");
                            int hg=sc.nextInt();
                            p = new cProduk(nm,hg);
                            break;
                        case 2:
                            System.out.print("  Ubah harga: ");
                            hg=sc.nextInt();
                            System.out.println("  Yakin Ubah?");
                            System.out.println("  1. Ya");
                            System.out.println("  2. Batal");
                            System.out.print("  Jawab = ");
                            int jwb=sc.nextInt();
                            if(jwb==1){
                                p.setHarga(hg);
                                System.out.println("  Ubah harga berhasil..");
                            }else{
                                System.out.println("  Ubah harga batal..");
                            }
                            break;
                        case 3:
                            System.out.print("  Nama: ");
                            nm=sc.next();
                            if(nm.equalsIgnoreCase(p.getNama())){
                                System.out.println("  Yakin Hapus?");
                                System.out.println("  1. Ya");
                                System.out.println("  2. Tidak");
                                System.out.print("  Jawab = ");
                                jwb=sc.nextInt();
                                if(jwb==1){
                                    p=null;
                                    System.out.println("  Hapus sukses..");
                                }else{
                                    System.out.println("  Batal hapus!");
                                }
                            }else{
                                System.out.println("  Produk tidak ada..");
                            }
                            break;
                        case 4:
                            if(p!=null){
                                System.out.println(p.ToString());
                            }else{
                                System.out.println("  Objek kosong");
                            }
                    }
                    break;
                case 2:
                    System.out.println("[Pembeli]");
                    System.out.println("  1.Nama ");
                    System.out.println("  2.Alamat");
                    System.out.println("  3.Detail");
                    System.out.print("  Pilih: ");
                    int pilih3=sc.nextInt();
                    switch(pilih3){
                        case 1:
                            sc=new Scanner(System.in);
                            System.out.print("  Nama: ");
                            String nm = sc.nextLine();
                            pb.setNama(nm);
                            break;
                        case 2:
                            sc=new Scanner(System.in);
                            System.out.print("  Alamat: ");
                            String alm=sc.nextLine();
                            pb.setAlamat(alm);
                            break;
                        case 3:
                            System.out.print(pb.ToString());
                    }
                    break;
                case 3:
                    System.out.println("  [Transaksi]");
                    System.out.println("  1.Buat Pesanan");
                    System.out.println("  2.Detail Pesanan");
                    System.out.print("  Pilih: ");
                    int pilih4=sc.nextInt();
                    switch(pilih4){
                        case 1:
                            sc=new Scanner(System.in);
                            System.out.println("  Produk yang tersedia: ");
                            System.out.println("  ~ "+p.ToString());
                            System.out.print("  Pilih: ");
                            String psn=sc.nextLine();
                            if(psn.equalsIgnoreCase(p.getNama())){
                                System.out.print("  Jumlah: ");
                                int jml=sc.nextInt();
                                tr.setJumlah(jml);
                            }else{
                                System.out.println("  Produk tidak tersedia");
                            }
                            break;
                        case 2:
                            tr.detailTransaksi();
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih..");
            }
        }while(pilih!=4);
    }
}