// program id : 13
// 1. �Ѻ����Ţ 2 �ӹǹ���ǹ��Һǡ�ѹ �����ʴ���
// 2. �� BufferedReader 㹡���Ѻ������
// 3. ������������ import package
import java.io.*;
public class j0304 {
  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String buf;
    int i1,i2,i3;
    buf = stdin.readLine();
    i1 = Integer.parseInt(buf);
    i2 = Integer.parseInt(stdin.readLine());
    i3 = i1 + i2;
    System.out.println("Output is "+i1+" + "+i2+" = "+i3);
  }
}
