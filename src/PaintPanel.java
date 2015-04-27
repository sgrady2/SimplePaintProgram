import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;


public class PaintPanel extends JPanel {
	private static int POINT_SIZE = 10;
	private ArrayList<PointData> _points;
	private Color _color;
	//private ArrayList<Point> _points1;
	
	
	public PaintPanel() {
		_points = new ArrayList<PointData>();
		_color = Color.BLACK;
		//_points1 = new ArrayList<Point>();
		
		//_drawList = new ArrayList<PointData>();
		addMouseMotionListener(new MouseMotionAdapter() {
			
	
			@Override
			public void mouseDragged(MouseEvent ev) {
				//here we are sending the data from the mouse, to the arrayList _points
				
				
				//adds x,y plus current color and size of mouse-dragged location
				_points.add(new PointData((ev.getPoint().x),(ev.getPoint().y),(_color),(POINT_SIZE)));
				repaint();
			
			}
			
			});
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
				
				//call a function to 
				
				for (PointData point:_points){
					g.setColor(point.getCurColor());
					g.fillOval(point.getPointx(), point.getPointy(), point.getCurSize(), point.getCurSize());
					
					
					
					
				}
				
				//g.fillOval(point.x, point.y, POINT_SIZE, POINT_SIZE);
					}
			
		
		
		
	
			
			

	
	public void changeGreen() {
		
		_color = Color.GREEN;
		
	}
	public void changeYellow() {
		
		_color = Color.YELLOW;
		repaint();
	}
	public void changeRed() {
		
		_color = Color.RED;	
		repaint();		
		
	}
	public void changeBlue() {
		
		_color = Color.BLUE;			
		repaint();
		
	}
	
	public void changeSmall(){
		if (POINT_SIZE <= 10){
			
		}else{
			POINT_SIZE = 10;
		}
	}
	public void changeMedium(){
		if (POINT_SIZE == 10 || POINT_SIZE == 30 )
			POINT_SIZE = 20;
		
	}
	public void changeLarge(){
		if (POINT_SIZE < 30)
			POINT_SIZE = 30;
		
		
	}
	public void clear(){
		_points.clear();
		repaint();
	}
	
	
}