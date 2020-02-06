package project.projectfour.caloriestracker.data

class User(
            var type:Type = Type.NOTHING,
            var gender:Gender = Gender.NOTHING,
           var age:Int = -1,
           var weight:Int = -1,
           var desired_weight:Int = -1,
           var mobility:Mobility = Mobility.NOTHING,
           var height:Int = -1,
           var mode:CaloriesMode = CaloriesMode.NOTHING) {
}