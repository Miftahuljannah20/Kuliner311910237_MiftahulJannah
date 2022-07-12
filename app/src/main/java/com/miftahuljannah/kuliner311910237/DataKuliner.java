package com.miftahuljannah.kuliner311910237;

import java.util.ArrayList;

public class DataKuliner {
    public static String[][] data = new String[][]{
            {"Ketoprak", "Ketoprak adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://img.okezone.com/content/2020/09/02/298/2271724/tips-buat-ketoprak-sendiri-di-rumah-ternyata-gampang-mSOkRstBip.jpg"},
            {"Nasi Kebuli", "Nasi Kebuli adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://kulinerkota.com/wp-content/uploads/2020/10/Nasi-Kebuli-Ayam.jpg"},
            {"Nasi Uduk", "Nasi Uduk adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://img.okezone.com/content/2020/05/26/298/2220040/cara-memasak-nasi-uduk-pakai-rice-cooker-gampang-banget-deh-mYKq3oaPvF.jpg"},
            {"Gado-Gado", "Gado-gado adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://awsimages.detik.net.id/community/media/visual/2021/09/20/food-spot-gado-gado.jpeg?w=650&q=90"},
            {"Bebek Madura", "Bebek Madura adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://www.sajianlezat.com/media/image/bebek/bebek-madura.jpg"},
            {"Nasi Kuning", "Nasi Kuning adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://www.resepistimewa.com/wp-content/uploads/nasi-kuning.jpg"},
            {"Kerak Telor", "Kerak Telor adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://kbu-cdn.com/dk/wp-content/uploads/kerak-telor.jpg"},
            {"Soto Pekalongan", "Soto Pekalongan adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://i0.wp.com/img-global.cpcdn.com/recipes/c4b43c15bf517e53/860x610cq70/photo.jpg"},
            {"Mie Ayam", "Mie Ayam adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://imgx.sonora.id/crop/0x0:0x0/x/photo/2021/12/31/desain-tanpa-judul-2021-05-10t13-20211231094828.jpg"},
            {"Nasi Goreng", "Nasi Goreng adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://selerasa.com/wp-content/uploads/2021/03/Resep-nasi-goreng-kampung-1-1200x898.jpg"},
            {"Bakso", "Bakso adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://cdn0-production-images-kly.akamaized.net/265KcigvIMcvoAN4XIRKjOT-aR0=/1200x675/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/2763419/original/071857300_1553761217-shutterstock_1148354906.jpg"},
            {"Rendang", "Rendang adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://cdn0-production-images-kly.akamaized.net/6ZZIvGifaE6sGCMf7L4wxHuT2Vg=/1200x900/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1253731/original/213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg"},
    };

    public static ArrayList<ModelKuliner> ambilDataKuliner() {
        ArrayList<ModelKuliner> dataKuliner = new ArrayList<>();
        for (String[] varData : data) {
            ModelKuliner model = new ModelKuliner();
            model.setNama(varData[0]);

            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            dataKuliner.add(model);
        }
        return dataKuliner;
    }
}
