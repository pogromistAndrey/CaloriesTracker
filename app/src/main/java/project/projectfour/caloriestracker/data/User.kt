package project.projectfour.caloriestracker.data

class User(var gender:Gender = Gender.MALE,
           var age:Int = 20,
           var weight:Int = 80,
           var desired_weight:Int = 70,
           var mobility:Mobility = Mobility.MEDIUM,
           var height:Int = 173,
           var mode:CaloriesMode = CaloriesMode.NORMAL) {
}