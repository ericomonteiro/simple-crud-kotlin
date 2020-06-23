package br.com.ericocm.simplecrudkotlin.repository

import br.com.ericocm.simplecrudkotlin.model.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CustomerRepository : CrudRepository<Customer, UUID>