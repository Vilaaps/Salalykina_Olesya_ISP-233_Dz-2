fun main() {
/* №1
    print("Введите уровень игрока: ")
    val level = readln().toInt()
    val a: String
    val b: Int
    if (level < 10) {
    a = "Новичок"
    b = 10
    } else if (level < 50) {
    a = "Опытный"
    b = 30
    } else {
    a = "Легенда"
    b = 100
    }
    println("Вы $a получаете $b HP.")
 */

/* №2
    print("Введите ваш возраст: ")
    val age = readln().toInt()
    if (age < 12) {
        println("Вы ребёнок")
    } else if (age <= 17) {
        println("Вы подросток")
    } else {
        println("Вы взрослый")
    }
 */
/* №3
    print("Введите число от 1 до 100: ")
    val number = readln().toInt()
    val range = 10..50
    if (number in range) {
        println("Число входит в диапазон")
    } else {
        println("Число не входит в диапазон")
    }
 */

/* №4
    print("Введите один символ: ")
    val input = readln()
    if (input.length != 1) {
        println("Введите ровно один символ.")
        return
    }
    val char = input[0]
    if (char in '0'..'9') {
        println("Цифра")
    } else if (char in 'a'..'z' || char in 'A'..'Z') {
        println("Буква латинского алфавита")
    } else if (char == ' ') {
        println("Пробел")
    } else {
        println("Спецсимвол")
    }
 */

/* №5
    val a = 5
    val b = 10
    repeat(b) { index ->
        val c = index + 1
        val f = a * c
        println("$a x $c = $f")
    }
 */

/* №6
    val a = listOf("Леон", "Назад в будущее", "Туда", "Мое прекрасное несчастье", "Зависнуть в Палм-Спрингс")
    for (i in a) {
        println(i)
        var c = 0
        for (char in i) {
            c++
        }
        println("Длина названия: $c")
    }
 */

/* №7
    print("Как вас зовут? ")
    val name = readln()
    print("Сколько вам лет? ")
    val age = readln().toInt()
    print("Какой ваш любимый цвет? ")
    val color = readln()
    println("Привет, $name! Тебе $age лет, и твой любимый цвет $color.")
}
 */
}

