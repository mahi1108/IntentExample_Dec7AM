package cubex.mahesh.intentexample

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dial.setOnClickListener {
                val i = Intent( )
                i.action = Intent.ACTION_DIAL
                i.data = Uri.parse("tel:${et1.text.toString()}")
                startActivity(i)
        }
        next.setOnClickListener {  }
        whatsapp.setOnClickListener {  }

    }
}
