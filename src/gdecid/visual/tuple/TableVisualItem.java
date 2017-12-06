package gdecid.visual.tuple;

import java.awt.Font;
import java.awt.Graphics;

import gdecid.visual.VisualItem;

public class TableVisualItem implements VisualItem{
	String name;
	double x;
	double y;
	double size = 1.0; //����ͼƬ�����Ŵ�С��
	Font font = new Font("����", Font.PLAIN, 15);;
	
	public TableVisualItem(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	
}
