//Trivia
//Final Project
//Programmer: Jaime Reyes-Mendoza

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Trivia extends JFrame implements ItemListener, ActionListener
{
	FlowLayout flow = new FlowLayout();
	JLabel text = new JLabel(" ");
	JLabel s = new JLabel(" ");
	String[] q = {"What city is the birthplace of anime?", "What city is known for their shrines?", "Which city holds a snow festival every February?", "Which of the following is the hottest tourist destination?", "Which city is known as the 'Capital of Peace and Tranquility'?"};
	JCheckBox tokyo = new JCheckBox("Tokyo", false);
	JCheckBox kyoto = new JCheckBox("Kyoto", false);
	JCheckBox sapporo = new JCheckBox("Sapporo", false);
	JButton btn = new JButton("Submit");
	int points = 0;
	int score = 0;
	int x = 0;
	String word = " ";
	
	public Trivia()
	{
		super("Japan Quiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		text.setFont(new Font("Arial", Font.ITALIC, 22));
		tokyo.addItemListener(this);
		kyoto.addItemListener(this);
		sapporo.addItemListener(this);
		btn.addActionListener(this);
		text.setText(q[x]);
		add(text);
		add(tokyo);
		add(kyoto);
		add(sapporo);
		add(btn);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		score = score + points;
		points = 0;
		if(score <= 15)
			word = "はい。!";
		if(15 < score && score < 20)
			word = "良い!";
		if(score >= 20)
			word = "優れた!";
		//Question Switch
		if (x < q.length - 1) 
		{ 
			x++; 
			text.setText(q[x]);
			tokyo.setSelected(false);
            kyoto.setSelected(false);
            sapporo.setSelected(false);

		} 
		else 
		{
			text.setText(word +" You earned " + score + " points!");
			tokyo.setVisible(false);
			kyoto.setVisible(false);
			sapporo.setVisible(false);
			btn.setVisible(false);
		}
	}
	//Point System
	public void itemStateChanged(ItemEvent check)
	{
		int select = check.getStateChange();
		if(x == 0)
		{
			if(tokyo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 5;
			if(kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(tokyo.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 2;
			if(tokyo.isSelected() && kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 2;
			if(tokyo.isSelected() && kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 1;
			if(kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if (!tokyo.isSelected() && !kyoto.isSelected() && !sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
		}
		if(x == 1)
		{
			if(tokyo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 5;
			if(sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(tokyo.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(tokyo.isSelected() && kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 2;
			if(tokyo.isSelected() && kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 2;
			if (!tokyo.isSelected() && !kyoto.isSelected() && !sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
		}
		if(x == 2)
		{
			if(tokyo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points + 5;
			if(tokyo.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points + 2;
			if(tokyo.isSelected() && kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(tokyo.isSelected() && kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points + 1;
			if(kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points + 2;
			if (!tokyo.isSelected() && !kyoto.isSelected() && !sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
		}
		if(x == 3)
		{
			if(tokyo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 5;
			if(kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(tokyo.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 2;
			if(tokyo.isSelected() && kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 2;
			if(tokyo.isSelected() && kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 1;
			if(kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if (!tokyo.isSelected() && !kyoto.isSelected() && !sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
		}
		if(x == 4)
		{
			if(tokyo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 5;
			if(sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(tokyo.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
			if(tokyo.isSelected() && kyoto.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 2;
			if(tokyo.isSelected() && kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 1;
			if(kyoto.isSelected() && sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = 2;
			if (!tokyo.isSelected() && !kyoto.isSelected() && !sapporo.isSelected())
				if(select == ItemEvent.SELECTED)
					points = points;
		}
	}
	
	public static void main(String[] args)
	{
		final int FRAME_WIDTH = 350;
		final int FRAME_HEIGHT = 120;
		Trivia frame = new Trivia();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setVisible(true);
	}
}
