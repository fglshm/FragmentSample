package com.fglshm.fragmentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast


class MainActivity : AppCompatActivity(), OnButtonClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ビューをセット
        setContentView(R.layout.activity_main)

        // AgeFragmentのインスタンス生成
        val ageFragment = AgeFragment()

        // リスナーを登録
        // 登録しなければ、AgeFragmentのボタンクリックイベントを受け取ることができない
        ageFragment.listener = this

        // 最初のAgeFragmentをセット
        // replaceじゃなくてaddにするとアニメーションは起こらない
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ageFragment)
            .commit()

    }

    override fun onNextButtonOfAgeFragmentClick() {
        val genderFragment = GenderFragment()
        genderFragment.listener = this
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.slide_in_from_right,
                R.anim.slide_out_to_left,
                R.anim.slide_in_from_left,
                R.anim.slide_out_to_right
            )
            .replace(R.id.container, genderFragment)
            // addToBackStackすることで、デバイスの戻るボタンで前のFragmentに戻ることができる。
            .addToBackStack(null)
            .commit()
    }

    override fun onNextButtonOfGenderFragmentClick() {
        val countryFragment = CountryFragment()
        countryFragment.listener = this
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.slide_in_from_right,
                R.anim.slide_out_to_left,
                R.anim.slide_in_from_left,
                R.anim.slide_out_to_right
            )
            .replace(R.id.container, countryFragment)
            .addToBackStack(null)
            .commit()
    }

    override fun pop() {
        // 今表示されているFragmentを破棄して1つ前のFragmentに戻る
        supportFragmentManager.popBackStack()
    }
}
