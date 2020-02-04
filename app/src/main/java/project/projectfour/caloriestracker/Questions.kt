package project.projectfour.caloriestracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentQuestionOne: Fragment() {
    companion object{
        fun newInstance():FragmentQuestionOne{
            var fragment = FragmentQuestionOne()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q1,container,false)
        //showNameDialog()

        return view
    }
}

class FragmentQuestionTwo: Fragment() {
    companion object{
        fun newInstance():FragmentQuestionTwo{
            var fragment = FragmentQuestionTwo()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q2,container,false)
        //showNameDialog()

        return view
    }
}

class FragmentQuestionThree: Fragment() {
    companion object{
        fun newInstance():FragmentQuestionThree{
            var fragment = FragmentQuestionThree()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q3,container,false)
        //showNameDialog()

        return view
    }
}

class FragmentQuestionFour: Fragment() {
    companion object{
        fun newInstance():FragmentQuestionFour{
            var fragment = FragmentQuestionFour()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q4,container,false)
        //showNameDialog()

        return view
    }
}