package com.favour.algorithims


class BinaryGap {

    fun  solution (N:Int):Int{

        //Stores the index of the position of the first 1
        var tempOne =0
        //Number  of Zeros between two 1s
        var binaryGap =0



        //Generate the binary equivalent for a given integer
        val integerToBinary = Integer.toBinaryString(N)

        //Convert the strings of binary numbers to a list
        val binaryList = integerToBinary.split("","")

        //Iterate through the binaryList
        binaryList.forEachIndexed { index, element ->

            //Check if the number is equal to 1
            if (element == ONE) {

                //Added 1 to the index to make sure the position begins from 1
              var position =index+1


                //Inorder to get the number of Zeros  1 was added to tempOne 1 to include the last value (which will be 1) in the subtraction
                val  numberOfZeros= position - (tempOne+1)

                //Make the new position of tempOne be the last position of 1 gotten.
                tempOne =index+1

                //check if the new numberOfZeros is greater than the existing binaryGap if true make replace binaryGap variable with the numberOfZeros variable
                if(binaryGap < numberOfZeros )
                    binaryGap = numberOfZeros
            }

        }


        return binaryGap


    }

    companion object {
         const val ONE :String  ="1"
    }


}
