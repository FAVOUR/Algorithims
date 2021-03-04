package com.favour.algorithims

import com.google.gson.Gson

class BinaryGap {

    companion object {
    fun  solution (N:Int):Int{

        var tempOne =0
        var binaryGap =0

        val integerToBinary = Integer.toBinaryString(N)

        System.out.println("integerToBinary $integerToBinary")

        val binaryArray = integerToBinary.split("","")


        binaryArray.forEachIndexed { index, element ->

            if (element=="1") {
              var position =index+1

                val  numberofZeros= position - (tempOne+1)

                tempOne =index+1

                if(binaryGap < numberofZeros )
                    binaryGap = numberofZeros
            }

        }


        return binaryGap


    }



        @JvmStatic
        fun main(args: Array<String>) {
            val binaryGap = solution(1041)

            System.out.println("binaryGap $binaryGap")


        }


}
}


//fun  solution (N:Int):Int{
//
//    var tempOne =0
//    var binaryGap =0
//
//    val integerToBinary = Integer.toBinaryString(N)
//
//    System.out.println("integerToBinary $integerToBinary")
//
//    val binaryArray = integerToBinary.map { it.toString() }.toTypedArray()
//
//
//    binaryArray.forEachIndexed { index, element ->
//
//        if (tempOne == 0 && element =="1"){
//
//            tempOne =index+1
//        }else if (element=="1") {
//
//            val  numberofZeros= index+1 - (tempOne+1)
//
//            tempOne =index+1
//
//            if(binaryGap < numberofZeros )
//                binaryGap = numberofZeros
//        }
//
//    }
//
//
//    return binaryGap
//
//
//}
//
//fun main() {
//
//    val binaryGap = solution(1041)
//
//    System.out.println("binaryGap $binaryGap")
//}