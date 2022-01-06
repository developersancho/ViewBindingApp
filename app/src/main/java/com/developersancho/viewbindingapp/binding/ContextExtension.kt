package com.developersancho.viewbindingapp.binding

import android.content.Context
import android.view.LayoutInflater

val Context.inflater get() = LayoutInflater.from(this)