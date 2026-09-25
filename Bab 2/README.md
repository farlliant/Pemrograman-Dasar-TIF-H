# 02 — Seleksi Kondisi

Bab ini membahas **seleksi kondisi**, yaitu mekanisme yang memungkinkan program menentukan perintah yang dijalankan berdasarkan kondisi tertentu.

Materi utama:

```text
Conditional Assignment
If-Else
Nested If
Switch-Case
```

---

## Tujuan Pembelajaran

Setelah mempelajari bab ini, mahasiswa diharapkan mampu:

- memahami conditional assignment;
- menggunakan `if-else`;
- menggunakan percabangan bertingkat atau nested if;
- menggunakan `switch-case`;
- menentukan struktur seleksi yang sesuai dengan permasalahan.

---

# Conditional Assignment

Conditional assignment digunakan untuk memberikan sebuah nilai berdasarkan suatu kondisi.

Bentuk dasar:

```text
variabel = kondisi ? nilai_jika_benar : nilai_jika_salah
```

Contoh:

```java
String hasil = kondisi ? "Berhasil" : "Gagal";
```

Alur:

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

---

# If-Else

`if-else` digunakan untuk menentukan blok program berdasarkan suatu kondisi.

```java
if (kondisi) {
    // kondisi benar
} else {
    // kondisi salah
}
```

Untuk beberapa kondisi:

```java
if (kondisi1) {
    ...
} else if (kondisi2) {
    ...
} else {
    ...
}
```

---

# Nested If

Nested if merupakan struktur `if` yang berada di dalam `if` lainnya.

```java
if (kondisi1) {
    if (kondisi2) {
        ...
    } else {
        ...
    }
}
```

Digunakan apabila kondisi berikutnya hanya perlu diperiksa setelah kondisi sebelumnya terpenuhi.

---

# Switch-Case

`switch-case` digunakan untuk memilih salah satu dari beberapa kemungkinan berdasarkan sebuah nilai.

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

---

## Fungsi `break`

`break` menghentikan eksekusi setelah suatu `case` selesai dijalankan.

```java
break;
```

Jika `break` tidak digunakan, eksekusi dapat berlanjut menuju `case` berikutnya.

Hal tersebut disebut:

```text
fall-through
```

---

# Percobaan

## Percobaan 1 — Conditional Assignment

Source code:

👉 [constAss.java](./constAss.java)

Konsep:

```text
condition ? trueValue : falseValue
```

---

## Percobaan 2 — If-Else

Source code:

👉 [seleksi1.java](./seleksi1.java)

Konsep:

```text
if
else if
else
```

---

## Percobaan 3 — Nested If

Source code:

👉 [seleksi2.java](./seleksi2.java)

Konsep:

```text
if
  └── if
```

---

## Percobaan 4 — Switch-Case

Source code:

👉 [seleksi3.java](./seleksi3.java)

Konsep:

```text
switch
case
break
default
```

---

# If-Else vs Switch-Case

## If-Else

Cocok untuk:

```text
rentang nilai
operator perbandingan
kondisi kompleks
beberapa ekspresi logika
```

Contoh:

```text
nilai >= 80

nilai >= 60 && nilai <= 100
```

---

## Switch-Case

Cocok ketika satu nilai dibandingkan dengan sejumlah pilihan tertentu.

Contoh:

```text
1
2
3
4
5
```

---

# Tugas Praktikum

Terdapat tiga tugas praktikum:

```text
1. Menghitung luas dan keliling bangun datar.
2. Menghitung dan menentukan kategori IMT.
3. Menghitung upah pegawai berdasarkan jam kerja.
```

Soal dan penyelesaian:

👉 [Tugas Praktikum](./Tugas-Praktikum)

---

# Struktur Folder

```text
Bab 2/
├── README.md
├── constAss.java
├── seleksi1.java
├── seleksi2.java
├── seleksi3.java
│
└── Tugas-Praktikum/
    ├── README.md
    ├── Tugas1.java
    ├── Tugas2.java
    └── Tugas3.java
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