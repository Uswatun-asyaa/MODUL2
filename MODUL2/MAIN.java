package MODUL2;
import java.util.ArrayList;
public class MAIN {
    public static void main(String[] args) {
        // TODO code application logic here
      ArrayList<String> hewan = new ArrayList<>();
        hewan.add("SAPI");
        hewan.add("KELINCI");
        hewan.add("KAMBING");
        hewan.add("UNTA");
        hewan.add("DOMBA");
        System.out.println("Hewan: " + hewan);
        ArrayList<String> hapus = new ArrayList<>();
        hapus.add("KELINCI");
        hapus.add("KAMBING");
        hapus.add("UNTA");
        System.out.println("Hewan yang dihapus:\n " + hapus);
            for (String warna : hapus) {
            while (hewan.contains(warna)) {
                hewan.remove(warna);
            }
        }
        System.out.println("Output hewan setelah dihapus: \n" + hewan);
    }
    }
    

