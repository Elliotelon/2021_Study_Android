package fastcampus.aop.part5.step12recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "홍드로이드0", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.woman, "홍드로이드1", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드2", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.woman, "홍드로이드3", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드4", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.woman, "홍드로이드5", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드6", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.woman, "홍드로이드7", 27, "안드로이드 앱 개발자"),
            Profiles(R.drawable.man, "홍드로이드8", 27, "안드로이드 앱 개발자")
        )

        val rv_profile = findViewById<RecyclerView>(R.id.rv_profile)
        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = ProfileAdapter(profileList)

    }
}