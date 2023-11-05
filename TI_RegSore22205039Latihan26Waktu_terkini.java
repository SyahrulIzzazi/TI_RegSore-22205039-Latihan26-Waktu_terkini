package ti_regsore.pkg22205039.latihan26.waktu_terkini;
/*
NAMA    : Syahrul Izzazi
NIM     : 22205039
PRODI   : TI RegSore
DESKRIPSI : Program menampilkan waktu saat ini
*/
import java.text.SimpleDateFormat;
import java.util.Date;
public class TI_RegSore22205039Latihan26Waktu_terkini {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
}