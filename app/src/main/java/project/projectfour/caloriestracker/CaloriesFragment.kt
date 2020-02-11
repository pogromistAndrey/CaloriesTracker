package project.projectfour.caloriestracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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

        val foodProgressBar = view.findViewById<ProgressBar>(R.id.food_progress_bar)
        foodProgressBar.max = 100
        GlobalScope.launch (Dispatchers.Main){
            var dir = 1
            val job = launch {
                while(true){
                    if(foodProgressBar.progress == 0) {
                        dir = 1
                    } else if(foodProgressBar.progress == foodProgressBar.max) {
                        dir = -1
                    }
                    foodProgressBar.progress += 2*dir
                    System.out.println(foodProgressBar.progress)
                    delay(30)
                }
            }
        }
        return view
    }
}