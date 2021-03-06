package com.example.myapplication.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import kotlinx.android.synthetic.main.layout_bog_list_item.view.*

class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var items: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.


        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_bog_list_item,parent,false)
        )
    }



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        when(holder){
            is BlogViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }
    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        return  items.size
    }

    fun submitList(blogList:List<BlogPost>){
        items = blogList
    }



    class BlogViewHolder constructor(
        itemView: View




    ):RecyclerView.ViewHolder(itemView){

        val blog_image :ImageView  =itemView.blog_image
        val blog_title:TextView =itemView.blog_title
        val blogAuthor :TextView =itemView.blog_author

        fun bind(blogPost:BlogPost){
            blog_title.setText(blogPost.title)
            blogAuthor.setText(blogPost.username)

            Glide.with(itemView.context)
                .load(blogPost.image)
                .into(blog_image)




        }




    }

}
