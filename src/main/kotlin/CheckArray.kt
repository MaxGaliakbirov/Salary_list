class CheckArray () {
    fun checkArr (list: List<String>?, countChar: Int) {
        if (list != null) {
            for (i in list.indices) {
                if (list[i].length > countChar) {
                    println("\"${list[i]}\" содержит не допустимую длину, попробуйте ещё раз ввести значение")
                }
                continue
            }
        }
    }
}