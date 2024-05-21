/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class EJ3 {
public static void main(String[] args) {
int[] nums = new int[CONSTANTE_TAMANIO_TABLA];
for (int i = 0; i < CONSTANTE_TAMANIO_TABLA; i++) {
nums[i] = (int) (Math.random() * 100) + 1;
}
int sum = 0;
for (int i = 0; i < CONSTANTE_TAMANIO_TABLA; i++) {
if (nums[i] % 2 == 0) {
sum += nums[i] * 3;
} else {
sum += nums[i] * 2;
}
}
System.out.println("Suma de los números pares e impares multiplicados por 3 y 2  respectivamente: " + sum);


}
static final int CONSTANTE_TAMANIO_TABLA = 10;
}
