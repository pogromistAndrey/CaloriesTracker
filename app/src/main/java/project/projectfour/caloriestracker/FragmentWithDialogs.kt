package project.projectfour.caloriestracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar
import project.projectfour.caloriestracker.ViewModels.UserViewModel

class FragmentWithDialogs: Fragment() {

    lateinit var pager:ViewPager
    var userViewModel:UserViewModel? = null
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
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }

        pager = view.findViewById(R.id.pager)
        val pagerAdapter = PagerAdapter(childFragmentManager)
        pager.adapter = pagerAdapter

        val question = view.findViewById<TextView>(R.id.question)
        val backButton = view.findViewById<MaterialButton>(R.id.back)
        backButton.setOnClickListener {
            if(pager.currentItem != 0) {
                pager.currentItem--
                question.setText("Вопрос ${pager.currentItem + 1} из ${pagerAdapter.count}")
            }
        }
        val nextButton = view.findViewById<MaterialButton>(R.id.next)
        nextButton.setOnClickListener {
            var check:Boolean? = true
            var mesage = ""
            when(pager.currentItem){
                0 ->{
                    check = userViewModel?.checkType()
                    mesage = getString(R.string.err0)
                }
                1 -> {
                    check = userViewModel?.checkWeight()
                    mesage = getString(R.string.err1)
                }
                2 -> {
                    check = userViewModel?.checkDesiredWeight()
                    mesage = getString(R.string.err2)
                }
                3 -> {
                    check = userViewModel?.checkMobility()
                    mesage = getString(R.string.err3)
                }
                4 -> {
                    check = userViewModel?.checkGender()
                    mesage = getString(R.string.err4)
                }
                5 -> {
                    check = userViewModel?.checkAge()
                    mesage = getString(R.string.err5)
                }
                6 -> {
                    check = userViewModel?.checkHeight()
                    mesage = getString(R.string.err6)
                }
                7 -> {
                    check = userViewModel?.checkMode()
                    mesage = getString(R.string.err7)
                }
            }
            if(check == true) {
                if (pager.currentItem + 1 != pagerAdapter.count) {
                    pager.currentItem++
                    question.setText("Вопрос ${pager.currentItem + 1} из ${pagerAdapter.count}")
                } else {
                    (activity as MainActivity).replaceFragment(CaloriesFragment.newInstance(),false)
                }
            } else {
                Snackbar.make(view, mesage, Snackbar.LENGTH_SHORT).setAction("Action", null).show()
            }
        }
        return view
    }



}