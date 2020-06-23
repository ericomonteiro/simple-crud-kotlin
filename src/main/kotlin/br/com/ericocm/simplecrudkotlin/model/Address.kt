package br.com.ericocm.simplecrudkotlin.model

class Address (
        val addressLine1: String,
        val addressLine2: String,
        val neighborhood: String,
        val city: String,
        val stateProvince: String,
        val postalCode: String,
        val country: String
) {
    constructor() : this(
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    )

    fun print() {
        println("addressLine1: ${this.addressLine1}")
        println("addressLine2: ${this.addressLine2}")
        println("neighborhood: ${this.neighborhood}")
        println("city: ${this.city}")
        println("stateProvince: ${this.stateProvince}")
        println("postalCode: ${this.postalCode}")
        println("country: ${this.country}")
    }
}