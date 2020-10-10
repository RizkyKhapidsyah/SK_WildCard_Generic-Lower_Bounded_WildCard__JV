import com.rizkykhapidsyah.Lingkaran;
import com.rizkykhapidsyah.PersegiPanjang;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {

    public static <T> void hitungLuas(List<? super T> Daftar) {
        for (int i = 0; i < Daftar.size(); i++) {
            System.out.println(Daftar.get(i));
        }

        System.out.println();
    }

    public static void main(String[] args) {
        List<PersegiPanjang> Daftar1 = new ArrayList<>();
        Daftar1.add(new PersegiPanjang(14, 7));
        Daftar1.add(new PersegiPanjang(19.5, 8.3));
        Daftar1.add(new PersegiPanjang(897, 123));

        List<Lingkaran> Daftar2 = new ArrayList<>();
        Daftar2.add(new Lingkaran(9));
        Daftar2.add(new Lingkaran(8.3));
        Daftar2.add(new Lingkaran(0.2));

        System.out.println("====================\nLuas Persegi Panjang\n====================");
        hitungLuas(Daftar1);
        System.out.println("====================\nLuas Lingkaran\n====================");
        hitungLuas(Daftar2);
    }
}
