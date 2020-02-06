package project.projectfour.caloriestracker.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import project.projectfour.caloriestracker.data.*

class UserViewModel(application:Application) : AndroidViewModel(application) {
    lateinit var user:User

    init {
        user = User()
    }
    fun setType(type:Type){
        user.type= type
    }
    fun checkType():Boolean{
        if(user.type == Type.NOTHING) return false
        return true
    }

    fun setAge(age:Int){
        user.age = age
    }
    fun checkAge():Boolean{
        if(user.age == -1) return false
        return true
    }

    fun setHeight(height:Int){
        user.height = height
    }
    fun checkHeight():Boolean{
        if(user.height == -1) return false
        return true
    }

    fun setGender(gender: Gender){
        user.gender = gender
    }
    fun checkGender():Boolean{
        if(user.gender == Gender.NOTHING) return false
        return true
    }

    fun setWeight(weight: Int){
        user.weight = weight
    }
    fun checkWeight():Boolean{
        if(user.weight == -1) return false
        return true
    }

    fun setDesiredWeight(desired_weight: Int){
        user.desired_weight = desired_weight
    }
    fun checkDesiredWeight():Boolean{
        if(user.desired_weight == -1) return false
        return true
    }

    fun setMobility(mobility:Mobility){
        user.mobility = mobility
    }
    fun checkMobility():Boolean{
        if(user.mobility == Mobility.NOTHING) return false
        return true
    }

    fun setMode(mode:CaloriesMode){
        user.mode = mode
    }
    fun checkMode():Boolean{
        if(user.mode == CaloriesMode.NOTHING) return false
        return true
    }
}