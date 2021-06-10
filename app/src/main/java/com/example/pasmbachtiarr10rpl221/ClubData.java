package com.example.pasmbachtiarr10rpl221;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClubData {
    private static String [] clubName = {
            "Juventus",
            "Arsenal",
            "Aston Villa",
            "Barcelona",
            "Chelsea",
            "Crystal Palace",
            "Liverpool",
            "Manchester City",
            "Manchester United",
            "Real Madrid",

    };

    private static String [] clubDetail = {
            "Juventus Football Club S.p.A., biasa disebut sebagai Juventus dan populer dengan nama Juve, adalah klub sepak bola profesional asal Italia yang berbasis di kota Turin, Piemonte.",
            "Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London",
            "Aston Villa berdiri tahun 1874 dan menggunakan stadion Villa Park dari tahun 1897 hingga sekarang. Aston Villa merupakan salah satu anggota pendiri Liga Sepak Bola (Football League) dan langsung mencapai kesuksesan, mereka memenangkan lima gelar dalam waktu tujuh musim.",
            "Fútbol Club Barcelona / juga dikenal sebagai Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol.",
            "Chelsea Football Club /ˈtʃɛlsiː/ adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.",
            "Crystal Palace Football Club merupakan sebuah tim sepak bola Inggris yang bermarkas di London Borough of Croydon dan didirikan pada tahun 1905.",
            "Liverpool Football Club /ˈlɪvərpuːl/ (dikenal pula sebagai Liverpool atau The Reds) adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool.",
            "Manchester City Football Club (dikenal pula sebagai Man City atau The Citizens) adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester.",
            "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.",
            "Real Madrid Club de Fútbol / umumnya dikenal sebagai Real Madrid adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol. Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih.",

    };

    private static int[] clubImage = {
            R.drawable.juventus,
            R.drawable.arsenal,
            R.drawable.aston,
            R.drawable.barcelona,
            R.drawable.chelsea,
            R.drawable.crystal,
            R.drawable.liverpool,
            R.drawable.mancity,
            R.drawable.manutd,
            R.drawable.real_madrid,
        };

    static ArrayList<Club> getListData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position <clubName.length; position++) {
        Club club = new Club();
        club.setName(clubName[position]);
        club.setDetail(clubDetail[position]);
        club.setPhoto(clubImage[position]);
        list.add(club);
        }
        return list;
    }
}

