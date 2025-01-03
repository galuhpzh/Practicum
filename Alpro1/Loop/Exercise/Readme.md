# Program Perhitungan Luas Bangun Datar

![Loop Exercise](https://github.com/galuhpzh/Practicum/blob/7c2d41f97471a20f680d9f00b797372db580bdcf/Alpro1/assets/Loop%20Exercise.jpg)

Repository ini mencakup 3 latihan pemrogramman menggunakan struktur pengulangan di Java. Setiap program memiliki fungsi dan tujuan yang berbeda untuk memahami berbagai implementasi perulangan dalam pemrograman.

---

## Exercise 1: Pola Bintang Belah Ketupat
Program ini mencetak pola berbentuk belah ketupat menggunakan simbol `*`.  

### Penjelasan:
- **Input:** Tidak diperlukan.
- **Output:** Pola bintang berbentuk belah ketupat.
- Menggunakan dua nested loop untuk mencetak bagian atas dan bawah belah ketupat.

### Contoh Output
```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```
---

## Exercise 2: Perhitungan Waktu Menabung Biaya Haji
Program ini menghitung waktu yang diperlukan untuk menabung hingga biaya haji tercapai, dengan mempertimbangkan kenaikan biaya tahunan.  

### Penjelasan:
- **Input:**
  - Biaya awal haji (dalam rupiah).
  - Jumlah tabungan bulanan (dalam rupiah).
  - Persentase kenaikan biaya tahunan.
- **Output:** Waktu (dalam bulan) untuk mencapai total biaya.
- Menggunakan **while loop** untuk menghitung tabungan hingga cukup membayar biaya haji.

### Contoh Input & Output:
```
Enter the initial cost of Hajj (Rp): 25000000
Enter the monthly saving amount (Rp): 500000
Enter the average annual increase in cost (%): 4
The time required to save for Hajj is 59 months.
```
---

## Exercise 3: Penjumlahan Angka dengan Konfirmasi
Program ini meminta pengguna memasukkan angka secara berulang dan menjumlahkannya hingga pengguna memilih untuk berhenti.  

### Penjelasan:
- **Input:**
  - Angka untuk dijumlahkan.
  - Konfirmasi untuk melanjutkan (`y`) atau berhenti (`n`).
- **Output:** Total penjumlahan angka.
- Menggunakan **while loop** untuk mengelola masukan dan konfirmasi pengguna.

### Contoh Input & Output:
```
Enter number 1: 3
Do you want to continue (y/n): y
Program continues.
Enter number 2: 5
Do you want to continue (y/n): n
Program stopped.
Total sum: 8
```

---

## Cara Menjalankan Program
1. Pastikan Java Development Kit (JDK) telah terinstal.
2. Buka terminal atau command prompt.
3. Kompilasi dan jalankan masing-masing program dengan perintah berikut:
   - Untuk **Exercise1**:
     ```bash
     javac Exercise1.java
     java Alpro1.Loop.Exercise.Exercise1
     ```
   - Untuk **Exercise2**:
     ```bash
     javac Exercise2.java
     java Alpro1.Loop.Exercise.Exercise2
     ```
   - Untuk **Exercise3**:
     ```bash
     javac Exercise3.java
     java Alpro1.Loop.Exercise.Exercise3
     ```

---

## Catatan
Program ini dibuat sebagai bagian dari pembelajaran struktur perulangan dalam pemrograman Java.

---
