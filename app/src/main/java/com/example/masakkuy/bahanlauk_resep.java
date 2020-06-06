package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class bahanlauk_resep extends AppCompatActivity {

    TextView namaResep, bahanResep, caraResep;
    ImageView imgResep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahanlauk_resep);

        namaResep = (TextView)findViewById(R.id.namaResep_lauk);
        bahanResep = (TextView)findViewById(R.id.bahanResep_lauk);
        caraResep = (TextView)findViewById(R.id.caraResep_lauk);
        imgResep = (ImageView) findViewById(R.id.imgResep_lauk);

        String pilihanResep = getIntent().getStringExtra("Nama");

        namaResep.setText(pilihanResep);

        if (pilihanResep.equalsIgnoreCase("Ayam Kecap")){
            bahanResep.setText("-Ayam 500gr \n-Bawang Merah 5 \n-Bawang Putih 3 \n-Jahe Geprek \n-Lada bubuk 1 sdt \n-Cabe rawit 5 \n-Kecap Manis 100ml \n-Air 300ml \n-Minyak goreng \n-Penyedak rasa");
            caraResep.setText("1. Siapkan air mendidih, masukan ayam yang sudah dibersihkan. \n2. Panaskan minyak, tumis bawang merah dan putih serta jahe sampai harum.\n3. Masukan ayam, di koleh koleh sampai berubah warna, masukan cabe, kecap dan air.\n4. Tambahkan lada dan garam, penyedap rasa. Aduk merata biarkan sampai air berkurang.\n5. Siap disajikan. ");
            imgResep.setImageResource(R.drawable.ayamkecap);
        } else if (pilihanResep.equalsIgnoreCase("Ayam Suwir Pedas")){
            bahanResep.setText("-Ayam bagian dada 1 potong\n-Daun salam 2\n-Daun jeruk 5\n-garam dan gula secukupnya\n-Air rebusan ayam 40ml\n-Cabe rawit keriting 6\n-cabe rawit merah 5\n-bawang merah 5\n-bawang putih 4");
            caraResep.setText("1. Ulek halus bahan-bahan bumbu kemudian sisihkan.\n2. Rebus ayam dengan sedikit air, bila sudah keluar hitam-hitamnya,baung airnya. Beri air baru, rebus sampai matang. Suwir-suwir ayam menggunakan garpu kemudian sisihkan.\n3. Tumis bumbu halus bersama daun salam dan daun jeruk hingga wangi. masukan ayam suwir, aduk rata. Tambahkan garam dan gula secukupnya. Beri air rebusan ayam, kecilkan api, aduk hingga bumbu meresap.\n4. Siap di sajikan.");
            imgResep.setImageResource(R.drawable.ayam_suwir_pedas);
        } else if (pilihanResep.equalsIgnoreCase("Ayam Rica Rica")){
            bahanResep.setText("-Ayam 250gr\n-Lemon 1/2 buah\n-Bawang merah dan Bawang putih 3\n-Jahe\n-Tomat 1\n-Sere 2\n-Daun jeruk dan Daun bawang 2\n-Bumbu kaldu bubuk\n-Air 250ml\n-Cabe keriting 10\n-Cabe rawit 6");
            caraResep.setText("1. Bumbui ayam dengan 1sdt garam dan bumbu kladu secukupnya. Aduk dan diamkan sekitar 20 menit.\n2. Bahan yang dihaluskan bisa diblender/ulek.\n3. Goreng ayam setengah matang, hingga berubah warna. Tiriskan.\n4. Goreng bahan yang dihalsukan, daun jeruk serta 2 batang sere dan aduk hingga matang dan tercium wangi.\n5. Masukan air dan tomat serta ayam.\n6. Tutup penggorengan agar bubumnya semakin meresap sekitar 5 sampai 10 menit.\n7. Siap disajikan.");
            imgResep.setImageResource(R.drawable.ayam_ricarica);
        } else if (pilihanResep.equalsIgnoreCase("Ayam Goreng")) {
            bahanResep.setText("-Ayam 500gr \n-Bubuk kunyit dan garam 1/2sdt \n-Bubuk jahe dan Lada putih 1/4sdt \n-Ketumbar, Cabe merah dan bawang putih 1/4sdt \n-Tepung jagung 3sdm \n-Minyak secukupnya ");
            caraResep.setText("1. Cuci ayam terlebih dahulu dan tiriskan. \n2. Tambahkan semua bahan bumbu ke dalam ayam dan aduk sehingga merata, biarkan selama 1 jam.\n3. Tambahkan tepung jagung ke dalam ayam aduk rata kembali dan panaskan minyak..\n4. Goreng ayam hingga kekuningan.\n5. Siap disajikan. ");
            imgResep.setImageResource(R.drawable.ayam_goreng);
        } else if (pilihanResep.equalsIgnoreCase("Ayam Betutu")) {
            bahanResep.setText("-Ayam 1/2kg \n-Bawang merah 8 \n-Bawang putih 4 \n-Daun jeruk dan Daun sere 3 \n-Kencur dan Kemiri 3 \n-Ketumbar \n-Gula dan Garam \n-Kara 1 bungkus \n-Cabe merah ");
            caraResep.setText("1. Bersihkan ayam. \n2. Siapkan semua bumbu, kemudian blender.\n3. Tumis bumbu yang sudah di blender sampai harum dan masukkan dedaunan tadi.\n4. Masukan ayam. Tambahkan santan, gula, garam dan masukan air secukupnya sampai ayam terendam. Masak 45 menit dengan api kecil.\n5. Siap disajikan. ");
            imgResep.setImageResource(R.drawable.ayam_betutu);
        } else if (pilihanResep.equalsIgnoreCase("Telur Kecap")) {
            bahanResep.setText("-Telur ayam 6 \n-Bawang merah dan Bawang putih 4 \n-Cabe merah 2 \n-Tomat 1 \n-Daun bawang 1 \n-Garam 1/2sdt \n-Merica bubuk 1/4sdt \n-Saus tiram 2sdm \n-Kecap manis 4sdm \n-Air 200ml \n-Minyak 1sdm");
            caraResep.setText("1. Panaskan minyak. Tumis bawang putih, bawang merah, cabe merah hingga harum. \n2. Masukkan tomat kemudian aduk rata.\n3. Masukan garam, merica bubuk, saus tiram dan kecap manis.\n4. Tuangkan air. Aduk rata dan masak hingga mendidih.\n5. Masukan telur goreng. Aduk perlahan dan masak hingga kuah mengental dan sedikit menyusut. \n6. Masukan daun bawang kemduian angkat. \n7. Siap disajikan");
            imgResep.setImageResource(R.drawable.telurkecap);
        } else if (pilihanResep.equalsIgnoreCase("Tahu Mercon")) {
            bahanResep.setText("-Tahu 10 \n-Air 2 liter \n-Susu bubuk 1 sdm \n-Minyak goreng 1 liter \n-BAHAN ISI TAHU \n-Wortel 1 \n-Bawang merah dan Bawang putih 2 \n-Cabe rawit 10 \n-Cabe merah keriting 5 \n-Bawang putih 2 siung \n-Kaldu bubuk 1sdt \n-air 50 ml \n-Ketumbar 1/2sdt \n-Garam 1sdt \n-BAHAN TEPUNG \n-Tepung protein tinggi 500gr \n-Tepung maizena 2sdm \n-lada bubuk 1sdt \n-Garam 2 sdt \n-Bawang putih bubuk 2sdt \n-Kaldu bubuk 2sdt \n-Soda kue 1sdt");
            caraResep.setText("1. Kupas wortel, potong ukuran korek api, cuci, sisihkan. \n2. Rebus bawang merah, bawang putih, cabe rawit, cabe keriting. Setelah matang, angkat tiriskan.\n3. Lubangi sebagian tahu, sisihkan. Untuk marinasi, ulek bawang putih, kemudian campur dengan lada bubuk, ketumbar, garam, air, aduk rata. Kemudian celupkan tahu, diamkan sampai meresap.\n4. Untuk bahan tepung, campurkan tepung protein, tepung maizena, lada bubuk, garam, bawang putih bubuk, kaldu bubuk, soda kue, aduk rata, sisihkan..\n5. Ulek bahan rebusan, kemudian campur air dengan susu bubuk, aduk rata. Masukan tahu ke campuran air dan susu, kemudian balurkan ke bahan tepung kering, ulangi sampai 3 kali, sisihkan. \n6. Siapkan minyak dengan suhu tinggi, setelah itu masukan tahu, goreng dengan api sedang. Jika sudah golden brown, angkat tiriskan. \n7. Siap disajikan");
            imgResep.setImageResource(R.drawable.tahu_mercon);
        } else if (pilihanResep.equalsIgnoreCase("Ikan Bumbu Kuning")) {
            bahanResep.setText("-Ikan 1 ekor berukuran besar \n-Bawang merah dan Bawang putih 3 \n-Cabe 10 \n-Jahe dan Kunyit 1 \n-Daun jeruk 5 \n-Daun salam 3 \n-Sere 1 \n-Lemon 1 \n-Air mineral \n-Garam dan Gula secukupnya \n-Merica bubuk 1/4sdt \n-Penyedap rasa 1 sachet \n- Santan kecil 1 \n-Minyak");
            caraResep.setText("1. Haluskan bumbu-bumbu. \n2. Memarkan lengkuas dan sere, peras jeruk dan ambil airnya.\n3. Bersihkan ikan buang sisiknya kemudian goreng ikan setengah matang atau hingga kekuningan.\n4. Tumis bumbu hingga harum lalu masukan semua bumbu kecuali santan.\n5. Masukan air ke bumbu tumis lalu masukan ikan dan santan pastikan api sedang agar santan tidak pecah lalu masukan cabe utuh. \n6. Siap disajikan");
            imgResep.setImageResource(R.drawable.ikan_bumbu_kuning);
        } else if (pilihanResep.equalsIgnoreCase("Daging Lada Hitam")) {
            bahanResep.setText("-Daging 1/2kg \n-Bawang merah dan Bawang putih 4 \n-Bawang bombay 1 \n-Saori lada hitam 1 \n-Cabe merah dan Cabe hijau 3 \n-Garam, Gula pasir, dan Gula merah secukupnya \n-Kaldu jamur \n-Air kaldu 100-200ml \n-Kecap manis 1sdm ");
            caraResep.setText("1. Cuci bersih daging, lalu rebus hingga empuk, potong potong dadu, sisihkan. \n2. Cincang halus semua bahan bumbu. Tumis, Masukan daun salam, daun jeruk, laos, kemudian aduk.\n3. Masukan daging yang sudah dipotong, aduk rata. Kemudian beri garam, gula pasir, gula merah, kecap manis dan kaldu jamur, aduk. Kemudian masukan saori lada hitam lalu aduk hingga rata. beri air. Angkat. \n4. Siap disajikan");
            imgResep.setImageResource(R.drawable.daging_lada_hitam);
        } else if (pilihanResep.equalsIgnoreCase("Udang Balado")) {
            bahanResep.setText("-Udang kupas 1kg \n-1/4kg kentang potong dadu \n-Cabe merah 1/4 kg \n-Tomat 1 \n-1/4kg bawang merah \n-Bawang putih 5 siung \n-Jeruk limau 4 \n-1 buah jeruk nipis \n-Gula dan Garam secukupnya \n-Air secukupnya \n-Minyak secukupnya");
            caraResep.setText("1. Kupas udang, sisakan ekornya. Cuci bersih, lalu beri perasan jeruk nipis untuk mengurangi bau amis. Diamkan 5-10 menit, keumdian bilas udangnya. \n2. Panaskan wajan, masukan minyak. Lalu greng kentang terlebih dahulu, kemudian goreng udang (jangan terlalu kering agar tidak keras). Angkat dan sisihkan. \n3. Minyak bekas menggoreng udang biasanya akan keruh. Untuk menumis bumbu gunakan minyak yang baru. \n4. Haluskan bumbu balado (kecuali jeruk limau), goreng dalam minyak panas.\n5.Setelah bumbu berpori, beri sedikit air. Lalu masukan perasan jeruk limau, gula dan garam.. \n6. Kemudian masukan udang dan kentang, aduk rata. \n7. Siap disajikan");
            imgResep.setImageResource(R.drawable.udang_balado);
        } else if (pilihanResep.equalsIgnoreCase("Cumi Hitam Pedas")) {
            bahanResep.setText("-Cumi segar 500gr \n-Jeruk nipis \n-Bawang merah 8 \n-Bawang putih 5 \n-Cabe Rawit 9 \n-Cabe keriting 5 \n-Daun jeruk 2 lembar \n-Daun bawang \n-Serai 2 batang \n-Daun salam 1 \n-Jahe geprek dan Laos geprek 1 \n-Gula 1sdt \n-Kecap asin 1sdm");
            caraResep.setText("1. Cuci cumi segar, buang tulang putih di dalamnya. Beri perasan jeru nipis dan garam. Rendam 10 menit. \n2. Iris bawang merah, bawang putih, cabe dan daun bawang.\n3. Tumis bumbu, masukan serai, salam, jahe, laos. MAsukan daun bawang, daun jeruk dan daun salam. Masukan gula dan kecap asin.\n4. Masukan cumi. Aduk rata hingga bumbu meresap.\n5. Siap disajikan.");
            imgResep.setImageResource(R.drawable.cumi_hitam);
        } else if (pilihanResep.equalsIgnoreCase("Tempe Penyet")) {
            bahanResep.setText("-Tempe 1 \n-Bawang putih yang sudah halus 2 \n-Ketumbar bubuk 1sdt \n-Garam 1sdt \n-Air 3sdm \n-Minyak goreng secukupnya \n-BAHAN SAMBAL \n-Cabe merah 10 \n-Cabe rawit 8 \n-Bawang putih 3 \n-Bawang merah 5 \n-Tomat merah 1/2 buah \n-Terasi bakar 1sdt \n-Gula merah 1/2sdm \n garam 1sdt");
            caraResep.setText("1. Bumbui tempe dengan bawang putih, ketumbar dan air. Goreng tempe hingga matang, lalu angkat. \n2. Goreng cabe merah, cabe rawit, bawang merah, bawang putih, tomat dan terasi hingga layu.\n3. Ulek dalam cobek semua bahan sambal yang telah digoreng.\n4. Tambahkan gula dan garam, aduk rata.\n5. Masukan tempe goreng, penyet di atasnya. \n6. Siap disajikan");
            imgResep.setImageResource(R.drawable.tempe_penyet);
        }
    }
}
