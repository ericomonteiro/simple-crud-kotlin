package br.com.ericocm.simplecrudkotlin.model

class Customer {

    var name: String = ""
        set(value)  { field = value.toUpperCase() }

    var email: String = ""
    var document: String = ""
    var address: Address = Address()

    constructor(name: String, email: String, document: String, address: Address) {
        this.name = name
        this.email = email
        this.document = document
        this.address = address
    }

    fun print() {
        println("name: ${this.name}")
        println("email: ${this.email}")
        println("document: ${this.document}")

        address.print()

    }

}