package jp.techacademy.norio.masuda.aisatsu2

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log  // ← ここを追加
import android.view.View  // ← ここを追加
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {  // ← ここを修正

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.text = "ボタン"
        button1.setOnClickListener(this)  // ← ここから以降、修正
    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI-PARTS", "$hour:$minute")
                    if(2<=hour && hour <=9 ){
                        textView.text = "おはよう"
                    }else if(10<= hour && hour <=17 ){
                        textView.text = "こんにちは"
                    }else{
                    textView.text = "こんばんは"
                }
                },
                13, 0, true)
                        timePickerDialog.show()
    }
}




