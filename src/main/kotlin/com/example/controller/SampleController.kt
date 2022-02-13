package com.example.controller

import com.example.domain.UserSummary
import com.example.service.UserSummaryService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class SampleController(
    private val userSummaryService: UserSummaryService
) {
    @QueryMapping
    fun getUserSummary(@Argument userId: Long): UserSummary? {
        return userSummaryService.getUserSummary(userId)
    }
}