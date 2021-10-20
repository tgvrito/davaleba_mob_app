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
        println("X and Y coordinates:(${x_coorinate},$y_coordinate)")
    }

}
