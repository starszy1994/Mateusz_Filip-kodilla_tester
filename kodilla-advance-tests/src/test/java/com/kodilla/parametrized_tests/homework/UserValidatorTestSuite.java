package com.kodilla.parametrized_tests.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();


    // zwraca false, kiedy nazwa użytkownika jest pusta
    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenUsernameIsEmpty(String username) {
        assertFalse(validator.validateUsername(username));
    }

    // zwraca fałsz, kiedy nazwa użytkownika ma mniej niż 3 znaki
    @ParameterizedTest
    @ValueSource(strings = {"a", "a1"})
    public void shouldReturnFalseWhenUsernamHasBelowThreeChars(String username) {
        assertFalse(validator.validateUsername(username));
    }
    // zwraca fałsz, kiedy nazwa użytkownika ma niedozwolone znaki
    @ParameterizedTest
    @ValueSource(strings = {"*amy#", "Pablo,=123%"})
    public void shouldReturnWhenUsernameHasIllegalChars(String username) {
        assertFalse(validator.validateUsername(username));
    }
    // zwraca prawdę, kiedy nazwa użytkownika ma dozwolone znaki i długość
    @ParameterizedTest
    @ValueSource(strings = {"username", "UserName123", "User1Name2", "User-Name123", "User_name-123"})
    public void shouldReturnTrueWhenUsernameHasCorrectCharsAndGoodLength(String username) {
        assertTrue(validator.validateUsername(username));
    }

    //zwraca fałsz, kiedy pozycja email jest pusta
    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseWhenEmailIsNull(String email) {
        assertFalse(validator.validateEmail(email));
    }
    //zwraca false, kiedy "@" jest w złym miejscu
    @ParameterizedTest
    @ValueSource(strings = {"janko@alski@gmail.com", "@kowalskijak@com.gmail", "kowalskijan@gmail.com.@"})
    public void shouldReturnFalseWhenAtIsInWrongPlace(String email){
        assertFalse(validator.validateEmail(email));
    }
    //zwraca fałsz, kiedy email jest za krótki lub za długi (może mieć od 1 do 6 znaków)
    @ParameterizedTest
    @ValueSource(strings  = {"jankowalski123@gmail.", "jan123jan@gmail.coooomcom", "jan123123@gmail.gmail.com123123"})
    public void sholudReturnFalseWhenEmailIsEmptyOrTooLong(String email) {
        assertFalse(validator.validateEmail(email));
    }
}