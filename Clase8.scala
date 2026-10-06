import scala.annotation.tailrec
object Clase8 {
    def factorial (n: Int, acum: Int ): Int={
        if n==0 then acum
        else factorial(n-1,n*acum)
    }

    def factorialV2 (n: Int): Int={
        @tailred
        def factorialV2Aux(n:Int, acum: Int): Int ={
            if n==0 then acum
            else factorialV2Aux(n-1, n*acum)
        }
        factorialV2Aux(n,1)
    }
    @tailrec
    def suma (num: Int): Int ={
        if num==0 then 0
        else num+suma(num-1)

    }

    //hacer una funcion contar}Digitos pero con una recursion de cola
    def contarDigitos(num: Int, acum: Int =1):Int={
        if num <10 &&num >=0 then acum
        else contarDigitos(num/10, acum+1)
    }

    def main(args: Array [String]): Unit ={
        println(factorial(5))
        println(factorialV2(5))
        println(contarDigitos(1234))
    }
}