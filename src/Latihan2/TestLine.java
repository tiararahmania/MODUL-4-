/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Umi Tiara
 */
public class TestLine 
{
    public static void main (String[] arga)
    {
        Line a = new Line (4, 5, 7, 9);
        Line b = new Line (8, 2, 4, 2);
        System.out.println("Length a : "+a.getLength());
        System.out.println("Length b : "+b.getLength());
        System.out.println("aLen > bLen = "+a.isGreater(a, b));
        System.out.println("aLen > bLen = "+a.isLess(a, b));
        System.out.println("aLen == bLen = "+a.isEqual(a, b));
    }
}
