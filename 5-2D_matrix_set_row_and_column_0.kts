/*

    Given a 2D Matrix, if an element is 0
    set its entire row and column to 0. Do it in place

    Input:
    [[1,1,1,1],
     [1,1,1,0],
     [1,1,1,1]]

    Output:
    [[1,1,1,0],
     [0,0,0,0],
     [1,1,1,0]

 */

// [UNDERSTANDING IN PROGRESS] -- REVIEW AFTER

class MatrixZeros {

    fun setZeros(matrix: Array<IntArray>): Unit {
        val rows = matrix.size
        val columns = matrix[0].size

        var firstRow = false
        var firstColumn = false

        for (row in 0 until rows) { // row = 1
            for (column in 0 until columns) { // column = 1
                if (matrix[row][column] == 0) { // matrix[1][1] = 0
                    if (row == 0) firstRow = true
                    if (column == 0) firstColumn = true

                    matrix[row][0] = 0
                    matrix[0][column] = 0
                }
            }
        }

        for (row in 1 until rows) {
            if (matrix[row][0] == 0) {
                for (column in 1 until columns) {
                    matrix[row][column] = 0
                }
            }
        }

        for (column in 1 until columns) {
            if (matrix[0][column] == 0) {
                for (row in 1 until rows) {
                    matrix[row][column] = 0
                }
            }
        }

        if (firstRow) {
            for (column in 0 until columns) {
                matrix[0][column] = 0
            }
        }

        if (firstColumn) {
            for (row in 0 until rows) {
                matrix[row][0] = 0
            }
        }
    }
}

fun main(args: Array<String>) {
    val matrixZeros = MatrixZeros()

    val inputArray = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(1, 0, 1),
        intArrayOf(1, 1, 1),
    )

    matrixZeros.setZeros(inputArray)
    inputArray.map { println(it.toList()) }
}

main(arrayOf("arg"))