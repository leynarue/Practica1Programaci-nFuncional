object Clase7{

    def contarDigitos(num:Int):Int={
        if num<10 && num>=0 then 1
        else 1+contarDigitos(num/10)
    }

    def contarDigitosV2(num:Int):Int={
        if num>0 then 1+contarDigitosV2(num/10)
        else 0
    }

    //funcion que pueda sumar los digitos de un numero entero 
    //sumarDigitos(1265)--> 14

    def sumarDigitos (num:Int):Int={
        if num>0 then (num%10) + sumarDigitos(num/10)
        else 0
    }

    def mayorDigito(num:Int):Int={
        def maximo(a:Int, b:Int):Int={
            if a>b then a else b
        }
        if num<10 && num>=0 then num
        else maximo(num%10, mayorDigito(num/10))
    }
    
    def voltear(s: String): String = {
        if s.isEmpty then ""
        else voltear(s.tail) + s.head
    }

    def contarVocales(s: String): Int = {
        if s.isEmpty then 0
        else {
            // Preguntamos si la primera letra está dentro de las vocales
            val esVocal = "aeiouAEIOU".contains(s.head)
            
            if esVocal then 1 + contarVocales(s.tail)
            else contarVocales(s.tail)
        }
    }

    def main (args: Array[String]): Unit={
        println(contarDigitos(123))
        println(contarDigitosV2(0))
        println(sumarDigitos(1265))
        println(mayorDigito(1171))
        println(voltear("ajedrez"))
        println(contarVocales("rodolfo"))
    }
}