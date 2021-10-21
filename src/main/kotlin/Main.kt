fun main() {

    print("Write X number: ")
    val numberx = Integer.valueOf(readLine())
    println("The entered X is: $numberx")

    print("Write Y number: ")
    val numbery = Integer.valueOf(readLine())
    println("The entered Y is: $numbery")

    val point=Point()

    point.x_coorinate=numberx

    point.y_coordinate=numbery

    point.equals()

    point.tostring()

    val fraction = Fraction(3,4) //aq vwert pirvel wilads

    fraction.jami(Fraction(7,4)) // aq vwert im wilads romlis mimatebac gvinda pirvel wiladze

    fraction.gamokleba(Fraction(2,3))// aq vwert im wilads romlis gamoklebac gvinda pirvel wiladze

    fraction.namravli(Fraction(2,3)) // aq vwert im wilads romlis namravlic gvinda pirvel wiladze

    fraction.gayofa(Fraction(2,3)) // aq vwert im wilads romlis gayofac gvinda pirvel wiladze


}

data class Fraction(val mricxveli:Int, val mnishvneli:Int){
    fun chanaweri() = "$mricxveli/$mnishvneli"

    fun jami(damateba:Fraction) {
        if (this.mnishvneli == damateba.mnishvneli)
            println(Fraction(this.mricxveli + damateba.mricxveli, mnishvneli))

        if (this.mnishvneli != damateba.mnishvneli)
            println(Fraction(damateba.mnishvneli*this.mricxveli+this.mnishvneli*damateba.mricxveli,this.mnishvneli*damateba.mnishvneli))
    }

    fun gamokleba(damateba: Fraction){
        if (this.mnishvneli == damateba.mnishvneli)
            println(Fraction(this.mricxveli - damateba.mricxveli, mnishvneli))

        if(this.mnishvneli != damateba.mnishvneli)
            println(Fraction(damateba.mnishvneli*this.mricxveli-this.mnishvneli*damateba.mricxveli,this.mnishvneli*damateba.mnishvneli))
    }

    fun namravli(damateba: Fraction){
        println(Fraction(this.mricxveli*damateba.mricxveli,this.mnishvneli*damateba.mnishvneli))
    }

    fun gayofa(damateba: Fraction){
        println(Fraction(this.mricxveli*damateba.mnishvneli,this.mnishvneli*damateba.mricxveli))
    }
}


class Point(){

    var x_coorinate:Int=0

    var y_coordinate:Int=0

    fun equals(){

        val equals= (x_coorinate==y_coordinate)

        if (x_coorinate>y_coordinate)
            println("X is higher than Y")

        if (x_coorinate<y_coordinate)
            println("X is lower than Y")

        if (x_coorinate==y_coordinate)
            println("X equals to Y: $equals")
    }

    fun tostring(){
        println("X and Y coordinates:(${x_coorinate},$y_coordinate)" )
    }

}



