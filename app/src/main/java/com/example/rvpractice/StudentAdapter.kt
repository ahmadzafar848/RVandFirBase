package com.example.rvpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val studentList:ArrayList<StudentModel>):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.student_rv_layout,parent,false)
        return  StudentViewHolder(itemView)
    }

    override fun getItemCount(): Int {
     return  studentList.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
       holder.image.setImageResource(studentList[position].image)
        holder.studentFirstName.text=studentList[position].studentName
        holder.studentRollNo.text=studentList[position].studentRollNumber.toString()
    }
    class StudentViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val image=itemView.findViewById<ImageView>(R.id.studentPic)
        val studentFirstName=itemView.findViewById<TextView>(R.id.studentFirstName)
        val studentRollNo=itemView.findViewById<TextView>(R.id.studentRollNo)
    }
}