"""
Script Test
""".trimIndent()

// function 만드는 구조 check
fun sum(a: Int, b: Int): Int {
    return a + b
}
sum(1, 2)

// 조건문 돌리는 방법
fun is_max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    else {
        return b
    }
}
is_max(2, 1)

fun getStringLength(obj: Any): Int? {
//    is 연산 = 식이 타입의 인스턴스인지 검사함.
    if (obj is String) {
        return obj.length
    }
    return null
}
fun getStringLength2(obj: Any): Int?{
    if (obj is String && obj.length >0) {
        return obj.length
    }
    else {
        return null
    }
}
getStringLength("123")
getStringLength2("456")
