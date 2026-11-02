package main;

import model.Bmi;
import model.BmiPria;
import model.BmiWanita;

public class DemoTerminalMode {
    public static void main(String[] args) {
        Bmi pria = new BmiPria(170, 65);
        System.out.printf("%s: %.1f%% -> %s%n", pria.getGender(), pria.hitungPersentase(), pria.getKategori());

        Bmi wanita = new BmiWanita(160, 60);
        System.out.printf("%s: %.1f%% -> %s%n", wanita.getGender(), wanita.hitungPersentase(), wanita.getKategori());
    }
}
