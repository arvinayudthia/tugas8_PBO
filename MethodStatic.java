package nomor4;
/*
Nama      : ARVINA YUDITHIA SOMPIE.
Kelas     : B2
hari/tgl  : Sabtu, 2 Mei 2020
 */
public class MethodStatic {
    public static String nama = "ARVINA YUDITHIA SOMPIE";
    
    public static void cetakNama(){
	System.out.println("Nama saya "+nama);
    }
    public static void cetakUmur(int umur){
        System.out.println("Saya berumur "+umur+" tahun");
    }
    public static void main(String[] args){
        cetakNama();
        cetakUmur(19);         
    }
}
