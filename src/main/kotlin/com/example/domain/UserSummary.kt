package com.example.domain

data class UserSummary(
    val userId: Long,
    val userName: String
) {
    companion object {
        fun of(user: User): UserSummary {
            return UserSummary(
                userId = user.userId,
                userName = user.userName
            )
        }
    }
}