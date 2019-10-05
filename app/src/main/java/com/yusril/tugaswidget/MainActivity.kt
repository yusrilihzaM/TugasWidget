package com.yusril.tugaswidget

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import android.os.Bundle

import com.yusril.tugaswidget.adapter.AdapterMain

import java.util.ArrayList

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var adapter: RecyclerView.Adapter<*>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var judul: ArrayList<String>? = null //Digunakan untuk Judul
    private var deskripsi: ArrayList<String>? = null //Digunakan untuk deskripsi
    //Daftar Judul
    private val judulisi = arrayOf("TextView", "ImageView", "ImageButton", "EditText", "CheckBox", "RadioButton", "DatePicker", "TimePicker", "SwichButton", "DigitalClock", "AnalogClock")
    private val deskisi = arrayOf("Merupakan salah satu widget yang berfungsi menampilkan dan mengkustomisasi sebuah text ,baik itu kata atau kalimat ,paragraf dll,yang digunakan untuk pengembangan Aplikasi Android.", "Merupakan adalah salah satu widget yang berfungsi sebagai komponen User Interface (Antar Muka)  yang akan  menampilkan sebuah gambar baik itu format .jpg ataupun .png. Jadi jika kalian ingin menampilkan sebuah gambar", "Merupakan sebuah salah satu widget yang berfungsi sebagai komponen User Interface (Antar Muka)  yang tidak hanya  menampilkan sebuah gambar , namun juga dapat di navigasikan menjadi button yag dapat  menghubungkan antar Activity", "adalah salah satu widget yang berfungsi sebagai komponen User Interface (Antar Muka) yang berisi sebuah kotak input dari sebuah user. Seperti contohnya pada pengeisian sebuah formulir.", "adalah salah satu widget yang berfungsi sebagai komponen User Interface (Antar Muka), yang berfungsi sebagai daftar menu. Daftar menu yang di sediakan dapat digunakan oleh pengguna,untuk memilih salah satu daftar menu, dengan menceklisnya salah satu dengan ditandai seperti sebuah kotak kecil.", "adalah salah satu widget yang berfungsi sebagai komponen User Interface (Antar Muka), yang akan menampilkan daftar pilihan ,yang berbentuk seperti titik bulat kecil.Jika di widget CheckBox pengguna memilih dengan Checklist dan bisa memilih lebih dari satu.Namun , di widget RadioButton kalian hanya perlu memilih dengan bulatan kecil saja,dan hanya bisa memilih satu pilihan saja.RadioButton juga merupakan bagian dari RadioGroup.", "adalah salah satu widget yang berfungsi sebagai  komponen User Interface (Antar Muka) , yang dapat menampilkan , dan mengijinkan si pengguna(user) dapat memilih/menset tanggal,bulan ,tahun. DatePicker bisa juga disebut widget kalender Android", "adalah salah satu widget yang berfungsi sebagai  komponen User Interface (Antar Muka),yang dapat menampilkan waktu, serta  mengijinkan si pengguna(user) dapat memilih/menset jam dan menit.", "adalah salah satu widget yang berfungsi sebagai komponen User Interface (Antar Muka),yang dapat menampilkan sebuah switch(gonta-ganti) button secara dinamis.Switch  button terdiri dari ON dan OFF.Ibarat sebuah saklar di sebuah pengembangan Aplikasi Android,", "adalah suatu widget yang digunakan untuk suatu komponen User Interface(Antar Muka), yang dapat menampilkan sebuah jam dalam bentuk digital pada Aplikasi Android.Jika kalian bosan dengan tampilan jam secara default (bawaan) ,yang ada pada perangkat Android. Kalian dapat menggunakan widget DigitalClock ,dan mengkustomisasi tampilanya sesuai selera kalian,saat kalian membuat Aplikasi Jam di Android.", " adalah suatu widget yang digunakan untuk komponen User Interface (Antar Muka) , yang dapat menampilkan sebuah jam dalam bentuk Analog,seperti yang sering kita lihat di jam dinding di rumah. Seperti widget DigitalClock kalian juga bisa mengkustomisasi tampilanya sesuai selera kalian,saat kalian membuat Aplikasi Jam di Android.\n")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportActionBar != null) {
            supportActionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.gradasi))
        }
        judul = ArrayList()
        deskripsi = ArrayList()
        recyclerView = findViewById(R.id.recycler)
        daftarItem()
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        adapter = AdapterMain(judul!!, deskripsi!!)
        //Memasang Adapter pada RecyclerView
        recyclerView!!.adapter = adapter
    }

    private fun daftarItem() {
        for (w in judulisi.indices) {
            deskripsi!!.add(deskisi[w])
            judul!!.add(judulisi[w])
        }
    }

}
