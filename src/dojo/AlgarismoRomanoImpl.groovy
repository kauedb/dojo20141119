package dojo

import groovy.util.logging.Slf4j

class AlgarismoRomanoImpl implements AlgarismoRomano {

    @Override
    int paraArabico(String algarismo) {
        def valores = ["I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000]
        int valor = 0;
        def algarismos = algarismo.toCharArray()
        algarismos.each {
            valor += valores[it.toString()]
        }

        if (algarismo == "I") {
            return 1
        }
        if (algarismo == "V") return 5
        if (algarismo == "X") return 10
        if (algarismo == "L") return 50
        if (algarismo == "C") return 100
        if (algarismo == "D") return 500
        if (algarismo == "M") return 1000

        return valor
    }

}
