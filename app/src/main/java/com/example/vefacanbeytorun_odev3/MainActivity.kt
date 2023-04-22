package com.example.vefacanbeytorun_odev3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.vefacanbeytorun_odev3.onboarding.OnboardingItem
import com.example.vefacanbeytorun_odev3.onboarding.OnboardingItemsAdapter
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var onboardingItemAdapter: OnboardingItemsAdapter
    private lateinit var indicatorsContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnBoardingItems()
        setupIndicators()
        setCurrentIndicators(0)
    }

    private fun setOnBoardingItems() {
        onboardingItemAdapter = OnboardingItemsAdapter(
            listOf(
                OnboardingItem(
                    R.drawable.first_image,
                    "Hoşgeldiniz",
                    "Lütfen ilerlemek için kaydırın."
                ), OnboardingItem(
                    R.drawable.second_image,
                    "Uygulama Hakkında.",
                    "Bu uygulama Turkcell Geleceği Yazanlar Kotlin BootCamp'inin 3. Ödevidir."
                ), OnboardingItem(
                    R.drawable.third_image,
                    "Uygulama İçeriği",
                    "Bu uygulama benim biyografi uygulamamdır."
                )
            )
        )

        val onboardingViewPager = findViewById<ViewPager2>(R.id.onboardingViewPager)
        onboardingViewPager.adapter = onboardingItemAdapter
        onboardingViewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicators(position)
            }
        })
        (onboardingViewPager.getChildAt(0) as RecyclerView).overScrollMode =
            RecyclerView.OVER_SCROLL_NEVER
        findViewById<ImageView>(R.id.imageNext).setOnClickListener {
            if (onboardingViewPager.currentItem + 1 < onboardingItemAdapter.itemCount) {
                onboardingViewPager.currentItem += 1
            } else {
                intentToHome()
            }
        }
        findViewById<TextView>(R.id.txtSkip).setOnClickListener {
            intentToHome()
        }

        findViewById<MaterialButton>(R.id.ButtonStart).setOnClickListener {
            intentToHome()
        }
    }

    private fun intentToHome() {
        startActivity(Intent(applicationContext, HomePageActivity::class.java))
        finish()
    }


    private fun setupIndicators() {

        indicatorsContainer = findViewById(R.id.indicatorContainer)
        val indicators = arrayOfNulls<ImageView>(onboardingItemAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(15, 50, 8, 0)

        for (i in indicators.indices) {
            indicators[i] = ImageView(applicationContext)
            indicators[i]?.let {
                it.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext, R.drawable.indicator_inactive_background
                    )
                )
                it.layoutParams = layoutParams
                indicatorsContainer.addView(it)
            }
        }
    }

    private fun setCurrentIndicators(position: Int) {
        val counter = indicatorsContainer.childCount

        for (i in 0 until counter) {
            val imageView = indicatorsContainer.getChildAt(i) as ImageView
            if (i == position) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active_background
                    )
                )
            } else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive_background
                    )
                )
            }
        }
    }


}