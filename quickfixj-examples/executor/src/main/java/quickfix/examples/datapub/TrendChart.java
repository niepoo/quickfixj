package quickfix.examples.datapub;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;  
  
/** 
 * 股票分时图 
 *  
 * @author niepoo 
 * @Time 2016-10-2 
 */  
public class TrendChart extends JFrame {  
  
    private static final long serialVersionUID = 1L;  
    private Image iBuffer;  
    private MyCanvas trendChartCanvas = new MyCanvas(30.0,0.05,30.5);  
    private JTextField highPressText, lowPressText;  
  
    private final int WINDOW_WIDTH = 1800;
    private final int WINDOW_HEIGHT = 920;
    // 框架起点坐标、宽高  
    private final int FRAME_X = 100;  
    private final int FRAME_Y = 100;  
    private final int FRAME_WIDTH = 1580;  
    private final int FRAME_HEIGHT = 620;  
  
    // 原点坐标  
    private final int Origin_X = FRAME_X + 80;  
    private final int Origin_Y = FRAME_Y + FRAME_HEIGHT - 30;  
  
    // X轴、Y轴终点坐标  
    private final int XAxis_X = FRAME_X + FRAME_WIDTH - 40;  
    private final int XAxis_Y = Origin_Y;  
    private final int YAxis_X = Origin_X;  
    private final int YAxis_Y = FRAME_Y + 30;  
  
    // X轴上的时间分度值(1分度=5分钟=30像素)  
    private final int TIME_INTERVAL = 30;  
  
    // y轴上单价分度值  
    private final int PRICE_INTERVAL = 7;  

//    private String[] XAxis_TimeStr = {"09:30","09:45","10:00","10:15","10:30","10:45","11:00","11:15","11:30/13:00",
//    		"13:15","13:30","13:45","14:00","14:15","14:30","14:45","15:00"};
    private String[] XAxis_TimeStr = {"09:30","10:00","10:30","11:00","11:30/13:00","13:30","14:00","14:30","15:00"};
  
    // 保存当前测量高压和低压值数组,数组长度计数器  
    private int[] CurrentHighPressInput = { 150, 150, 150, 150, 150, 150, 150,  
            150, 150, 150, 150, 150, 150, 150, 150, 150 };  
    private int[] CurrentLowPressInput = { 75, 75, 75, 75, 75, 75, 75, 75, 75,  
            75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75 };  
    private int CurrentPressInputLength = 1;  
  
    public TrendChart() {  

        final String WINDOW_TITLE = "股票发布行情";  
        setTitle(WINDOW_TITLE);                                         // Set the frame title
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);                           // Set the frame dimensions
        setLocationRelativeTo(null);                                    // Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);

   
        // 添加控制到框架北部区  
        JPanel topPanel = new JPanel();  
        this.add(topPanel, BorderLayout.NORTH);  
  
        // X轴值与文本框  
        highPressText = new JTextField(5);  
        topPanel.add(new JLabel("X轴值", JLabel.CENTER));  
        topPanel.add(highPressText);  
 
       // Y轴值与文本框  
        lowPressText = new JTextField(5);  
        topPanel.add(new JLabel("Y轴值", JLabel.CENTER));  
        topPanel.add(lowPressText);  
  
        // 打点按钮与事件  
        JButton pressButton = new JButton("打点");  
        pressButton.addActionListener(new ActionListener() {  
  
            // 把当前输入的高压和低压值  
            @Override  
            public void actionPerformed(ActionEvent arg0) {  
  
                // 绘制当前输入的高压趋势  
                double InputHighPress = Double.parseDouble(highPressText.getText());
                double InputLowPress = Double.parseDouble(lowPressText.getText());
                //CurrentHighPressInput[CurrentPressInputLength] = InputHighPress;  
               // CurrentLowPressInput[CurrentPressInputLength] = InputLowPress;  
               // CurrentPressInputLength++;  
               // trendChartCanvas.repaint();  
                trendChartCanvas.drawAddPoint(InputHighPress, InputLowPress);
                //trendChartCanvas.repaint(); 
                // 输入文本框清零  
                highPressText.setText("");  
                lowPressText.setText("");  
            }  
        });  
  
        topPanel.add(pressButton);  
  
