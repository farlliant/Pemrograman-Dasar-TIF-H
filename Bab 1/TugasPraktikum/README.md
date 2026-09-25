# Tugas Praktikum — Modul 1

Tugas praktikum pada Modul 1 merupakan implementasi dari materi **Program Input, Output, dan Proses** menggunakan bahasa pemrograman Java.

Pada tugas ini digunakan beberapa konsep dasar:

1. Input
2. Output
3. Variabel dan Tipe Data
4. Operator Aritmetika
5. Proses Perhitungan

---

## Tujuan Pembelajaran

Setelah mengerjakan tugas praktikum ini, mahasiswa diharapkan mampu:

- menerima input dari pengguna;
- menyimpan data ke dalam variabel;
- menggunakan tipe data yang sesuai;
- melakukan operasi aritmetika;
- memproses data masukan;
- menampilkan hasil program.

---

# Tugas

## Tugas 1 — Operasi Aritmetika

Membuat program yang menerima dua buah nilai dari pengguna.

Program kemudian melakukan operasi:

1. Penjumlahan
2. Pengurangan
3. Perkalian
4. Pembagian

Contoh input:

    Masukkan operator pertama : 3
    Masukkan operator kedua : 2

Contoh output:

    Hasil penjumlahan : 5
    Hasil pengurangan : 1
    Hasil perkalian : 6
    Hasil pembagian : 1.5

---

# Penyelesaian

File:

👉 [Tugas1.java](./Tugas1.java)

Secara umum alur penyelesaian adalah:

    Input Nilai Pertama
            ↓
    Input Nilai Kedua
            ↓
      Proses Aritmetika
            ↓
    ┌──────────────────┐
    │ Penjumlahan      │
    │ Pengurangan      │
    │ Perkalian        │
    │ Pembagian        │
    └──────────────────┘
            ↓
      Menampilkan Hasil

Program menggunakan `Scanner` untuk menerima input dari pengguna.

Nilai yang diterima kemudian disimpan di dalam variabel dan diproses menggunakan operator aritmetika.

| Operator | Fungsi |
|:---:|---|
| `+` | Penjumlahan |
| `-` | Pengurangan |
| `*` | Perkalian |
| `/` | Pembagian |

---

## Tugas 2 — Perhitungan Pemakaian Listrik

Membuat program sederhana untuk menghitung pemakaian listrik berdasarkan data pelanggan.

Data yang digunakan meliputi:

- nama pelanggan;
- kelurahan;
- posisi awal KWh meter;
- posisi akhir KWh meter;
- biaya beban;
- PPJ.

Contoh input:

    Nama                         : Bpk Asisten
    Kelurahan                    : Java
    Posisi awal Kwh Meter        : 8000
    Posisi akhir Kwh Meter       : 9000
    Biaya beban saat ini         : 140
    PPJ                           : 10

Pemakaian listrik dihitung dengan:

    Pemakaian = Posisi Akhir KWh - Posisi Awal KWh

Contoh:

    Pemakaian = 9000 - 8000
              = 1000 KWh

Program kemudian menghitung biaya penggunaan listrik dan menampilkan hasil perhitungan kepada pengguna.

---

# Konsep yang Digunakan

Konsep utama pada tugas praktikum Modul 1:

    Input
      ↓
    Scanner
      ↓
    Variabel
      ↓
    Proses
      ↓
    Output

---

# Struktur Folder

    TugasPraktikum/
    ├── README.md
    └── Tugas1.java

---

# Ringkasan

Tugas praktikum Modul 1 menerapkan pola dasar pemrograman:

    Input
      ↓
    Process
      ↓
    Output

Data diterima dari pengguna, disimpan ke dalam variabel, diproses menggunakan operasi yang diperlukan, kemudian hasilnya ditampilkan kembali sebagai output program.

Konsep tersebut menjadi dasar untuk implementasi program yang lebih kompleks pada modul berikutnya.
