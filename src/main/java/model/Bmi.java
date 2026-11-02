package model;

public abstract class Bmi {

    private final double tinggiCm;
    private final double beratKg;

    public Bmi(double tinggiCm, double beratKg) {
        if (tinggiCm < 100 || tinggiCm > 250) {
            throw new IllegalArgumentException("Tinggi badan harus antara 100 dan 250 cm.");
        }
        if (beratKg < 20 || beratKg > 300) {
            throw new IllegalArgumentException("Berat badan harus antara 20 dan 300 kg.");
        }
        this.tinggiCm = tinggiCm;
        this.beratKg = beratKg;
    }

    public double getTinggiCm() {
        return tinggiCm;
    }

    public double getBeratKg() {
        return beratKg;
    }

    /** Nilai BMI klasik (kg/m^2), ditampilkan sebagai informasi tambahan. */
    public double hitungBmi() {
        double meter = tinggiCm / 100.0;
        return beratKg / (meter * meter);
    }

    /** Rumus BERBEDA untuk pria dan wanita -> diimplementasikan di subclass. */
    public abstract double hitungBeratIdeal();

    public abstract String getGender();

    /** Persentase berat badan aktual terhadap berat ideal. */
    public double hitungPersentase() {
        return beratKg / hitungBeratIdeal() * 100.0;
    }

    public String getKategori() {
        double persen = hitungPersentase();
        if (persen < 90.0) {
            return "Underweight";
        } else if (persen <= 110.0) {
            return "Normal";
        } else {
            return "Overweight";
        }
    }
}
