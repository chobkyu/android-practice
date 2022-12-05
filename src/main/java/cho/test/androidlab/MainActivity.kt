package cho.test.androidlab

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val name = TextView(this).apply{
            typeface = Typeface.DEFAULT_BOLD
            text="fuck"
        }

        val image = ImageView(this).also{
            it.setImageDrawable(ContextCompat.getDrawable(
                this,R.drawable.ic_launcher_background
            ))
        }

        val title = TextView(this).apply{
            typeface = Typeface.DEFAULT_BOLD
            text = "hihihihihihi"
        }

        val layout = LinearLayout(this).apply{
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            addView(name, WRAP_CONTENT, WRAP_CONTENT)
            addView(image, WRAP_CONTENT, WRAP_CONTENT)
            addView(title, WRAP_CONTENT, WRAP_CONTENT)
        }
        //setContentView(layout)
        setContentView(R.layout.activity_main)
    }
}