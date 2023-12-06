package amity.edu.labpractical

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to EditText, TextView, and Button
        val numberEditText: EditText = findViewById(R.id.editText)
        val resultTextView: TextView = findViewById(R.id.text_view_id)
        val calculateButton: Button = findViewById(R.id.showInput)

        // Set onClickListener for the Button
        calculateButton.setOnClickListener {
            // Get the entered number as a string
            val numberStr = numberEditText.text.toString()

            // Check if the input is not empty
            if (numberStr.isNotEmpty()) {
                // Convert the string to a double
                val number = numberStr.toDouble()

                // Calculate the square
                val square = number * number

                // Display the result in the TextView
                resultTextView.text = "Square: $square"
            } else {
                // If the input is empty, display an error message
                resultTextView.text = "Please enter a number"
            }
        }
    }

}
