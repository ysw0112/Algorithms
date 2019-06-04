package DesignPattern;

public class test {
  public static void main(String[] args) {
    String a = "Say your prayers, little one";
    String[] arr = a.split("");
    for (int i=arr.length-1; i>=0; i--){
      System.out.print(arr[i]);
    }
  }
}
