package com.fadjriaf.mytourbuddy;

import java.util.ArrayList;

public class TourData {
    private static String[][] dataTour = new String[][]{
            {
                "https://i.ibb.co/ysvpxfm/hutan-di-bandung-taman-hutan-raya-juanda-1.jpg",
                "Taman Hutan Raya Ir.H.Djuanda",
                "Taman Hutan Raya terletak di kawasan Dago Pakar, membentang sampai ke daerah Maribaya. Di tempat yang merupakan taman hutan raya pertama di Indonesia ini terdapat kurang lebih 2500 jenis tanaman.",
                "Kampung Pakar, Desa Ciburial, Kecamatan Cimenyan Bandung",
                "Setiap Hari : 08.00 s/d 18.00 WIB",
                "Rp.11.000,-",
                "\u2022 Monumen Ir. H. Djuanda \n\u2022 Gua Jepang & Gua Belanda \n\u2022 Air Terjun Dago \n\u2022 Air Terjun Omas \n\u2022 Air Terjun Lalay \n\u2022 Museum Ir.H.Djuanda \n\u2022 Prasasti Raja Thailand"
            }, {
                "https://i.ibb.co/n0QHzQP/dermaga-bintang-dari-bawah-puncak-bintang-bandung-2017.jpg",
                "Puncak Bintang Bandung",
                "Puncak Bintang Bandung merupakan tempat wisata di Bandung yang relatif terbilang baru. Lokasinya berada di puncak bukit, tidak jauh dari warung daweung atau moko yang sudah lebih dulu dikenal para traveller. Karena itu pula tempat ini sering disebut juga puncak bintang moko atau puncak bintang bukit moko.",
                "Cimenyan Bandung",
                "Setiap Hari : 08.00 s/d 18.00 WIB\nHari Libur : 08.00 s/d 23.00 WIB",
                "Rp.10.000,-",
                "\u2022 Jalan-Jalan di Hutan Pinus \n\u2022 Dermaga Bintang \n\u2022 Camping Di Puncak Bintang \n\u2022 Berburu Sunrise di Patahan Lembang"
            }, {
                "https://i.ibb.co/9GH27TV/bamboo-playground-dusun-bambu-1.jpg",
                "Dusun Bambu Lembang",
                "Banyak hal yang bisa anda lakukan disini. Kita bisa sekedar menikmati susasana bersama pasangan, menikmati kuliner di beberapa resort dan cafe, membawa anak dan keluarga bermain bersama, ataupun berjalan santai mengitari taman yang tertata.",
                "Jl. Kolonel Masturi No.KM, Kertawangi, Kec. Cisarua",
                "Setiap Hari : 09.00 s/d 21.00 WIB\nHari Libur : 08.00 s/d 23.00 WIB",
                "Rp.20.000,-/org\nTicket Weekend Rp.25.000,-",
                "\u2022 Bersantap DiRestoran Purbasari \n\u2022 Cafe Burangrang \n\u2022 Lutung Kasarung Area \n\u2022 Taman Arimbi \n\u2022 Pasar Khatulistiwa"
            }, {
                "https://i.ibb.co/ZhbM4Kn/tempat-istirahat-di-floating-market.jpg",
                "Floating Market Lembang",
                "Pada awalnya, floating market Lembang tidak begitu luas. Tapi sekarang sudah ekspansi dan memiliki banyak objek menarik baru. Nama floating market ini sepertinya merujuk pada stand tempat jualan makanan yang berada dalam perahu.",
                "Jl. Grand Hotel No.33E, Lembang, Kabupaten Bandung Barat",
                "Senin s/d Jumat : 09.00 – 17.00 WIB\nSabtu s/d Minggu : 09.00 – 20.00 WIB",
                "Rp.20.000,-\n Weekend : Rp.25.000,-",
                "\u2022 Kota Mini Lembang \n\u2022 Mini Carnival \n\u2022 Playground \n\u2022 Penyewaan Kostum Jepang Dan Korea \n\u2022 Rainbow Garden \n\u2022 Wahana Permainan Air \n\u2022 Taman Kelinci \n\u2022 Miniatur Kereta Api \n\u2022 Becak Dan mobil Mini"
            }, {
                "https://i.ibb.co/ynvP5T7/Taman-begonia.jpg",
                "Taman Begonia",
                "Keistimewaan Taman Bunga Begonia bukan hanya dari keberadaan bunga dan tanaman yang ada, melainkan juga dari tatanan taman yang menarik. Warna-warni taman bunga juga dilengkapi dengan berbagai bentukan yang cocok untuk berfoto-foto. Bahkan memang banyak pengunjung yang datang ke sini hanya untuk mengabadikan keindahan tamannya.",
                "Jalan Maribaya No. 120 A Kecamatan Lembang, Kabupaten Bandung Jawa Barat",
                "Setiap Hari : 08.00 - 17.00 WIB",
                "Rp15.000,- \nWeekend : Rp20.000,-",
                "\u2022 Taman Bunga Aneka Warna \n\u2022 Gerbang Bunga \n\u2022 Aneka Spot Foto \n\u2022 Café Kebun \n\u2022 Wisata Petik Buah \n\u2022 Outbound"
            }, {
                "https://i.ibb.co/bsbYKsx/De-ranch-lembang-bandung-1.jpg",
                "De Ranch Lembang",
                "Konsep tempat wisata keluarga di Bandung ini mengusung konsep Western/Cowboy. Kita bisa bermain atau menunggang kuda, berfoto dengan kostum koboy yang tersedia, mengelilingi area dengan kuda, dan lain sebagainya.",
                "Jl. Maribaya No.17, Kayuambon, Lembang",
                "Senin s/d Jumat : 09.00 – 17.00 WIB\nSabtu s/d Minggu : 08.00 – 18.00 WIB",
                "Rp.15.000,-",
                "\u2022 Berkuda \n\u2022 Delman \n\u2022 Permainan Air"
            }, {
                "https://i.ibb.co/kJ6yVfF/Dago-dream-park-bandung-1.jpg",
                "Dago Dream Park",
                "Bandung emang ngga ada matinya, selalu ada tempat wisata baru yang bermunculan. Salah satunya adalah Dago Dream Park. Tempat wisata keluarga di Bandung ini umurnya terhitung baru, tapi sudah cukup populer dan banyak dikunjungi wisatawan. \n\nBuat anda yang mencari destinasi wisata keluarga di Bandung, tempat ini bisa jadi alternatif menarik nih. Lokasinya mudah di jangkau, dengan fasilitas dan permainan yang cukup lengkap juga.",
                "Jl. Dago Giri KM 2.2, Mekarwangi, Pagerwangi, Bandung",
                "Senin s/d Jumat : 09.00 – 17.00 WIB\nSabtu s/d Minggu : 08.00 – 20.00 WIB",
                "Rp.25.000,- s/d Rp.35.000,-",
                "\u2022 Love Seat \n\u2022 Sky Tree \n\u2022 Up House \n\u2022 Alladin Carpet \n\u2022 Sky Bike \n\u2022 Row A Boat \n\u2022 Lost In Paradise \n\u2022 Anti Gravity \n\u2022 Geared Up \n\u2022 Kampung Dayang Sumbi"
            }
    };

    static ArrayList<Tour> getListData(){
        Tour tour = null;
        ArrayList<Tour> list = new ArrayList<>();
        for (String[] tData : dataTour){
            tour = new Tour();
            tour.setTourImage(tData[0]);
            tour.setTourName(tData[1]);
            tour.setTourDescript(tData[2]);
            tour.setTourLoc(tData[3]);
            tour.setTourHours(tData[4]);
            tour.setTourTicket(tData[5]);
            tour.setTourActivity(tData[6]);

            list.add(tour);
        }
        return list;
    }
}
