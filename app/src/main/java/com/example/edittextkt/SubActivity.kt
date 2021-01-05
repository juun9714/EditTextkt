package com.example.edittextkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edittextkt.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        var view=binding.root
        setContentView(view)

        if(intent.hasExtra("msg")){
            //받은 intent 객체중에 msg라는 꾸러미 있니? (hasExtra)
            binding.tvGetMsg.text=intent.getStringExtra("msg")
            //넘겨받은 intent에서 msg 꾸러미를 getStringExtra로 tvGetmsg의 text에 전달해주자
            //우리는 전달한게 string인 걸 알고 있기 때문에 getStringExtra 함수를 써준 것임
            //setText를 해줘도 됩니다.
            //서브 액티비티에 존재하는 textView에다가 준희 개짱이 넘겨져 옴
        }
    }
}