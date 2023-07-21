package com.monstarlab.isolatedtesting.user

import jakarta.persistence.*
import lombok.Data

@Data
@Entity
@Table(name = "users")
class User (
	var firstName: String,
	var lastName: String,
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long? = null) {
	constructor() : this("", "")
}
