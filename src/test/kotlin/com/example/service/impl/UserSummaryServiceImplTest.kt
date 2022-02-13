package com.example.service.impl

import com.example.domain.User
import com.example.domain.UserSummary
import com.example.repository.UserRepository
import com.example.service.UserSummaryService
import io.mockk.clearMocks
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
internal class UserSummaryServiceImplTest {
    lateinit var userSummaryService: UserSummaryService

    @MockK
    lateinit var userRepository: UserRepository

    @BeforeEach
    fun setUp() {
        userSummaryService = UserSummaryServiceImpl(userRepository)
    }

    @AfterEach
    fun tearDown() {
        clearMocks(userRepository)
    }

    @Nested
    inner class GetUserByIdTest {
        @Test
        @DisplayName("Returns a UserSummary in normal case")
        fun ReturnsAUserSummaryInNormalCase() {
            every { userRepository.getUserById(any()) } returns User(2L, "Jane Doe", "New York")

            val expected = UserSummary(2, "Jane Doe")

            val actual = userSummaryService.getUserSummary(2L)

            assertEquals(expected, actual)

            verify(exactly = 1) { userRepository.getUserById(2L) }
        }

        // TODO: Remaining test cases
    }
}