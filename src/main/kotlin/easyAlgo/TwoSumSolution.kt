package easyAlgo

class TwoSumSolution {
    fun twoSum(nums: List<Int>, target: Int): List<Int> {
        val desiredMap: MutableMap<Int, Int> = mutableMapOf()

        // нам необходимо пройти по списку, добавляя в конце итерации каждое значение
        nums.forEachIndexed { index, num ->
            val desired = target - num
            // если искомое уже в списке -> profit
            val desiredInMap = desiredMap.get(desired)
            if (desiredInMap != null) return listOf(index, desiredInMap)
            desiredMap.put(num, index)
        }
        return emptyList()
    }
}