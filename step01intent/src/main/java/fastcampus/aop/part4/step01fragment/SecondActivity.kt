package fastcampus.aop.part4.step01fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //돌아가기 버튼의 참조값 얻어오기
        val backBtn = findViewById<Button>(R.id.backBtn)

        //이메일, 패스워드의 참조값 얻어오기
        val email = findViewById<TextView>(R.id.emailTextView)
        val password = findViewById<TextView>(R.id.passwordTextView)

        //이메일, 패스워드에 인텐트에 저장된 값 가져오기
        email.text = intent.getStringExtra("email")
        password.text = intent.getIntExtra("password", 0).toString()

        //버튼을 클릭했을때 액티비티 종료하기
        backBtn.setOnClickListener {
            val intent = Intent()
            intent.putExtra("result", "ok")
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        setResult(RESULT_CANCELED)
        finish()
    }
}