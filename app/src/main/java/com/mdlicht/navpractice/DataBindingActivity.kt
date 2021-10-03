package com.mdlicht.navpractice

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

open class DataBindingActivity<B: ViewDataBinding>(@LayoutRes private val layoutRes: Int): BaseActivity() {

    lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutRes)
        setContentView(binding.root)
    }
}