package com.tj.a20191030_01_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // xml에 그려진 초기 값이라고 적힌 텍스트뷰의 글자를 '실행 후'로 변경
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strTest = "기백2다"
        firstTextView.text = strTest

        okBtn.setOnClickListener {
            firstTextView.text = "확인 버튼 클릭 됨"
        }

        okBtn.setOnLongClickListener {
            firstTextView.text = "님 좀 짱인듯!"
            return@setOnLongClickListener true
        }
    // @라벨 에 대한 예시, 책 49p

        firstFor@ for (i in 0..10){
            secondFor@ for (j in 0..10) {
                Log.d("코틀린 기초", "$i $j")
                if(j==2) {
                    break@firstFor
                }
            }
        }

        var stringListTemp = ArrayList<String>()
        stringListTemp.add("AAA")
//        stringListTemp.add(333) // 에러 발생

        var stringList:ArrayList<String> = ArrayList()

        stringList.add("조근택")
        stringList.add("한용수")
        stringList.add("유호인")

        var intList:ArrayList<Int> = ArrayList()

        intList.add(10)
        intList.add(20)
        intList.add(30)

        val indexOfCho = stringList.indexOf("조근택");

        Log.d("코틀린 기초","조근택의 위치 : $indexOfCho")

        var a = 10
        var b = 20

        var c = if (a == b) {
            Log.d("코틀린 기초", "같음")
        } else {
            Log.d("코틀린 기초", "다름")
        } // 이런 문법도 가능함, 책 39p

        when(a) {
            0, 1 -> Log.d("코틀린 기초", "a가 0이나 1이다")
            in 2..5 -> Log.d("코틀린 기초", "a가 2~5 사이")
            in intList -> Log.d("코틀린 기초", "a가 intList에 포함")
            !in intList -> Log.d("코틀린 기초", "a가 intList에 불포함")
        }

        // 커밋 한번용 주석
        for (name in stringList) {
            Log.d("코틀린 기초", "$name 고맙지 뭐야~")
        }

        for (i in 0..5) {
            Log.d("코틀린 기초", "$i")
        }
    }

}
