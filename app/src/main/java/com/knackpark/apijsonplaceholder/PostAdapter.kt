package com.knackpark.apijsonplaceholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(private val posts: List<Posts>):RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item , parent , false))
    }

    override fun getItemCount(): Int {
       return posts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val view  = posts[position]
        holder.bind(view)
    }


    class ViewHolder( itemView: View): RecyclerView.ViewHolder(itemView) {
        private val id = itemView.findViewById<TextView>(R.id.idTextView)
        private val title = itemView.findViewById<TextView>(R.id.titleTextView)
        private val body = itemView.findViewById<TextView>(R.id.bodyTextView)


        fun bind(post:Posts){

            id.text = post.id.toString()
            title.text = post.title
            body.text = post.body
        }

    }

}