package fastcampus.aop.part4.step01fragment

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private val resultText by lazy {findViewById<TextView>(R.id.resultText)  }

    val getAction = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->
        if(result.resultCode == Activity.RESULT_OK){
            resultText.text = result.data?.getStringExtra("result")
        }else {
            resultText.text = "Fail"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //인텐트 생성
        val intent = Intent(this, SecondActivity::class.java)

        //인텐트에 이메일, 비밀번호 넣기
        intent.putExtra("email", "abc@naver.com")
        intent.putExtra("password", 1234)

        //화면이동 버튼의 참조값 가져오기
        val moveBtn = findViewById<Button>(R.id.moveBtn)
        val moveBtn2 = findViewById<Button>(R.id.moveBtn2)

        //버튼을 클릭했을때 화면 전환 하기
        moveBtn.setOnClickListener {
            startActivity(intent)
        }

        //버튼을 클릭했을때 화면 전환 하기
        moveBtn2.setOnClickListener {
            getAction.launch(intent)
        }
    }
}