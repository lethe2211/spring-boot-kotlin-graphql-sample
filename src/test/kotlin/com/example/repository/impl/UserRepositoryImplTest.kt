package com.example.repository.impl

import com.example.domain.User
import com.example.repository.UserRepository
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

internal class UserRepositoryImplTest {

    lateinit var userRepository: UserRepository

    @BeforeEach
    fun setUp() {
        userRepository = UserRepositoryImpl()
    }

    @AfterEach
    fun tearDown() {}

    @Nested
    inner class GetUserByIdTest {
        @Test
        @DisplayName("Returns a User in normal case")
        fun ReturnsAUserInNormalCase() {
            val expected = User(1, "John Doe", "San Francisco")

            val actual = userRepository.getUserById(1)

            assertEquals(expected, actual)
        }

        // TODO: Remaining test cases
    }

    @Nested
    inner class GetAllUsersTest {
        // TODO
    }
}