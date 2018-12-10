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
          //      i.action = Intent.ACTION_DIAL
          //      i.data = Uri.parse("tel:${et1.text}")
        //            i.action = Intent.ACTION_VIEW
        //            i.data = Uri.parse("${et1.text}")
            i.action = Intent.ACTION_GET_CONTENT
            i.type = "image/*"
                startActivity(i)
        }
        next.setOnClickListener {
            val i = Intent(this@MainActivity,
                                            WelcomeActivity::class.java)
            i.putExtra("name",et2.text.toString())
            i.putExtra("email",et3.text.toString())

            startActivity(i)
        }
        whatsapp.setOnClickListener {
            val i = packageManager.
                getLaunchIntentForPackage("com.whatsapp")
            if(i==null){
                    val i1 = Intent( )
                    i1.action = Intent.ACTION_VIEW
                    i1.data = Uri.parse(
                        "https://play.google.com/store/apps/details?id=com.whatsapp")
                    startActivity(i1)
            }else {
                startActivity(i)
            }
        }

    }
}
