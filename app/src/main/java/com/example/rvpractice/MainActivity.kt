package com.example.rvpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var studentRv:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val studentArray= arrayListOf<StudentModel>()
        studentArray.add(StudentModel(R.drawable.a,"Ahmad",1))
        studentArray.add(StudentModel(R.drawable.b,"Ahmad",2))
        studentArray.add(StudentModel(R.drawable.c,"Ahmad",3))
        studentArray.add(StudentModel(R.drawable.d,"Ahmad",4))
        studentArray.add(StudentModel(R.drawable.e,"Ahmad",5))
        studentArray.add(StudentModel(R.drawable.a,"Ahmad",6))
        studentArray.add(StudentModel(R.drawable.b,"Ahmad",7))
        studentArray.add(StudentModel(R.drawable.c,"Ahmad",8))
        studentArray.add(StudentModel(R.drawable.d,"Ahmad",9))
        studentArray.add(StudentModel(R.drawable.e,"Ahmad",10))
        studentArray.add(StudentModel(R.drawable.a,"Ahmad",11))
        setContentView(R.layout.activity_main)
        studentRv=findViewById(R.id.studentRv)
        studentRv.adapter=StudentAdapter(studentArray)
        studentRv.layoutManager=LinearLayoutManager(this)
        studentRv.setHasFixedSize(true)
    }
}