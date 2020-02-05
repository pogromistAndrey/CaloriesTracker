package project.projectfour.caloriestracker.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import project.projectfour.caloriestracker.data.CaloriesMode
import project.projectfour.caloriestracker.data.Gender
import project.projectfour.caloriestracker.data.Mobility
import project.projectfour.caloriestracker.data.User

class UserViewModel(application:Application) : AndroidViewModel(application) {
    lateinit var user:User

    init {
        user = User()
    }

    fun setAge(age:Int){
        user.age = age
    }

    fun setHeight(height:Int){
        user.height = height
    }

    fun setGender(gender: Gender){
        user.gender = gender
    }

    fun setWeight(weight: Int){
        user.weight = weight
    }

    fun setDesiredWeight(desired_weight: Int){
        user.desired_weight = desired_weight
    }

    fun setMobility(mobility:Mobility){
        user.mobility = mobility
    }

    fun setMode(mode:CaloriesMode){
        user.mode = mode
    }
}