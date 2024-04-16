package com.davayposmoritm.uikit.views

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.davayposmoritm.uikit.views.ext.applyStyleable
import com.example.uikit.R

class MovieSelectionCustomView@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {
    init {
        inflate(context, R.layout.movie_selection_custom_view, this)
        attrs?.applyStyleable(context, R.styleable.MovieSelectionCustomView) {
            val imageUrl = getString(R.styleable.MovieSelectionCustomView_imageUrlSelection)
            Glide.with(context)
                .load(imageUrl)
                .into(findViewById(R.id.imageSelection))
        }
    }
}