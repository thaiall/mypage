// program id : 16
// 1. �����¹ method �����Ѻ���任����ż�
// 2. �Ţͧ sum = 140 ��������
public class j0402 {
  public static void main(String args[]) {
    int s = 0;
    s = sub(2,8,s);
    s = sub(7,3,s);
    s = sub(4,6,s);
    System.out.println("Sum = "+s);
  }
  public static int sub(int x, int y, int z) { 
    int a = y + x + z;
    return (a + y + x + z);    
  }
}
