package easyAlgo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTests {

    private val twoSumSolution by lazy { TwoSumSolution() }

    @Test
    fun twoSumTest() {
        var nums = listOf(2,7,11,15)
        var target = 9
        val expectedCaseOne = twoSumSolution.twoSum(nums, target)
        assertEquals(listOf(1, 0), expectedCaseOne)

        nums = listOf(3,2,4)
        target = 6
        val expectedCaseTwo = twoSumSolution.twoSum(nums, target)
        assertEquals(listOf(2, 1), expectedCaseTwo)

        nums = listOf(3, 3)
        target = 6
        val expectedCaseThree = twoSumSolution.twoSum(nums, target)
        assertEquals(listOf(1, 0), expectedCaseThree)

    }

}