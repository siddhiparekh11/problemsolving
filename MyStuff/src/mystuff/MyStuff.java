/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystuff;

import java.util.ArrayList;
import java.util.List;

public class MyStuff {
 String name;
 MyStuff(String n) {
 name = n;
 }
 public static void main(String[] args) {
 MyStuff m1 = new MyStuff("guitar");
 MyStuff m2 = new MyStuff("tv");
 System.out.println(m2.equals(m1));
 List p = new ArrayList();
 p.add(7);
 p.add(1);
 p.add(5);
 p.add(1);
 p.remove(1);
 System.out.println(p);
 }
 public boolean equals(Object o) {
 MyStuff m = (MyStuff) o;
 if (m.name != null) {
 return true;
 }
 return false;
 }
}