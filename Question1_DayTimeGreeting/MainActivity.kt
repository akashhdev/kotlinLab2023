package amity.edu.labpractical

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import amity.edu.labpractical.ui.theme.LabPracticalTheme
import android.widget.TextView
import android.widget.Toast
import java.time.LocalDateTime

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.text_view_id) as TextView

        // access current time
        val current = LocalDateTime.now().toString().subSequence(11,13)
        val time = current.toString().toInt()

        var greeting = "Good "
        if (time < 12 ){
            greeting += "Morning!"
        }
        else if (time >= 12) {
            greeting += "Afternoon!"
        }

        else if (time >= 5) {
            greeting += "Evening!"
        }


        textView.setText(greeting).toString()
    }



}
