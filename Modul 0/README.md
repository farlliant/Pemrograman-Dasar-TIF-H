# 00 — Computational Thinking dan Algoritma

Materi ini membahas dasar penyelesaian permasalahan komputasional menggunakan **Computational Thinking**, analisis masalah menggunakan **Tabel IPO**, perancangan **algoritma**, **pseudocode**, dan **flowchart**, serta pengujian logika menggunakan **Desk Checking** dan **Trace Table**.

Materi ini menjadi fondasi sebelum solusi diimplementasikan ke dalam bahasa pemrograman.

---

## Tujuan Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:

- menerapkan empat pilar Computational Thinking;
- menyusun analisis masukan dan keluaran menggunakan Tabel IPO;
- menentukan normal case, boundary case, dan invalid case;
- merancang solusi algoritma yang terstruktur;
- merepresentasikan algoritma menggunakan pseudocode;
- membuat flowchart yang ekuivalen dengan algoritma;
- melakukan Desk Checking;
- menyusun Trace Table untuk melacak perubahan nilai selama algoritma berjalan.

---

# Computational Thinking

Computational Thinking merupakan proses berpikir dalam memformulasikan suatu masalah dan menyusun solusi sehingga solusi tersebut dapat direpresentasikan secara sistematis dan dapat dijalankan oleh manusia maupun komputer.

Computational Thinking memiliki empat pilar utama:

```text
Computational Thinking
        |
        +--> Dekomposisi
        |
        +--> Pengenalan Pola
        |
        +--> Abstraksi
        |
        +--> Perancangan Algoritma
```

---

## 1. Dekomposisi

Dekomposisi merupakan proses memecah suatu permasalahan besar atau kompleks menjadi submasalah yang lebih kecil dan lebih mudah dikelola.

```text
Masalah Besar
     |
     +--> Submasalah 1
     +--> Submasalah 2
     +--> Submasalah 3
     └--> Submasalah ...
```

Dengan memecah masalah, proses analisis dan penyelesaian dapat dilakukan secara lebih terstruktur.

---

## 2. Pengenalan Pola

Pengenalan pola atau **Pattern Recognition** digunakan untuk mengidentifikasi:

```text
kesamaan
karakteristik yang berulang
aturan tertentu
```

dari beberapa masalah atau submasalah.

Pola yang ditemukan dapat digunakan untuk menyusun solusi yang lebih efisien.

---

## 3. Abstraksi

Abstraksi merupakan proses menyaring informasi dengan berfokus pada bagian yang penting dan mengabaikan detail yang tidak relevan terhadap penyelesaian masalah.

```text
Informasi Lengkap
       ↓
Pilih Informasi Penting
       ↓
Hilangkan Detail Tidak Relevan
       ↓
Model Permasalahan
```

---

## 4. Perancangan Algoritma

Perancangan algoritma merupakan proses menyusun urutan instruksi yang:

```text
logis
terstruktur
jelas
sistematis
```

untuk menyelesaikan suatu permasalahan.

---

# Analisis Domain Masalah dan Tabel IPO

Tabel **IPO (Input-Process-Output)** digunakan sebagai alat analisis awal untuk memetakan transformasi data di dalam suatu sistem.

```text
Input
  ↓
Process
  ↓
Output
```

---

## Input

Input merupakan data mentah atau variabel awal yang diperlukan oleh sistem.

Contoh:

```text
totalBelanja
statusMember
panjang
lebar
nilai
```

---

## Process

Process merupakan algoritma atau proses transformasi yang mengubah input menjadi output.

Proses dapat berupa:

```text
perhitungan matematika
validasi kondisi
manipulasi data
aturan bisnis
```

---

## Output

Output merupakan hasil akhir setelah data diproses.

Contoh:

```text
totalBayar
luas
status kelulusan
jenis bilangan
```

---

# Klasifikasi Kasus Pengujian

Dalam analisis masalah, data pengujian dapat dikategorikan menjadi:

