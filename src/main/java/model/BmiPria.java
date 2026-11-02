package model;

public class BmiPria extends Bmi {
    public BmiPria(double tinggiCm, double beratKg) {
        super(tinggiCm, beratKg);
    }

    @Override
    public double hitungBeratIdeal() {
        // Rumus Broca pria: (TB - 100) dikurangi 10%
        return (getTinggiCm() - 100) * 0.90;
    }

    @Override
    public String getGender() {
        return "Pria";
    }
}
