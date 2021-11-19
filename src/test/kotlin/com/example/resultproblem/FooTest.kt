package com.example.resultproblem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FooTest {
    @Test
    fun someFun() {
        Foo(Result.success(true)).someFun()
    }
}