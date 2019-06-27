package com.fglshm.fragmentsample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_age.*

class AgeFragment : Fragment() {

    var listener: OnButtonClickListener? = null
        // セッター (MainActivityからリスナーがセットされたかどうかを、ログで確認している)
        set(value) {
            field = value
            Log.d("LISTENER", "listener of AgeFragment is set!!!")
        }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_age, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_age_next.setOnClickListener {
            listener?.onNextButtonOfAgeFragmentClick()
        }
    }

}