package com.java.callback;

public class PaintFrame {
	public static void drawFrame(IMyFrame f){
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣ");
		
		//������
		f.paint();
		
		System.out.println("�������棬����Ч��");
		
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame());
	}
}

class GameFrame implements IMyFrame{
	public void paint(){
		System.out.println("GameFrame.Paint()");
		System.out.println("��GameFrame.Paint()����");
	}
}
