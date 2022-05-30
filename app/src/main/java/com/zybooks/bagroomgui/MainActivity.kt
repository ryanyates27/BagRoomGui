package com.zybooks.bagroomgui


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openBagList(view: View)
    {
        val intent = Intent(this, BagList::class.java)

        startActivity(intent)

    }

    fun openEmployee(view: View)
    {
        val intent = Intent(this, Employees::class.java)
        startActivity(intent)
    }
}