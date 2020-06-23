package br.com.ericocm.simplecrudkotlin.exception

class CustomerNotFoundException() : DefaultServiceException("id", "Customer not found") {
}
