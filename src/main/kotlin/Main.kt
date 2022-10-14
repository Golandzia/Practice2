fun main(args: Array<String>) {
    //Ex1
    val age1 = 42
    val age2 = 21
    //Тип - int

    //Ex2
    val avg1 = (age1+age2) / 2
    println(avg1)
    //Значение avg1 равно 31, а должно быть 31.5
    //Это связано с тем что age1 и age2 имеют тип int

    //Ex3
    //Правильный вариант - val avg1 = (age1.toDouble()+age2.toDouble()) / 2.0

    //Ex4
    val firstName: String = "Daniil"
    val secondName: String = "Solovev"

    //Ex5
    val fullName: String = "$firstName $secondName"
    println(fullName)

    //Ex6
    val myDetails:String="Hello, my name is $fullName."
    println(myDetails)

    //Ex7
    val date = Triple(14, 10, 2022)

    //Ex8
    val (month, day, year)=date

    //Ex9
    val (month1, _, year1) = date

    //Ex10
    //month = 11
    val newDate = Pair(month, year)
    println(newDate)
    //month не может быть переприсвоено значение, тк это константа

}