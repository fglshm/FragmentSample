package com.fglshm.fragmentsample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_country.*

class CountryFragment : Fragment() {

    var listener: OnButtonClickListener? = null
        set(value) {
            field = value
            Log.d("LISTENER", "listener of CountryFragment is set!!!")
        }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_country, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_country_back.setOnClickListener {
            listener?.pop()
        }
    }

}


