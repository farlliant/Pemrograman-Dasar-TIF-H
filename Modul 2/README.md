# 02 — Seleksi Kondisi

Materi ini membahas **seleksi kondisi**, yaitu mekanisme yang memungkinkan program menentukan perintah yang dijalankan berdasarkan kondisi tertentu.

Materi ini terdiri dari empat konsep utama:

```text
Conditional Assignment
If-Else
Nested If
Switch-Case
```

---

## Tujuan Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:

- memahami konsep conditional assignment;
- memahami percabangan menggunakan `if-else`;
- memahami percabangan bertingkat menggunakan nested if;
- memahami seleksi kondisi menggunakan `switch-case`.

---

# Conditional Assignment

Conditional assignment digunakan untuk memberikan suatu nilai berdasarkan kondisi tertentu.

Bentuk dasarnya:

```text
variabel = kondisi ? nilai_jika_benar : nilai_jika_salah
```

Contoh:

```java
String hasil = kondisi ? "Berhasil" : "Gagal";
```

Secara sederhana:

```text
          Kondisi
          /     \
       True     False
        |         |
        v         v
    Nilai A     Nilai B
          \     /
           \   /
          Variabel
```

Conditional assignment sesuai digunakan untuk kondisi sederhana yang menghasilkan sebuah nilai.

---

# If-Else

`if-else` digunakan untuk menentukan blok program yang akan dijalankan berdasarkan suatu kondisi.

Bentuk dasar:

```java
if (kondisi) {
    // dijalankan jika kondisi benar
} else {
    // dijalankan jika kondisi salah
}
```

Untuk lebih dari dua kondisi dapat digunakan:

```java
if (kondisi1) {
    ...
} else if (kondisi2) {
    ...
} else {
    ...
}
```

Alurnya:

```text
         Kondisi
        /       \
     True       False
      |           |
      v           v
   Blok A       Blok B
```

---

# Nested If

Nested if merupakan struktur `if` yang berada di dalam blok `if` lainnya.

Contoh konsep:

```java
if (kondisi1) {
    if (kondisi2) {
        ...
    } else {
        ...
    }
}
```

Alur:

```text
Kondisi 1
   |
   +-- False --> Proses lain
   |
  True
   |
   v
Kondisi 2
  /    \
True   False
```

Nested if digunakan ketika kondisi berikutnya hanya perlu diperiksa apabila kondisi sebelumnya telah terpenuhi.

---

# Switch-Case

Selain `if-else`, seleksi kondisi dapat dilakukan menggunakan `switch-case`.

Bentuk dasar:

```java
switch (pilihan) {
    case 1:
        ...
        break;

    case 2:
        ...
        break;

    default:
        ...
}
```

`switch-case` sesuai digunakan ketika terdapat beberapa pilihan berdasarkan nilai tertentu.

---

## Fungsi `break`

Statement:

```java
break;
```

digunakan untuk menghentikan eksekusi pada suatu `case`.

Tanpa `break`, program dapat melanjutkan menjalankan `case` berikutnya.

Fenomena tersebut dikenal sebagai:

```text
fall-through
```

---

# Percobaan

## Percobaan 1 — Conditional Assignment

File:

👉 [constAss.java](./constAss.java)

Percobaan ini memperkenalkan conditional assignment untuk menentukan nilai berdasarkan kondisi tertentu.

Konsep utama:

```text
condition ? trueValue : falseValue
```

---

## Percobaan 2 — If-Else

File:

👉 [seleksi1.java](./seleksi1.java)

Percobaan ini menggunakan:

```text
if
else if
else
```

untuk menentukan output berdasarkan nilai yang dimasukkan pengguna.

Secara umum:

```text
Input Nilai
    ↓
Cek Kondisi
    |
    +--> Kondisi 1
    |
    +--> Kondisi 2
    |
    └--> Kondisi lainnya
```

---

## Percobaan 3 — Nested If

File:

👉 [seleksi2.java](./seleksi2.java)

Percobaan ini menunjukkan penggunaan percabangan di dalam percabangan lainnya.

Konsep:

```text
Kondisi Pertama
      |
      +--> Kondisi Kedua
      |
      +--> Kondisi Lain
```

---

## Percobaan 4 — Switch-Case

File:

👉 [seleksi3.java](./seleksi3.java)

Percobaan ini menggunakan `switch-case` untuk memilih jenis mata uang dan melakukan perhitungan berdasarkan pilihan pengguna.

Konsep utama:

```text
switch
case
break
default
```

---

# Analisis Percobaan

Bagian analisis digunakan untuk mengamati perilaku program ketika source code dimodifikasi.

---

## Conditional Assignment

Analisis meliputi:

```text
perubahan tipe data
perubahan kondisi
validasi input
```

---

## If-Else

Analisis dilakukan dengan memasukkan beberapa nilai untuk melihat blok kondisi yang dijalankan.

```text
Input
  ↓
Evaluasi Kondisi
  ↓
Output
```

---

## Nested If

Analisis berfokus pada alur program ketika terdapat kondisi bertingkat.

```text
Kondisi Luar
     ↓
Kondisi Dalam
     ↓
Output
```

---

## Switch-Case

Analisis meliputi pengaruh statement:

```java
break;
```

Apabila `break` dihilangkan, eksekusi dapat berlanjut menuju `case` berikutnya.

---

# If-Else vs Switch-Case

## If-Else

`if-else` sesuai digunakan untuk:

```text
rentang nilai
operator perbandingan
lebih dari satu ekspresi logika
kondisi kompleks
```

Contoh:

```text
nilai >= 80

umur > 17

nilai >= 60 && nilai <= 100
```

---

## Switch-Case

`switch-case` sesuai digunakan ketika satu nilai dibandingkan dengan sejumlah pilihan tertentu.

Contoh:

```text
1
2
3
4
5
```

Struktur program biasanya menjadi lebih mudah dibaca apabila pilihan yang tersedia bersifat tetap.

---

# Tugas Praktikum

Terdapat tiga tugas praktikum pada materi Seleksi Kondisi:

```text
1. Perhitungan luas dan keliling bangun datar menggunakan switch-case.
2. Menentukan kategori IMT menggunakan if-else.
3. Menghitung total penghasilan berdasarkan jam kerja.
```

Soal lengkap tersedia pada:

👉 [Tugas Praktikum](./Tugas-Praktikum)

Penyelesaian tugas belum disertakan.

---

# Struktur Folder

```text
Modul 2/
├── README.md
├── constAss.java
├── seleksi1.java
├── seleksi2.java
├── seleksi3.java
│
└── Tugas-Praktikum/
    └── README.md
```

---

# Ringkasan

```text
Seleksi Kondisi
      |
      +--> Conditional Assignment
      |
      +--> If-Else
      |
      +--> Nested If
      |
      +--> Switch-Case
```

Seleksi kondisi memungkinkan program menentukan proses yang harus dijalankan berdasarkan kondisi atau input tertentu.