package fastcampus.aop.part5.step10textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 최초로 실행되었을때 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // xml 화면 뷰를 연결한다.

        val tv_title = findViewById<TextView>(R.id.tv_title)
        tv_title.setText("Hello World..") // 텍스트의 값을 변경한다.

    }
}