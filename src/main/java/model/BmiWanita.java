package model;

public class BmiWanita extends Bmi {
    public BmiWanita(double tinggiCm, double beratKg) {
        super(tinggiCm, beratKg);
    }

    @Override
    public double hitungBeratIdeal() {
        // Rumus Broca wanita: (TB - 100) dikurangi 15%
        return (getTinggiCm() - 100) * 0.85;
    }

    @Override
    public String getGender() {
        return "Wanita";
    }
}
