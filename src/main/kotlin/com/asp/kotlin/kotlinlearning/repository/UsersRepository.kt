package com.asp.kotlin.kotlinlearning.repository

import com.asp.kotlin.kotlinlearning.model.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository : JpaRepository<Users, Long> {

    fun findByName(name: String): Users
}