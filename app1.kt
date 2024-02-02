import kotlin.math.pow
import kotlin.reflect.jvm.internal.impl.name.Name

fun main(){
    var a= readLine()!!.toDouble()
    var b= readLine()!!.toDouble()
    when
    {
        a>b-> println(a+1)
        a<b-> println(b+1)
        a==b-> println(a.pow(3))

         }
}