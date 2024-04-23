package com.example.mvvmretrofitrecylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmretrofitrecylerview.databinding.ItemFileBinding
import com.example.mvvmretrofitrecylerview.Model.Result

class ItemAdapter():RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    private var movieList = ArrayList<Result>()

    fun setDataMovie(moviesList: List<Result>){
        this.movieList = moviesList as ArrayList<Result>
        notifyDataSetChanged()

    }

    class ViewHolder(val binding: ItemFileBinding):RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = ItemFileBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.name.text = movieList[position].title
        Glide.with(holder.itemView).load("https://image.tmdb.org/t/p/w500"+movieList[position].poster_path)
            .into(holder.binding.image)
//        holder.binding.cardView.setOnClickListener {
////            Toast.makeTe, movieList[position].title, Toast.LENGTH_SHORT).show()
//        }
    }
}