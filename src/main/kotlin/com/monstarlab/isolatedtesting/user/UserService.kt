package com.monstarlab.isolatedtesting.user

import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import java.util.*

@Service
@RequiredArgsConstructor
class UserService(val userRepository: UserRepository) {

  fun findAll(): Iterable<User> {
    return userRepository.findAll()
  }

  fun createNew(user: User): User {
    return userRepository.save(user)
  }

  fun getUser(id: Long): User? {
    return when(val user = userRepository.findById(id)) {
      Optional.ofNullable(null) -> null
      else -> user.get()
    }
  }
}

