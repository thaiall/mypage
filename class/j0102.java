// program id : 3
// 1. ��Դ�����ž�鹰ҹ 2 Ẻ �ҡ 8 Ẻ
// 2. �ʴ��Ũҡ��ҷ���˹���� ��С���� function 
// 3. ��С�ȵ���� ��С������������
public class j0102 {
  public static void main(String args[]) {
  // 7. float -3.4e38 to 3.4e38 (4 Bytes) (�� 0 �� 38 ���)
    float d;
    d = 340000000000000000000000000000000000000f;    
    System.out.println("float = "+d);
  // 8. double -1.7e308 to 1.7e308 (8 Bytes)
    double e;
    e = 17900000000000000000000000000000000000000d;    
    System.out.println("double = "+e);
  // String aa = Double.toString(Double.parseDouble("123") + 1); 
  // String aa = Integer.toString(Integer.parseInt("456") + 2); 
  // aa = aa.substring(0,3);
  // String ���� List ��ҧ�� Abstact data type Ẻ˹��
  // ���� String z = new String("ThaiAll");
    String z ="ThaiAll";  
    System.out.println("string = "+z);  
    System.out.println(z.substring(0,4));  // Thai
    System.out.println(z.substring(2,5));  // aiA
    System.out.println(z.substring(4));    // All
    System.out.println(z.toUpperCase());   // THAIALL
    System.out.println(z.toLowerCase());   // thaiall
    System.out.println(z.length());   // 7
	char ar[] = new char[128];
    ar = z.toCharArray();
    System.out.println((char)ar[0]);       // T
    System.out.println(ar[0]);             // T
    System.out.println(ar[2] + ar[4]);     // 162 (97 + 65)
    z = "1234.1";
    int m = Integer.parseInt(z.substring(0,3)) + 5;  // 123 + 5
    double n = Double.parseDouble(z) + 0.2;          // 1234.3 
    System.out.println(m + n);           // 128 + 1234.3 = 1362.3
    System.out.println(Integer.toString(m) + 5);      // 1285 
  }
}
