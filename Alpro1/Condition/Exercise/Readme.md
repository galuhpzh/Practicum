# Kondisi dan Latihan dalam Java

Repository ini berisi beberapa program Java sederhana yang dirancang untuk melatih penggunaan logika kondisional dalam pemrograman. Setiap program menyelesaikan masalah tertentu berdasarkan input dari pengguna.

## Daftar Latihan

### 1. Exercise1: Menghitung Gaji Berdasarkan Jam Kerja
**Deskripsi:**
- Program ini menghitung gaji karyawan berdasarkan jumlah jam kerja per minggu.
- Logika penggajian:
  - Jika jam kerja antara 50 dan 60, gaji dihitung dengan tarif Rp. 5000 per jam.
  - Jika lebih dari 60 jam, diberikan bonus Rp. 7500 per jam untuk jam kerja tambahan.
  - Jika kurang dari 50 jam, ada potongan Rp. 2500 per jam untuk kekurangan jam kerja.

**Contoh Input dan Output:**
```
Name: Galuh
Hours per week: 55

Name: Galuh
Wage: Rp. 275000
```

### 2. Exercise2: Menghitung Diskon Berdasarkan Pembelian
**Deskripsi:**
- Program ini menghitung diskon total berdasarkan jumlah pembelian dan nomor transaksi.
- Logika diskon:
  - Jika total pembelian lebih dari Rp. 50.000, diskon 10% diterapkan.
  - Jika nomor transaksi kurang dari atau sama dengan 50 dan total pembelian lebih dari Rp. 50.000, diskon tambahan 5% diberikan.

**Contoh Input dan Output:**
```
Enter total purchase: 60000
Enter transaction number: 45

Total discount: Rp.9000.0
Total amount to pay: Rp.51000.0
```

### 3. Exercise3: Penilaian Tes dan Penempatan Divisi
**Deskripsi:**
- Program ini mengevaluasi hasil tes akademik, keterampilan, dan psikologi untuk menentukan apakah peserta lulus dan di divisi mana mereka ditempatkan.
- Logika penilaian:
  - Peserta dinyatakan gagal jika rata-rata nilai kurang dari 75.
  - Jika lulus, peserta ditempatkan di divisi berdasarkan nilai tertinggi:
    - Nilai akademik tertinggi: Administrasi
    - Nilai keterampilan tertinggi: Produksi
    - Nilai psikologi tertinggi: Pemasaran

**Contoh Input dan Output:**
```
Name: Galuh
Academic Test Score: 80
Skill Test Score: 70
Psychological Test Score: 85

You Passed!
You Placed in Marketing!
Name: Galuh
Academic Test Score: 80
Skill Test Score: 70
Psychological Test Score: 85
Average Score: 78.33333333333333
```

## Cara Menggunakan
1. Clone atau unduh repository ini.
2. Navigasi ke folder program yang diinginkan.
3. Kompilasi file Java menggunakan perintah `javac`.
4. Jalankan file hasil kompilasi menggunakan perintah `java`.
5. Masukkan input sesuai dengan instruksi di konsol.

## Persyaratan
- Java Development Kit (JDK) 8 atau lebih baru

## Lisensi
Proyek ini bersifat open-source dan tersedia di bawah [Lisensi MIT](LICENSE).
