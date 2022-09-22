package com.example.primerrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import java.util.*

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //saludo()
        //println("Hola estudiantes de programacion IV")

        //variableyconstate()
        //EjerciciosVarVal()
        //tiposdedatos()
    }
    fun saludo(){
        println("Hola estudiantes desde la funcion saludo")
    }

    private fun variableyconstate(){
        //variables
        var myprimeravariable = "Hola estudiantes de ingenieria"
        println(myprimeravariable)

        myprimeravariable = " Aqi cambiamos el valor de la variable"
        println(myprimeravariable)

        //Constante
        val myprimeraconstante ="Esto es una constante"
        println(myprimeraconstante)
        //una constante su valor no puede ser modificado
        //myprimeraconstante = "otro valor"

        val mysegundaconstante:String = myprimeravariable
        println(mysegundaconstante)

        val numero = 1
        val miDouble = 2.2
    }

    fun EjerciciosVarVal(){
        println("Hola Alumnos")

        val nombre:String = "Pedro"
        //nombre = "Pedri"

        var apellido:String = "Lopes"
        apellido = "Lopez"

        var edad:Int = 21
        edad = 22

        var salario = 1200
        salario = 1220

        var nombrecompleto = nombre + " " + apellido
        println(nombrecompleto)

        val añonacimiento = 2000
        var añoactual = Calendar.getInstance().get(Calendar.YEAR)
        var Edad = añoactual - añonacimiento
        println("Tu edad es: " + Edad)
        println("Tu edad es: $Edad")

    }

    private fun tiposdedatos(){
        //Enteros(Byte,short, int, long)
        val myInt = 1
        val myInt2 = 3
        val myInt3: Int = myInt + myInt2
        println(myInt3)

        //Decimales(Float, Double)
        val myfloat = 1
        val myfloat2: Float = 1.7f
        val mydouble = 1.3
        val mydouble2: Double = 1.4
        val mydoube3: Double = 5.0
        val mysumadouble = mydouble + mydouble2 + mydoube3
        println(mysumadouble)

        //Boolean(bool)
        val myboolean: Boolean = true
        val myboolean2= false
        val myboolean3: Boolean = true
        println(myboolean == myboolean2)
        println(myboolean && myboolean3)


    }

    private fun  tiposdedatosdeducidosExplicitos(){
        //tipos de datos
        var enterosExplicito:Int = 45
        println(enterosExplicito.javaClass)
        var enteroDeducido = 35
        println(enteroDeducido.javaClass)

        var dobleExplicito:Double = 45.45
        println(dobleExplicito.javaClass)
        var dobleDeducido = 35.35
        println(dobleDeducido.javaClass)

        var floatanteExplicito:Float = 45.45f
        println(floatanteExplicito.javaClass)
        var floatanteDeducido = 35.35f
        println(floatanteDeducido.javaClass)

        var largoExplicito: Long = 454545
        println(largoExplicito.javaClass)
        var largoDeducido = 353535L
        println(largoDeducido.javaClass)

        var textoExplicito: String = "45"
        println(textoExplicito.javaClass)
        var textoDeducido: String = "35"
        println(textoDeducido.javaClass)

        enterosExplicito = textoExplicito.toInt()
        println(enterosExplicito.javaClass)

        enteroDeducido = textoDeducido.toInt()
        println(enteroDeducido.javaClass)




    }









}
