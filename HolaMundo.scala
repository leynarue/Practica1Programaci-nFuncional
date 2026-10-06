object HolaMundo{
    def main(args : Array [String]): Unit ={
        val a: Int= 8
        val b: Int= 3
        val c: Int= 5

val medio = if ((a >= b && a <= c) || (a <= b && a >= c)) a
              else if ((b >= a && b <= c) || (b <= a && b >= c)) b
              else c

  println(s"El número del medio es: $medio")
    
    }
}
