package ru.netology

fun main() {
    val highDiscount = 0.95
    val middleDiscount = 100
    val constCustomerDiscount = 0.99
    val purhaseHigtLimit = 10001
    val purhaseMiddleLimit = 1001
    val customerAmount = 10000
    val statusCustomer1 = "Постоянный"
    val statusCustomer2 = "Новый"
    var checkStatus = statusCustomer2 == "Постоянный"

    if (checkStatus == false && customerAmount >= purhaseHigtLimit) {
        println((customerAmount * highDiscount) * constCustomerDiscount)
    } else if (checkStatus == false && customerAmount < purhaseHigtLimit && customerAmount >= purhaseMiddleLimit) {
        println((customerAmount - middleDiscount) * constCustomerDiscount)
    } else if (checkStatus == false && customerAmount < purhaseMiddleLimit) {
        println(customerAmount * constCustomerDiscount)
    } else if (checkStatus == true && customerAmount >= purhaseHigtLimit) {
        println(customerAmount * highDiscount)
    } else if (checkStatus == true && customerAmount < purhaseHigtLimit && customerAmount >= purhaseMiddleLimit) {
        println(customerAmount - middleDiscount)
    } else {
        println(customerAmount)
}