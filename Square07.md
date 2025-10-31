1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan
perulangan dalam, Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
3. Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang
berada didalamnya?
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
5. Silakan commit dan push ke repository Anda.

Jawab : 
1. Program akan mencetak 1 baris bintang lebih banyak dari seharusnya,maka perulangan dimulai dari 0. 
Karena nilai iOuter dimulai dari 0, maka perulangan berjalan sebanyak 6 kali
2. Setiap baris akan mencetak 1 bintang lebih banyak,Karena loop dalam berjalan dari 0 sampai.
Karena indeks dimulai dari 0, jadi loop berjalan 6 kali
3. Perulangan luar berfungsi untuk mengatur jumlah baris yang akan ditampilkan, sedangkan perulangan dalam berfungsi untuk mengatur jumlah kolom atau banyaknya bintang pada setiap baris.
4. Untuk pindah ke baris baru setelah satu baris bintang selesai dicetak.
Tanpa "println()", semua bintang dari seluruh perulangan akan tercetak di baris yang sama.
