// program id : 11
// 1. �ʴ�����Ѻ��Ҩҡ�鹾����Ẻ character 
// 2. �Ѻ 2 ����ѡ�����ʴ��ŵ�͡ѹ �� enter ������ش
// 3. �� try ᷹ throws IOException
import java.io.*;
public class j0302 {
  public static void main(String args[]) {
    char buf1=0;
    char buf2=0;
    try {
      buf1 = (char)System.in.read();
      buf2 = (char)System.in.read();    	
    } catch (Exception e) { }
    System.out.println("Output is "+buf1+buf2);
  }
}
