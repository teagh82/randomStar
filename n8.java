import javax.swing.*;
import java.awt.*;

public class n8 extends JFrame{
	public n8() {
		setTitle("8�� ����"); // �������� Ÿ��Ʋ  �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); // ����Ʈ�ҿ� BorderLayout ��ġ������ ����
		
		//���� �г�
        JPanel northP = new JPanel();
        northP.setBackground(Color.LIGHT_GRAY);
		northP.add(new JButton("����"));
		northP.add(new JButton("�ݱ�"));
		northP.add(new JButton("������"));
		northP.setLayout(new FlowLayout());
		
		//��� �г�
		JPanel centerP = new JPanel();
		centerP.setBackground(Color.WHITE);
		centerP.setLayout(null); //���̾ƿ� ����
		for(int i = 0; i < 10; i++) {
			JLabel l = new JLabel("*");
			l.setSize(30,30);
			l.setForeground(Color.RED);
			l.setLocation((int)(Math.random()*200+10), (int)(Math.random()*200+10));
			centerP.add(l);
		}
		
		//�Ʒ��� �г�
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
