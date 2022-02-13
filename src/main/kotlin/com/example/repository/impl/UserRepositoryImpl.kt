package com.example.repository.impl

import com.example.domain.User
import com.example.repository.UserRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl : UserRepository {

    // Dummy data
    val userList: List<User> = listOf(
        User(1L, "John Doe", "San Francisco"),
        User(2L, "Jane Doe", "New York"),
        User(3L, "田中太郎", "Tokyo")
    )

    override fun getUserById(userId: Long): User? {
        if (userId in 1..userList.size) {
            return userList[userId.toInt() - 1]
        }
        return null
    }

    override fun getAllUsers(): List<User> {
        return userList
    }
}