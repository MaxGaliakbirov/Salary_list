/*
------------------------
|   Max   |   500000   |
------------------------
|   Alex  |   250000   |
------------------------
11
14
*/
fun main () {
    while (true) {
        println("Введите список имён через запятую (не более 10 символов):")
        val namesArr = readlnOrNull()?.split(",")
        CheckArray().checkArr(namesArr, countCharName)

        println("Введите зарплату (без дробей) через запятую (не более 6 символов):")
        val salaryArr = readlnOrNull()?.split(",")
        CheckArray().checkArr(salaryArr, countCharSalary)

        if (namesArr?.size != salaryArr?.size) {
            println("Список имён не совпадает со списком зарплаты, введите ещё раз.")
            continue
        }
        println(TableSalary().table(names = namesArr, salary = salaryArr))
    }

}