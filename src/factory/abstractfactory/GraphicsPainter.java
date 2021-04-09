package factory.abstractfactory;

import java.awt.Graphics;

import javax.swing.JFrame;

// 辅助绘图

public interface GraphicsPainter {
	
	void paint(Graphics g);
	
	static void draw(GraphicsPainter p) {
		// 创建窗口并绘图
		@SuppressWarnings("serial")
		JFrame f = new JFrame() {
			@Override
			public void paint(Graphics g) {
				p.paint(g);
			}
		};
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(640, 480);
		f.setVisible(true);
	}
}
