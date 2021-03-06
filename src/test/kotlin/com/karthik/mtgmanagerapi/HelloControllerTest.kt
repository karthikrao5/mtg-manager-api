package com.karthik.mtgmanagerapi

import junit.framework.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun whenCalled_shouldReturnHello() {
        val result = testRestTemplate
                // ...
                .getForEntity("/hello", String::class.java)

        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        assertEquals(result?.body, "Hello world!")
    }
}