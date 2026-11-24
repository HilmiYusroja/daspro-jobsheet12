package Jobsheet12;

import java.util.Scanner;

public class HitungBalok11 {
    static int hitungLuas(int p, int l) {
        int luas = p * l;
        return luas;
    }

    static int hitungVolume(int p, int l, int t) {
        int volume = hitungLuas(p, l) * t;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang : ");
        p = input.nextInt();

        System.out.print("Masukkan lebar : ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah : " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah : " + vol);

        input.close();
    }
}
