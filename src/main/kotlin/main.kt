/*
------------------------
|   Max   |   500000   |
------------------------
|   Alex  |   250000   |
------------------------
*/

fun main () {
    println("Введите список имён через запятую:")
    val namesArr = readLine()?.split(",")
    println("Введите зарплату (без дробей) через запятую:")
    val salaryArr = readLine()?.split(",")
    println(table(namesArr, salaryArr))
}
fun table (names: List<String>?, salary: List<String>?) {
    println("-".repeat(24))
    if (names != null && salary != null) {
        for (i in 0..names.size-1) {

            print("|")
            print(names[i])
            print("|")
            println(salary[i])
            println("-".repeat(24))
        }
    }

}