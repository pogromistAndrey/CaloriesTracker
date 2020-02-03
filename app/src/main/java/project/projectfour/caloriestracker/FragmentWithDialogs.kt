package project.projectfour.caloriestracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager

class FragmentWithDialogs: Fragment() {

    lateinit var pager:ViewPager

    companion object{
        fun newInstance():FragmentWithDialogs{
            var fragment = FragmentWithDialogs()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_with_dialogs,container,false)
        //showNameDialog()

        pager = view.findViewById(R.id.pager)
        val pagerAdapter = PagerAdapter(childFragmentManager)
        pager.adapter = pagerAdapter

        val question = view.findViewById<TextView>(R.id.question)
        val backButton = view.findViewById<Button>(R.id.back)
        backButton.setOnClickListener {
            if(pager.currentItem != 0) {
                pager.currentItem--
                question.setText("Вопрос ${pager.currentItem + 1} из ${pagerAdapter.count}")
            }
        }
        val nextButton = view.findViewById<Button>(R.id.next)
        nextButton.setOnClickListener {
            if(pager.currentItem + 1 != pagerAdapter.count) {
                pager.currentItem++
                question.setText("Вопрос ${pager.currentItem + 1} из ${pagerAdapter.count}")
            }
        }
        return view
    }

    fun showNameDialog() {
        val builder = AlertDialog.Builder(this.requireContext())
        val inflater = layoutInflater
        builder.setTitle("тест")
        val dialogLayout = inflater.inflate(R.layout.dialog_layout, null)
        builder.setView(dialogLayout)


        val dialog = builder.create()

        dialog.show()
    }

}