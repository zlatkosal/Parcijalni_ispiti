import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcijalni.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var editTextTitle: EditText
    private lateinit var editTextDetails: EditText
    private lateinit var buttonSave: Button

    private val reminderList = ArrayList<Reminder>()
    private lateinit var adapter: RecyclerView.Adapter<*>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewReminders)
        editTextTitle = findViewById(R.id.editTextTitle)
        editTextDetails = findViewById(R.id.editTextDetails)
        buttonSave = findViewById(R.id.buttonSave)

        adapter = object : RecyclerView.Adapter<ReminderViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReminderViewHolder {
                val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_reminder, parent, false)
                return ReminderViewHolder(itemView)
            }

            override fun onBindViewHolder(holder: ReminderViewHolder, position: Int) {
                val reminder = reminderList[position]
                holder.bind(reminder)
            }

            override fun getItemCount(): Int {
                return reminderList.size
            }
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        buttonSave.setOnClickListener {
            val title = editTextTitle.text.toString()
            val details = editTextDetails.text.toString()

            if (title.isNotEmpty() && details.isNotEmpty()) {
                val reminder = Reminder(title, details)
                reminderList.add(reminder)
                adapter.notifyDataSetChanged()
                clearFields()
            }
        }
    }

    private fun clearFields() {
        editTextTitle.text.clear()
        editTextDetails.text.clear()
    }

    data class Reminder(val title: String, val details: String)

    inner class ReminderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
        private val detailsTextView: TextView = itemView.findViewById(R.id.textViewDetails)

        fun bind(reminder: Reminder) {
            titleTextView.text = reminder.title
            detailsTextView.text = reminder.details
        }
    }
}