        // 添加画布到中央区  
        this.add(trendChartCanvas, BorderLayout.CENTER);  
        this.setResizable(false);  
        this.setVisible(true);  
    }  
  
    /** 
     * 画布重绘股票图 
     */  
    class MyCanvas extends Canvas {  
          
        private static final long serialVersionUID = 1L; 
        private double originT,originP,currentT,currentP,startDimension,TEN_INTERVAL; 
        public MyCanvas(double originPrice,double fdbl,double Kp_price){
        	originT = 0;
        	originP = originPrice;
        	double zf = originP*fdbl*1.1;
        	startDimension = originP - zf;
        	TEN_INTERVAL= zf/4;
        	//初始化起点
        	currentT = 0;
        	currentP = Kp_price;
        	
        }
        public void paint(Graphics g) {  
            Graphics2D g2D = (Graphics2D) g;  
  
            // 画边框  
            g.setColor(Color.BLACK);  
            g.draw3DRect(FRAME_X, FRAME_Y, FRAME_WIDTH, FRAME_HEIGHT, true);  
  
            // 画坐标轴  
            g.setColor(Color.BLACK);  
            g2D.setStroke(new BasicStroke(Float.parseFloat("2.0f")));  

            // 画X轴上时间刻度(从坐标原点起，每隔TIME_INTERVAL(时间分度)像素画一时间点，到X轴终点至)  
            g.setColor(Color.BLUE);  
            g2D.setStroke(new BasicStroke(Float.parseFloat("0.5f")));  
            
            for (int i = Origin_X, j = 0; i <= XAxis_X; i += 6*TIME_INTERVAL, j += 1) {  
                g.drawString(XAxis_TimeStr[j], i - 25, Origin_Y + 20);  
            }  

  
            // 画Y轴上单价刻度(从坐标原点起，每隔10像素画一价格值，到Y轴终点至)  
            for (int i = Origin_Y, j = 0; i >= YAxis_Y; i -= 10*PRICE_INTERVAL, j += 1) {  
                g.drawString((float)Math.round((startDimension + j*TEN_INTERVAL)*100)/100 + "", Origin_X - 50, i + 3);  
            }  
  
            // 画网格线  
            g.setColor(Color.gray);  
            // 横线  
            for (int i = Origin_Y,j=0; i >= YAxis_Y; i -= PRICE_INTERVAL,j++) {  
            	if(j%10==0){
            		g2D.setStroke(new BasicStroke(Float.parseFloat("2.0f")));
            	}else{
            		g2D.setStroke(new BasicStroke(Float.parseFloat("0.5f")));
            	}
                g.drawLine(Origin_X, i, Origin_X + 48 * TIME_INTERVAL, i);  
            }  
            // 竖线  
            for (int i = Origin_X,j=0; i <= XAxis_X; i += TIME_INTERVAL,j++) {  
            	if(j%6==0){
            		g2D.setStroke(new BasicStroke(Float.parseFloat("2.0f")));
            	}else{
            		g2D.setStroke(new BasicStroke(Float.parseFloat("0.5f")));
            	}
                g.drawLine(i, Origin_Y, i, Origin_Y - 80 * PRICE_INTERVAL);  
  
            }    
        }  
  
        // 双缓冲技术解决图像显示问题  
        public void update(Graphics g) {  
            if (iBuffer == null) {  
                iBuffer = createImage(this.getSize().width,  
                        this.getSize().height);  
  
            }
            Graphics gBuffer = iBuffer.getGraphics();  
            gBuffer.setColor(getBackground());  
            gBuffer.fillRect(0, 0, this.getSize().width, this.getSize().height);  
            paint(gBuffer);  
            gBuffer.dispose();  
            g.drawImage(iBuffer, 0, 0, this);  
        } 
        //在画板中添加最后一个点画的线
       public void drawAddPoint(double x,double y){
           Graphics g = this.getGraphics();
           Graphics2D g2D = (Graphics2D) g; 
    	   g.setColor(Color.ORANGE);  
           g2D.setStroke(new BasicStroke(Float.parseFloat("3.0f")));  
           int o_distance_left =  (int)(Origin_X+(currentT-originT)*TIME_INTERVAL);
           int o_distance_top =  (int)(Origin_Y-40*PRICE_INTERVAL- ((currentP-originP)/TEN_INTERVAL)*10*PRICE_INTERVAL);
           int n_distance_left =  (int)(Origin_X+(x-originT)*TIME_INTERVAL);
           int n_distance_top =  (int)(Origin_Y - 40*PRICE_INTERVAL- ((y-originP)/TEN_INTERVAL)*10*PRICE_INTERVAL);
           g.drawLine(o_distance_left, o_distance_top, n_distance_left, n_distance_top); 
           currentT = x;
           currentP = y;
       }
    }  
  
    public static void main(String[] args) {  
  
        // 设置界面的外观，为系统外观  
        try {  
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        new TrendChart();  
    }  
}  