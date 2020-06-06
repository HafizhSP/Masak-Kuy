package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class bahanlauk_suggestion extends AppCompatActivity {

    ListView listView;
    SimpleAdapter adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] nama_lauk; //deklarasi judul iem
    String[] desc_lauk; //deklarasi keterangan item
    String[] img_lauk; //deklarasi image item


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahanlauk_suggestion);

        String onClikLauk = getIntent().getStringExtra("dataLauk");
        listView = (ListView)findViewById(R.id.listLauk);

        //  List Nama Lauk, Deskripsi, dan Gambar di tulis di bawah ini.
        //  Tulis Sesuai dengan string yang ada di IF
        //  Jika 'AYAM' maka isi dengan resep berbahan utama AYAM.
        if (onClikLauk.equalsIgnoreCase("ayam")){
            nama_lauk = new String[] {
                    "Ayam Kecap","Ayam Suwir Pedas","Ayam Rica-Rica","Ayam Goreng","Ayam Betutu"
            };
            desc_lauk = new String[]{
                    "Ayam Kecap Mantap","Ayam Suwir Pedas Sederhana","Ayam Rica-Rica Pedas Mampus","Ayam Goreng Khas Anak Kos","Ayam Betutu Termantap"
            };
            img_lauk = new String[]{
                    Integer.toString(R.drawable.ayamkecap),Integer.toString(R.drawable.ayam_suwir_pedas),Integer.toString(R.drawable.ayam_ricarica),
                    Integer.toString(R.drawable.ayam_goreng),Integer.toString(R.drawable.ayam_betutu)
            };
        } else if (onClikLauk.equalsIgnoreCase("telur")){
            nama_lauk = new String[] {
                    "Telur Kecap"
            };
            desc_lauk = new String[]{
                    "Telur Kecap Sederhana Ala Anak Kos"
            };
            img_lauk = new String[]{
                    Integer.toString(R.drawable.telurkecap)
            };
        } else if (onClikLauk.equalsIgnoreCase("tahu")){
            nama_lauk = new String[] {
                    "Tahu Mercon"
            };
            desc_lauk = new String[]{
                    "Tahu Mercon Pedas Neraka"
            };
            img_lauk = new String[]{
                    Integer.toString(R.drawable.tahu_mercon)
            };
        } else if (onClikLauk.equalsIgnoreCase("ikan")){
            nama_lauk = new String[] {
                    "Ikan Bumbu Kuning"
            };
            desc_lauk = new String[]{
                    "Ikan Bumbu Kuning Simple"
            };
            img_lauk = new String[]{
                    Integer.toString(R.drawable.ikan_bumbu_kuning)
            };
        } else if (onClikLauk.equalsIgnoreCase("daging")){
            nama_lauk = new String[] {
                    "Daging Lada Hitam"
            };
            desc_lauk = new String[]{
                    "Daging Lada Hitam Cocok Untuk Idul Adha"
            };
            img_lauk = new String[]{
                    Integer.toString(R.drawable.daging_lada_hitam)
            };
        } else if (onClikLauk.equalsIgnoreCase("udang")){
            nama_lauk = new String[] {
                    "Udang Balado"
            };
            desc_lauk = new String[]{
                    "Udang Balado Pedas Untuk Makan Malam"
            };
            img_lauk = new String[]{
                    Integer.toString(R.drawable.udang_balado)
            };
        } else if (onClikLauk.equalsIgnoreCase("cumi")){
            nama_lauk = new String[] {
                    "Cumi Hitam Pedas"
            };
            desc_lauk = new String[]{
                    "Cumi Hitam Penuh Dosa"
            };
            img_lauk = new String[]{
                    Integer.toString(R.drawable.cumi_hitam)
            };
        } else if (onClikLauk.equalsIgnoreCase("tempe")){
            nama_lauk = new String[] {
                    "Tempe Penyet"
            };
            desc_lauk = new String[]{
                    "Tempe Penyet Pedas Nikmat"
            };
            img_lauk = new String[]{
                    Integer.toString(R.drawable.tempe_penyet)
            };
        }


        //memberikan event ketika listview diklik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // inten ke detail.java dengan mengirimkan parameter yang berisi nama dan gambar
                Intent a = new Intent(getApplicationContext(), bahanlauk_resep.class);
                //kirimkan parameter
                a.putExtra("Nama", nama_lauk[position]);
                a.putExtra("Deskripsi", desc_lauk[position]);
                a.putExtra("Gambar", img_lauk[position]);

                //kirimkan ke detail.java
                startActivity(a);
            }
        });



        mylist = new ArrayList<HashMap<String, String>>();

        for (int i=0; i<nama_lauk.length; i++){
            map = new HashMap<String, String>();
            map.put("judul", nama_lauk[i]);
            map.put("Keterangan", desc_lauk[i]);
            map.put("Gambar", img_lauk[i]);
            mylist.add(map);
        }
        adapter = new SimpleAdapter(this, mylist, R.layout.item_lauk,
                new String[]{"judul", "Keterangan", "Gambar"}, new int[]{R.id.txtNamaLauk,(R.id.txtDescLauk),(R.id.imgLauk)});
        listView.setAdapter(adapter);
    }

    public void pindahResep_lauk(View view) {
        Intent intent = new Intent(bahanlauk_suggestion.this, bahanlauk_resep.class);
        startActivity(intent);
    }
}
