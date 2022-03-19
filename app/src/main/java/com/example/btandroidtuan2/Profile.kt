package com.example.btandroidtuan2

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Profile : AppCompatActivity() {
    private lateinit var editfullname : EditText
    private lateinit var editemail: EditText
    private lateinit var editphone: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        editemail = findViewById(R.id.editemail)
        editfullname = findViewById(R.id.editfullname)
        editphone = findViewById(R.id.editphone)
        editfullname.setOnClickListener {
            it.hideKeyboard()
            showdialogfullname()
        }
        editemail.setOnClickListener {
            it.hideKeyboard()
            showdialogemail()
        }
        editphone.setOnClickListener {
            it.hideKeyboard()
            showdialogphone()
        }
    }
    fun showdialogfullname(){
        val builder : android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        builder.setTitle("Edit fullname")
        val input = EditText(this)
        input.setHint("Enter fullname")
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)
        builder.setPositiveButton("OK",DialogInterface.OnClickListener { dialogInterface, i ->
            var text = input.text.toString()
            editfullname.text = Editable.Factory.getInstance().newEditable(text)
        })
        builder.setNegativeButton("Cancel",DialogInterface.OnClickListener { dialogInterface, i ->
            dialogInterface.cancel()
        })
        builder.show()
    }
    fun showdialogemail(){
        val builder : android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        builder.setTitle("Edit email")
        val input = EditText(this)
        input.setHint("Enter new email")
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)
        builder.setPositiveButton("OK",DialogInterface.OnClickListener { dialogInterface, i ->
            var text = input.text.toString()
            editemail.text = Editable.Factory.getInstance().newEditable(text)
        })
        builder.setNegativeButton("Cancel",DialogInterface.OnClickListener { dialogInterface, i ->
            dialogInterface.cancel()
        })
        builder.show()
    }
    fun showdialogphone(){
        val builder : android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        builder.setTitle("Edit phone")
        val input = EditText(this)
        input.setHint("Enter new phone")
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)
        builder.setPositiveButton("OK",DialogInterface.OnClickListener { dialogInterface, i ->
            var text = input.text.toString()
            editphone.text = Editable.Factory.getInstance().newEditable(text)
        })
        builder.setNegativeButton("Cancel",DialogInterface.OnClickListener { dialogInterface, i ->
            dialogInterface.cancel()
        })
        builder.show()
    }
    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
}