package com.example.projetcreativite

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nom: EditText
    private lateinit var prenom: EditText
    private lateinit var email: EditText
//    private lateinit var numero: EditText
    private lateinit var affiche: Button
    private lateinit var boutton: Button
    private lateinit var view: TextView
    private lateinit var gridView: GridView
    private lateinit var tableLayout: TableLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nom = findViewById(R.id.editTextText)
        prenom = findViewById(R.id.editTextText2)
        email = findViewById(R.id.editTextText3)
//        numero = findViewById(R.id.editTextText4)
        affiche = findViewById(R.id.button)
        boutton = findViewById(R.id.button2)
        view = findViewById(R.id.textView)
        gridView = findViewById(R.id.GridView)
        tableLayout = findViewById(R.id.tableLayout)

        affiche.setOnClickListener {
            afichage()
        }

        boutton.setOnClickListener {
            list()
        }
    }

    private fun afichage() {
        val anarana = nom.text.toString()
        val prenome = prenom.text.toString()
        val emaile = email.text.toString()
//        val numeroe = numero.text.toString()

        if (anarana.isEmpty() && prenome.isEmpty() && emaile.isEmpty()) {
            Toast.makeText(this, "fenoy ny banga", Toast.LENGTH_SHORT).show()
        } else {
            val mess = "nom:$anarana"
            val a = "prenom:$prenome"
            val b = "email:$emaile"
//            val d = "numero:$numeroe"
            Toast.makeText(this, mess, Toast.LENGTH_LONG).show()
            Toast.makeText(this, a, Toast.LENGTH_LONG).show()
            Toast.makeText(this, b, Toast.LENGTH_LONG).show()

        }
    }

    private fun list() {
        val anarana = nom.text.toString()
        val prenome = prenom.text.toString()
        val emaile = email.text.toString()
//        val numeroe = numero.text.toString()

        if (anarana.isEmpty() && prenome.isEmpty() && emaile.isEmpty()) {
            Toast.makeText(this, "fenoy ny banga", Toast.LENGTH_SHORT).show()
        } else {
            val message = "nom:$anarana\nprenom:$prenome\nemail:$emaile\n"
            view.text = message

            // GridView
            val gridAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListOf(message))
            gridView.adapter = gridAdapter

            // TableLayout
            val tableRow = TableRow(this)
            val textView = TextView(this)
            textView.text = message
            tableRow.addView(textView)
            tableLayout.addView(tableRow)
        }
    }
}
