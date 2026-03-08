package com.kovanlabs.intern.week.task.practice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutoMorphicNumberTest {

    @BeforeAll
    static void testAutoMorphicFalse(){
        assertFalse(AutoMorphicNumber.autoMorphicNumber(7),"Input : 7 Output : False");
    }
    //  Parameterized test : Value Source method
    @ParameterizedTest
    @ValueSource(ints = {5 , 6 })
    @DisplayName("Input : 5 Output : True")
    void testAutomorphicTrue(int value){
        assertTrue(AutoMorphicNumber.autoMorphicNumber(value),"Input : 5 Output : True");
    }

//  Parameterized test : CSV Source method
    @ParameterizedTest
    @CsvSource({
            "5,true",
            "7,false"
    })
    void testAutoMorphicEquals(int value , boolean expectedResult){
        boolean result = AutoMorphicNumber.autoMorphicNumber(value);
        assertEquals(expectedResult, result );
    }
//  Assuming method practice
    @Test
    void assumingValue(){
        Assumptions.assumeTrue(AutoMorphicNumber.autoMorphicNumber(7));
        System.out.println("This is true ");
    }
}