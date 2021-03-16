package com.favour.algorithims

import java.util.*


class BinaryGap {


    fun startProgram(){
        print(" \n Enter a number : ")

        readLine()?.let { number ->

            try {
                number.toIntOrNull()?.let { num ->
                    val binaryGap = solution(num)
                    displayResult(number, binaryGap)

                }?: kotlin.run {
                    print("Oh no... \n  please enter a valid number\n")

                }

            } catch (e:Throwable){
                print("Something went wrong... \n Please try again  ")
            }

        } ?: print("Oh No.. \n Your input is Invalid, please try again")
    }



    private fun displayResult(input: String, gap: Int?) {
        gap?.let {
            print(
                    "$input has $it Gap(s)\n\n"
            )
        }
    }



    //This is the Actual solution need for evaluation
    private fun  solution (N:Int):Int{

        //Stores the index of the position of the first 1
        var tempOne =0
        //Number  of Zeros between two 1s
        var binaryGap =0


        //Generate the binary equivalent for a given integer
        val integerToBinary = Integer.toBinaryString(N)

        print(
                "integerToBinary value  $integerToBinary \n\n"
        )

        print(
                "integerToBinary size  ${integerToBinary.length} \n\n"
        )

        //Convert the strings of binary numbers to a list
//        val binaryList = integerToBinary.trim().split(' ')
        val binaryList =  listOf(integerToBinary)



        print(
                "binaryList length  ${binaryList.size} \n\n"
        )



        //Iterate through the binaryList


//         binaryList.forEachIndexed { index, element ->
        integerToBinary.forEachIndexed { index, element ->
             print(
                     "Hello the  element  $element \n"
             )
                 print(
                         "Index before first check = $index \n The element is = $element \n \n "
                 )
                 if (tempOne == 0 && element == ONE) {

                     tempOne = index + 1

                     print(
                             "Index in first temp one  $index \n\n"
                     )

                     print(
                             "TempOne now   $tempOne \n\n"
                     )

                 } else if (element == ONE) {

                     //Added 1 to the index to make sure the position begins from 1
                     var position = index + 1

                     print(
                             "Position when next element is equals one  $position \n\n"
                     )

                     var newTemp1 = tempOne + 1
                     //Inorder to get the number of Zeros  1 was added to tempOne 1 to include the last value (which will be 1) in the subtraction
                     val numberOfZeros = position - (newTemp1)

                     print(
                             "newTemp1 when element is equals one   $newTemp1 \n\n"
                     )
                     print(
                             "numberOfZeros when element is equals one  $numberOfZeros \n\n"
                     )

                     //Make the new position of tempOne be the last position of 1 gotten.
                     tempOne = position //put the variable position instead
                     print(
                             "tempOne when element is equals  $tempOne \n\n"
                     )
                     //check if the new numberOfZeros is greater than the existing binaryGap if true make replace binaryGap variable with the numberOfZeros variable
                     print(
                             "binaryGap when element is equals  $binaryGap \n\n"
                     )

                     print(
                             "numberOfZeros when element is equals  $numberOfZeros \n\n"
                     )

                     print(
                             "binaryGap < numberOfZeros when element is equals  ${binaryGap < numberOfZeros} \n\n"
                     )

                     if (binaryGap < numberOfZeros)
                         binaryGap = numberOfZeros
                 }

             }


        return binaryGap
    }

    companion object {
//         const val ONE :String  ="1"
         const val ONE   ='1'
    }


}
