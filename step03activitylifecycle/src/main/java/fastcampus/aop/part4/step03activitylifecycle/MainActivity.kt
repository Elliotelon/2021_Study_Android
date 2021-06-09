package fastcampus.aop.part4.step03activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity", "onCreate()")

    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart()")

    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity", "onResume()")

    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause()")

    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop()")

    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity", "onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity", "onDestroy()")
    }

    fun moveBtn(v: View) {
        startActivity(Intent(this, SubActivity::class.java))

    }

}