package com.example.vefacanbeytorun_odev3.autobio.gallery



class DetailService {

    fun photoServices():List<PhotoDetail>{

        var list = mutableListOf<PhotoDetail>()

        val u1 = PhotoDetail("Alanya Kalesi ", "Yakın arkadaşımı ziyaret sırasında çekildiğim bir fotoğraf.","https://i.ibb.co/HTwt2Wh/Whats-App-Image-2022-06-10-at-17-48-53.jpg")
        val u2 = PhotoDetail("Çeşme Dalyan","Tatilden bir kare.","https://i.ibb.co/vXwgbhs/vefa-can-2.jpg")
        val u3 = PhotoDetail("İzmir Ekonomi Üniversitesi","Yakın arkadaşımın mezuniyeti.","https://i.ibb.co/ZNJx9hF/vefa-can-3.jpg")
        val u4 = PhotoDetail("İzmir Balçova","Voleybol esintileri","https://i.ibb.co/6FSjvDb/vefa-can-4.jpg")
        val u5 = PhotoDetail("İzmir Gaziemir","Selfie","https://i.ibb.co/Hhjqd98/vefa-can-5.jpg")
        val u6 = PhotoDetail("İzmir Alsancak","Yakın bir arkadaşım","https://i.ibb.co/sw3yMTc/vefa-can-6.jpg")
        val u7 = PhotoDetail("İzmir Alsancak","Unutulmaz bir an","https://i.ibb.co/Y2cRTWX/vefa-can-7.jpg")

        list.add(u1)
        list.add(u2)
        list.add(u3)
        list.add(u4)
        list.add(u5)
        list.add(u6)
        list.add(u7)



        return list
    }


}