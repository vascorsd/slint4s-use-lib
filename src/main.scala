@main
def main = {
    // prove case class is seen and available
    val p1 = Person("jo")

    println("hi")
    println(p1.name)

    // check which target was used
    println(Platform.v)
}
