import scala.annotation.tailrec
object Clase9 {
    def mcd (a: Int, b: Int):Int={
        if b==0 then a 
        else mcd (b,a%b)
    }

@tailrec
    def fibo (pos: Int, a: Int=0, b: Int=1): Int={
        if pos ==0 then a
        else fibo (pos-1,b,a+b)
    }

@tailrec
    def sumaCuadrados (n: Int, acc: Int): Int ={
        if (n>1)acc
        else sumaCuadrados(n+1, acc +n*n)
    }

@tailrec
    def productoDigitos (n: Int, acc: Int=1): Int ={
        if (n==0) acc
        else productoDigitos(n/10,acc *(n%10))
    }

 @tailrec
    def invertirNumero (n: Int, acc: Int=0):Int={
        if (n==0) acc
        else invertirNumero(n/10, acc * 10 + (n%10))
    }

    def main(args: Array[String]): Unit ={
        println(fibo(0))
        println(sumaCuadrados(-3, 0))
        println(productoDigitos(234))
        println(invertirNumero(5832))
    }
}