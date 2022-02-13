package com.example.repository

import com.example.domain.User

interface UserRepository {
    fun getUserById(userId: Long): User?
    fun getAllUsers(): List<User>
}