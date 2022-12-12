package cho.test.androidlab

import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var initTime = 0L
    lateinit var resultView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        resultView = findViewById(R.id.resultView);

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var eventType =""
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> eventType = "DOWN EVENT"
            MotionEvent.ACTION_UP -> eventType = "UP EVENT"
            MotionEvent.ACTION_MOVE -> eventType = "MOVE EVENT"

        }

        resultView.text ="$eventType : x - ${event?.x}, y - ${event?.y}"


        return super.onTouchEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if(keyCode === KeyEvent.KEYCODE_BACK){
            if(System.currentTimeMillis() - initTime > 3000){
                Toast.makeText(this, "종료하려면 한번 더 누르세요",
                    Toast.LENGTH_SHORT).show()
                    initTime = System.currentTimeMillis()
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }
}