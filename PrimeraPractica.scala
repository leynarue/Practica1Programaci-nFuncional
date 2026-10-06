import scala.annotation.tailrec

object PrimeraPractica {

  // Ejercicio 1
  def decimalABinario(n: Int): String = {
    if (n < 2) {
      n.toString
    } else {
      decimalABinario(n / 2) + (n % 2).toString
    }
  }

  // Ejercicio 2
  def digitoMayor(n: Int): Int = {
    if (n < 10) {
      n
    } else {
      val ult = n % 10
      val mayor = digitoMayor(n / 10)
        if (ult > mayor) ult
        else mayor
    }
  }

  // Ejercicio 3
  def contarDigitosPares(n: Int): Int = {
    if (n < 10) {
      if (n % 2 == 0) 1 else 0
    } else {
      val ult = n % 10
      val cuentaResto = contarDigitosPares(n / 10)

      if (ult % 2 == 0) cuentaResto + 1
      else cuentaResto
    }
  }

  // Ejercicio 4
  def contarDigito(n: Int, digito: Int): Int = {
    if (n < 10) {
      if (n == digito) 1 else 0
    } else {
      val ult = n % 10
      val cuentaResto = contarDigito(n / 10, digito)
      if (ult == digito) cuentaResto + 1
      else cuentaResto
    }
  }

  // Ejercicio 5
  def extraerPares(n: Int): String = {
    if (n < 10) {
      if (n % 2 == 0) n.toString
      else ""
    } else {
      val resultadoResto = extraerPares(n / 10)
      val ult = n % 10
      if (ult % 2 == 0) {
        resultadoResto + ult.toString
      } else {
        resultadoResto
      }
    }
  }

  // Ejercicio 6
  def sumarDigitosPares(n: Int): Int = {
    @tailrec
    def recorrer(numero: Int, suma: Int): Int = {
      if (numero == 0) {
        suma
      } else {
        val digito = numero % 10

        val nuevaSuma =
          if (digito % 2 == 0) suma + digito
          else suma
        recorrer(numero / 10, nuevaSuma)
      }
    }
    recorrer(n, 0)
  }

  // Ejercicio 7
  def contarMayusculas(texto: String): Int = {
    @tailrec
    def recorrer(pos: Int, contador: Int): Int = {
      if (pos >= texto.length) {
        contador
      } else {
        val caracter = texto.charAt(pos)
        val nuevoContador =
          if (Character.isUpperCase(caracter)) contador + 1
          else contador
        recorrer(pos + 1, nuevoContador)
      }
    }
    recorrer(0, 0)
  }

  // Ejercicio 8
  def contarCambiosParidad(n: Int): Int = {
    @tailrec
    def recorrer(num: Int, cambios: Int): Int = {
      if (num < 10) {
        cambios
      } else {
        val ult = num % 10
        val anterior = (num / 10) % 10
        val cambia = ult % 2 != anterior % 2
        val nuevosCambios =
          if (cambia) cambios + 1
          else cambios
        recorrer(num / 10, nuevosCambios)
      }
    }
    recorrer(n, 0)
  }

  // Ejercicio 9
  def segundoMayorDigito(n: Int): Int = {
    @tailrec
    def recorrer (numero: Int, mayor: Int, segundo: Int): Int = {
      if (numero == 0) {
        segundo
      } else {
        val digito = numero % 10
        if (digito > mayor) {
          recorrer(numero / 10, digito, mayor)
        } else if (digito < mayor && digito > segundo) {
          recorrer(numero / 10, mayor, digito)
        } else {
          recorrer(numero / 10, mayor, segundo)
        }
      }
    }
    recorrer(n, -1, -1)
  }

  // Ejercicio 10
  def rachaMaxima(texto: String): Int = {
    if (texto.isEmpty) {
      0
    } else {
      @tailrec
      def recorrer(pos: Int, anterior: Char, rachaActual: Int,rachaMax: Int): Int = {
        if (pos >= texto.length) {
          rachaMax
        } else {
          val actual = texto.charAt(pos)
          if (actual == anterior) {
            val nuevaRacha = rachaActual + 1
            val nuevoMaximo =
              if (nuevaRacha > rachaMax) nuevaRacha
              else rachaMax
            recorrer(pos + 1,actual,nuevaRacha,nuevoMaximo)
          } else {
            recorrer(pos + 1,actual,1,rachaMax)
          }
        }
      }
      recorrer(1, texto.charAt(0), 1, 1)
    }
  }




  def main(args: Array[String]): Unit = {

    println("Primera Práctica")
    println("1.decimalABinario(42) = " + decimalABinario(42))
    println("2.digitoMayor(58329) = " + digitoMayor(58329))
    println("3.contarDigitosPares(2468) = " + contarDigitosPares(2468))
    println("4.contarDigito(525235, 5) = " + contarDigito(525235, 5))
    println("5.extraerPares(102034) = " + extraerPares(102034))
    println("6.sumarDigitosPares(583246) = " + sumarDigitosPares(583246))
    println("7.contarMayusculas(\"Scala3EsGenial\") = " + contarMayusculas("Scala3EsGenial"))
    println("8.contarCambiosParidad(123456) = " + contarCambiosParidad(123456))
    println("9.segundoMayorDigito(58329) = " + segundoMayorDigito(58329))
    println("10.rachaMaxima(\"aaabbccccdaa\") = " + rachaMaxima("aaabbccccdaa"))
  }
}