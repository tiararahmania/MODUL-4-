/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum;

/**
 *
 * @author Umi Tiara
 */
public class recttest {
    public static void main(String[]args)
    {
        rect r1 = new rect(1, 1, 4, 4);
        rect r2 = new rect(2, 3, 5, 6);
        rect u = r1.union(r2);
        rect i = r1.intersection(r2);
        
        if (u.isInside(r2.x1, r2.y1))
            System.out.println("("+r2.x1 +","+r2.y1+") is indide the union");
            System.out.println(r1 + "union" +r2+ "=" +u);
            System.out.println(r1 + "intersect" +r2+ "=" +1);
    }
}
