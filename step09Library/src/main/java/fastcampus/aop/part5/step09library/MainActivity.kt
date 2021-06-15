package fastcampus.aop.part5.step09library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

/*
    Framework
    - 개발을 하기 위해 지켜야 하는 틀

    Library
    - 개발을 하기 위해 필요한 도구들이 미리 구현되어 있는 것
    - 함수나, 클래스로 구현이 되어 있다.

    특징
    - 프레임워크에서 하기 힘든 것들을 쉽게 사용할 수 있도록 만들어 놨다.
    - 프레임워크에서 제공하지 않는 기능을 사용할 수 있도록 만들어 놨다.


 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val glide = findViewById<ImageView>(R.id.glide)

        Glide.with(this@MainActivity)
            .load("https://image.laftel.net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg")
            .centerCrop()
            .into(glide)
    }
}