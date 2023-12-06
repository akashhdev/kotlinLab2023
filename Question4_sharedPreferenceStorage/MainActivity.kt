package amity.edu.labpractical

import androidx.activity.ComponentActivity
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {

    // Contact data class
    data class Contact(val name: String, val email: String)
    val PREFS_FILENAME = ""
    val KEY_USER_NAME = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize SharedPreferences
        var sharedPreferences = getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)

        // Get references to UI elements
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val saveButton: Button = findViewById(R.id.saveButton)
        val displayTextView: TextView = findViewById(R.id.displayTextView)

        // Load the saved name from SharedPreferences
        val savedName = sharedPreferences.getString(KEY_USER_NAME, "")
        displayTextView.text = "Welcome back, $savedName!"

        // Set onClickListener for the Save button
        saveButton.setOnClickListener {
            // Get the user-entered name
            val userName = nameEditText.text.toString()

            // Save the name in SharedPreferences
            with(sharedPreferences.edit()) {
                putString(KEY_USER_NAME, userName)
                apply()
            }

            // Display a welcome message
            displayTextView.text = "Hello, $userName!"
        }
    }


}
