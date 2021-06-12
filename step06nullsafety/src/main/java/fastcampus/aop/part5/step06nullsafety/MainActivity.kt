package fastcampus.aop.part5.step06nullsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
    Null Safety
    -> Null에 대해서 안전하다
    -> 코틀린의 특징

    Null vs 0
    -> 0 : 휴지를 다 쓰고 휴지심만 남은 상태
    -> Null : 휴지심도 없는 상태, 존재하지 않는 상태, 모르는 상태

    Null이 안전하지 않은 이유
    -> 0 + 10 = 10
    -> Null + 10 = ? -> 에러
    -> NullPointExceptionError 발생

    코틀린이 Null Safety 하기 위해서 사용하는 문법
    -> ? : Null이 아니라면 이하 구문 실행
    -> !! : Null이 아님을 개발자가 보장

    사용방법
    button?.setOnClickListener
    button!!.setOnClickListener

    Null이 될 수 있는 타입
    Int, Double, Float, Class -> Null이 될 수 없는 타입
    Int?, Double?, Float?, Class? -> Null이 될 수 있는 타입

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number : Int = 10
        val number1 : Int? = null

        val number3 = number1?.plus(number)

        val number4 = number1 ?: 10
    }

    fun plus(a: Int, b: Int?) : Int? {
        if(b != null) return a + b
        else return a
    }

    fun plus2(a: Int, b: Int?) : Int? {
        return b?.plus(a)
    }
}