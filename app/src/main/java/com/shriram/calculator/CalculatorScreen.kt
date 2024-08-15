package com.shriram.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel


@Preview
@Composable
fun CalculatorScreen() {
    val viewModel: CalculatorViewModel = viewModel()
    val specialBtnColor = Color(0xFF1A1A1A)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF000000))
            .padding(16.dp)
            .padding(top = 32.dp),
        verticalArrangement = Arrangement.Bottom

    ) {
//        Text(
//            text = "CALCULATOR",
//            color = Color.White,
//            fontSize = 25.sp,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.fillMaxWidth(),
//            textAlign = TextAlign.Center
//        )

        Spacer(modifier = Modifier.weight(1f))

//      Upper Output Text
        Text(
            text = viewModel.showOperations,
            fontSize = 45.sp,
            color = Color.White,
            textAlign = TextAlign.End,
            maxLines = 2,
            modifier = Modifier
                .fillMaxWidth(),
        )
//      Output Text
        Text(
            text = viewModel.displayValue,
            fontSize = 38.sp,
            color = Color.White,
            textAlign = TextAlign.End,
            maxLines = 2,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 40.dp),
        )


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp),
        ) {


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                CalculatorButton(
                    modifier = Modifier.background(specialBtnColor),
                    displaySymbol = {
                        Text(
                            text = "AC",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("AC")
                    }
                )
                CalculatorButton(
                    modifier = Modifier.background(specialBtnColor),
                    displaySymbol = {
                        Text(
                            text = "%",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("%")
                    }
                )
                CalculatorButton(
                    modifier = Modifier.background(specialBtnColor),
                    displaySymbol = {
                        Text(
                            text = "⌫",
                            color = Color.White,
                            fontSize = 27.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("DEL")
                    }
                )
                CalculatorButton(
                    modifier = Modifier.background(specialBtnColor),
                    displaySymbol = {
                        Text(
                            text = "÷",
                            color = Color.White,
                            fontSize = 35.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("/")
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "7",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("7")
                    }
                )
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "8",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("8")
                    }
                )
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "9",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("9")
                    }
                )
                CalculatorButton(
                    modifier = Modifier.background(specialBtnColor),
                    displaySymbol = {
                        Icon(
                            Icons.Default.Close,
                            contentDescription = "Multiply",
                            tint = Color.White,
                            modifier = Modifier.size(28.dp)
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("*")
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "4",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("4")

                    }
                )
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "5",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("5")
                    }
                )
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "6",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("6")
                    }
                )
                CalculatorButton(
                    modifier = Modifier.background(specialBtnColor),
                    displaySymbol = {
                        Text(
                            text = "-",
                            color = Color.White,
                            fontSize = 45.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("-")
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "1",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("1")
                    }
                )
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "2",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("2")
                    }
                )
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "3",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("3")
                    }
                )
                CalculatorButton(
                    modifier = Modifier.background(specialBtnColor),
                    displaySymbol = {
                        Text(
                            text = "+",
                            color = Color.White,
                            fontSize = 32.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("+")
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "00",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("00")
                    }
                )
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "0",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick("0")
                    }
                )
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = ".",
                            color = Color.White,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    onClick = {
                        viewModel.onButtonClick(".")
                    }
                )
                CalculatorButton(
                    displaySymbol = {
                        Text(
                            text = "=",
                            color = Color.White,
                            fontSize = 40.sp,
                            textAlign = TextAlign.Center,
                        )
                    },
                    modifier = Modifier.background(Color(0xFFFF6600)),
                    onClick = {
                        viewModel.onButtonClick("=")

                    }
                )
            }


        }
    }
}


