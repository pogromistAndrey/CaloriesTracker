package project.projectfour.caloriestracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.NumberPicker
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.button.MaterialButton
import project.projectfour.caloriestracker.ViewModels.UserViewModel
import project.projectfour.caloriestracker.data.*

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
        val userObserver = Observer<User>{newUser ->
            when (userViewModel?.user?.type){
                Type.ADD ->{
                    b_add.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                    b_loss.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
                Type.LESS ->{
                    b_add.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_loss.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                }
                Type.NOTHING ->{
                    b_add.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_loss.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
            }
        }
        userViewModel?.userLiveData?.observe(this, userObserver)
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

        val digit1 = view.findViewById<NumberPicker>(R.id.numberPicker1);
        digit1.setMaxValue(9);
        digit1.setMinValue(0);
        val digit2 = view.findViewById<NumberPicker>(R.id.numberPicker2);
        digit2.setMaxValue(9);
        digit2.setMinValue(0);
        val digit3 = view.findViewById<NumberPicker>(R.id.numberPicker3);
        digit3.setMaxValue(9);
        digit3.setMinValue(0);
        digit1.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setWeight(digit1.value*100 + digit2.value*10 + digit3.value)
        }
        digit2.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setWeight(digit1.value*100 + digit2.value*10 + digit3.value)
        }
        digit3.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setWeight(digit1.value*100 + digit2.value*10 + digit3.value)
        }

        val userObserver = Observer<User> { newUser ->
            digit1.value = 5
            digit2.value = 5
            digit3.value = 5
        }
        userViewModel?.userLiveData?.observe(this, userObserver)

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

        val digit1 = view.findViewById<NumberPicker>(R.id.numberPicker1);
        digit1.setMaxValue(9);
        digit1.setMinValue(0);
        val digit2 = view.findViewById<NumberPicker>(R.id.numberPicker2);
        digit2.setMaxValue(9);
        digit2.setMinValue(0);
        val digit3 = view.findViewById<NumberPicker>(R.id.numberPicker3);
        digit3.setMaxValue(9);
        digit3.setMinValue(0);
        digit1.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setDesiredWeight(digit1.value*100 + digit2.value*10 + digit3.value)
        }
        digit2.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setDesiredWeight(digit1.value*100 + digit2.value*10 + digit3.value)
        }
        digit3.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setDesiredWeight(digit1.value*100 + digit2.value*10 + digit3.value)
        }

        val userObserver = Observer<User> { newUser ->
            digit1.value = 5
            digit2.value = 5
            digit3.value = 5
        }
        userViewModel?.userLiveData?.observe(this, userObserver)

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

        val b_low = view.findViewById<MaterialButton>(R.id.low)
        b_low.setOnClickListener { userViewModel?.setMobility(Mobility.LOW) }
        val b_medium = view.findViewById<MaterialButton>(R.id.medium)
        b_medium.setOnClickListener { userViewModel?.setMobility(Mobility.MEDIUM) }
        val b_high = view.findViewById<MaterialButton>(R.id.high)
        b_high.setOnClickListener { userViewModel?.setMobility(Mobility.HIGH) }
        val userObserver = Observer<User>{newUser ->
            when (userViewModel?.user?.mobility){
                Mobility.LOW ->{
                    b_low.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                    b_medium.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_high.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
                Mobility.MEDIUM->{
                    b_low.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_medium.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                    b_high.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
                Mobility.HIGH ->{
                    b_low.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_medium.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_high.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                }
                Mobility.NOTHING ->{
                    b_low.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_medium.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_high.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
            }
        }
        userViewModel?.userLiveData?.observe(this, userObserver)

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

        val userObserver = Observer<User>{newUser ->
            when (userViewModel?.user?.gender){
                Gender.MALE ->{
                    b_male.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                    b_female.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
                Gender.FEMALE ->{
                    b_male.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_female.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                }
                Gender.NOTHING ->{
                    b_male.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_female.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
            }
        }

        userViewModel?.userLiveData?.observe(this, userObserver)

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

        val digit1 = view.findViewById<NumberPicker>(R.id.numberPicker1);
        digit1.setMaxValue(9);
        digit1.setMinValue(0);
        val digit2 = view.findViewById<NumberPicker>(R.id.numberPicker2);
        digit2.setMaxValue(9);
        digit2.setMinValue(0);
        val digit3 = view.findViewById<NumberPicker>(R.id.numberPicker3);
        digit3.setMaxValue(9);
        digit3.setMinValue(0);
        digit1.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setAge(digit1.value*100 + digit2.value*10 + digit3.value)
        }
        digit2.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setAge(digit1.value*100 + digit2.value*10 + digit3.value)
        }
        digit3.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setAge(digit1.value*100 + digit2.value*10 + digit3.value)
        }

        val userObserver = Observer<User> { newUser ->
            digit1.value = 5
            digit2.value = 5
            digit3.value = 5
        }
        userViewModel?.userLiveData?.observe(this, userObserver)

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

        val digit1 = view.findViewById<NumberPicker>(R.id.numberPicker1);
        digit1.setMaxValue(9);
        digit1.setMinValue(0);
        val digit2 = view.findViewById<NumberPicker>(R.id.numberPicker2);
        digit2.setMaxValue(9);
        digit2.setMinValue(0);
        val digit3 = view.findViewById<NumberPicker>(R.id.numberPicker3);
        digit3.setMaxValue(9);
        digit3.setMinValue(0);
        digit1.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setHeight(digit1.value*100 + digit2.value*10 + digit3.value)
        }
        digit2.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setHeight(digit1.value*100 + digit2.value*10 + digit3.value)
        }
        digit3.setOnValueChangedListener { picker, oldVal, newVal ->
            userViewModel?.setHeight(digit1.value*100 + digit2.value*10 + digit3.value)
        }

        val userObserver = Observer<User> { newUser ->
            digit1.value = 5
            digit2.value = 5
            digit3.value = 5
        }
        userViewModel?.userLiveData?.observe(this, userObserver)

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

        val userObserver = Observer<User>{newUser ->
            when (userViewModel?.user?.mode){
                CaloriesMode.SLOW ->{
                    b_slow.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                    b_normal.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_fast.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
                CaloriesMode.NORMAL ->{
                    b_slow.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_normal.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                    b_fast.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
                CaloriesMode.FAST ->{
                    b_slow.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_normal.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_fast.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.choosedColorButton))
                }
                CaloriesMode.NOTHING ->{
                    b_slow.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_normal.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                    b_fast.setBackgroundColor(ContextCompat.getColor(getContext()!!, R.color.colorButton))
                }
            }
        }

        userViewModel?.userLiveData?.observe(this, userObserver)
        return view
    }
}

