package com.monstarlab.isolatedtesting.user

class UserNotFoundException(id: Long) : RuntimeException("Could not find user $id")
