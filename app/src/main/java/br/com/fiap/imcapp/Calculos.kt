package br.com.fiap.imcapp

import androidx.compose.ui.graphics.Color
import kotlin.math.pow

fun calcularImc (pesoUsuario: Double, alturaUsuario: Double): Double {
    val imc =   pesoUsuario / (alturaUsuario/100).pow(2)
    return imc
}

fun deteminarGrauIMC (imc: Double): String{
    return if (imc < 18.5){
        "Abaixo do peso."
    }else if (imc >= 18.5 && imc < 25.0){
        "Peso Ideal."
    }else if(imc >= 25.0 && imc < 30.0){
        "Levemente acima do peso."
    }else if (imc >= 30.0 && imc < 35.0){
        "Obesidade Grau 1."
    }else if (imc >=35.0 && imc < 40.0){
        "Obesidade Grau 2"
    }else {
        "Obesidade Grau 3"
    }
}

fun corIMC (imc: Double): Color {
    return if(imc < 18.5){
        Color(0xFFB81414)
    }else if (imc >= 18.5 && imc < 25.0){
        Color(0xff329F6B)
    }else if (imc >= 25.0 && imc < 30.0){
        Color(0xFFEBD726)
    }else{
        Color(0xFFB81414)
    }
}