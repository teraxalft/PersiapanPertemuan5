# PersiapanPertemuan5

## Apa itu Multithreading?
Multithreading adalah teknik yang membagi program berurutan menjadi sejumlah aliran instruksi yang lebih kecil (thread) yang dapat dieksekusi secara paralel dengan tetap menjaga inti prosesor yang berbeda dalam CMP tetap sibuk secara bersamaan.
Multithreading adalah kemampuan suatu program atau sistem operasi untuk mendukung lebih dari satu pengguna pada satu waktu tanpa memerlukan beberapa salinan program yang berjalan di komputer. Multithreading juga dapat menangani beberapa permintaan dari pengguna yang sama.

**Contoh multithreading:**
Multithreading digunakan dalam banyak konteks yang berbeda. Salah satu contohnya adalah ketika data dimasukkan ke dalam spreadsheet dan digunakan untuk aplikasi real-time.

## Perbedaan Thread dan Runnable
**Pengertian Thread:**
Thread merupakan sebuah pengontrol aliran program. Untuk lebih mudahnya, bayangkanlah thread sebagai sebuah proses yang akan dieksekusi didalam sebuah program tertentu. Penggunaan sistem operasi modern saat ini telah mendukung kemampuan untuk menjalankan beberapa program. 

**Pengertian Runnable:**
Runnable adalah status thread yang siap dijalankan atau sedang berjalan, tetapi menunggu alokasi sumber daya

**Perbedaan kelas Thread dan Runnable pada java:**
1. Didalam kelas thread pada java, kita tidak bisa memperpanjang thread yang telah kita buat. Dikarenakan java sendiri tidak mendukung banyak turunan layaknya bahasa
pemrograman lain seperti C++. Maka dari itu, implementasi kelas Runnable lebih dianjurkan dikarenakan kita lebih diberi kebebasan untuk memperpanjang kelas sebanyak yang kita mau.
2. Ketika kita menggunakan kelas Runnable, kita mendapatkan kebebasan untuk menggunakan kembali behavior class yang sudah tidak terpakai. Berbeda dengan
thread class, behavior yang sudah tidak terpakai tidak akan dapat unutk di gunakan lagi.
3. Runnable thread lebih cocok bagi programmer yang berorientasi objek

## Penggunaan Thread.sleep()
**Pengertian Thread.sleep()**
Metode Java Thread.sleep() dapat digunakan untuk menghentikan sementara eksekusi thread saat ini selama waktu tertentu dalam milidetik.

**Cara Kerja**
Thread.sleep() berinteraksi dengan penjadwal thread untuk menempatkan thread saat ini dalam status tunggu selama periode waktu tertentu. Setelah waktu tunggu berakhir, status thread diubah ke status yang dapat dijalankan dan menunggu CPU untuk eksekusi lebih lanjut. Waktu sebenarnya thread saat ini tidur bergantung pada penjadwal thread yang merupakan bagian dari sistem operasi.

