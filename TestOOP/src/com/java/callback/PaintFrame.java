package com.java.callback;

public class PaintFrame {
	public static void drawFrame(IMyFrame f){
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息");
		
		//画窗口
		f.paint();
		
		System.out.println("启动缓存，增加效率");
		
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame());
	}
}

class GameFrame implements IMyFrame{
	public void paint(){
		System.out.println("GameFrame.Paint()");
		System.out.println("画GameFrame.Paint()窗口");
	}
}
