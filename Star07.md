1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya?
Mengapa bisa demikian?
2. Jika pada perulangan for, kondisi i <= N diubah menjadi i > N, apa akibatnya? Mengapa
bisa demikian?
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i -- apa akibatnya? Mengapa bisa demikian?

Jawab : 
1. Program akan mencetak bintang satu kali lebih banyak, karena program dimulai dari i = 0
2. Perulangan tidak akan berjalan sama sekali dan tidak ada bintang yang dicetak, Karena pada awalnya i = 1, sedangkan i > N bernilai false (misalnya jika N = 5, maka 1 > 5 salah).
3. Terjadi perulangan tak terbatas (infinite loop) dan program tidak akan berhenti kecuali dihentikan secara paksa
