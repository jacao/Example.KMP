package com.unidays.module

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}