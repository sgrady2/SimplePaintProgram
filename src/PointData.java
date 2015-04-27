import java.awt.Color;

public class PointData{
	private int _xcoord;
	private int _ycoord;
	private Color _curColor;
	private int _curSize;
	private static int pointCount = 0;
	
	public PointData(int xcoord,int ycoord, Color color, int size){
		_xcoord = xcoord;
		_ycoord = ycoord;
		_curColor = color;
		_curSize = size;
		++pointCount;
		
		
		
	}
	public int getPointx(){
		return _xcoord;
	}
	public int getPointy(){
		return _ycoord;
	}
	public Color getCurColor(){
		return _curColor;
	}
	public int getCurSize(){
		return _curSize;
	}
	
	
	
	
}
	
	
	

