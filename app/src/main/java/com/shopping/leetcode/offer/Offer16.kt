package com.shopping.leetcode.offer

/**
描述:
zhaochenshuo
2021/2/24
 */

class Offer16 {


    /**
     * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
     * */

    fun aa( t:TextTwo?){
        val a: TextTwo? = t?.l
        t?.l=t?.r
        t?.r=a

        aa(t?.l)
        aa(t?.r)

    }

}