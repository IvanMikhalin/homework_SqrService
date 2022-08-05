package ru.netology.sqr;

public class SqrService {
    public int calculate(int left, int right) {
        int count = 0; //количество итераций
        for (int x = 1; x*x < right; x++) {   // х - это число, которое возводится в квадрат
            if (x * x < left) {
                continue;
            }
            count++;
        }
        return count;
    }
}