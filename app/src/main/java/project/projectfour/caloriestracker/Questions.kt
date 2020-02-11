package project.projectfour.caloriestracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.button.MaterialButton
import project.projectfour.caloriestracker.ViewModels.UserViewModel
import project.projectfour.caloriestracker.data.CaloriesMode
import project.projectfour.caloriestracker.data.Gender
import project.projectfour.caloriestracker.data.Mobility
import project.projectfour.caloriestracker.data.Type

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
        userViewModel = activity?.let { ViewModelProviders.of(it).get(UserViewModel::class.java) }
        val b_loss = view.findViewById<MaterialButton>(R.id.loss)
        b_loss.setOnClickListener { userViewModel?.setType(Type.LESS) }
        val b_add = view.findViewById<MaterialButton>(R.id.add)
        b_add.setOnClickListener { userViewModel?.setType(Type.ADD) }
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
        val text = view.findViewById<EditText>(R.id.editText)
        text.setOnKeyListener { view, i, keyEvent ->
            val a = ((view as EditText).text).toString()
            if(!a.equals("")) {
                val b = a.toIntOrNull()
                if (b != null)
                    userViewModel?.setWeight(b)
            }
            false
        }
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
        val text = view.findViewById<EditText>(R.id.editText)
        text.setOnKeyListener { view, i, keyEvent ->
            val a = ((view as EditText).text).toString()
            if(!a.equals("")) {
                val b = a.toIntOrNull()
                if (b != null)
                    userViewModel?.setDesiredWeight(b)
            }
            false
        }
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
        val b_low = view.findViewById<MaterialButton>(R.id.low)
        b_low.setOnClickListener { userViewModel?.setMobility(Mobility.LOW) }
        val b_medium = view.findViewById<MaterialButton>(R.id.medium)
        b_medium.setOnClickListener { userViewModel?.setMobility(Mobility.MEDIUM) }
        val b_high = view.findViewById<MaterialButton>(R.id.high)
        b_high.setOnClickListener { userViewModel?.setMobility(Mobility.HIGH) }
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
        val b_male = view.findViewById<MaterialButton>(R.id.male)
        b_male.setOnClickListener { userViewModel?.setGender(Gender.MALE) }
        val b_female = view.findViewById<MaterialButton>(R.id.female)
        b_female.setOnClickListener { userViewModel?.setGender(Gender.FEMALE) }
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
        val text = view.findViewById<EditText>(R.id.editText)
        text.setOnKeyListener { view, i, keyEvent ->
            val a = ((view as EditText).text).toString()
            if(!a.equals("")) {
                val b = a.toIntOrNull()
                if (b != null)
                    userViewModel?.setAge(b)
            }
            false
        }
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
        val text = view.findViewById<EditText>(R.id.editText)
        text.setOnKeyListener { view, i, keyEvent ->
            val a = ((view as EditText).text).toString()
            if(!a.equals("")) {
                val b = a.toIntOrNull()
                if (b != null)
                    userViewModel?.setHeight(b)
            }
            false
        }
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

        val b_slow = view.findViewById<MaterialButton>(R.id.slow)
        b_slow.setOnClickListener { userViewModel?.setMode(CaloriesMode.SLOW) }

        val b_normal = view.findViewById<MaterialButton>(R.id.normal)
        b_normal.setOnClickListener { userViewModel?.setMode(CaloriesMode.NORMAL) }

        val b_fast = view.findViewById<MaterialButton>(R.id.fast)
        b_fast.setOnClickListener { userViewModel?.setMode(CaloriesMode.FAST) }


        return view
    }
}