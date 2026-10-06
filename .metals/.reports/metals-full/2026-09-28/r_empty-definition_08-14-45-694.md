error id: file:///C:/Users/lerue/pochi/clase6.scala:scala/Predef.String#
file:///C:/Users/lerue/pochi/clase6.scala
empty definition using pc, found symbol in pc: scala/Predef.String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -String#
	 -scala/Predef.String#
offset: 523
uri: file:///C:/Users/lerue/pochi/clase6.scala
text:
```scala
object clase6 {
    def suma (num: Int): Int={
        //caso base
        if num==1 then 1
        //paso recursivo
        else num + suma (num-1)
    }

    def factorial(num: Long):Long={
        //caso base
        if num==1 then 1
        //paso recursivo
        else num * factorial (num-1)
    }

    def fibonacci(pos: Int):Long={
        //caso base
        if pos==0 then 0L
        else if pos == 1 then 1L
        else fibonacci(pos-1)+fibonacci(pos-2)
    }
    def main (args: Array [St@@ring]): Unit ={
        println(suma(5))
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Predef.String#