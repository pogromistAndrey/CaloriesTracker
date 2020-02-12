package project.projectfour.caloriestracker.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import project.projectfour.caloriestracker.data.*

class UserViewModel(application:Application) : AndroidViewModel(application) {
    var user:User
    var userLiveData: MutableLiveData<User> = MutableLiveData()

    init {
        user = User()
        userLiveData.value = user
    }
    fun setType(type:Type){
        user.type= type
        userLiveData.value = user
    }
    fun checkType():Boolean{
        if(user.type == Type.NOTHING) return false
        return true
    }

    fun setAge(age:Int){
        user.age = age
        userLiveData.value = user
    }
    fun checkAge():Boolean{
        if(user.age == -1) return false
        return true
    }

    fun setHeight(height:Int){
        user.height = height
        userLiveData.value = user
    }
    fun checkHeight():Boolean{
        if(user.height == -1) return false
        return true
    }

    fun setGender(gender: Gender){
        user.gender = gender
        userLiveData.value = user
    }
    fun checkGender():Boolean{
        if(user.gender == Gender.NOTHING) return false
        return true
    }

    fun setWeight(weight: Int){
        user.weight = weight
        userLiveData.value = user
    }
    fun checkWeight():Boolean{
        if(user.weight == -1) return false
        return true
    }

    fun setDesiredWeight(desired_weight: Int){
        user.desired_weight = desired_weight
        userLiveData.value = user
    }
    fun checkDesiredWeight():Boolean{
        if(user.desired_weight == -1) return false
        return true
    }

    fun setMobility(mobility:Mobility){
        user.mobility = mobility
        userLiveData.value = user
    }
    fun checkMobility():Boolean{
        if(user.mobility == Mobility.NOTHING) return false
        return true
    }

    fun setMode(mode:CaloriesMode){
        user.mode = mode
        userLiveData.value = user
    }
    fun checkMode():Boolean{
        if(user.mode == CaloriesMode.NOTHING) return false
        return true
    }
}