package cubex.mahesh.intentexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val  name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")

        tv1.text = "Welcome To NareshIT \n $name \n $email"
    }
}
