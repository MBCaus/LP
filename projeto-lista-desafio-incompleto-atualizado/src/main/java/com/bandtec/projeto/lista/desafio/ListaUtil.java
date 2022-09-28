package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public void add(Integer valor) {

        if (valor != null) {

            inteiros.add(valor);

        }

    }

    public void remove(Integer valor) {

        if (valor != null && valor > 0) {

            inteiros.remove(valor);

        }

    }

    public Integer count() {

        return inteiros.size();

    }

    public Integer countPares() {

        Integer qtdPares = 0;

        for (Integer inteiro : inteiros) {

            if (inteiro % 2 == 0) {

                qtdPares += 1;

            }

        }

        return qtdPares;
    }

    public Integer countImpares() {

        Integer qtdImpares = 0;

        for (Integer inteiro : inteiros) {

            if (inteiro % 2 == 1) {

                qtdImpares += 1;

            }

        }

        return qtdImpares;
    }

    public Integer somar() {

        Integer totalSoma = 0;

        for (int i = 0; i < inteiros.size(); i++) {

            totalSoma += inteiros.get(i);

        }

        return totalSoma;
    }

    public Integer getMaior() {

        if (inteiros.size() == 0) {

            return 0;

        } else {

            Integer maiorNumero = -99999;
            
            for (int i = 0; i < inteiros.size(); i++) {

                if (inteiros.get(i) > maiorNumero) {

                    maiorNumero = inteiros.get(i);

                }

            }

            return maiorNumero;

        }

    }

    public Integer getMenor() {

        if (inteiros.size() == 0) {

            return 0;

        } else {

            Integer menorNumero = 99999;

            for (int i = 0; i < inteiros.size(); i++) {

                if (inteiros.get(i) < menorNumero) {

                    menorNumero = inteiros.get(i);

                }

            }

            return menorNumero;

        }
    }

    public Boolean hasDuplicidade() {

        Boolean isRepetido = false;

        Integer contador = 0;

        while (contador < inteiros.size()) {

            Integer numerosRepetidos = 0;
            Integer numeros = inteiros.get(contador);

            for (int i = 0; i < inteiros.size(); i++) {

                if (numeros == inteiros.get(i)) {

                    numerosRepetidos++;

                }

                if (numerosRepetidos == 2) {

                    isRepetido = Boolean.TRUE;

                }

            }

            contador++;

        }

        return isRepetido;
    }
}
