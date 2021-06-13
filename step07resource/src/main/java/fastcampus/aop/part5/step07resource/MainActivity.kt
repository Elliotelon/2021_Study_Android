package fastcampus.aop.part5.step07resource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ment = resources.getString(R.string.hello)
        Log.d("mentt", "ment : " + ment)

        val ment2 = getString(R.string.hello)
        Log.d("mentt", "ment : " + ment2)

        val color = getColor(R.color.textview_color)
        Log.d("mentt", "color : "+ color)




    }
}