package gdecid.render;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import gdecid.visual.tuple.TableVisualItem;

public class LabelRender {
	
	protected int m_imageMargin = 20;  // ͼƬ������֮��Ŀ�϶
	
	protected Font  m_font;
	
	private static Image img;
	
	
	static {
		try {
			img=ImageIO.read(LabelRender.class.getClassLoader().getResourceAsStream("images/ren30.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//URL imageURL = IOLib.urlFromString("images/ren.png"); 
		//img=Toolkit.getDefaultToolkit().createImage(imageURL);
	}
	
	AffineTransform m_transform = new AffineTransform();
	
	public void Render(Graphics2D g, TableVisualItem item) {
		String text = item.getName();
		double size = item.getSize(); // ��ȡͼƬ�����ű���
		m_font = item.getFont();      // ��ȡ���ֵ�����
		
		double tx = item.getX();
		double ty = item.getY();
		double ix = item.getX();
		double iy = item.getY();
		
		// ����ͼƬ�ĸ߶ȺͿ�ȣ�����Ҫ��ͼƬ��ԭʼ�߶ȳ�ͼƬ�����ű�����
        double iw = size * img.getWidth(null);
        double ih = size * img.getHeight(null);
        
        ty = iy + ih + m_imageMargin;

        m_transform.setTransform(size, 0, 0, size, ix, iy);
        g.drawImage(img, m_transform, null);
        
        
        g.setFont(m_font);  // ���û��ʵ�����
        g.drawString(text, (float)tx, (float)ty);
	}
	
}
