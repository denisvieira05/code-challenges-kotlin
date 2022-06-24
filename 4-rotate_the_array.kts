/*

    Given an array, rotate the array to the left by "k" steps
        where "k" is non-negative

    Input: [1,2,3,4,5,6,7] k=2
    Output: [3,4,5,6,7,1,2]
 */

// [UNDERSTANDING IN PROGRESS] -- REVIEW AFTER

fun IntArray.leftShift(k: Int): IntArray {
    val shiftedArray = this.copyOf()
    var rotateBy = k

    if(rotateBy > size) { // 2 > 7
        rotateBy = rotateBy % size // q
        println("rot=")
    }
    
    forEachIndexed { index, value ->
        val shiftedIndex = (index + (size - rotateBy)) % size  // (1 + (7-rotateBy)) % 7
        shiftedArray[shiftedIndex] = value
    }

    return shiftedArray
}

fun main() {
    val arrayToRotate = intArrayOf(1,2,3,4,5,6,7)

    val rotatedArray = arrayToRotate.leftShift(5)

    println(rotatedArray.asList())
}

main()