package com.example.alatmusikriau

object DataInstrument {
    private val instrumentName = arrayOf(
        "Gambus","Nafiri","Gendang Nobat","Rebana Ubi","Kompang","Gedombak",
        "Camar","Akordeon","Marwas","Talempong","Gong","Genggong"
    )
    private val instrumentDetail = arrayOf(
        "Gambus merupakan alat musik yang sudah sangat terkenal dinusantara. Pada awalnya Gambus dimainkan untuk acara-acara spiritual pada   masyarakat adat Melayu. Namun kini alat musik Gambus lebih banyak digunakan sebagai pengiring tarian Zapin. Alat musik yang dimainkan dengan dipetik ini memiliki bentuk seperti alat musik Mandolin dengan jumlah senar antara 3 sampai 12 buah. Gambus biasanya dimainkan bersamaan dengan alat musik Gendang. Hal yang unik juga alat musik Gambus ini digunakan oleh para nelayan sebagai hiburan di atas alat transportasi laut tradisional ketika mencari ikan.",
        "Alat yang satu ini memiliki bentuk fisik yang sangat mirip dengan Terompet yang dimainkan dengan cara ditiup. Alat musik ini bisa dikatakan terkenal di Provinsi Riau, sebab kerap mengiringi acara pertunjukan makyong. Selain sebagai alat musik yang mengiringi acara pertunjukan alat musik ini juga dijadikan sebagai alat komunikasi tradisional menyampaikan informasi terkait terjadinya bencana, kematian, kemalingan, dan informasi yang mendesak lainnya kepada warga masyarakat.",
        "Gendang Nobat sendiri terbuat dari kulit hewan, kayu serta rotan yang dimainkan dengan cara dipukul atau ditabuh. Konon alat musik ini juga menjadi benda yang disakralkan tidak boleh dimainkan oleh sembarangan orang. Bahkan alat musik ini tidak boleh dilangkahi oleh pemain maupun orang lain. Pemain Gendang Nobat sendiri harus memiliki darah keluarga kerajaan. Alat musik Gendang Nobat biasanya dimainkan dalam acara – acara adat khusus yang sakral.",
        "Rebana Ubi merupakan alat musik yang dimainkan dengan cara dipukul atau ditabuh. Alat musik yang satu ini memiliki ukuran 70 cm dan tinggi 1 meter. Dalam memainkan Rebana Ubi posisi alat musik ini bisa dipegang dengan posisi horizontal atau diletakkan diatas lantai. Rebana Ubi memiliki bentuk yang unik seperti tabuhan pada umumnya, namun ada penyangga dibawah Rebana.\n" + "\n" +
                "Alat musik ini sering ditabuh oleh pria yang datang ke rumah mempelai wanita dan memeriahkan pesta pernikahan mereka, sebab alat musik ini memiliki suara yang cukup keras saat ditabuh. Selain untuk mengiringi acara pernikahan alat musik Rebana Ubi berfungsi untuk upacara adat tertentu. Tidak sembarangan orang bisa memainkan alat musik ini sebab ada beberapa aturan yang digunakan untuk menabunhnya. Bagi pemula, harus belajar terlebih dahulu supaya ahli dalam memainkan alat musik yang bernama Rebana Ubi ini.",
        "Kompang adalah alat musik yang ditabuh seperti halnya alat musik Rebana. Akan tetapi perbedaan dari alat musik ini adalah pada gemerincing logam yang terdapat pada bagian tepinya. Ukuran dari alat musik Kompang yaitu 16 inci dengan ditutup memakai kulit yang terbuat dari kulit kambing ataupun kulit lembu/kerbau.\n" +
                "\n" +
                "Alat musik kompang biasanya dimainkan dengan alat musik Gambus dan tabuhan Gendang. Fungsi dari alat musik in sendiri yakni untuk mengiringi pawai adat dan pertunjukkan kesenian tradisional khas Melayu Riau.",
        "Gedombak adalah alat musik tradisional dari Riau yang memiliki bentuk sangat unik seperti tropy piala dunia. Alat musik ini terbuat dari bahan rotan, kayu dan kulit hewan. Gedombak biasanya dimainkan bersamaan dengan Nafiri dan alat musik lainnya sebagai pengiring dalam pagelaran Makyong.",
        "Alat musik Camar termasuk dalam kategori alat musik pukul yang dipukul dengan alat pemukul. Alat musik ini biasanya dimainkan saat perayaan hari – hari besar. Gendang Camar memiliki bentuk yang unik terdiri dari 6 bilah kayu berwarna hitam yang ditempatkan pada rak dengan ukiran sayap seperti burung Camar. Inilah alasan mengapa disebut sebagai Gendang Camar.",
        "Akordoen adalah alat musik yang bisa dibilang unik jika dilihat dari bentuknya. Akordeon adalah penggabungan dari pianika dan tombol-tombol lainnya. Alat musik ini juga sangatlah mirip dengan alat musik yang ditemukan oleh C.F.L.Buschmann yang berasal dari Jerman.",
        "Alat musik Marwas merupakan salah satu dari sekian banyak alat musik Riau yang memiliki nilai agamis yang sangat kental. Alat musik ini berbentuk seperti Gendang namun berukuran kecil dengan 2 (dua) membran pada bagian sisi-sisinya. Bunyi yang dihasilkan dari alat musik Marwas cenderung kecil namun memiliki nada tinggi. Marwas sendiri termasuk dalam kategori alat musik Tabuh/Pukul.",
        "Telempong atau yang biasa juga disebut Calempong adalah alat musik yang terbuat dari lempengan logam perunggu, besi atau kuningan dengan bentuk bundar. Ukarannya pun berbeda-beda, dan masing-masing menghasilkan suara yang berbeda pula.\n" +
                "\n" +
                "Cara memainkan alat musik ini dengan cara dipukul dengan alat pemukul yang ujungnya dibalut oleh kain. Pada zaman dahulu alat musik ini digunakan untuk menyampaikan pesan penting dari wali negara oleh orang suruhannya untuk masyarakat. Kini alat musik Calempong salah satu alat musik yang mengiringi tarian sakral dan dimainkan ketika pasangan pengantin menuju rumah mempelai wanita (bararak).",
        "Gong ini sama seperti gong pada umunya yang terbuat dari kuningan dan dimainkan dengan bantuan alat pemukul yang terbuat dari kayu dengan ujung bantalan terbuat dari karet ataupun kain. Nada yang dihasilkan dari gong in tergantung dari ukuran gong, jika gong semakin besar maka semakin kuat pula bunyi yang dihasilkannya.",
        "Alat musik Genggong adalah alat musik yang cara memainkannya dengan ditiup. Alat musik ini biasanya digunakan bersama dengan alat musik tradisional lainnya sebagai alat musik pengiring dalam pagelaran musik tradisional. Genggong memiliki bentuk yang unik dan beragam bentuk yang kecil dan tipis. Genggong terbuat dari kulit terluar pohon enau.\n" +
                "\n" +
                "Cara memainkannya adalah dengan di tiup sembari menarik ujung talinya, suara yang dihasilkan seperti pantulan dengan dengungan keras yang berasal dari rongga suara."
    )
    private val instrumentImage = intArrayOf(
        R.drawable.gambus,
        R.drawable.nafiri,
        R.drawable.gendang_nobat,
        R.drawable.rebana_ubi,
        R.drawable.kompang,
        R.drawable.gedombak,
        R.drawable.camar,
        R.drawable.akordeon,
        R.drawable.marwas,
        R.drawable.talempong,
        R.drawable.gong_riau,
        R.drawable.genggong)

    val listData: ArrayList<Instrument>
      get() {
          val list = arrayListOf<Instrument>()
          for (position in instrumentName.indices){
              val instrument = Instrument()
              instrument.name = instrumentName[position]
              instrument.detail = instrumentDetail[position]
              instrument.photo = instrumentImage[position]
              list.add(instrument)
          }
          return list
      }
}
