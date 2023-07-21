package com.monstarlab.isolatedtesting.user

import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.*

@RestController
@RequiredArgsConstructor
internal class UserController(val service: UserService) {

    @GetMapping("/users")
    fun all(): Iterable<User> {
        return service.findAll()
    }

    @PostMapping("/users")
    fun newUser(@RequestBody newUser: User): User {
        return service.createNew(newUser)
    }

    @GetMapping("/users/{id}")
    fun one(@PathVariable id: Long): User? {
        return service.getUser(id) ?: throw UserNotFoundException(id)
    }
}