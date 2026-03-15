# Kotlin Hello World Demo

## 简介

这是 Kotlin 编程语言的基础入门示例，演示了如何编写和运行第一个 Kotlin 程序。

## 基本原理

Kotlin 是 JetBrains 于 2011 年推出的现代编程语言，可以编译成 Java 字节码或 JavaScript。Kotlin 与 Java 完全兼容，语法更加简洁现代。

Kotlin 程序以 `.kt` 为文件扩展名。`println()` 函数用于将文本或变量的值打印到控制台。

## 启动和使用

### 环境要求

- JDK 8 或更高版本
- Kotlin 编译器

### 安装和运行

```bash
# 进入项目目录
cd kotlin-hello-world-demo

# 编译运行
kotlinc HelloWorld.kt -include-runtime -d hello.jar
java -jar hello.jar
```

或者使用 Gradle：

```bash
./gradlew run
```

### 预期输出

```
Hello, Kotlin!
欢迎使用 Kotlin 编程语言!
这是 Kotlin 2.0
整数: 42
浮点数: 3.14
Kotlin 很棒: true
5 + 3 = 8
你好，Kotlin!
水果: Apple, Banana, Orange
数字列表: [1, 2, 3, 4, 5]
```

## 教程

### 第一个 Kotlin 程序

打开 `HelloWorld.kt` 文件，你会看到以下代码：

```kotlin
fun main() {
    println("Hello, Kotlin!")
}
```

这段代码做了以下事情：

1. `fun main()` - 定义主函数，程序入口点
2. `println()` - 打印字符串到控制台

### Kotlin 程序的结构

```kotlin
// 这是单行注释

/*
 * 这是
 * 多行注释
 */

fun main() {
    println("要打印的内容")
}
```

与 Java 不同，Kotlin 不需要：
- 包裹代码块的括号（在函数级别）
- 语句结尾的分号
- 特定的类

### 变量声明

Kotlin 使用 `val` 声明常量，`var` 声明变量：

```kotlin
val name = "Kotlin"  // 常量
var count = 0         // 变量
```

### 常见问题

1. **区分大小写**：Kotlin 是大小写敏感的
2. **空安全**：Kotlin 有内置的空安全机制
3. **类型推断**：Kotlin 会自动推断变量类型
