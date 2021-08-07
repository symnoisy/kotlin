"""
공부했던 case 함수로 기록 
""".trimIndent()

fun sum(a: Int, b: Int): Int {
    """
    function 만드는 구조 Check
    """.trimIndent()
    return a + b
}

fun is_max(a: Int, b: Int): Int {
    """
    조건문 돌리는 방법
    """.trimIndent()
    if (a > b) {
        return a
    }
    else {
        return b
    }
}

fun getStringLength(obj: Any): Int? {
    """
    object 받아서 문자열일 경우, string 길이를 return 해주는 함수
    """.trimIndent()
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

