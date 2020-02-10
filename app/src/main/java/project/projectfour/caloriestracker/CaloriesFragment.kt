package project.projectfour.caloriestracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CaloriesFragment:Fragment() {
    companion object{
        fun newInstance():CaloriesFragment{
            return CaloriesFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.fragment_calories,container,false)
        val eatingView = view.findViewById<RecyclerView>(R.id.eating_view)
        eatingView.layoutManager = LinearLayoutManager(this.requireContext())
        eatingView.adapter = EatingRecyclerViewAdapter()
        return view
    }
}