```text
Normal Case
Boundary Case
Invalid Case
```

---

## Normal Case

Normal Case merupakan data masukan yang berada di dalam domain normal dan memenuhi spesifikasi sistem.

Contoh:

```text
totalBelanja = 750000
statusMember = ya
```

---

## Boundary Case

Boundary Case merupakan data masukan yang berada tepat pada batas suatu aturan atau kondisi.

Contoh:

```text
Minimal belanja = 500000

Input:
500000
```

Boundary Case penting untuk menguji operator:

```text
>
>=
<
<=
```

---

## Invalid Case

Invalid Case merupakan data yang berada di luar domain yang diperbolehkan.

Contoh:

```text
nilai negatif
tipe data tidak sesuai
pembagian dengan nol
```

Input seperti ini perlu ditangani agar program tidak menghasilkan hasil yang salah atau berhenti secara tidak terkontrol.

---

# Contoh Analisis IPO — Diskon Member

Studi kasus:

```text
Toko online memberikan diskon 10%
kepada member yang berbelanja minimal Rp500.000.

Selain itu tidak ada diskon.
```

Input:

```text
totalBelanja
statusMember
```

Proses:

```text
Jika:
statusMember = "ya"
DAN
totalBelanja >= 500000

maka:
potongan = 10% × totalBelanja

Jika tidak:
potongan = 0

totalBayar = totalBelanja - potongan
```

Output:

```text
totalBayar
```

Contoh:

```text
totalBelanja = 600000
statusMember = ya

potongan = 10% × 600000
          = 60000

totalBayar = 600000 - 60000
           = 540000
```

---

# Algoritma

Algoritma merupakan langkah-langkah sistematis yang dirancang untuk menyelesaikan suatu masalah atau mencapai tujuan tertentu.

Algoritma harus memiliki beberapa karakteristik.

---

## Finiteness

Algoritma harus memiliki akhir.

```text
Mulai
  ↓
Proses
  ↓
Selesai
```

---

## Definiteness

Setiap langkah algoritma harus didefinisikan dengan jelas dan tidak ambigu.

---

## Input dan Output

Algoritma dapat menerima:

```text
Input
```

dan menghasilkan:

```text
Output
```

---

## Efektivitas

Setiap langkah algoritma harus dapat dilaksanakan dalam waktu yang terbatas.

---

# Pseudocode

Pseudocode merupakan representasi algoritma dalam bentuk tulisan yang menyerupai kode program tetapi tidak terikat pada sintaks bahasa pemrograman tertentu.

Contoh struktur:

```text
Algorithm NamaAlgoritma

Input:
    data masukan

Output:
    hasil

begin
    proses
end
```

Pseudocode digunakan untuk membantu menyusun logika sebelum masuk ke tahap implementasi program.

---

# Flowchart

Flowchart merupakan representasi grafis dari algoritma menggunakan simbol-simbol tertentu.

Flowchart membantu memvisualisasikan:

```text
proses
keputusan
input
output
alur data
```

---

## Simbol Dasar Flowchart

| Simbol | Fungsi |
|---|---|
| Terminator | Menunjukkan awal atau akhir |
| Process | Menunjukkan proses atau operasi |
| Input / Output | Menunjukkan masukan atau keluaran |
| Decision | Menunjukkan keputusan atau kondisi |
| Preparation | Menunjukkan persiapan atau inisialisasi |
| Line / Arrow | Menunjukkan arah aliran |
| Connector | Menghubungkan bagian flowchart dalam halaman |
| Off-page Connector | Menghubungkan bagian pada halaman berbeda |
| Predefined Process | Menunjukkan proses atau subroutine yang telah didefinisikan |

---

# Contoh 1 — Menghitung Luas Persegi Panjang

Deskripsi:

```text
Menghitung luas persegi panjang
berdasarkan panjang dan lebar.
```

Input:

```text
panjang
lebar
```

Proses:

