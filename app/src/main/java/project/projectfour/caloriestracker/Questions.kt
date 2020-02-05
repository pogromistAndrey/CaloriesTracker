package project.projectfour.caloriestracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import project.projectfour.caloriestracker.ViewModels.UserViewModel

class FragmentQuestionOne: Fragment() {
    var userViewModel:UserViewModel? = null
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
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }
        return view
    }
}

class FragmentQuestionTwo: Fragment() {
    var userViewModel:UserViewModel? = null
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
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }
        //showNameDialog()

        return view
    }
}

class FragmentQuestionThree: Fragment() {
    var userViewModel:UserViewModel? = null
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
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }
        //showNameDialog()

        return view
    }
}

class FragmentQuestionFour: Fragment() {
    var userViewModel:UserViewModel? = null
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
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }
        //showNameDialog()

        return view
    }
}

class FragmentQuestionFive: Fragment() {
    var userViewModel:UserViewModel? = null
    companion object{
        fun newInstance():FragmentQuestionFive{
            var fragment = FragmentQuestionFive()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q5,container,false)
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }
        //showNameDialog()

        return view
    }
}

class FragmentQuestionSix: Fragment() {
    var userViewModel:UserViewModel? = null
    companion object{
        fun newInstance():FragmentQuestionSix{
            var fragment = FragmentQuestionSix()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q6,container,false)
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }
        //showNameDialog()

        return view
    }
}

class FragmentQuestionSeven: Fragment() {
    var userViewModel:UserViewModel? = null
    companion object{
        fun newInstance():FragmentQuestionSeven{
            var fragment = FragmentQuestionSeven()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q7,container,false)
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }
        //showNameDialog()

        return view
    }
}

class FragmentQuestionEight: Fragment() {
    var userViewModel:UserViewModel? = null
    companion object{
        fun newInstance():FragmentQuestionEight{
            var fragment = FragmentQuestionEight()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q8,container,false)
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }
        //showNameDialog()

        return view
    }
}