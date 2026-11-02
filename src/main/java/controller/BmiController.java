package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;
import model.Bmi;
import model.BmiPria;
import model.BmiWanita;

public class BmiController {
    @FXML private TextField tinggiField;
    @FXML private TextField beratField;
    @FXML private ToggleGroup genderGroup;
    @FXML private RadioButton priaRadio;
    @FXML private RadioButton wanitaRadio;
    @FXML private Label hasilLabel;
    @FXML private Label kategoriLabel;

    @FXML
    private void initialize() {
        priaRadio.setSelected(true);
        kategoriLabel.setVisible(false);
        kategoriLabel.setManaged(false);
    }

    @FXML
    private void hitung() {
        try {
            double tinggi = Double.parseDouble(tinggiField.getText().trim().replace(',', '.'));
            double berat = Double.parseDouble(beratField.getText().trim().replace(',', '.'));

            Bmi bmi;
            if (wanitaRadio.isSelected()) {
                bmi = new BmiWanita(tinggi, berat);
            } else {
                bmi = new BmiPria(tinggi, berat);
            }

            hasilLabel.setStyle("-fx-text-fill: #0f172a;");
            hasilLabel.setText(String.format(
                "Gender: %s%nBMI: %.1f kg/m²%nBerat ideal: %.1f kg",
                bmi.getGender(), bmi.hitungBmi(), bmi.hitungBeratIdeal()));

            tampilkanKategori(bmi.getKategori());
        } catch (NumberFormatException e) {
            tampilkanError("Tinggi dan berat harus berupa angka (contoh: 170 dan 65,5).");
        } catch (IllegalArgumentException e) {
            tampilkanError(e.getMessage());
        }
    }

    private void tampilkanKategori(String kategori) {
        String warna;
        switch (kategori) {
            case "Underweight": warna = "#d97706"; break;
            case "Normal":      warna = "#16a34a"; break;
            default:            warna = "#dc2626"; break;
        }
        kategoriLabel.setText(kategori);
        kategoriLabel.setStyle("-fx-background-color: " + warna + "; -fx-text-fill: white;"
            + " -fx-font-weight: bold; -fx-font-size: 18px; -fx-padding: 8 22;"
            + " -fx-background-radius: 20;");
        kategoriLabel.setVisible(true);
        kategoriLabel.setManaged(true);
    }

    private void tampilkanError(String pesan) {
        kategoriLabel.setVisible(false);
        kategoriLabel.setManaged(false);
        hasilLabel.setStyle("-fx-text-fill: #b91c1c;");
        hasilLabel.setText(pesan);
    }
}
