package project.projectfour.caloriestracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

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
    init {
        val addProduct = itemView.findViewById<MaterialButton>(R.id.add_product)
        addProduct.setOnClickListener {
            (itemView.context as MainActivity).replaceFragment(EatFragment.newInstance(), true)
        }

    }

    /*fun showProductDialog() {
        val builder = AlertDialog.Builder(itemView.context)
        val inflater = LayoutInflater.from(itemView.context)
        builder.setTitle("тест")
        val dialogLayout = inflater.inflate(R.layout.products_dialog, null)
        builder.setView(dialogLayout)

        val dialog = builder.create()

        dialog.show()
    }*/

}