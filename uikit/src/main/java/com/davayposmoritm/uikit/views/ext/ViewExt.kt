package com.davayposmoritm.uikit.views.ext

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import androidx.annotation.StyleableRes

inline fun AttributeSet.applyStyleable(
    context: Context,
    @StyleableRes styleableResId: IntArray,
    action: TypedArray.() -> Unit
) {
    val typedArray = context.obtainStyledAttributes(this, styleableResId)
    typedArray.action()
    typedArray.recycle()
}
