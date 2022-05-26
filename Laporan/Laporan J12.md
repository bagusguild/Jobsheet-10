# JOBSHEET 10 PRAKTIKUM ALGORITMA DAN STRUKTUR DATA

Created by : <p>
Bagus Dwi Putranto <p>
1F D4 Teknik Informatika <p>
2141720079 <p>

# 12.2 Kegiatan Praktikum 1 
## 12.2.1 Percobaan 1
1. Perhatikan diagram class Node dan class DoublelinkedLists di bawah ini! Diagram class ini yang selanjutnya akan dibuat sebagai acuan dalam membuat kode program DoubleLinkedLists. <p>
<img src="12.2.1 - 1.png">
<img src="12.2.1 - 1a.png">
2. Buat paket baru dengan nama doublelinkedlists
3. Buat class di dalam paket tersebut dengan nama Node <p>
<img src="12.2.1 - 3.png">
4. Di dalam class tersebut, deklarasikan atribut sesuai dengan diagram class di atas. <p>
<img src="12.2.1 - 4.png">
5. Selanjutnya tambahkan konstruktor default pada class Node sesuai diagram di atas. <p>
<img src="12.2.1 - 5.png">
6. Buatlah sebuah class baru bernama DoubleLinkedLists pada package yang sama dengan node seperti gambar berikut: <p>
<img src="12.2.1 - 6.png">
7. Pada class DoubleLinkedLists tersebut, deklarasikan atribut sesuai dengan diagram class di atas. <p>
<img src="12.2.1 - 7.png">
8. Selajuntnya, buat konstruktor pada class DoubleLinkedLists sesuai gambar berikut. <p>
<img src="12.2.1 - 8.png">
9. Buat method isEmpty(). Method ini digunakan untuk memastikan kondisi linked list kosong. <p>
<img src="12.2.1 - 9.png">
10. Kemudian, buat method addFirst(). Method ini akan menjalankan penambahan data di bagian depan linked list. <p>
<img src="12.2.1 - 10.png">
11.  Selain itu pembuatan method addLast() akan menambahkan data pada bagian belakang linked list. <p>
<img src="12.2.1 - 11.png">
12.  Untuk menambakan data pada posisi yang telah ditentukan dengan indeks, dapat dibuat dengan method add(int item, int index) <p>
<img src="12.2.1 - 12.png">
13. Jumlah data yang ada di dalam linked lists akan diperbarui secara otomatis,sehingga dapat dibuat method size() untuk mendapatkan nilai dari size. <p>
<img src="12.2.1 - 13.png">
14. Selanjutnya dibuat method clear() untuk menghapus semua isi linked lists, sehingga linked lists dalam kondisi kosong. <p>
<img src="12.2.1 - 14.png">
15. Untuk mencetak isi dari linked lists dibuat method print(). Method ini akan mencetak isi linked lists berapapun size-nya. Jika kosong akan dimunculkan suatu pemberitahuan bahwa linked lists dalam kondisi kosong. <p>
<img src="12.2.1 - 15.png">
16. Selanjutya dibuat class Main DoubleLinkedListsMain untuk mengeksekusi semua method yang ada pada class DoubleLinkedLists.<p>
<img src="12.2.1 - 16.png">
17. Pada main class pada langkah 16 di atas buatlah object dari class DoubleLinkedLists kemudian eksekusi potongan program berikut ini. <p>
<img src="12.2.1 - 17.png">

## 12.2.2 Verifikasi Hasil Percobaan
<img src="12.2.2.png">
<img src="12.2.2 - output.png">

## 12.2.3 Pertanyaan Percobaan
1. Jelaskan perbedaan antara single linked list dengan double linked lists!
> : Pada Single Linked Lists memiliki satu pointer yaitu pointer next dan satu arah, sedangkan Double Linked Lists memiliki 2 pointer, yaitu pointer next, prev dan memiliki dua arah.
2. Perhatikan class Node, didalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?
> : Pointer next menunjuk pada node setelahnya dan pointer prev menunjukkan pada node sebelumnya.
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini? <p>
<img src="12.2.3 - 3.png">
> : Head digunakan menunjuk node pertama di dalam linked lists itu sendiri dan size digunakan untuk menentukan jumlah data yang ada di dalam linked lists dan akan diperbarui secara otomatis.
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null? <p>
<img src="12.2.3 - 4.png">
> : Karena saat penambahan data pada bagian sebelum head, data pada bagian head harus dipindahkan dulu ke dalam prev, sehingga inisialisasinya dianggap sama dengan null.
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
> : head.prev menunjuk ke input atau data yang ditambahkan.
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null? <p>
<img src="12.2.3 - 6.png">
> : Untuk penentuan node awal yaitu yang berisi current atau prev dan node akhir yang berisi null, kemudian node baru ditambahkan pada posisi lokasi next yang berisi null.