```text
luas = panjang × lebar
```

Output:

```text
luas
```

Algoritma:

```text
1. Mulai.
2. Masukkan nilai panjang.
3. Masukkan nilai lebar.
4. Hitung luas = panjang × lebar.
5. Tampilkan luas.
6. Selesai.
```

Pseudocode:

```text
Algorithm MenghitungLuasPersegiPanjang

Input: panjang, lebar
Output: luas

begin
    Input panjang, lebar
    luas ← panjang × lebar
    Output luas
end
```

Alur:

```text
Mulai
  ↓
Input panjang
  ↓
Input lebar
  ↓
luas = panjang × lebar
  ↓
Output luas
  ↓
Selesai
```

---

# Contoh 2 — Menentukan Bilangan Ganjil atau Genap

Deskripsi:

```text
Menentukan apakah sebuah bilangan
merupakan bilangan ganjil atau genap.
```

Input:

```text
sebuah bilangan
```

Proses:

```text
Jika bilangan habis dibagi 2
    → Genap

Jika tidak
    → Ganjil
```

Output:

```text
jenis bilangan
```

Pseudocode:

```text
Algorithm MenentukanGanjilGenap

Input: number
Output: jenis bilangan

begin
    Input number

    if number % 2 = 0 then
        Output "Bilangan Genap"
    else
        Output "Bilangan Ganjil"
    end if
end
```

---

# Contoh 3 — Perhitungan Total Bayar

Studi kasus:

```text
Toko online memberikan diskon 10%
kepada member yang berbelanja minimal Rp500.000.

Selain itu tidak ada diskon.
```

Algoritma:

```text
1. Input totalBelanja dan statusMember.
2. Jika statusMember = "ya"
   dan totalBelanja >= 500000:
       potongan = 10% × totalBelanja
3. Jika tidak:
       potongan = 0
4. totalBayar = totalBelanja - potongan
5. Output totalBayar
6. Selesai
```

---

# Desk Checking

Desk Checking merupakan teknik pengujian algoritma secara manual dengan menelusuri setiap instruksi dari awal hingga akhir.

Tujuannya adalah memverifikasi bahwa algoritma menghasilkan output sesuai aturan yang telah ditentukan.

Skenario pengujian sebaiknya mencakup:

```text
Normal Case
Boundary Case
Invalid Case
```

Contoh kasus diskon:

| Skenario | totalBelanja | Member | Output | Kategori |
|---|---:|:---:|---:|---|
| Belanja besar, member | 750000 | ya | 675000 | Normal |
| Belanja kecil, member | 250000 | ya | 250000 | Normal |
| Tepat di ambang batas | 500000 | ya | 450000 | Boundary |
| Satu rupiah di bawah batas | 499999 | ya | 499999 | Boundary |
| Bukan member | 500000 | tidak | 500000 | Boundary |
| Nilai negatif | -50000 | ya | Ditolak | Invalid |
| Tipe data salah | "lima ribu" | ya | Ditolak | Invalid |

---

# Trace Table

Trace Table digunakan untuk mencatat perubahan nilai variabel, evaluasi kondisi, dan keluaran pada setiap langkah algoritma.

Tujuannya:

```text
memverifikasi logika
mendeteksi kesalahan
mengamati perubahan variabel
membuktikan hasil Desk Checking
```

---

## Contoh Trace Table — Total Bayar

| Kasus | totalBelanja | Member | Kondisi | potongan | totalBayar |
|:---:|---:|:---:|---|---:|---:|
| 1 | 750000 | ya | True AND True → True | 75000 | 675000 |
| 2 | 250000 | ya | True AND False → False | 0 | 250000 |
| 3 | 500000 | ya | True AND True → True | 50000 | 450000 |

---

# Contoh Trace Table Perulangan

Masalah:

```text
Menjumlahkan angka dari 1 sampai n
```

Dengan:

```text
n = 5
```

Pseudocode:

