package com.example.service.impl

import com.example.domain.UserSummary
import com.example.repository.UserRepository
import com.example.service.UserSummaryService
import org.springframework.stereotype.Service
import java.lang.IllegalStateException

@Service
class UserSummaryServiceImpl(
    private val userRepository: UserRepository
) : UserSummaryService {
    override fun getUserSummary(userId: Long): UserSummary {
        val user = userRepository.getUserById(userId) ?: throw IllegalStateException("User did not exist")

        return UserSummary.of(user)
    }
}