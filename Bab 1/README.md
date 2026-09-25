# 01 — Program Input, Output, dan Proses

Bab ini membahas dasar pembuatan program Java yang terdiri dari proses:

```text
Input
  ↓
Process
  ↓
Output
```

Materi meliputi:

```text
Output
Variabel
Tipe Data
Input dengan Scanner
Operator Aritmetika
Formatting Output
```

---

## Tujuan Pembelajaran

Setelah mempelajari bab ini, mahasiswa diharapkan mampu:

- memahami struktur dasar program Java;
- menampilkan output;
- menggunakan variabel dan tipe data;
- menerima input dari pengguna;
- melakukan proses perhitungan sederhana;
- menampilkan hasil program.

---

# Output

Java menyediakan:

```java
System.out.print();
System.out.println();
System.out.printf();
```

untuk menampilkan data.

---

## `print()`

Menampilkan output tanpa berpindah baris.

```java
System.out.print("Hello");
System.out.print(" Java");
```

---

## `println()`

Menampilkan output kemudian berpindah ke baris berikutnya.

```java
System.out.println("Hello World");
```

---

## `printf()`

Digunakan untuk menampilkan output dengan format tertentu.

```java
System.out.printf("%s%n", "Pemrograman Java");
```

---

# Variabel dan Tipe Data

Variabel digunakan untuk menyimpan sebuah nilai.

Contoh:

```java
int nilai = 10;
double nilai2 = 5.3;
String teks = "Belajar Java";
```

Beberapa tipe data yang digunakan:

| Tipe | Contoh |
|---|---|
| `int` | `10` |
| `double` | `5.3` |
| `float` | `3.14F` |
| `char` | `'A'` |
| `boolean` | `true` |
| `String` | `"Java"` |

---

# Input

Input dari pengguna dapat diterima menggunakan class:

```java
Scanner
```

Import:

```java
import java.util.Scanner;
```

Membuat object Scanner:

```java
Scanner input = new Scanner(System.in);
```

Membaca integer:

```java
int nilai = input.nextInt();
```

---

# Process

Data yang telah diterima dapat diproses menggunakan operator.

```text
+  Penjumlahan
-  Pengurangan
*  Perkalian
/  Pembagian
%  Modulus
```

Contoh:

```java
hasil = nilai1 + nilai2;
```

---

# Percobaan

## Percobaan 1 — Output Dasar

👉 [Output1.java](./Output1.java)

Menampilkan:

```text
Hello World
```

---

## Percobaan 2 — Penggabungan Output

👉 [Output2.java](./Output2.java)

Mempelajari penggunaan `println()` dan penggabungan String.

---

## Percobaan 3 — Formatting String

👉 [Output3.java](./Output3.java)

Mempelajari penggunaan:

```java
System.out.printf();
```

beserta pengaturan lebar output dan jumlah karakter.

---

## Percobaan 4 — Formatting Angka

👉 [Output4.java](./Output4.java)

Mempelajari formatting nilai integer dan floating point.

---

## Percobaan 5 — Variabel

👉 [Variabel.java](./Variabel.java)

Mempelajari:

```text
variabel
tipe data
operasi nilai
String
```

---

## Percobaan 6 — Input

👉 [Input.java](./Input.java)

Mempelajari penerimaan input menggunakan:

```java
Scanner
```

---

# Tugas Praktikum

Soal dan penyelesaian tersedia pada:

👉 [Tugas Praktikum](./TugasPraktikum)

---

# Struktur Folder

```text
Bab 1/
├── README.md
├── Input.java
├── Output1.java
├── Output2.java
├── Output3.java
├── Output4.java
├── Variabel.java
│
└── TugasPraktikum/
    ├── README.md
    └── Tugas1.java
```

---

# Ringkasan

```text
Input
  ↓
Variabel
  ↓
Process
  ↓
Output
```

Konsep Input–Process–Output menjadi dasar bagi program yang lebih kompleks pada bab berikutnya.