package com.asp.kotlin.kotlinlearning.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Users(val name: String = "",
            val salary: Int = (10000 until 100000).shuffled().last(),
            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            val id: Long = 0)