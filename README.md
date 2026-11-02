# BMIApp

Aplikasi kalkulator BMI (Body Mass Incex) berbasis JavaFX dan Maven. Memiliki perhitungan yang berbeda untuk pria dan wanita,
dengan output berat badan ideal dan kategori (Underweight, Normal, Overweight).

## Fitur
- Input tinggi badan (cm), berat badan (kg), dan gender
- Rumus berat ideal berbeda untuk pria dan wanita
- Output nilai BMI, berat ideal, dan kategori berwarna

## Kebutuhan
- JDK 17 atau lebih baru
- Maven (sudah termasuk di NetBeans)
- NetBeans IDE

## Cara Menjalankan
1. Clone repository:
   ```
   git clone https://github.com/chaavier/BMIApp.git
   ```
2. Buka NetBeans, pilih File > Open Project, lalu pilih folder `BmiApp`.
3. Klik kanan project, pilih Run (atau tekan F6).
4. Atau lewat terminal: `mvn clean javafx:run`

## Rumus
- Pria: berat ideal = (tinggi - 100) x 0,90
- Wanita: berat ideal = (tinggi - 100) x 0,85
- Underweight < 90%, Normal 90-110%, Overweight > 110%

## Screenshot
![Tampilan awal](screenshots/form.png)
![Hasil perhitungan](screenshots/hasil.png)

## Struktur Project
- `model/` : kelas Bmi, BmiPria, BmiWanita
- `controller/` : BmiController
- `main/` : MainApp
- `resources/form-bmi.fxml` : tampilan GUI
