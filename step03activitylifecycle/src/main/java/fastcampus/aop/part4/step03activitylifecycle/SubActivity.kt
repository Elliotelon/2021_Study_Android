package fastcampus.aop.part4.step03activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        Log.e("SubActivity", "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.e("SubActivity", "onStart()")

    }

    override fun onResume() {
        super.onResume()
        Log.e("SubActivity", "onResume()")

    }

    override fun onPause() {
        super.onPause()
        Log.e("SubActivity", "onPause()")

    }

    override fun onStop() {
        super.onStop()
        Log.e("SubActivity", "onStop()")

    }

    override fun onRestart() {
        super.onRestart()
        Log.e("SubActivity", "onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("SubActivity", "onDestroy()")
    }
}