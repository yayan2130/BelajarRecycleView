package com.example.modul5_tugas

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users> ()
    val listUsers = arrayOf(
            "Andi",
            "Budi",
            "Carli",
            "Dodi",
            "Eka",
            "Fani",
            "Gilang",
            "Hana",
            "Indiana",
            "Julian"
    )

    val halo = arrayOf(
        "halo"
    )
    override fun onCreate(savedInstanceState:
                          Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager =
            LinearLayoutManager(this )
        for (i in 0 until listUsers.size){
            list.add(Users(listUsers.get(i)))
            if (listUsers.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter
                adapter.setOnClickListener {
                    Toast.makeText(this, "Halo " + listUsers[it], Toast.LENGTH_SHORT).show()
                }
            }
        }
        mRecyclerView.scrollToPosition(halo.size -
                1);
    }
}
