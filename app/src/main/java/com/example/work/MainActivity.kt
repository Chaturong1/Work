package com.example.work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text01:TextView = findViewById(R.id.text01)
        text01.setText("Malong")

        var name: EditText = findViewById(R.id.Username)
        var pass: EditText = findViewById(R.id.Password)
        var con: EditText = findViewById(R.id.Confirm)
        var ok: Button = findViewById(R.id.OK)
        var clear: Button = findViewById(R.id.CLEAR)

        clear.setOnClickListener() {
            name.setText("")
            pass.setText("")
            con.setText("")
            val toast = Toast.makeText(applicationContext, "ลบสำเร็จ!!!", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var username = name.text.toString()
            var password = pass.text.toString()
            var confirmpassword = con.text.toString()
            if(username == ""  ||password == ""  ||confirmpassword == ""){
                Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_LONG).show()
            }
            else if(username == password && username == confirmpassword) {
                Toast.makeText(applicationContext, "อย่ากรอก Username ตรงกับ Password", Toast.LENGTH_LONG).show()
            }
            else if(password != confirmpassword){
                Toast.makeText(applicationContext, "กรุณากรอกพาสให้ตรงกัน", Toast.LENGTH_LONG).show()

            }
            else{
                Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
            }
        }


    }
}