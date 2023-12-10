class TableSalary () {
    fun table (names: List<String>?, salary: List<String>?) {
        println("-".repeat(24))
        if (names != null && salary != null) {
            for (i in names.indices) {
                val spacesBeforeNames = (10 - names[i].length) / 2
                val spacesAfterNames = (9 - names[i].length) / 2
                val spacesBeforeSalary = (13 - salary[i].length) / 2
                val spacesAfterSalary = (12 - salary[i].length) / 2
                print("|")
                print(" ".repeat(spacesBeforeNames))
                print(names[i])
                print(" ".repeat(spacesAfterNames))
                print("|")
                print(" ".repeat(spacesBeforeSalary))
                print(salary[i])
                print(" ".repeat(spacesAfterSalary))
                println("|")
                println("-".repeat(24))

            }
        }

    }
}