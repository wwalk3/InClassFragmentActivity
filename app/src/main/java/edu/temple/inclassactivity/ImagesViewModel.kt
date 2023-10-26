package edu.temple.inclassactivity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ImagesViewModel : ViewModel() {
    private val images = MutableLiveData<IntArray>()

    fun setImages(_images: IntArray) {

    }
}