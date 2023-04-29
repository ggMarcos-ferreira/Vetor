/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Marcos gabriel de so
 */
class Solucao {
    public int[] twoSum(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int sum = nums[left] + nums[right];
      if (sum == target) {
        return new int[] { left, right };
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    throw new IllegalArgumentException("Nenhuma solução encontrada.");
  }
}
//A complexidade desse algoritmo é O(n), pq cada elemento do array é visitado no máximo uma vez. 