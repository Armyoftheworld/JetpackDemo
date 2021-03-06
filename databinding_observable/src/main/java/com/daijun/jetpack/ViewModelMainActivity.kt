package com.daijun.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.daijun.jetpack.databinding.observable.R
import com.daijun.jetpack.databinding.observable.databinding.ActivityViewModelMainBinding

class ViewModelMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind = DataBindingUtil.setContentView<ActivityViewModelMainBinding>(
            this,
            R.layout.activity_view_model_main
        )
        bind.viewmodel = ViewModelProvider(this).get(MainViewModel::class.java)
        bind.lifecycleOwner = this
    }
}
