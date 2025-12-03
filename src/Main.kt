import java.util.Scanner

fun main() {
    val мойКонвертер = МойКонвертер()
    мойКонвертер.старт()
}

class МойКонвертер {
    private val сканер = Scanner(System.`in`)
    private var курсДоллара = 77.50
    private var курсЕвро = 89.92

    fun старт() {
        println("Конвертер валют")
        while (true) {
            println("\nЧто будем делать?")
            println("1. Конвертировать валюту")
            println("2. Показать курсы")
            println("3. Изменить курсы")
            println("4. Выйти")
            print("Выбери: ")

            when (сканер.nextInt()) {
                1 -> конвертировать()
                2 -> показатьКурсы()
                3 -> изменитьКурсы()
                4 -> {
                    println("Пока!")
                    return
                }
            }
        }
    }

    private fun конвертировать() {
        println("1. Рубли -> Доллары")
        println("2. Рубли -> Евро")
        println("3. Доллары -> Рубли")
        println("4. Евро -> Рубли")
        print("Выбери конвертацию: ")

        when (сканер.nextInt()) {
            1 -> {
                print("Сколько рублей? ")
                val рубли = сканер.nextDouble()
                println(" ${рубли} RUB = ${рубли / курсДоллара} USD")
            }
            2 -> {
                print("Сколько рублей? ")
                val рубли = сканер.nextDouble()
                println(" ${рубли} RUB = ${рубли / курсЕвро} EUR")
            }
            3 -> {
                print("Сколько долларов? ")
                val доллары = сканер.nextDouble()
                println(" ${доллары} USD = ${доллары * курсДоллара} RUB")
            }
            4 -> {
                print("Сколько евро? ")
                val евро = сканер.nextDouble()
                println(" ${евро} EUR = ${евро * курсЕвро} RUB")
            }
        }
    }

    private fun показатьКурсы() {
        println("\n Текущие курсы:")
        println("1 USD = $курсДоллара RUB")
        println("1 EUR = $курсЕвро RUB")
    }

    private fun изменитьКурсы() {
        println("\n Изменение курсов валют")
        print("Введите новый курс доллара (USD/RUB): ")
        val новыйКурсДоллара = сканер.nextDouble()

        print("Введите новый курс евро (EUR/RUB): ")
        val новыйКурсЕвро = сканер.nextDouble()

        курсДоллара = новыйКурсДоллара
        курсЕвро = новыйКурсЕвро

        println("Курсы успешно обновлены!")
    }
}