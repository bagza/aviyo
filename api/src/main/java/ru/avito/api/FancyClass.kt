package ru.avito.api


interface FancyClass {
    val value: String
}

class FancyClassImpl(override val value: String = "prodValue") : FancyClass