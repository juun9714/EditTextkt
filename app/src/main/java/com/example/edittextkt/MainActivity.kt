package com.example.edittextkt

import android.content.Intent
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

        binding.btnA.setOnClickListener{
            val intent= Intent(this,SubActivity::class.java)
            //다음 화면으로 이동하기 위한 Intent 객체 생성.
            intent.putExtra("msg",binding.tvSendMsg.text.toString())
            //msg = 해당 값을 열기 위한 열쇠(이 열쇠로 잠궈서 sub activity로 보낸다.) && 꾸러미
            //두번째 인자는 실제 전달해줘야 할 값
            startActivity(intent)
            //sub activity로 intent를 넘기고 sub activity를 실행했다.

            //만약 이제 앞으로 모든 활동이 sub activity에서 이루어져서 main activity를 없애는게 나을 수도!
            //-> finish() 함수를 활용하면 main activity를 폭파할 수 있음 = sub activity에서 뒤로 돌아갈 수 없음 = 뒤로가기를 누르면 바로 app이 종료된다
            finish()
        }
    }
}