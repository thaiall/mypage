// program id : 32
// 1. �Ѻ��Ҩҡ�鹾������� System.in.read 
// 2. ������͡���������� data.txt �����ʴ�����¹���ç
// 3. ���Ҵ��� .equals()
import java.io.*;
public class j0801 {
  public static void main (String args[]) throws IOException {
    int found=0;
    char buf;
    String b,g = "";  
    String[] fields;
    System.out.println("Wait id and end character with [x]");
    buf = (char)System.in.read();
    while (buf != 'x') {
      g = g + buf;
      buf = (char)System.in.read();
    }
    FileReader fin = new FileReader("data.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(",");
      if (fields[0].equals(g)) {
        System.out.println(fields[1]);
        found = 1;
      }
    }
    if (found == 0) System.out.println("Not found");
    fin.close();
  }
}
