import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Main {	
	private static PaintPanel _paintPanel;
	
	public static void main(String[] args) {		
		JFrame frame = new JFrame("CIS 212");
		frame.setLayout(new BorderLayout());
		//Initializing two side panels
		JPanel subPanelL = new JPanel();
		JPanel subPanelR = new JPanel();
		
		//Setting up some buttons for the side panels
		JButton yellow = new JButton("Yellow");
		yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ex) {
				_paintPanel.changeYellow();
			}
		});
		JButton red = new JButton("Red");
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ex) {
				_paintPanel.changeRed();
			}
		});
		JButton green = new JButton("Green");
		green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ex) {
				_paintPanel.changeGreen();
			}
		});
		JButton blue = new JButton("Blue");
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ex) {
				_paintPanel.changeBlue();
			}
		});
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ex) {
				_paintPanel.clear();
			}
		});
		JButton large = new JButton("Large");
		large.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ex) {
				_paintPanel.changeLarge();
			}
		});
		JButton medium = new JButton("Medium");
		medium.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ex) {
				_paintPanel.changeMedium();
			}
		});
		JButton small = new JButton("Small");
		small.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ex) {
				_paintPanel.changeSmall();
			}
		});
		
		//adding buttons to subPanel
		subPanelL.add(yellow);
		subPanelL.add(red);
		subPanelL.add(green);
		subPanelL.add(blue);
		subPanelR.add(clear);
		subPanelR.add(small);
		subPanelR.add(medium);
		subPanelR.add(large);
		
		frame.add(subPanelL, BorderLayout.WEST);
		frame.add(subPanelR, BorderLayout.EAST);
		
		_paintPanel = new PaintPanel();
		_paintPanel.setPreferredSize(new Dimension(400, 400));		
		frame.add(_paintPanel, BorderLayout.CENTER);
		frame.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
		PointData p = new PointData(1, 1, Color.BLUE, 10);
		
		System.out.println(p.getPointx()+"x"+p.getPointy()+"y"+p.getCurSize()+"siize  "+p.getCurColor()+"cullah");
		
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);
	}		
}