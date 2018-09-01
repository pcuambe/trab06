/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

import java.util.Vector;

/**
 *
 * @author Paulo Amosse
 */
public class MetodosRecursivos {

    public int calculaFactoria(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * calculaFactoria(numero - 1);
    }

    public static int somarValores(Vector<Integer> vetor) {
        if (vetor.isEmpty()) {
            return 0;
        }
        int soma = vetor.firstElement();
        vetor.remove(vetor.firstElement());
        return soma += somarValores(vetor);
    }

    public static int inverterNumeros(int i) {
        String nr = String.valueOf(i);

        if (nr.length() == 1) {
            return i;
        }

        int ultimoNR = Integer.parseInt(nr.substring(nr.length() - 1));
        int nrsRestantes = Integer.parseInt(nr.substring(0, nr.length() - 1));

        int saida = Integer.parseInt(ultimoNR + "" + inverterNumeros(nrsRestantes));
        return saida;
    }

    public static int multiplicacao(int i1, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return i1 + multiplicacao(i1, i2 - 1);
    }

    public static int converterParaBinario(int i) {
        if (i <= 1) {
            return i;
        }
        int restoDaDivisao = i - ((i / 2) * 2);
        int conversao = Integer.parseInt(converterParaBinario(i / 2) + "" + restoDaDivisao);
        return conversao;
    }

    public static int somaRecursiva(int nr) {
        String numero = String.valueOf(nr);
        if (numero.length() == 1) {
            return nr;
        }
        int ultimoDigito = Integer.parseInt(numero.substring(numero.length() - 1));
        return ultimoDigito + somaRecursiva(Integer.parseInt(numero.substring(0, numero.length() - 1)));
    }

    public static int quantasRepeticoes(int i, int nr) {
        String valor = String.valueOf(i);

        if (valor.length() == 1) {
            if (valor.charAt(0) == nr) {
                return 1;
            } else {
                return -1;
            }
        }

        if (valor.charAt(valor.length() - 1) == nr) {
            nr = Integer.parseInt(valor.substring(0, valor.length() - 1));
            return 1 + quantasRepeticoes(i, nr);
        } else {
            nr = Integer.parseInt(valor.substring(0, valor.length() - 1));
            return quantasRepeticoes(i, nr);
        }
    }

    public static void main(String[] args) {
        System.out.println(quantasRepeticoes(220, 2));
    }
}
