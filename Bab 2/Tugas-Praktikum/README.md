# Tugas Praktikum — Seleksi Kondisi

Tugas ini merupakan bagian dari materi **Seleksi Kondisi**.

Materi yang digunakan meliputi:

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

Buatlah program menggunakan metode **switch-case** dengan menu:

```text
Menu:
1. menghitung luas dan keliling persegi panjang
2. menghitung luas dan keliling lingkaran
3. menghitung luas dan keliling segitiga
```

Program menerima pilihan dari pengguna dan melakukan perhitungan sesuai pilihan tersebut.

Contoh:

```text
Pilihan anda: 3

Masukkan a: 3
Masukkan b: 4
Masukkan r: 5

Keliling segitiga : 12 cm
Luas segitiga     : 6 cm2
```

Jika pengguna memasukkan pilihan yang tidak tersedia:

```text
Pilihan anda: 10

Data tak ditemukan, program dihentikan ...
```

---

## Ketentuan

Program harus:

```text
1. Menggunakan switch-case.
2. Memiliki tiga pilihan bangun datar.
3. Menerima input sesuai pilihan pengguna.
4. Menghitung luas dan keliling.
5. Menangani pilihan yang tidak tersedia.
```

---

# Tugas 2 — Indeks Massa Tubuh

Buat program untuk menentukan kriteria kegemukan berdasarkan **IMT (Indeks Massa Tubuh)**.

Rumus:

```text
IMT = b / t²
```

dengan:

```text
b = berat badan dalam kilogram
t = tinggi badan dalam meter
```

---

## Kriteria IMT

| Nilai IMT | Kriteria |
|---|---|
| `IMT ≤ 18,5` | Kurus |
| `18,5 < IMT ≤ 25` | Normal |
| `25 < IMT ≤ 30` | Gemuk |
| `IMT > 30` | Kegemukan |

Program dibuat menggunakan metode **if-else**.

---

## Contoh 1

```text
Berat badan (kg) : 45
Tinggi badan (m) : 1.72

IMT = 15,21 Termasuk kurus
```

---

## Contoh 2

```text
Berat badan (kg) : 85
Tinggi badan (m) : 1.71

IMT = 27,76 Termasuk gemuk
```

---

## Ketentuan

Program harus:

```text
1. Menerima berat badan.
2. Menerima tinggi badan.
3. Menghitung IMT.
4. Menentukan kategori IMT.
5. Menggunakan if-else.
6. Menampilkan nilai IMT dan kategorinya.
```

---

# Tugas 3 — Perhitungan Gaji Pegawai

Buat program untuk menghitung total upah pegawai berdasarkan jumlah jam kerja setiap minggu.

Input:

```text
jumlah jam kerja
```

Output:

```text
upah
lembur
denda
total
```

---

## Aturan Upah Normal

Batas kerja maksimal:

```text
60 jam / minggu
```

Upah normal:

```text
Rp5.000 / jam
```

---

## Aturan Lembur

Jika jam kerja melebihi:

```text
60 jam
```

maka kelebihan jam dihitung sebagai lembur.

Upah lembur:

```text
Rp6.000 / jam
```

---

## Aturan Denda

Batas kerja minimal:

```text
50 jam / minggu
```

Jika jam kerja kurang dari 50 jam, pegawai dikenakan denda:

```text
Rp1.000 / jam
```

untuk setiap kekurangan jam.

---

## Contoh 1 — Jam Kerja Normal

```text
Jam kerja : 55
Upah      = Rp. 275000
Lembur    = Rp. 0
Denda     = Rp. 0
--------------------
Total     = Rp. 275000
```

---

## Contoh 2 — Lembur

```text
Jam kerja : 70
Upah      = Rp. 300000
Lembur    = Rp. 60000
Denda     = Rp. 0
--------------------
Total     = Rp. 360000
```

---

## Contoh 3 — Denda

```text
Jam kerja : 40
Upah      = Rp. 200000
Lembur    = Rp. 0
Denda     = Rp. 10000
--------------------
Total     = Rp. 190000
```

---

# Target

Program tugas praktikum Modul 2 harus mampu menerapkan:

```text
Seleksi Kondisi
If-Else
Switch-Case
Operator Perbandingan
Operator Logika
Input
Process
Output
```

---

# Penyelesaian

File penyelesaian tugas belum disertakan dan akan ditambahkan setelah tugas selesai dikerjakan.