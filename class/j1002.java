// program id : 37
// 1. ���������������º��º ��ШѴ���§Ẻ bubble sort 
// 2. �����������������Ẻ String
// 3. ���ҧ function ����㹡����ҹ�����Ũҡ���������Ҿ����
import java.lang.*;
public class j1002 {
  public static void main (String args[]) {
    String tmp,x[] = {"ac","abc","adb","a","aa","acd","a a","a d"};
    System.out.println("Before sorting");
    prtlist(x);
    for(int i=1;i<x.length;i++) {
      for(int j=x.length-1;j>=i;j--) {
        if(x[j-1].compareTo(x[j])>0) {
           tmp = x[j];
           x[j] = x[j-1];
           x[j-1] = tmp;
        }
      }
    }
    System.out.println("After sorting");
    prtlist(x);
  }
  public static void prtlist(String[] x) {
    for(int i=0;i<x.length;i++) {
      System.out.println(x[i]);
    }
  }
}
