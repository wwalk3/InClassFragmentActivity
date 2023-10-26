package edu.temple.inclassactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity(), ImageDisplayFragment.ImageSelectedInterface {

    lateinit var someVar : Array<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (::someVar.isInitialized)

        val mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        // Fetch images into IntArray called imageArray
        val typedArray = resources.obtainTypedArray(R.array.image_ids)
        val imageArray = IntArray(typedArray.length()) {typedArray.getResourceId(it, 0)}
        typedArray.recycle()


        if
        (supportFragmentManager.findFragmentById(R.id.ImageDisplayFragment)) as ImageDisplayFragment
            .setImages(imageArray)

        // Attach an instance of ImageDisplayFragment using factory method
//        if (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) !is ImageDisplayFragment)
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.fragmentContainerView, ImageDisplayFragment())
//                .addToBackStack(null)
//                .setReorderingAllowed(true)
//                .commit()

    }

    override fun imageSelected(itemID: Int) {
        Toast.makeText(this, "You selected $itemId", Toast.LENGTH_SHORT).show()

    }
}