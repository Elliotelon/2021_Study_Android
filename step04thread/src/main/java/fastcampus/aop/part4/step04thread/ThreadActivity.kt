package fastcampus.aop.part4.step04thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)


        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }

        }
        val thread : Thread = Thread(runnable)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            thread.start()
        }





    }
}