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
}