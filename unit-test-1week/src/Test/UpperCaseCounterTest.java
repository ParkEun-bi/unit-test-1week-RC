import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {
    //클래스 테스트를 위해 불러옴.
    private  UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void 널체크(){
        String str = null;

        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }

    @Test
    public void 빈값체크(){
        String str ="";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        assertTrue(result == 0);
    }

    @Test
    public void 대문자_ABC(){
        String str = "ABC";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result:: " + result);
        assertTrue(result == 3);
        assertFalse(result == 2); //결과로 2가 나오면 대문자의 개수가 3개가 아니라는 의미
    }

    @Test
    public void 대소문자_ABCdefGHI(){
        String str = "ABCdefGHI";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result:: " + result);
        assertTrue(result == 6);
        assertFalse(result == 4);
    }
}