```text
n ← 5
jumlah ← 0
i ← 1

while i ≤ n do
    jumlah ← jumlah + i
    i ← i + 1
end while

Output jumlah
```

Trace:

| Iterasi | i Awal | i ≤ 5 | Proses | jumlah Baru | i Akhir |
|:---:|:---:|:---:|---|---:|---:|
| Inisialisasi | 1 | - | - | 0 | - |
| 1 | 1 | Ya | 0 + 1 | 1 | 2 |
| 2 | 2 | Ya | 1 + 2 | 3 | 3 |
| 3 | 3 | Ya | 3 + 3 | 6 | 4 |
| 4 | 4 | Ya | 6 + 4 | 10 | 5 |
| 5 | 5 | Ya | 10 + 5 | 15 | 6 |
| 6 | 6 | Tidak | Berhenti | 15 | - |

---

# Data dan Analisis Hasil Percobaan

Pada bagian analisis terdapat beberapa studi kasus.

---

## Studi Kasus 1 — Voucher Belanja

Ketentuan:

```text
Diskon voucher = 15%
Minimal pembelian = Rp150.000
Maksimal diskon = Rp50.000
Hanya berlaku untuk kategori "Elektronik"
Akun harus berusia minimal 30 hari
Voucher tidak dapat digabung dengan promo lain
```

---

## Studi Kasus 2 — Pengambilan SKS

```text
IPK ≥ 3,00       → maksimal 24 SKS
IPK 2,50–2,99    → maksimal 21 SKS
IPK 2,00–2,49    → maksimal 18 SKS
IPK < 2,00        → maksimal 15 SKS
```

Mahasiswa semester 1 tidak diperbolehkan mengambil mata kuliah pilihan.

---

## Studi Kasus 3 — Ongkos Kirim

```text
Gratis ongkir jika:
total belanja ≥ Rp200.000
DAN
berat ≤ 3 kg

Jika berat > 3 kg:
Rp5.000 per kg kelebihan

Pengiriman ke luar Jawa:
tambahan tetap Rp15.000
```

---

## Studi Kasus 4 — Pengajuan Kredit

```text
Usia 21–55 tahun
Penghasilan minimal Rp3.000.000
Cicilan maksimal 30% dari penghasilan
Masa kerja minimal 2 tahun
```

---

## Studi Kasus 5 — Kelulusan Mata Kuliah

```text
Nilai akhir = 40% × UTS + 60% × UAS

Lulus jika:
nilai akhir ≥ 60
DAN
kehadiran ≥ 75%

Predikat A:
nilai akhir ≥ 90
dan kehadiran ≥ 75%
```

---

# Alur Analisis

Untuk setiap studi kasus:

```text
Analisis Masalah
      ↓
Susun Tabel IPO
      ↓
Buat Pseudocode
      ↓
Buat Flowchart
      ↓
Desk Checking
      ↓
Susun Trace Table
```

---

# Tugas Praktikum

Bagian **Tugas Praktikum** tersedia pada akhir modul.

Namun rincian soal tidak dicantumkan pada dokumen Modul 0 yang tersedia.

👉 [Tugas Praktikum](./Tugas-Praktikum)

---

# Struktur Folder

```text
Modul 0/
├── README.md
└── Tugas-Praktikum/
    └── README.md
```

---

# Ringkasan

```text
Computational Thinking
        |
        +--> Dekomposisi
        +--> Pengenalan Pola
        +--> Abstraksi
        +--> Perancangan Algoritma
                    |
                    v
                Tabel IPO
                    |
                    v
               Algoritma
                    |
          +---------+---------+
          |                   |
          v                   v
      Pseudocode          Flowchart
          |                   |
          +---------+---------+
                    |
                    v
              Desk Checking
                    |
                    v
               Trace Table
```

Materi ini menjadi dasar untuk menganalisis masalah, merancang solusi, dan memverifikasi logika sebelum solusi diimplementasikan ke dalam program.