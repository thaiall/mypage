// program id : 12
// 1. �ʴ�����Ѻ��Ҩҡ�鹾����Ẻ character 
// 2. �Ѻ��͡ѹ������� � ���Ѻ����ѡ�� 0 ���仨֧��ش
// 3. ��� import java.io.*
public class j0303 {
  public static void main(String args[]) throws java.io.IOException {
    System.out.println("Get until receive 0 [hidden is 13, 10]");
    char buf;
    do {
      buf = (char)System.in.read();
      System.out.println("Output is "+buf);
    } while (buf != '0');
  }
}
