package fastcampus.aop.part5.step11fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFrag(0)

        val btn_fragment1 = findViewById<Button>(R.id.btn_fragment1)
        val btn_fragment2 = findViewById<Button>(R.id.btn_fragment2)
        val btn_fragment3 = findViewById<Button>(R.id.btn_fragment3)

        btn_fragment1.setOnClickListener { setFrag(0) }
        btn_fragment2.setOnClickListener { setFrag(1) }
        btn_fragment3.setOnClickListener { setFrag(2) }

    }

    private fun setFrag(fragNum : Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum){
            0 -> {
                ft.replace(R.id.main_frame, Fragment1()).commit()
            }
            1 -> {
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }
            2 -> {
                ft.replace(R.id.main_frame, Fragment3()).commit()
            }
        }

    }
}