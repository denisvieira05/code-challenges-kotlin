

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */ 
class ListNode(var `val`: Int) {
     var next: ListNode? = null
}

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        if(head == null) return false

        var original = 0

        do {
            original = head.`val`
        } while(head.next != null)


        val reversed = original.toString().reversed().toLong()

        return original.toLong() == reversed
    }
}

val list = ListNode(1)
list.next = ListNode(2)

Solution().isPalindrome(list)


//class Solution {
//    fun isPalindrome(x: Int): Boolean {
//        val original = x.toLong()
//        if(x < 0) return false
//
//        var reversed = original.toString().reversed().toLong()
//
//        return original == reversed
//
//
//    }
//}