package com.fglshm.fragmentsample

interface OnButtonClickListener {

    // AgeFragmentのNextボタンが押された時に呼び出される
    fun onNextButtonOfAgeFragmentClick()

    // GenderFragmentのNextボタンが押された時に呼び出される
    fun onNextButtonOfGenderFragmentClick()

    // AgeFragmentとGenderFragmentのBackボタンが押された時に呼び出される
    fun pop()

}