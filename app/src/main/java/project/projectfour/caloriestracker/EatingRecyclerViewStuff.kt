package project.projectfour.caloriestracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EatingRecyclerViewAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.eating_view, parent, false)
        return EatingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4;
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

}

class EatingViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

}