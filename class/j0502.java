// program id : 20
// 1. ��С���������� 2 �Ե� ����ʴ���������������� 
// 2. ������͡�ԵԷ���ͧ�����ʴ���
public class j0502 {
  public static void main(String args[]) {
    String a[][] = new String[2][3];
    a[0][0] = "101";
    a[0][1] = "102";
    a[0][2] = "103";
    int i = 0;
    a[1][i++] = "tom";  // 1,0
    a[1][i++] = "dang"; // 1,1
    a[1][i++] = "boy";  // 1,2
    for (i = 0; i < a[0].length; i++) {
      System.out.println("element of 0,"+i+" = "+a[0][i]);
    }
    for (i = 0; i < a[1].length; i++) {
      System.out.println("element of 1,"+i+" = "+a[1][i]);
    }
    // for under for
    for (int x = 0; x < a.length; x++) { // 2
      for (int y = 0; y < a[0].length; y++) { // 3
        System.out.println(a[x][y]);
      }
    }
  }
}
