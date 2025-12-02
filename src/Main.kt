import java.util.Scanner

fun main(){
    val scanner = Scanner(System. `in`)
    val курсДоллара = 77.50
    val курсЕвро = 89.92

    println("Это конвертер валют")
    println("Выберите конверт")
    println("1. Рубли в Доллары")
    println("2. Рубли в Евро")
    println("3. Доллары в Рубли")
    println("4. Евро в Рубли")
    print("Выберите цифру (1-4) ")

    val выбор = scanner.nextInt()
    when (выбор){
        1 ->{
            print("Сколько рублей? ")
            val рубли = scanner.nextDouble()
            val доллары = рубли / курсДоллара
            println("Это будет: ${"%.2f".format(доллары)} долларов")
        }

        2 ->{
            print("Сколько рублей? " )
            val рубли = scanner.nextDouble()
            val евро = рубли / курсЕвро
            println("Это будет: ${"%.2f".format(евро)} евро")
        }

        3 ->{
            print("Сколько долларов? ")
            val доллары = scanner.nextDouble()
            val рубли = доллары * курсДоллара
            println("Это будет: ${"%.2f".format(рубли)} рублей")
        }

        4 ->{
            print("Сколько евро? ")
            val евро = scanner.nextDouble()
            val рубли = евро * курсЕвро
            println("Это будет: ${"%.2а".format(рубли)} рублей")
        }
    }
}