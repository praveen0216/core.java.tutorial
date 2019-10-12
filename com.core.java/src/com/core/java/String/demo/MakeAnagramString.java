/*
 * package com.core.java.String.demo;
 * 
 * import java.io.*; import java.math.*; import java.security.*; import
 * java.text.*; import java.util.*; import java.util.concurrent.*; import
 * java.util.regex.*;
 * 
 * public class MakeAnagramString {
 * 
 * // Complete the makeAnagram function below. static int makeAnagram(String a,
 * String b) { int count=0; int loop=0; String A[]= new String[] {a}; String
 * B[]= new String[] {b}; if(a!=null&&b!=null){ if(a.length() ==b.length()){
 * 
 * while(loop!=a.length()-1) { if(!b.contains(A[loop])) { count++; } else
 * {//frequency check frequency(A,) } loop++; } loop=0; while
 * (loop!=b.length()-1) { if(!a.contains(A[loop])) { count++;} loop++; } } else{
 * 
 * }
 * 
 * 
 * } else if(a==null&&b!=null) { return b.length(); } else if(a!=null&& b==null)
 * { return a.length(); } else{ return count; }
 * 
 * }
 * 
 * private static final Scanner scanner = new Scanner(System.in);
 * 
 * public static void main(String[] args) throws IOException { BufferedWriter
 * bufferedWriter = new BufferedWriter(new
 * FileWriter(System.getenv("OUTPUT_PATH")));
 * 
 * String a = scanner.nextLine();
 * 
 * String b = scanner.nextLine();
 * 
 * int res = makeAnagram(a, b);
 * 
 * bufferedWriter.write(String.valueOf(res)); bufferedWriter.newLine();
 * 
 * bufferedWriter.close();
 * 
 * scanner.close(); } }
 */