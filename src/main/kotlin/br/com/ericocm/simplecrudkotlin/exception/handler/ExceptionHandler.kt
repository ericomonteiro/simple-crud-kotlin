package br.com.ericocm.simplecrudkotlin.exception.handler

import br.com.ericocm.simplecrudkotlin.exception.BaseError
import br.com.ericocm.simplecrudkotlin.exception.CustomerNotFoundException
import br.com.ericocm.simplecrudkotlin.exception.DefaultServiceException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(value = [(CustomerNotFoundException::class)])
    fun notFoundException(e: DefaultServiceException): ResponseEntity<BaseError> {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(buildResponseError(e))
    }

    private fun buildResponseError(e: DefaultServiceException): BaseError {
        return BaseError(e.field, e.message)
    }
}