package easyAlgo

class TwoSumSolution {
    fun twoSum(nums: List<Int>, target: Int): List<Int> {
        val minMap: MutableMap<Int, Int> = mutableMapOf()

        nums.forEachIndexed { i, num ->
            val x = target - num
            val xI = minMap.get(x)
            if (xI != null) return listOf(i, xI)
            minMap.put(num, i)
        }
        return emptyList()
    }
}