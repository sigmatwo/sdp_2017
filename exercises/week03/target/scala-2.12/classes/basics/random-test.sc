def minWhile(Nums: Array[Int]): Int = {

  var count = 0
  var min = Nums(1)

  while (count < Nums.length)
    if (Nums(count) < min) {
      min = Nums(count)
      count = count + 1
    }
    else {
      count = count + 1
    }
  return min
}

minWhile(Array(8, 6, 7, 6, 5, 8, 9, 3, 2, 9))