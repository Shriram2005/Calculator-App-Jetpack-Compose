package com.shriram.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorViewModel : ViewModel() {

    var displayValue by mutableStateOf("")
    var calcValue by mutableStateOf("")
    var showOperations by mutableStateOf("")


    fun onButtonClick(operator: String) {
        showOperations = ""
        when (operator) {
            "AC" -> {
                displayValue = ""
                calcValue = ""
            }

            "DEL" -> {
                displayValue = displayValue.dropLast(1)
                calcValue = calcValue.dropLast(1)
            }

            "=" -> {
                // Remove the last character if it's an operator
                if (calcValue.last() in "+-*/.") {
                    // check if calcValue consist only operator (don't have any operands)
                    if (calcValue == "+" || calcValue == "-" || calcValue == "*" || calcValue == "/") {
                        calcValue = "0"
                        displayValue = ""
                    } else {
                        // if last value is operand then remove it before performing calculation
                        calcValue = calcValue.dropLast(1)
                        displayValue = displayValue.dropLast(1)
                    }

                }

                // perform calculation and update displayValue
                showOperations = displayValue

                calcValue = evaluateExpression(calcValue).toString()
                displayValue = calcValue
            }

            else -> {
                // Prevent multiple operators in a row
                if (operator in "+-*/.%" && calcValue.isNotEmpty() && calcValue.last() in "+-*/.%") {
                    calcValue = calcValue.dropLast(1)
                    displayValue = displayValue.dropLast(1)
                } else if (operator == "." && (calcValue.isEmpty() || calcValue.last() in "+-*/%")) {
                    calcValue += "0."
                    displayValue += "0."
                } else {
                    if (operator == "*") {
                        displayValue += "×"
                    } else if (operator == "/") {
                        displayValue += "÷"
                    } else {
                        displayValue += operator
                    }
                    calcValue += operator
                }
            }
        }
    }

    // most important function to perform calculation using "expr" library
    private fun evaluateExpression(expression: String): Double {
        return try {
            val expr = ExpressionBuilder(expression).build()
            expr.evaluate()
        } catch (e: Exception) {
            e.printStackTrace()
            Double.NaN
        }
    }

}