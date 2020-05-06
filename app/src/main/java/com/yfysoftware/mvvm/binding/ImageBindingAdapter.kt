package com.yfysoftware.mvvm.binding
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.yfysoftware.mvvm.util.Constants

object ImageBindingAdapter {
    @JvmStatic
    @BindingAdapter("imageUrl")
    fun loadImage(imageView: ImageView, url: String) {
        if(url.isNotEmpty()) {
            Glide.with(imageView.context)
                .load(Constants.IMAGE_BASE_URL+url)
                .into(imageView)
        }
    }

    @JvmStatic
    @BindingAdapter("visibleIf")
    fun changeVisibility(view: View, visible: Boolean) {
        view.visibility = if (visible) View.VISIBLE else View.GONE
    }
}