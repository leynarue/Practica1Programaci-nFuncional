object clase6 {

    def suma(num: Int): Int = {
        // caso base
        if num == 1 then 1
        // paso recursivo
        else num + suma(num - 1)
    }

    def factorial(num: Long): Long = {
        // caso base
        if num == 1 then 1
        // paso recursivo
        else num * factorial(num - 1)
    }

    def fibonacci(pos: Int): Long = {
        contador = contador + 1
        // caso base
        if pos == 0 then 0L
        else if pos == 1 then 1L
        else fibonacci(pos - 1) + fibonacci(pos - 2)
    }

    // Función recursiva para imprimir del 3 al 10
    def imprimirDel3Al10(n: Int): Unit = {
        if n <= 10 then
            println(n)
            imprimirDel3Al10(n + 1)
    }

    def main(args: Array[String]): Unit = {
        val num: Long = 20
        println(suma(5))
        println(factorial(num))
        println(fibonacci(10))
        imprimirDel3Al10(3)
    }
}