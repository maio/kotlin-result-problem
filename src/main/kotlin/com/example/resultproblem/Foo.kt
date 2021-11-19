package com.example.resultproblem

data class Foo(val result: Result<Boolean>) {
    enum class Bar { YES, NO }

    val Boolean.result get() = if (this) Bar.YES else Bar.NO

    fun someFun() {
        println(result.getOrNull()?.result)
    }
}
