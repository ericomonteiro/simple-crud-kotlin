package br.com.ericocm.simplecrudkotlin.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Customer(
        @Id @Column(length = 16) var id: UUID = UUID.randomUUID(),
        var name: String = "",
        var email: String = "",
        var document: String = "",
        @Embedded var address: Address
)