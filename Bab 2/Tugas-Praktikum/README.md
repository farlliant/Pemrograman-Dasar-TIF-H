# Tugas Praktikum — Seleksi Kondisi

Tugas praktikum ini merupakan bagian dari **Bab 2 — Seleksi Kondisi**.

Konsep utama yang digunakan:

```text
If-Else
Nested If
Switch-Case
Operator Perbandingan
Operator Logika
Input dan Output
```

---

# Tugas 1 — Perhitungan Bangun Datar

Buat program menggunakan **switch-case** dengan menu:

```text
Menu:
1. menghitung luas dan keliling persegi panjang
2. menghitung luas dan keliling lingkaran
3. menghitung luas dan keliling segitiga
```

Program menerima pilihan pengguna kemudian melakukan perhitungan sesuai bangun datar yang dipilih.

Contoh dari modul:

```text
Pilihan anda: 3
Masukkan a: 3
Masukkan b: 4
Masukkan r: 5

Keliling segitiga : 12 cm
Luas segitiga     : 6 cm2
```

Jika pilihan tidak tersedia:

```text
Pilihan anda: 10

Data tak ditemukan, program dihentikan ...
```

---

## Implementasi

Source code:

👉 [Tugas1.java](./Tugas1.java)

Program menggunakan:

```text
switch
case
break
default
```

Alurnya:

```text
Input Pilihan
     ↓
   switch
     |
     +--> 1 → Persegi Panjang
     |
     +--> 2 → Lingkaran
     |
     +--> 3 → Segitiga
     |
     └--> default → Data tidak ditemukan
```

---

# Tugas 2 — Indeks Massa Tubuh

Program digunakan untuk menentukan kriteria kegemukan menggunakan **IMT (Indeks Massa Tubuh)**.

Rumus:

```text
IMT = b / t²
```

dengan:

```text
b = berat badan (kg)
t = tinggi badan (m)
```

---

## Kriteria IMT

| Nilai IMT | Kriteria |
|---|---|
| `IMT ≤ 18,5` | Kurus |
| `18,5 < IMT ≤ 25` | Normal |
| `25 < IMT ≤ 30` | Gemuk |
| `IMT > 30` | Kegemukan |

Program harus menggunakan **if-else**.

Contoh:

```text
Berat badan (kg) : 45
Tinggi badan (m) : 1.72

IMT = 15,21 Termasuk kurus
```

Contoh lainnya:

```text
Berat badan (kg) : 85
Tinggi badan (m) : 1.71

IMT = 27,76 Termasuk gemuk
```

---

## Implementasi

Source code:

👉 [Tugas2.java](./Tugas2.java)

Alur:

```text
Input berat
     ↓
Input tinggi
     ↓
Hitung IMT
     ↓
   if-else
     |
     +--> Kurus
     +--> Normal
     +--> Gemuk
     └--> Kegemukan
```

---

# Tugas 3 — Perhitungan Gaji Pegawai

Program menerima:

```text
jumlah jam kerja setiap minggu
```

dan menghasilkan:

```text
upah
lembur
denda
total
```

---

## Aturan Penggajian

Upah normal:

```text
Rp5.000 / jam
```

Batas kerja maksimal:

```text
60 jam / minggu
```

Jika jam kerja melebihi 60 jam:

```text
kelebihan jam = lembur
upah lembur   = Rp6.000 / jam
```

Batas kerja minimal:

```text
50 jam / minggu
```

Jika jam kerja kurang dari 50 jam:

```text
denda = Rp1.000 / jam kekurangan
```

---

## Contoh — 55 Jam

```text
Jam kerja : 55
Upah      = Rp. 275000
Lembur    = Rp. 0
Denda     = Rp. 0
--------------------
Total     = Rp. 275000
```

## Contoh — 70 Jam

```text
Jam kerja : 70
Upah      = Rp. 300000
Lembur    = Rp. 60000
Denda     = Rp. 0
--------------------
Total     = Rp. 360000
```

## Contoh — 40 Jam

```text
Jam kerja : 40
Upah      = Rp. 200000
Lembur    = Rp. 0
Denda     = Rp. 10000
--------------------
Total     = Rp. 190000
```

---

## Implementasi

Source code:

👉 [Tugas3.java](./Tugas3.java)

Alurnya:

```text
Input Jam Kerja
      ↓
   > 60 jam?
   /       \
 Ya        Tidak
 |           |
Lembur    Upah Normal
             |
          < 50 jam?
          /      \
        Ya       Tidak
        |
      Denda
          \      /
           \    /
          Hitung Total
```

---

# Struktur Folder

```text
Tugas-Praktikum/
├── README.md
├── Tugas1.java
├── Tugas2.java
└── Tugas3.java
```

---

# Ringkasan

Tugas Praktikum Bab 2 menerapkan tiga bentuk penggunaan seleksi kondisi:

```text
Tugas 1
   ↓
Switch-Case

Tugas 2
   ↓
If-Else

Tugas 3
   ↓
If-Else dan Nested If
```

Ketiga tugas tersebut menerapkan pola dasar:

```text
Input
  ↓
Evaluasi Kondisi
  ↓
Process
  ↓
Output
```