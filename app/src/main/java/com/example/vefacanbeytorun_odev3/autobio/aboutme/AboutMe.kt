package com.example.vefacanbeytorun_odev3.autobio.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vefacanbeytorun_odev3.R
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        txtAboutMeText.text = "     Selamlar, ben Vefa Can Beytorun. 06.08.1997 yılında İzmir'de doğdum. İzmir Gaziemir'de yaşıyorum." +
                "\n\n     İlkokulumu Yahyah Kemal Beyatlı İlköğretim Okulu'nda okudum. Lisemi ise Çınarlı Anadolu Teknik ve Endüstri" +
                " Meslek lisesinde okudum. Daha sonrasında Önlisans olarak Akdeniz Üniversitesi bölümünde Elektronik Haberleşme Teknolojisi" +
                " okudum. Şu anda da Dokuz Eylül üniversitesi Endüstri Mühendisliği'nde son sınıf öğrencisi olarak eğitim görmekteyim." +
                " Hobilerim arasında satranç oynamak, tarih ile ilgilenmek ve strateji oyunlar oynamak gibi pek fazla insanın ilgisini çekmediği" +
                " bazı zevkler var." +
                "\n" +
                "\n" +
                "     2022 yılının Ağustos ayında yazılıma merak salarak Kotlin dilini öğrenmeye başladım ve kısa sürede Kotlin" +
                " hobilerimin arasına giriş yapmayı başardı. Kendimi daha çok geliştirmek için gün geçtikçe daha çok yeni şeyler öğrenmeye ve öğrendiklerimi" +
                " pratiğe dökmek için vakit harcadım ve hala harcıyorum. Şu an ki nihayi gelecek amacım yazılımı kendime meslek haline getirip" +
                " bu alanda çok iyi bir geliştirici olmak! "

    }
}