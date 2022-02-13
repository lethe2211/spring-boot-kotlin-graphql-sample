package com.example.controller

import org.junit.jupiter.api.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.graphql.test.tester.GraphQlTester

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureGraphQlTester
internal class SampleControllerTest {

    @Autowired
    lateinit var graphQlTester: GraphQlTester

    @BeforeEach
    fun setUp() {}

    @AfterEach
    fun tearDown() {}

    @Nested
    inner class GetUserSummaryTest {
        @Test
        @DisplayName("Returns a user summary in normal case")
        fun returnsAUserSummaryInNormalCase() {
            val query = """
            {
              getUserSummary(userId: 1) {
                userName
                userId
              }
            }
            """.trimIndent()

            graphQlTester.query(query)
                .execute()
                .path("getUserSummary.userId")
                .entity(Long::class.java)
                .isEqualTo(1L)
                .path("getUserSummary.userName")
                .entity(String::class.java)
                .isEqualTo("John Doe")
        }

        // TODO: Remaining test cases
    }
}