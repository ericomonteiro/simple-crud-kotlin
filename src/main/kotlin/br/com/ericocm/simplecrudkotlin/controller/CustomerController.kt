package br.com.ericocm.simplecrudkotlin.controller

import br.com.ericocm.simplecrudkotlin.model.Customer
import br.com.ericocm.simplecrudkotlin.service.impl.CustomerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/customer")
class CustomerController (var customerService: CustomerService){

    @PostMapping
    fun insert(@RequestBody customer: Customer) : ResponseEntity<Customer> {
        return ResponseEntity.ok(customerService.save(customer))
    }

    @GetMapping
    fun list(): List<Customer> {
       return  customerService.list()
    }

    @GetMapping("{id}")
    fun getById(@PathVariable id : UUID) : ResponseEntity<Customer> {
        return ResponseEntity.ok(customerService.findById(id))
    }

    @PutMapping("{id}")
    fun update(@PathVariable id : UUID, @RequestBody customer: Customer) : ResponseEntity<Customer> {
        customer.id = id
        return ResponseEntity.ok(customerService.update(customer))
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id : UUID) {
        customerService.delete(id)
    }
}