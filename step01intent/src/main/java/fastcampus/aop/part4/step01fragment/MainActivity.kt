package fastcampus.aop.part4.step01fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //인텐트 생성성
        val intent = Intent(this, SecondActivity::class.java)

        //인텐트에 이메일, 비밀번호 넣기
        intent.putExtra("email", "abc@naver.com")
        intent.putExtra("password", 1234)

        //화면이동 버튼의 참조값 가져오기
        val moveBtn = findViewById<Button>(R.id.moveBtn)

        //버튼을 클릭했을때 화면 전환 하기
        moveBtn.setOnClickListener {
            startActivity(intent)
        }
    }
}