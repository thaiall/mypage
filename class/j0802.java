// program id : 33
// 1. �Ѻ��Ҩҡ�����������Ǥ������� data.txt 
// 2. ���Ҵ��� split ��Ҿ��Ţͧ split �����ҡ���� 1
import java.io.*;
public class j0802 {
  public static void main (String args[]) throws IOException {
    int found=0;
    String b,g = "";  
    String[] fields;
    System.out.println("Wait string and enter");
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    g = stdin.readLine();
    String patternStr = g;
    FileReader fin = new FileReader("data.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(patternStr);
      if (fields.length > 1) {
        fields = b.split(",");
        System.out.println(fields[0] + fields[1] + fields[2] + fields[3]);
        found = 1;
      }
    }
    if (found == 0) System.out.println("Not found");
    fin.close();
  }
}
