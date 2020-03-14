import javax.swing.*;
import java.awt.*;

public class n8 extends JFrame{
	public n8() {
		setTitle("8번 문제"); // 프레임의 타이틀  달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); // 컨텐트팬에 BorderLayout 배치관리자 설정
		
		//위쪽 패널
        JPanel northP = new JPanel();
        northP.setBackground(Color.LIGHT_GRAY);
		northP.add(new JButton("열기"));
		northP.add(new JButton("닫기"));
		northP.add(new JButton("나가기"));
		northP.setLayout(new FlowLayout());
		
		//가운데 패널
		JPanel centerP = new JPanel();
		centerP.setBackground(Color.WHITE);
		centerP.setLayout(null); //레이아웃 없앰
		for(int i = 0; i < 10; i++) {
			JLabel l = new JLabel("*");
			l.setSize(30,30);
			l.setForeground(Color.RED);
			l.setLocation((int)(Math.random()*200+10), (int)(Math.random()*200+10));
			centerP.add(l);
		}
		
		//아랫쪽 패널
		JPanel southP = new JPanel();
		southP.setBackground(Color.YELLOW);
		southP.add(new JButton("Word Input"));
		southP.add(new JTextField(16));
		southP.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		c.add(northP, BorderLayout.NORTH);
		c.add(centerP, BorderLayout.CENTER);
		c.add(southP, BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new n8();
	}
}
