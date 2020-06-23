package br.com.ericocm.simplecrudkotlin.service.impl

import br.com.ericocm.simplecrudkotlin.exception.CustomerNotFoundException
import br.com.ericocm.simplecrudkotlin.model.Customer
import br.com.ericocm.simplecrudkotlin.repository.CustomerRepository
import br.com.ericocm.simplecrudkotlin.service.ICustomerService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerService(var customerRepository: CustomerRepository) : ICustomerService {

    override fun save(customer: Customer): Customer {
        return customerRepository.save(customer)
    }

    override fun list(): List<Customer> {
        return customerRepository.findAll().toList()
    }

    override fun update(customer: Customer): Customer {
        findById(customer.id)
        return customerRepository.save(customer)
    }

    override fun findById(customerUUID: UUID): Customer {
        return customerRepository.findByIdOrNull(customerUUID) ?: throw CustomerNotFoundException()
    }

    override fun delete(customerUUID: UUID) {
        findById(customerUUID)
        customerRepository.deleteById(customerUUID)
    }


}