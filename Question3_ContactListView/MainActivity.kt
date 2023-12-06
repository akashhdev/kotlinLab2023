package amity.edu.labpractical

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : ComponentActivity() {

    // Contact data class
    data class Contact(val name: String, val email: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dummy list of contact objects
        val contacts = arrayOf(
            Contact("John Doe", "john.doe@example.com"),
            Contact("Jane Smith", "jane.smith@example.com"),
            Contact("Bob Johnson", "bob.johnson@example.com"),
            Contact("John Doe", "john.doe@example.com"),
            Contact("Jane Smith", "jane.smith@example.com"),
            Contact("Bob Johnson", "bob.johnson@example.com"),
            Contact("John Doe", "john.doe@example.com"),
            Contact("Jane Smith", "jane.smith@example.com"),
            Contact("Bob Johnson", "bob.johnson@example.com"),
            Contact("John Doe", "john.doe@example.com"),
            Contact("Jane Smith", "jane.smith@example.com"),
            Contact("Bob Johnson", "bob.johnson@example.com"),
            Contact("John Doe", "john.doe@example.com"),
            Contact("Jane Smith", "jane.smith@example.com"),
            Contact("Bob Johnson", "bob.johnson@example.com"),
            Contact("John Doe", "john.doe@example.com"),
            Contact("Jane Smith", "jane.smith@example.com"),
            Contact("Bob Johnson", "bob.johnson@example.com"),
            Contact("John Doe", "john.doe@example.com"),
            Contact("Jane Smith", "jane.smith@example.com"),
            Contact("Bob Johnson", "bob.johnson@example.com"),
            // Add more contacts as needed
        )

        // Get reference to ListView
        val listView: ListView = findViewById(R.id.listView)

        // Create an ArrayAdapter to populate the ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contacts)

        // Set the adapter for the ListView
        listView.adapter = adapter
    }


}
