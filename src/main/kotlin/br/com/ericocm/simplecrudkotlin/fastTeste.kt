package br.com.ericocm.simplecrudkotlin

import br.com.ericocm.simplecrudkotlin.model.Address
import br.com.ericocm.simplecrudkotlin.model.Customer

fun main() {
    val erico = Customer("Érico Cintra Monteiro", "erico.cintra@gmail.com", "40795102844", Address())

    erico.print()
}