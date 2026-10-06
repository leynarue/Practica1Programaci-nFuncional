object TareaParaCasa1 {
  def promedioNotas(nota1: Int, nota2: Int, nota3: Int): Int = {
    (nota1 + nota2 + nota3) / 3
  }
  
  def categoriaAcademica(promedio: Int): String = {
    if (promedio < 60) "REPROBADO"
    else if (promedio >= 60 && promedio < 70) "Nota Regular"
    else if (promedio >= 70 && promedio < 85) "Nota Buena"
    else "Nota Excelente"
  }
  
  def descripcionEstudiante(nombre: String, promedio: Int, categoria: String): String = {
    s"El estudiante $nombre cuenta con un promedio de $promedio y pertenece a la categoria $categoria"
  }
 
  def main(args: Array[String]): Unit = {
    
    val promedioFinal1 = promedioNotas(80, 80, 90)
    println(descripcionEstudiante("Arturo", promedioFinal1, categoriaAcademica(promedioFinal1)))
    val promedioFinal2 = promedioNotas(53, 71, 93)
    println(descripcionEstudiante("Mathias", promedioFinal2, categoriaAcademica(promedioFinal2)))
    val promedioFinal3 = promedioNotas(45, 85, 80)
    println(descripcionEstudiante("Pochi", promedioFinal3, categoriaAcademica(promedioFinal3)))
    val promedioFinal4 = promedioNotas(65, 30, 40)
    println(descripcionEstudiante("Juan", promedioFinal4, categoriaAcademica(promedioFinal4)))
    val promedioFinal5 = promedioNotas(37, 78, 12)
    println(descripcionEstudiante("Dario", promedioFinal5, categoriaAcademica(promedioFinal5)))

  }

}