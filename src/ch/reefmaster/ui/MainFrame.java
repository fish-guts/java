package ch.reefmaster.ui;

import javax.swing.JFrame;

public class MainFrame {
	
	private static final int DEFAULT_LENGTH = 800;
	private static final int DEFAULT_WIDTH = 600;
	private static final String DEFAULT_FRAME_NAME = "Super League";
	
	private String frameTitle;
	private int height;
	private int width;
	
	public MainFrame() {
		this(DEFAULT_FRAME_NAME,DEFAULT_LENGTH, DEFAULT_WIDTH);
	}
	public MainFrame(String frameTitle, int h, int w) {
		this.frameTitle = frameTitle;
		this.height = h;
		this.width = w;
	}
	
	public JFrame createFrame() {
		 JFrame frame = new JFrame(frameTitle);
		 frame.setSize(height,width);
		 frame.setVisible(true);		
		 return frame;
	}
}
