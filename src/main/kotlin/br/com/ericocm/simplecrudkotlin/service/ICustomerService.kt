package br.com.ericocm.simplecrudkotlin.service

import br.com.ericocm.simplecrudkotlin.model.Customer
import java.util.*

interface ICustomerService {

    fun save(customer : Customer) : Customer

    fun list() : List<Customer>

    fun update(customer: Customer): Customer

    fun findById(customerUUID: UUID): Customer

    fun delete(customerUUID: UUID)

}