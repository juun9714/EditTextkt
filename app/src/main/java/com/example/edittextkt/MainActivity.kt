package com.example.edittextkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edittextkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //액티비티가 최초 실행되면 이곳을 실행한다.
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGetText.setOnClickListener(){
            //btn을 눌렀을 때 아래의 코드들이 작동하게 된다.
            // action 에딧 텍스트에 입력되어있는 값을 가지고 와서 텍스트뷰에 뿌려준다.
            var resultText=binding.etId.text.toString()
            //etId의 text 값을 string 형태로 변환해서 가지고 와서 resultText에 저장해주세요

            binding.tvResult.setText(resultText)
        }
    }
}