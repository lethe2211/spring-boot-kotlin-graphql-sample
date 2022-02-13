package com.example.service

import com.example.domain.UserSummary

interface UserSummaryService {
    fun getUserSummary(userId: Long): UserSummary
}