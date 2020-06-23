package br.com.ericocm.simplecrudkotlin.exception

import java.lang.RuntimeException

abstract class DefaultServiceException(
    open val field: String?,
    override val message: String?,
    val causeValue: String?
) : RuntimeException() {
    constructor() : this(null, null, null)
    constructor(field: String?, message: String?) : this(field, message, null)
    constructor(causeValue: String?) : this(null, null, causeValue)
}
