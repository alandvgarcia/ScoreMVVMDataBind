package com.example.alan.scoremvvmdatabind

import android.databinding.BindingAdapter
import android.support.annotation.NonNull
import android.widget.TextView

class TextViewBinding {
    companion object {

        @BindingAdapter("android:text")
        @JvmStatic
        fun setIntToText(@NonNull textView: TextView, @NonNull anInt: Int) {
            textView.text = anInt.toString()
        }
    }
}