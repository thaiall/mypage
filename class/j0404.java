// program id : 18
// 1. ���ҧ class ����������¡ method � class ���� 
// 2. �ʴ������ super ��� this � constructor
// 3. .java ���˹�� �Ҩ�������� class
// 4. extends ������ inherit �ҡ class ���
public class sub01 {
  void subx() {
    System.out.println("subx in sub01");
  }
}
public class sub02 {
  void subx() {
    System.out.println("subx in sub02");
  }
}
public class j0404 extends sub02 {
  j0404() { 
    super.subx(); // subx in sub02
    this.subx(); // subx in main
  }
  public static void main(String args[]) {
    sub01 x = new sub01();
    System.out.println("main"); // main
    x.subx();      // subx in sub01
    j0404 y = new j0404();    
  }
  void subx() {
    System.out.println("subx in main");
  }
}
