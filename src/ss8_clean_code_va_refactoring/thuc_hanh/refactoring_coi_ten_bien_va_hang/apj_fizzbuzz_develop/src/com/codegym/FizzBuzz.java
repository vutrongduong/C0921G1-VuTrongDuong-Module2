package ss8_clean_code_va_refactoring.thuc_hanh.refactoring_coi_ten_bien_va_hang.apj_fizzbuzz_develop.src.com.codegym;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