# 12.3 Kegiatan Praktikum 2
## 12.3.1 Tahapan Percobaan
<img src="12.3.1.png"> <p>
1. Buatlah method removeFirst() di dalam class DoubleLinkedLists. <p>
2. Tambahkan method removeLast() di dalam class DoubleLinkedLists. <p>
3. Tambahkan pula method remove(int index) pada class DoubleLinkedLists dan amati hasilnya. <p>
4. Untuk mengeksekusi method yang baru saja dibuat, tambahkan potongan kode program berikut pada main class. <p>

## 12.3.2 Verifikasi Hasil Percobaan
<img src="12.3.2.png"> <p>
<img src="12.2.2 - output.png">

## 12.3.3 Pertanyaan Percobaan
1. Apakah maksud statement berikut pada method removeFirst()?<p>
<img src="12.3.3 - 1.png">
> : head menunjukkan data yang berada di awal sehingga head menunjuk pada head.next kemudian head.next menunjuk head.prev menunjuk ke null dan head sama dengan null sehingga data awal terhapus.
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
> : 
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove! <p>
<img src="12.3.3 - 3.png">
> : 
4. Jelaskan fungsi kode program berikut ini pada fungsi remove! <p>
<img src="12.3.3 - 4.png">
> : 


# 12.4 Kegiatan Praktikum 3
## 12.4.1 Tahapan Percobaan
<img src="12.4.1.png"> <p>
1. Buatlah method getFirst() di dalam class DoubleLinkedLists untuk mendapatkan data pada awal linked lists.
2. Selanjutnya, buatlah method getLast() untuk mendapat data pada akhir linked lists.
3. Method get(int index) di buat untuk mendapatkan data pada indeks tertentu.
4. Pada main class tambahkan potongan program berikut dan amati hasilnya!

## 12.4.2 Verifikasi Hasil Percobaan
<img src="12.4.2.png"> <p>
<img src="12.2.2 - output.png">

## 12.4.3 Pertanyaan Percobaan
1. Jelaskan method size() pada class DoubleLinkedLists!
> : Agar kita bisa tau jumlah data yang linked list saat ini
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1!
> : setiap kita menambahkan data pada dll secara otomatis pula kita menambahkan indeks, indeks memiliki nilai deffault 0
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! 
> : pada sll method add mehanya nambahkan alamat setelah saja, namun pada dll method menambahkan alamat setelah dan sebelum
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini! <p>
<img src="12.4.3 - 4.png">
> : 


# 12.5 Tugas Praktikum
1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang telah divaksinasi di menu Hapus Data(2) harus ada) <p>
Ilustrasi Program <p>
Menu Awal dan Penambahan Data <p>
<img src="12.5 - 1.png"> <p>
Cetak Data (Komponen di area merah harus ada) <p>
<img src="12.5 - 1a.png"> <p>
Hapus Data (Komponen di area merah harus ada) <p>
<img src="12.5 - 1b.png"> <p>
Hasil Output Tugas 1 : <p>
Menu tambah antrian : <p>
<img src="Tambah antrian.png"> <p>
Menu antrian telah selesai : <p>
<img src="antrian selesai.png"> <p>
Menu check antrian : <p>
<img src="check antrian.png"> <p>

2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara 
descending. Class Film wajib diimplementasikan dalam soal ini.<p>
Contoh Ilustrasi Program <p>
<img src="12.5 - 2.png"> <p>
<img src="12.5 - 2a.png"> <p>
Hasil Output tugas 2 : <p>
<img src="t2 1.png"> <p>
<img src="t2 2.png"> <p>
<img src="t2 3.png"> <p>
<img src="t2 4.png"> <p>