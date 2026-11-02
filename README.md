# BMIApp

Aplikasi kalkulator BMI (Body Mass Index) berbasis JavaFX SceneBuilder (FXML) dan Maven. Memiliki perhitungan yang berbeda untuk pria dan wanita,
dengan output berat badan ideal dan kategori (Underweight, Normal, Overweight). Proyek ini dibuat untuk memenuhi tugas mata kuliah Pemrograman Lanjut dengan menerapkan prinsip Object-Oriented Programming (OOP) dan pola arsitektur MVC (Model-View-Controller).

## Fitur Utama

- **Perhitungan BMI Tanpa Input Nama**: Pengguna cukup memasukkan tinggi badan (cm), berat badan (kg), dan memilih jenis kelamin lewat radio button.
- **Perhitungan Persentase Berbeda untuk Pria dan Wanita (Polimorfisme)**: Aplikasi menghitung persentase berat badan terhadap berat ideal menurut rumus Broca. `BmiPria` mengurangi 10% dari `tinggi - 100`, sedangkan `BmiWanita` mengurangi 15%.
  - Pria: berat ideal = (tinggi - 100) × 0,90
  - Wanita: berat ideal = (tinggi - 100) × 0,85
  - Persentase = berat badan ÷ berat ideal × 100
- **Tampilan Hasil Berwarna**: Kategori ditampilkan dalam badge berwarna, yaitu kuning untuk Underweight, hijau untuk Normal, dan merah untuk Overweight. Hasil juga memuat gender, nilai BMI, berat ideal, dan persentase.
- **Validasi Input & Penanganan Eksepsi**: Aplikasi memvalidasi input kosong atau format non-angka (`NumberFormatException`), serta nilai di luar batas wajar, yaitu tinggi 100–250 cm dan berat 20–300 kg (`IllegalArgumentException`), dengan pesan peringatan berwarna merah pada antarmuka. Koma desimal seperti `65,5` juga diterima.
- **Mode Terminal & GUI**: Menyediakan kelas `MainApp` untuk tampilan antarmuka grafis (JavaFX) dan `DemoTerminalMode` untuk pengujian cepat melalui konsol/terminal.

## Kebutuhan Sistem
- JDK 17 atau lebih baru
- Apache Maven (sudah terintegrasi di NetBeans / IntelliJ / Eclipse)
- JavaFX SceneBuilder

## Cara Menjalankan
1. Clone repository:
   ```
   git clone https://github.com/chaavier/BMIApp.git
   ```
      (Membutuhkan Git. Alternatifnya, klik tombol **Code > Download ZIP** di halaman repository, lalu ekstrak.)
2. Buka Apache NetBeans IDE, lalu pilih menu **File > Open Project...** dan arahkan ke folder proyek `BMIApp`.

3. Klik kanan pada nama proyek di panel **Projects**, lalu pilih **Clean and Build** (`Shift + F11`) agar Maven mengunduh seluruh dependensi JavaFX (`javafx-controls` dan `javafx-fxml`). Pastikan komputer terhubung ke internet pada langkah ini.

4. Untuk menjalankan **Mode GUI** (tampilan kalkulator visual):
   - Klik kanan pada nama proyek, lalu pilih **Run** (atau tekan `F6`).
   - Atau buka **Source Packages > main > MainApp.java**, klik kanan, lalu pilih **Run File** (atau tekan `Shift + F6`).

5. Untuk menjalankan **Mode Terminal** (konsol CLI):
   - Buka **Source Packages > main > DemoTerminalMode.java**.
   - Klik kanan pada `DemoTerminalMode.java`, lalu pilih **Run File** (atau tekan `Shift + F6`).
   - Hasil perhitungan akan tampil di jendela **Output** pada bagian bawah NetBeans.

**Alternatif lewat terminal** (membutuhkan Maven terpasang): buka terminal di folder proyek, lalu jalankan `mvn clean javafx:run`.

## Screenshot
![Tampilan awal](screenshots/form.png)
![Hasil perhitungan](screenshots/hasil.png)

## Struktur Project
- `model/` : kelas Bmi, BmiPria, BmiWanita
- `controller/` : BmiController
- `main/` : MainApp
- `resources/form-bmi.fxml` : tampilan GUI
