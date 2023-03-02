/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variableargument;

/**
 *
 * @author alexc
 */
public class VariableList {
	public static int product(int... numbers) {
		if (numbers.length == 0)
			return 0;

		int total = 1;

		for (int number : numbers)
			total *= number;

		return total;
	}

}
