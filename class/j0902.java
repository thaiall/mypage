// program id : 35
// 1. ��ҹ��� data.txt ��� datas.txt ��������ѹ 
// 2. ������������� ������ʶҹ��Ҿ (�ӡѴ 6 ����¹)
// 2.1 data.txt : ����,����,ʡ��,ʶҹ�Ҿ
// 2.2 datas.txt : ʶҹ�Ҿ,��͸Ժ��ʶҹ�Ҿ
import java.io.*;
public class j0902 {
  public static void main (String args[]) throws IOException {
    int i = 0,t1,t2;
    String b,status;
    String[] fields;
    String[] recs1 = {"","","","","",""};
    String[] recs2 = new String[2];
    FileReader fin = new FileReader("data.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      recs1[i] = b;
      i = i + 1;
    }
    fin.close();
    t1 = i;
    i = 0;
    //
    FileReader fin2 = new FileReader("datas.txt");
    BufferedReader bin2 = new BufferedReader (fin2);
    while ((b =  bin2.readLine()) != null) {
      recs2[i] = b;
      i = i + 1;
    }
    fin2.close();
    t2 = i;
    //
    for(int j=0;j<t1;j++) {
      fields = recs1[j].split(",");
      System.out.print(fields[0] + fields[1] + fields[2]+fields[3]);
      status = fields[3];
      for(int k=0;k<t2;k++) {
        fields = recs2[k].split(",");
        if (fields[0].equals(status)) {
           System.out.println(fields[1]);
        }
      }
    }
  }
}
