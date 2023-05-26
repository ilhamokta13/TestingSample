package com.example.testingsample

import junit.framework.Assert.assertEquals
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun validUsernameAndCorrectlyRepeatedPassword_return_true() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Ariya",
            "12345",
            "12345"
        )
        assertEquals("oke",result,true)
    }

    @Test
    fun usernameEmpty(){
        val user = "qwerty"
        val result = RegistrationUtil.validateRegistrationInput(user,"1234","1234")
        assertEquals("oke",result,true)
    }

    @Test
    fun existingUsername(){
        val user= "Bahram"
        val result = RegistrationUtil.validateRegistrationInput(user,"1234","1234")
        assertEquals("usernameexist", result,false)
    }






}