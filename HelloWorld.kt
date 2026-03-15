// Kotlin Hello World Demo
fun main() {
    println("Hello, Kotlin!")
    println("欢迎使用 Kotlin 编程语言!")

    // 变量声明 - val 是不可变变量，var 是可变变量
    val name = "Kotlin"
    val version = 2.0
    println("这是 $name $version")

    // 基本数据类型
    val number: Int = 42
    val decimal: Double = 3.14
    val isAwesome: Boolean = true

    println("整数: $number")
    println("浮点数: $decimal")
    println("Kotlin 很棒: $isAwesome")

    // 函数演示
    val result = add(5, 3)
    println("5 + 3 = $result")

    // 字符串模板
    val greeting = "你好，Kotlin!"
    println(greeting)

    // 数组
    val fruits = arrayOf("Apple", "Banana", "Orange")
    println("水果: ${fruits.joinToString()}")

    // 列表（不可变）
    val numbers = listOf(1, 2, 3, 4, 5)
    println("数字列表: $numbers")
}

fun add(a: Int, b: Int): Int {
    return a + b
}
