// ::::: ������ӴѺ��� 38
// 1. ��������� test1 ���� Applet
// 2. ��ҧ�ͺ���� 10 pixels ��ҧ�ͺ�� 20 pixels
// 3. �����ż��Ը��á appletviewer j1101.htm
// 4. �����ż��Ըշ���ͧ explorer j1101.htm
// <applet code=j1101.class width=200 height=50></applet>
import java.applet.*; // Microsoft VM 
import java.awt.*; // Color
public class j1101 extends java.applet.Applet {
  public void paint(Graphics g) {
    g.setColor(new Color(0,0,255));
    g.drawString("test1",10,20);
    g.setColor(Color.red);
    g.drawString("test2",10,40);
  }
}

