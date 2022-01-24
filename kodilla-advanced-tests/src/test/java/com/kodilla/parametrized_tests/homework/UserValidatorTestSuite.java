package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource({
            "adam",
            "blabla",
            "blabla124"
    }
    )
    public void validUserLogins(String userName) {
        assertTrue(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @CsvSource({
            "ad",
            "blabla$#@$",
            "#@$"
    }
    )
    public void invalidUserLogins(String userName) {
        assertFalse(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @CsvSource({
            "adam@ppp.pl",
            "Ja_kowal_67_dwa@mail.pl"
    }
    )
    public void validEmail(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource({
            "122455@ppp.pl4445_%d",
            "adam.ppp.pl_blew"
    }
    )
    public void invalidEmail(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}