//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var name = "Kotlin"

    println("Hello Kotlin")


    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    name = "Michael"
    println("Hello, $name!")

    val x = 5
    val y = 8
    var sum = x+y

    println("$x + $y = $sum")

    sum -= y

    println("sum is now $sum")
}