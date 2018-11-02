package com.asp.kotlin.kotlinlearning.resource

import com.asp.kotlin.kotlinlearning.model.Users
import com.asp.kotlin.kotlinlearning.repository.UsersRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rest/users")
class UsersResource(val usersRepository: UsersRepository) {

    @GetMapping(value = "/all")
    fun getUsers() = usersRepository.findAll()

    @PostMapping(value = "/insert")
    fun insertUsers(@RequestBody user: Users): List<Users> {
//        val users = Users(name)
        usersRepository.save(user)
        return usersRepository.findAll()
    }

    @GetMapping(value ="find/{name}")
    fun findUser(@PathVariable name: String): Users {
        return usersRepository.findByName(name)
    }
}

