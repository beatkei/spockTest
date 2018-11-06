package sample

import spock.lang.Specification

class CalculatorTest extends Specification {
    def '足し算1'() {
        setup:
        Calculator calc = new Calculator()

        expect:
        //calc.add(1, 1) == 2
        calc.add(1, 1) == 4

    }
}
