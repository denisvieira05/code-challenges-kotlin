/*

    Given an input string, reverse the string word by word.

    Input: "reverse words in a string"
    Output: "string a in words reverse"

 */

fun reverseString(stringToReverse: String) =
    stringToReverse.split(" ").asReversed().joinToString(" ")

fun main() {
    val stringToReverse = "reverse words in a string"

    println(reverseString(stringToReverse))
}

main()