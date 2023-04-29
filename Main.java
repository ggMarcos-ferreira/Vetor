/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Marcos gabriel de so
 */
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 9, 11 };
    int target = 13;
    Solucao solucao = new Solucao();
    int[] result = solucao.twoSum(nums, target);
    System.out.println(Arrays.toString(result));
  }
}

