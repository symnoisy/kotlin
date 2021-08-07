"""
Script Test
""".trimIndent()

"""
for 루프 돌리면서 값 가져오는 방법
""".trimIndent()
val items = listOf("apple", "banana", "kiwi")
for (index in items.indices){
    println("$index ${items[index]}")
}

"""
while 사용법
""".trimIndent()
val items = listOf("apple", "banana", "kiwi")
var index = 0
while (index < items.size){
    println("$index ${items[index]}")
    index++
}

"""
Range 사용
""".trimIndent()
val x = 10
val y = 9
if (x in 1 .. y+1){
    print(x)
}

"""
!in 사용법
""".trimIndent()
val list = listOf("A", "B", "C")
if (-1 !in 0..list.lastIndex){
    println("-1 is out of range")
}
if (list.size !in list.indices){
    println("Out of range")
}


"""
print loop
""".trimIndent()
for (x in 1..5){
    print(x)
}

"""
step for 
""".trimIndent()
for (x in 1..5 step 2){
    print(x)
}

"""
step reverse
""".trimIndent()
for (x in 10 downTo 0 step 2){
    print(x)
}
