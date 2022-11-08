import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Start {
	
	private JFrame frame;

	private String target;
	private String program;
	private JTextField txtTarget;
	private JTextField txtProgram;
	
	
	// IV
	private int count = 0;
	private int answerChart[][] = new int[7][5];
	
	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public Start() {
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() {
		// Frame Initialization
		frame = new JFrame();
		frame.setTitle("만족도 설문조사 계산기");
		frame.setBounds(100, 100, 840, 840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		
		
		// Page Initialization
		JPanel StartPage = new JPanel();
		frame.getContentPane().add(StartPage);
		StartPage.setBounds(0, 0, 824, 591);
		StartPage.setLayout(null);
		
		
		JPanel InputPage = new JPanel();
		frame.getContentPane().add(InputPage);
		InputPage.setBounds(0, 0, 824, 591);
		InputPage.setVisible(false);
		InputPage.setLayout(null);

		
		
		// Start Page
		JLabel startTitle = new JLabel("만족도 설문조사 계산기");
		startTitle.setHorizontalAlignment(SwingConstants.CENTER);
		startTitle.setFont(new Font("D2Coding", Font.BOLD, 30));
		startTitle.setBounds(231, 123, 366, 88);
		StartPage.add(startTitle);
		
		JLabel targetLable = new JLabel("대상 : ");
		targetLable.setHorizontalAlignment(SwingConstants.CENTER);
		targetLable.setFont(new Font("D2Coding", Font.PLAIN, 20));
		targetLable.setBounds(291, 288, 100, 43);
		StartPage.add(targetLable);
		
		JLabel programLable = new JLabel("프로그램 명 : ");
		programLable.setHorizontalAlignment(SwingConstants.CENTER);
		programLable.setFont(new Font("D2Coding", Font.PLAIN, 20));
		programLable.setBounds(221, 354, 170, 43);
		StartPage.add(programLable);
		
		txtTarget = new JTextField();
		txtTarget.setFont(new Font("D2Coding", Font.PLAIN, 20));
		txtTarget.setColumns(10);
		txtTarget.setBounds(381, 283, 201, 48);
		StartPage.add(txtTarget);
		
		txtProgram = new JTextField();
		txtProgram.setFont(new Font("D2Coding", Font.PLAIN, 20));
		txtProgram.setColumns(10);
		txtProgram.setBounds(381, 349, 201, 48);
		StartPage.add(txtProgram);
		

		
		
		JLabel Count = new JLabel("1");
		Count.setHorizontalAlignment(SwingConstants.RIGHT);
		Count.setFont(new Font("D2Coding", Font.PLAIN, 20));
		Count.setBounds(566, 107, 61, 31);
		InputPage.add(Count);
		
		
		
		
		

		// Input Page Labels
		JLabel Q1Label = new JLabel("1번 문항");
		Q1Label.setHorizontalAlignment(SwingConstants.CENTER);
		Q1Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		Q1Label.setBounds(35, 209, 99, 31);
		InputPage.add(Q1Label);
		
		JLabel Q2Label = new JLabel("2번 문항");
		Q2Label.setHorizontalAlignment(SwingConstants.CENTER);
		Q2Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		Q2Label.setBounds(35, 251, 99, 31);
		InputPage.add(Q2Label);
		
		JLabel Q3Label = new JLabel("3번 문항");
		Q3Label.setHorizontalAlignment(SwingConstants.CENTER);
		Q3Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		Q3Label.setBounds(35, 293, 99, 31);
		InputPage.add(Q3Label);
		
		JLabel Q4Label = new JLabel("4번 문항");
		Q4Label.setHorizontalAlignment(SwingConstants.CENTER);
		Q4Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		Q4Label.setBounds(35, 335, 99, 31);
		InputPage.add(Q4Label);
		
		JLabel Q5Label = new JLabel("5번 문항");
		Q5Label.setHorizontalAlignment(SwingConstants.CENTER);
		Q5Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		Q5Label.setBounds(35, 377, 99, 31);
		InputPage.add(Q5Label);
		
		JLabel Q6Label = new JLabel("6번 문항");
		Q6Label.setHorizontalAlignment(SwingConstants.CENTER);
		Q6Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		Q6Label.setBounds(35, 419, 99, 31);
		InputPage.add(Q6Label);
		
		JLabel Q7Label = new JLabel("7번 문항");
		Q7Label.setHorizontalAlignment(SwingConstants.CENTER);
		Q7Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		Q7Label.setBounds(35, 461, 99, 31);
		InputPage.add(Q7Label);
		
		
		
		JLabel CountLabel = new JLabel("번째 응답자");
		CountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CountLabel.setFont(new Font("D2Coding", Font.PLAIN, 20));
		CountLabel.setBounds(630, 106, 123, 31);
		InputPage.add(CountLabel);
		
		JLabel P5Label = new JLabel("매우 그렇다");
		P5Label.setHorizontalAlignment(SwingConstants.CENTER);
		P5Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		P5Label.setBounds(156, 162, 117, 31);
		InputPage.add(P5Label);
		
		JLabel P4Label = new JLabel("그렇다");
		P4Label.setHorizontalAlignment(SwingConstants.CENTER);
		P4Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		P4Label.setBounds(301, 162, 61, 31);
		InputPage.add(P4Label);
		
		JLabel P3Label = new JLabel("보통이다");
		P3Label.setHorizontalAlignment(SwingConstants.CENTER);
		P3Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		P3Label.setBounds(387, 162, 92, 31);
		InputPage.add(P3Label);
		
		JLabel P2Label = new JLabel("그렇지 않다");
		P2Label.setHorizontalAlignment(SwingConstants.CENTER);
		P2Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		P2Label.setBounds(498, 162, 117, 31);
		InputPage.add(P2Label);
		
		JLabel P1Label = new JLabel("매우 그렇지 않다");
		P1Label.setHorizontalAlignment(SwingConstants.CENTER);
		P1Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		P1Label.setBounds(634, 162, 160, 31);
		InputPage.add(P1Label);
		
		// radioButtons
		JRadioButton Q1P5Radio = new JRadioButton("");
		Q1P5Radio.setBounds(197, 209, 21, 23);
		InputPage.add(Q1P5Radio);
		Q1P5Radio.setActionCommand("0");
		
		JRadioButton Q1P4Radio = new JRadioButton("");
		Q1P4Radio.setBounds(320, 209, 21, 23);
		InputPage.add(Q1P4Radio);
		Q1P4Radio.setActionCommand("1");
		
		JRadioButton Q1P3Radio = new JRadioButton("");
		Q1P3Radio.setBounds(421, 209, 21, 23);
		InputPage.add(Q1P3Radio);
		Q1P3Radio.setActionCommand("2");
		
		JRadioButton Q1P2Radio = new JRadioButton("");
		Q1P2Radio.setBounds(547, 209, 21, 23);
		InputPage.add(Q1P2Radio);
		Q1P2Radio.setActionCommand("3");
		
		JRadioButton Q1P1Radio = new JRadioButton("");
		Q1P1Radio.setBounds(707, 209, 21, 23);
		InputPage.add(Q1P1Radio);
		Q1P1Radio.setActionCommand("4");
		
		ButtonGroup groupQ1 = new ButtonGroup();
		groupQ1.add(Q1P5Radio);
		groupQ1.add(Q1P4Radio);
		groupQ1.add(Q1P3Radio);
		groupQ1.add(Q1P2Radio);
		groupQ1.add(Q1P1Radio);
		
		
		JRadioButton Q2P5Radio = new JRadioButton("");
		Q2P5Radio.setBounds(197, 251, 21, 23);
		InputPage.add(Q2P5Radio);
		Q2P5Radio.setActionCommand("0");
		
		JRadioButton Q2P4Radio = new JRadioButton("");
		Q2P4Radio.setBounds(320, 251, 21, 23);
		InputPage.add(Q2P4Radio);
		Q2P4Radio.setActionCommand("1");
		
		JRadioButton Q2P3Radio = new JRadioButton("");
		Q2P3Radio.setBounds(421, 251, 21, 23);
		InputPage.add(Q2P3Radio);
		Q2P3Radio.setActionCommand("2");
		
		JRadioButton Q2P2Radio = new JRadioButton("");
		Q2P2Radio.setBounds(547, 251, 21, 23);
		InputPage.add(Q2P2Radio);
		Q2P2Radio.setActionCommand("3");
		
		JRadioButton Q2P1Radio = new JRadioButton("");
		Q2P1Radio.setBounds(707, 251, 21, 23);
		InputPage.add(Q2P1Radio);
		Q2P1Radio.setActionCommand("4");
		
		ButtonGroup groupQ2 = new ButtonGroup();
		groupQ2.add(Q2P5Radio);
		groupQ2.add(Q2P4Radio);
		groupQ2.add(Q2P3Radio);
		groupQ2.add(Q2P2Radio);
		groupQ2.add(Q2P1Radio);
		
		
		JRadioButton Q3P5Radio = new JRadioButton("");
		Q3P5Radio.setBounds(197, 293, 21, 23);
		InputPage.add(Q3P5Radio);
		Q3P5Radio.setActionCommand("0");
		
		JRadioButton Q3P4Radio = new JRadioButton("");
		Q3P4Radio.setBounds(320, 293, 21, 23);
		InputPage.add(Q3P4Radio);
		Q3P4Radio.setActionCommand("1");
		
		JRadioButton Q3P3Radio = new JRadioButton("");
		Q3P3Radio.setBounds(421, 293, 21, 23);
		InputPage.add(Q3P3Radio);
		Q3P3Radio.setActionCommand("2");
		
		JRadioButton Q3P2Radio = new JRadioButton("");
		Q3P2Radio.setBounds(547, 293, 21, 23);
		InputPage.add(Q3P2Radio);
		Q3P2Radio.setActionCommand("3");
		
		JRadioButton Q3P1Radio = new JRadioButton("");
		Q3P1Radio.setBounds(707, 293, 21, 23);
		InputPage.add(Q3P1Radio);
		Q3P1Radio.setActionCommand("4");
		
		ButtonGroup groupQ3 = new ButtonGroup();
		groupQ3.add(Q3P5Radio);
		groupQ3.add(Q3P4Radio);
		groupQ3.add(Q3P3Radio);
		groupQ3.add(Q3P2Radio);
		groupQ3.add(Q3P1Radio);
		
		
		JRadioButton Q4P5Radio = new JRadioButton("");
		Q4P5Radio.setBounds(197, 335, 21, 23);
		InputPage.add(Q4P5Radio);
		Q4P5Radio.setActionCommand("0");
		
		JRadioButton Q4P4Radio = new JRadioButton("");
		Q4P4Radio.setBounds(320, 335, 21, 23);
		InputPage.add(Q4P4Radio);
		Q4P4Radio.setActionCommand("1");
		
		JRadioButton Q4P3Radio = new JRadioButton("");
		Q4P3Radio.setBounds(421, 335, 21, 23);
		InputPage.add(Q4P3Radio);
		Q4P3Radio.setActionCommand("2");
		
		JRadioButton Q4P2Radio = new JRadioButton("");
		Q4P2Radio.setBounds(547, 335, 21, 23);
		InputPage.add(Q4P2Radio);
		Q4P2Radio.setActionCommand("3");
		
		JRadioButton Q4P1Radio = new JRadioButton("");
		Q4P1Radio.setBounds(707, 335, 21, 23);
		InputPage.add(Q4P1Radio);
		Q4P1Radio.setActionCommand("4");
		
		ButtonGroup groupQ4 = new ButtonGroup();
		groupQ4.add(Q4P5Radio);
		groupQ4.add(Q4P4Radio);
		groupQ4.add(Q4P3Radio);
		groupQ4.add(Q4P2Radio);
		groupQ4.add(Q4P1Radio);
		
		
		JRadioButton Q5P5Radio = new JRadioButton("");
		Q5P5Radio.setBounds(197, 377, 21, 23);
		InputPage.add(Q5P5Radio);
		Q5P5Radio.setActionCommand("0");
		
		JRadioButton Q5P4Radio = new JRadioButton("");
		Q5P4Radio.setBounds(320, 377, 21, 23);
		InputPage.add(Q5P4Radio);
		Q5P4Radio.setActionCommand("1");
		
		JRadioButton Q5P3Radio = new JRadioButton("");
		Q5P3Radio.setBounds(421, 377, 21, 23);
		InputPage.add(Q5P3Radio);
		Q5P3Radio.setActionCommand("2");
		
		JRadioButton Q5P2Radio = new JRadioButton("");
		Q5P2Radio.setBounds(547, 377, 21, 23);
		InputPage.add(Q5P2Radio);
		Q5P2Radio.setActionCommand("3");
		
		JRadioButton Q5P1Radio = new JRadioButton("");
		Q5P1Radio.setBounds(707, 377, 21, 23);
		InputPage.add(Q5P1Radio);
		Q5P1Radio.setActionCommand("4");
		
		ButtonGroup groupQ5 = new ButtonGroup();
		groupQ5.add(Q5P5Radio);
		groupQ5.add(Q5P4Radio);
		groupQ5.add(Q5P3Radio);
		groupQ5.add(Q5P2Radio);
		groupQ5.add(Q5P1Radio);
		
		
		JRadioButton Q6P5Radio = new JRadioButton("");
		Q6P5Radio.setBounds(197, 419, 21, 23);
		InputPage.add(Q6P5Radio);
		Q6P5Radio.setActionCommand("0");
		
		JRadioButton Q6P4Radio = new JRadioButton("");
		Q6P4Radio.setBounds(320, 419, 21, 23);
		InputPage.add(Q6P4Radio);
		Q6P4Radio.setActionCommand("1");
		
		JRadioButton Q6P3Radio = new JRadioButton("");
		Q6P3Radio.setBounds(421, 419, 21, 23);
		InputPage.add(Q6P3Radio);
		Q6P3Radio.setActionCommand("2");
		
		JRadioButton Q6P2Radio = new JRadioButton("");
		Q6P2Radio.setBounds(547, 419, 21, 23);
		InputPage.add(Q6P2Radio);
		Q6P2Radio.setActionCommand("3");
		
		JRadioButton Q6P1Radio = new JRadioButton("");
		Q6P1Radio.setBounds(707, 419, 21, 23);
		InputPage.add(Q6P1Radio);
		Q6P1Radio.setActionCommand("4");
		
		ButtonGroup groupQ6 = new ButtonGroup();
		groupQ6.add(Q6P5Radio);
		groupQ6.add(Q6P4Radio);
		groupQ6.add(Q6P3Radio);
		groupQ6.add(Q6P2Radio);
		groupQ6.add(Q6P1Radio);
		
		
		JRadioButton Q7P5Radio = new JRadioButton("");
		Q7P5Radio.setBounds(197, 461, 21, 23);
		InputPage.add(Q7P5Radio);
		Q7P5Radio.setActionCommand("0");
		
		JRadioButton Q7P4Radio = new JRadioButton("");
		Q7P4Radio.setBounds(320, 461, 21, 23);
		InputPage.add(Q7P4Radio);
		Q7P4Radio.setActionCommand("1");
		
		JRadioButton Q7P3Radio = new JRadioButton("");
		Q7P3Radio.setBounds(421, 461, 21, 23);
		InputPage.add(Q7P3Radio);
		Q7P3Radio.setActionCommand("2");
		
		JRadioButton Q7P2Radio = new JRadioButton("");
		Q7P2Radio.setBounds(547, 461, 21, 23);
		InputPage.add(Q7P2Radio);
		Q7P2Radio.setActionCommand("3");
		
		JRadioButton Q7P1Radio = new JRadioButton("");
		Q7P1Radio.setBounds(707, 461, 21, 23);
		InputPage.add(Q7P1Radio);
		Q7P1Radio.setActionCommand("4");
		
		ButtonGroup groupQ7 = new ButtonGroup();
		groupQ7.add(Q7P5Radio);
		groupQ7.add(Q7P4Radio);
		groupQ7.add(Q7P3Radio);
		groupQ7.add(Q7P2Radio);
		groupQ7.add(Q7P1Radio);
				
		// Input Page Buttons
		JButton RestartButton = new JButton("처음으로");
		RestartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				Count.setText(String.valueOf(count+1));
				answerChart = new int[7][5];
				groupQ1.clearSelection();
				groupQ2.clearSelection();
				groupQ3.clearSelection();
				groupQ4.clearSelection();
				groupQ5.clearSelection();
				groupQ6.clearSelection();
				groupQ7.clearSelection();
				StartPage.setVisible(true);
				InputPage.setVisible(false);
			}
		});
		RestartButton.setFont(new Font("D2Coding", Font.PLAIN, 20));
		RestartButton.setBounds(35, 31, 131, 48);
		InputPage.add(RestartButton);
		
		// InputPage
		JButton NextButton = new JButton("입력");
		NextButton.setFont(new Font("D2Coding", Font.PLAIN, 20));
		NextButton.setBounds(454, 515, 131, 48);
		InputPage.add(NextButton);
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (groupQ1.getSelection()==null ||
					groupQ2.getSelection()==null ||
					groupQ3.getSelection()==null ||
					groupQ4.getSelection()==null ||
					groupQ5.getSelection()==null ||
					groupQ6.getSelection()==null ||
					groupQ7.getSelection()==null) {
					JOptionPane.showMessageDialog(null, "입력되지 않은 항목이 있습니다.");
				}
				else {
					count++;
					Count.setText(String.valueOf(count+1));
					answerChart[0][Integer.parseInt(groupQ1.getSelection().getActionCommand())]++;
					answerChart[1][Integer.parseInt(groupQ2.getSelection().getActionCommand())]++;
					answerChart[2][Integer.parseInt(groupQ3.getSelection().getActionCommand())]++;
					answerChart[3][Integer.parseInt(groupQ4.getSelection().getActionCommand())]++;
					answerChart[4][Integer.parseInt(groupQ5.getSelection().getActionCommand())]++;
					answerChart[5][Integer.parseInt(groupQ6.getSelection().getActionCommand())]++;
					answerChart[6][Integer.parseInt(groupQ7.getSelection().getActionCommand())]++;
					
					groupQ1.clearSelection();
					groupQ2.clearSelection();
					groupQ3.clearSelection();
					groupQ4.clearSelection();
					groupQ5.clearSelection();
					groupQ6.clearSelection();
					groupQ7.clearSelection();
				}
			}
		});
		
		
		
		JLabel targetLabel = new JLabel("대상 : ");
		targetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		targetLabel.setFont(new Font("D2Coding", Font.PLAIN, 20));
		targetLabel.setBounds(78, 107, 88, 31);
		InputPage.add(targetLabel);
		
		JLabel programLabel = new JLabel("프로그램 명 : ");
		programLabel.setHorizontalAlignment(SwingConstants.CENTER);
		programLabel.setFont(new Font("D2Coding", Font.PLAIN, 20));
		programLabel.setBounds(301, 107, 141, 31);
		InputPage.add(programLabel);
		
		JLabel targetPrint = new JLabel(" ");
		targetPrint.setHorizontalAlignment(SwingConstants.LEFT);
		targetPrint.setFont(new Font("D2Coding", Font.PLAIN, 20));
		targetPrint.setBounds(157, 106, 117, 31);
		InputPage.add(targetPrint);
		
		JLabel programPrint = new JLabel(" ");
		programPrint.setHorizontalAlignment(SwingConstants.LEFT);
		programPrint.setFont(new Font("D2Coding", Font.PLAIN, 20));
		programPrint.setBounds(441, 105, 117, 31);
		InputPage.add(programPrint);
		
		JButton radioInit = new JButton("초기화");
		radioInit.setFont(new Font("D2Coding", Font.PLAIN, 20));
		radioInit.setBounds(270, 515, 131, 48);
		InputPage.add(radioInit);
		radioInit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				groupQ1.clearSelection();
				groupQ2.clearSelection();
				groupQ3.clearSelection();
				groupQ4.clearSelection();
				groupQ5.clearSelection();
				groupQ6.clearSelection();
				groupQ7.clearSelection();
			}
		});
		
		// Start Page Button
				JButton startButton = new JButton("시작");
				startButton.setFont(new Font("D2Coding", Font.PLAIN, 20));
				startButton.setBounds(358, 456, 100, 58);
				StartPage.add(startButton);
				
				startButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						target = txtTarget.getText();
						program = txtProgram.getText();

						if (target.isEmpty() || program.isEmpty()) {
							JOptionPane.showMessageDialog(null, "값을 입력해주세요.");
						}
						else {
							targetPrint.setText(target);
							programPrint.setText(program);
							StartPage.setVisible(false);
							InputPage.setVisible(true);
						}
					}
				});
				

		
		JPanel ResultPage = new JPanel();
		frame.getContentPane().add(ResultPage);
		ResultPage.setBounds(0, 0, 824, 591);
		ResultPage.setVisible(false);
		ResultPage.setLayout(null);
		
		
		
		JLabel resultLabel = new JLabel("설문조사 결과");
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultLabel.setBounds(327, 26, 147, 47);
		ResultPage.add(resultLabel);
		
		JLabel resulttargetLabel = new JLabel("대상 : ");
		resulttargetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resulttargetLabel.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resulttargetLabel.setBounds(53, 90, 88, 31);
		ResultPage.add(resulttargetLabel);
		
		JLabel resultProgramLabel = new JLabel("프로그램 명 : ");
		resultProgramLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultProgramLabel.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultProgramLabel.setBounds(276, 90, 141, 31);
		ResultPage.add(resultProgramLabel);
		
		JLabel resultTargetPrint = new JLabel(" ");
		resultTargetPrint.setHorizontalAlignment(SwingConstants.LEFT);
		resultTargetPrint.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultTargetPrint.setBounds(132, 89, 117, 31);
		ResultPage.add(resultTargetPrint);
		
		JLabel resultProgramPrint = new JLabel(" ");
		resultProgramPrint.setHorizontalAlignment(SwingConstants.LEFT);
		resultProgramPrint.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultProgramPrint.setBounds(416, 88, 117, 31);
		ResultPage.add(resultProgramPrint);
		
		
		
		JLabel resultQ1Label = new JLabel("1번 문항");
		resultQ1Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ1Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ1Label.setBounds(21, 219, 99, 31);
		ResultPage.add(resultQ1Label);
		
		JLabel resultQ2Label = new JLabel("2번 문항");
		resultQ2Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ2Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ2Label.setBounds(21, 261, 99, 31);
		ResultPage.add(resultQ2Label);
		
		JLabel resultQ3Label = new JLabel("3번 문항");
		resultQ3Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ3Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ3Label.setBounds(21, 303, 99, 31);
		ResultPage.add(resultQ3Label);
		
		JLabel resultQ4Label = new JLabel("4번 문항");
		resultQ4Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ4Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ4Label.setBounds(21, 345, 99, 31);
		ResultPage.add(resultQ4Label);
		
		JLabel resultQ5Label = new JLabel("5번 문항");
		resultQ5Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ5Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ5Label.setBounds(21, 387, 99, 31);
		ResultPage.add(resultQ5Label);
		
		JLabel resultQ6Label = new JLabel("6번 문항");
		resultQ6Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ6Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ6Label.setBounds(21, 429, 99, 31);
		ResultPage.add(resultQ6Label);
		
		JLabel resultQ7Label = new JLabel("7번 문항");
		resultQ7Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ7Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ7Label.setBounds(21, 471, 99, 31);
		ResultPage.add(resultQ7Label);
		
		JLabel resultP5_1Label = new JLabel("매우");
		resultP5_1Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultP5_1Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultP5_1Label.setBounds(136, 150, 75, 31);
		ResultPage.add(resultP5_1Label);
		
		JLabel resultP4Label = new JLabel("그렇다");
		resultP4Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultP4Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultP4Label.setBounds(227, 174, 61, 31);
		ResultPage.add(resultP4Label);
		
		JLabel resultP3Label = new JLabel("보통이다");
		resultP3Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultP3Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultP3Label.setBounds(308, 174, 92, 31);
		ResultPage.add(resultP3Label);
		
		JLabel resultPercentage_1 = new JLabel("매우 그렇다");
		resultPercentage_1.setHorizontalAlignment(SwingConstants.CENTER);
		resultPercentage_1.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultPercentage_1.setBounds(628, 148, 160, 31);
		ResultPage.add(resultPercentage_1);
		
		JLabel resultP5_2 = new JLabel("그렇다");
		resultP5_2.setHorizontalAlignment(SwingConstants.CENTER);
		resultP5_2.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultP5_2.setBounds(136, 174, 75, 31);
		ResultPage.add(resultP5_2);
		
		JLabel resultP2_1Label = new JLabel("그렇지");
		resultP2_1Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultP2_1Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultP2_1Label.setBounds(407, 150, 75, 31);
		ResultPage.add(resultP2_1Label);
		
		JLabel resultP2_2Label = new JLabel("않다");
		resultP2_2Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultP2_2Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultP2_2Label.setBounds(407, 174, 75, 31);
		ResultPage.add(resultP2_2Label);
		
		JLabel resultP1_1Label = new JLabel("매우 그렇지");
		resultP1_1Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultP1_1Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultP1_1Label.setBounds(497, 149, 110, 31);
		ResultPage.add(resultP1_1Label);
		
		JLabel resultP1_2Label = new JLabel("않다");
		resultP1_2Label.setHorizontalAlignment(SwingConstants.CENTER);
		resultP1_2Label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultP1_2Label.setBounds(515, 174, 75, 31);
		ResultPage.add(resultP1_2Label);
		
		JLabel resultPercentage_2 = new JLabel("+ 그렇다 (%)");
		resultPercentage_2.setHorizontalAlignment(SwingConstants.CENTER);
		resultPercentage_2.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultPercentage_2.setBounds(628, 173, 160, 31);
		ResultPage.add(resultPercentage_2);
		
		JLabel resultQ1P5 = new JLabel("000");
		resultQ1P5.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ1P5.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ1P5.setBounds(146, 219, 53, 31);
		ResultPage.add(resultQ1P5);
		
		JLabel resultQ1P4 = new JLabel("000");
		resultQ1P4.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ1P4.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ1P4.setBounds(231, 218, 53, 31);
		ResultPage.add(resultQ1P4);
		
		JLabel resultQ1P3 = new JLabel("000");
		resultQ1P3.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ1P3.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ1P3.setBounds(327, 219, 53, 31);
		ResultPage.add(resultQ1P3);
		
		JLabel resultQ1P2 = new JLabel("000");
		resultQ1P2.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ1P2.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ1P2.setBounds(417, 219, 53, 31);
		ResultPage.add(resultQ1P2);
		
		JLabel resultQ1P1 = new JLabel("000");
		resultQ1P1.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ1P1.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ1P1.setBounds(520, 218, 53, 31);
		ResultPage.add(resultQ1P1);
		
		JLabel resultQ1Percentage = new JLabel("000");
		resultQ1Percentage.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ1Percentage.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ1Percentage.setBounds(679, 219, 53, 31);
		ResultPage.add(resultQ1Percentage);
		
		JLabel resultQ2P5 = new JLabel("000");
		resultQ2P5.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ2P5.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ2P5.setBounds(146, 261, 53, 31);
		ResultPage.add(resultQ2P5);
		
		JLabel resultQ2P4 = new JLabel("000");
		resultQ2P4.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ2P4.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ2P4.setBounds(231, 260, 53, 31);
		ResultPage.add(resultQ2P4);
		
		JLabel resultQ2P3 = new JLabel("000");
		resultQ2P3.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ2P3.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ2P3.setBounds(327, 261, 53, 31);
		ResultPage.add(resultQ2P3);
		
		JLabel resultQ2P2 = new JLabel("000");
		resultQ2P2.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ2P2.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ2P2.setBounds(417, 261, 53, 31);
		ResultPage.add(resultQ2P2);
		
		JLabel resultQ2P1 = new JLabel("000");
		resultQ2P1.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ2P1.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ2P1.setBounds(520, 260, 53, 31);
		ResultPage.add(resultQ2P1);
		
		JLabel resultQ2Percentage = new JLabel("000");
		resultQ2Percentage.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ2Percentage.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ2Percentage.setBounds(679, 261, 53, 31);
		ResultPage.add(resultQ2Percentage);
		
		JLabel resultQ3P5 = new JLabel("000");
		resultQ3P5.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ3P5.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ3P5.setBounds(146, 303, 53, 31);
		ResultPage.add(resultQ3P5);
		
		JLabel resultQ3P4 = new JLabel("000");
		resultQ3P4.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ3P4.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ3P4.setBounds(231, 302, 53, 31);
		ResultPage.add(resultQ3P4);
		
		JLabel resultQ3P3 = new JLabel("000");
		resultQ3P3.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ3P3.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ3P3.setBounds(327, 303, 53, 31);
		ResultPage.add(resultQ3P3);
		
		JLabel resultQ3P2 = new JLabel("000");
		resultQ3P2.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ3P2.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ3P2.setBounds(417, 303, 53, 31);
		ResultPage.add(resultQ3P2);
		
		JLabel resultQ3P1 = new JLabel("000");
		resultQ3P1.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ3P1.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ3P1.setBounds(520, 302, 53, 31);
		ResultPage.add(resultQ3P1);
		
		JLabel resultQ3Percentage = new JLabel("000");
		resultQ3Percentage.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ3Percentage.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ3Percentage.setBounds(679, 303, 53, 31);
		ResultPage.add(resultQ3Percentage);
		
		JLabel resultQ4P5 = new JLabel("000");
		resultQ4P5.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ4P5.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ4P5.setBounds(146, 345, 53, 31);
		ResultPage.add(resultQ4P5);
		
		JLabel resultQ4P4 = new JLabel("000");
		resultQ4P4.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ4P4.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ4P4.setBounds(231, 344, 53, 31);
		ResultPage.add(resultQ4P4);
		
		JLabel resultQ4P3 = new JLabel("000");
		resultQ4P3.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ4P3.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ4P3.setBounds(327, 345, 53, 31);
		ResultPage.add(resultQ4P3);
		
		JLabel resultQ4P2 = new JLabel("000");
		resultQ4P2.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ4P2.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ4P2.setBounds(417, 345, 53, 31);
		ResultPage.add(resultQ4P2);
		
		JLabel resultQ4P1 = new JLabel("000");
		resultQ4P1.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ4P1.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ4P1.setBounds(520, 344, 53, 31);
		ResultPage.add(resultQ4P1);
		
		JLabel resultQ4Percentage = new JLabel("000");
		resultQ4Percentage.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ4Percentage.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ4Percentage.setBounds(679, 345, 53, 31);
		ResultPage.add(resultQ4Percentage);
		
		JLabel resultQ5P5 = new JLabel("000");
		resultQ5P5.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ5P5.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ5P5.setBounds(146, 387, 53, 31);
		ResultPage.add(resultQ5P5);
		
		JLabel resultQ5P4 = new JLabel("000");
		resultQ5P4.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ5P4.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ5P4.setBounds(231, 386, 53, 31);
		ResultPage.add(resultQ5P4);
		
		JLabel resultQ5P3 = new JLabel("000");
		resultQ5P3.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ5P3.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ5P3.setBounds(327, 387, 53, 31);
		ResultPage.add(resultQ5P3);
		
		JLabel resultQ5P2 = new JLabel("000");
		resultQ5P2.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ5P2.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ5P2.setBounds(417, 387, 53, 31);
		ResultPage.add(resultQ5P2);
		
		JLabel resultQ5P1 = new JLabel("000");
		resultQ5P1.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ5P1.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ5P1.setBounds(520, 386, 53, 31);
		ResultPage.add(resultQ5P1);
		
		JLabel resultQ5Percentage = new JLabel("000");
		resultQ5Percentage.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ5Percentage.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ5Percentage.setBounds(679, 387, 53, 31);
		ResultPage.add(resultQ5Percentage);
		
		JLabel resultQ6P5 = new JLabel("000");
		resultQ6P5.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ6P5.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ6P5.setBounds(146, 429, 53, 31);
		ResultPage.add(resultQ6P5);
		
		JLabel resultQ6P4 = new JLabel("000");
		resultQ6P4.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ6P4.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ6P4.setBounds(231, 428, 53, 31);
		ResultPage.add(resultQ6P4);
		
		JLabel resultQ6P3 = new JLabel("000");
		resultQ6P3.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ6P3.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ6P3.setBounds(327, 429, 53, 31);
		ResultPage.add(resultQ6P3);
		
		JLabel resultQ6P2 = new JLabel("000");
		resultQ6P2.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ6P2.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ6P2.setBounds(417, 429, 53, 31);
		ResultPage.add(resultQ6P2);
		
		JLabel resultQ6P1 = new JLabel("000");
		resultQ6P1.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ6P1.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ6P1.setBounds(520, 428, 53, 31);
		ResultPage.add(resultQ6P1);
		
		JLabel resultQ6Percentage = new JLabel("000");
		resultQ6Percentage.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ6Percentage.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ6Percentage.setBounds(679, 429, 53, 31);
		ResultPage.add(resultQ6Percentage);
		
		JLabel resultQ7P5 = new JLabel("000");
		resultQ7P5.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ7P5.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ7P5.setBounds(146, 471, 53, 31);
		ResultPage.add(resultQ7P5);
		
		JLabel resultQ7P4 = new JLabel("000");
		resultQ7P4.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ7P4.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ7P4.setBounds(231, 470, 53, 31);
		ResultPage.add(resultQ7P4);
		
		JLabel resultQ7P3 = new JLabel("000");
		resultQ7P3.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ7P3.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ7P3.setBounds(327, 471, 53, 31);
		ResultPage.add(resultQ7P3);
		
		JLabel resultQ7P2 = new JLabel("000");
		resultQ7P2.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ7P2.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ7P2.setBounds(417, 471, 53, 31);
		ResultPage.add(resultQ7P2);
		
		JLabel resultQ7P1 = new JLabel("000");
		resultQ7P1.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ7P1.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ7P1.setBounds(520, 470, 53, 31);
		ResultPage.add(resultQ7P1);
		
		JLabel resultQ7Percentage = new JLabel("000");
		resultQ7Percentage.setHorizontalAlignment(SwingConstants.CENTER);
		resultQ7Percentage.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultQ7Percentage.setBounds(679, 471, 53, 31);
		ResultPage.add(resultQ7Percentage);
		
		JButton restartButton = new JButton("처음으로");
		restartButton.setFont(new Font("D2Coding", Font.PLAIN, 20));
		restartButton.setBounds(350, 526, 183, 42);
		ResultPage.add(restartButton);
		
		JLabel resultCountLabel = new JLabel("인원 수 : ");
		resultCountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultCountLabel.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultCountLabel.setBounds(543, 89, 110, 31);
		ResultPage.add(resultCountLabel);
		
		JLabel resultCountPrint = new JLabel("000");
		resultCountPrint.setHorizontalAlignment(SwingConstants.LEFT);
		resultCountPrint.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultCountPrint.setBounds(647, 90, 61, 31);
		ResultPage.add(resultCountPrint);
		
		JLabel resultPercentageAverage = new JLabel("000");
		resultPercentageAverage.setHorizontalAlignment(SwingConstants.CENTER);
		resultPercentageAverage.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultPercentageAverage.setBounds(679, 526, 53, 31);
		ResultPage.add(resultPercentageAverage);
		
		JLabel resultAverageLabel = new JLabel("평균 : ");
		resultAverageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultAverageLabel.setFont(new Font("D2Coding", Font.PLAIN, 20));
		resultAverageLabel.setBounds(607, 526, 88, 31);
		ResultPage.add(resultAverageLabel);
		
				restartButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						answerChart = new int[7][5];
						count = 0;
						Count.setText(String.valueOf(count+1));
						
						groupQ1.clearSelection();
						groupQ2.clearSelection();
						groupQ3.clearSelection();
						groupQ4.clearSelection();
						groupQ5.clearSelection();
						groupQ6.clearSelection();
						groupQ7.clearSelection();
						
						ResultPage.setVisible(false);
						InputPage.setVisible(false);
						StartPage.setVisible(true);
					}
				});
				
				JButton ExitButton = new JButton("완료");
				ExitButton.setBackground(new Color(0, 191, 255));
				ExitButton.setFont(new Font("D2Coding", Font.PLAIN, 20));
				ExitButton.setBounds(695, 31, 74, 49);
				ExitButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (count <= 0) {
							JOptionPane.showMessageDialog(null, "한 명 이상의 결과를 입력해주세요.");
						}
						else if (groupQ1.getSelection()==null &&
								 groupQ2.getSelection()==null &&
								 groupQ3.getSelection()==null &&
								 groupQ4.getSelection()==null &&
								 groupQ5.getSelection()==null &&
								 groupQ6.getSelection()==null &&
								 groupQ7.getSelection()==null) {
							StartPage.setVisible(false);
							InputPage.setVisible(false);
							ResultPage.setVisible(true);
							
							resultTargetPrint.setText(target);
							resultProgramPrint.setText(program);
							resultCountPrint.setText(Integer.toString(count));
							
							resultQ1P5.setText(Integer.toString(answerChart[0][0]));
							resultQ1P4.setText(Integer.toString(answerChart[0][1]));
							resultQ1P3.setText(Integer.toString(answerChart[0][2]));
							resultQ1P2.setText(Integer.toString(answerChart[0][3]));
							resultQ1P1.setText(Integer.toString(answerChart[0][4]));
							resultQ2P5.setText(Integer.toString(answerChart[1][0]));
							resultQ2P4.setText(Integer.toString(answerChart[1][1]));
							resultQ2P3.setText(Integer.toString(answerChart[1][2]));
							resultQ2P2.setText(Integer.toString(answerChart[1][3]));
							resultQ2P1.setText(Integer.toString(answerChart[1][4]));
							resultQ3P5.setText(Integer.toString(answerChart[2][0]));
							resultQ3P4.setText(Integer.toString(answerChart[2][1]));
							resultQ3P3.setText(Integer.toString(answerChart[2][2]));
							resultQ3P2.setText(Integer.toString(answerChart[2][3]));
							resultQ3P1.setText(Integer.toString(answerChart[2][4]));
							resultQ4P5.setText(Integer.toString(answerChart[3][0]));
							resultQ4P4.setText(Integer.toString(answerChart[3][1]));
							resultQ4P3.setText(Integer.toString(answerChart[3][2]));
							resultQ4P2.setText(Integer.toString(answerChart[3][3]));
							resultQ4P1.setText(Integer.toString(answerChart[3][4]));
							resultQ5P5.setText(Integer.toString(answerChart[4][0]));
							resultQ5P4.setText(Integer.toString(answerChart[4][1]));
							resultQ5P3.setText(Integer.toString(answerChart[4][2]));
							resultQ5P2.setText(Integer.toString(answerChart[4][3]));
							resultQ5P1.setText(Integer.toString(answerChart[4][4]));
							resultQ6P5.setText(Integer.toString(answerChart[5][0]));
							resultQ6P4.setText(Integer.toString(answerChart[5][1]));
							resultQ6P3.setText(Integer.toString(answerChart[5][2]));
							resultQ6P2.setText(Integer.toString(answerChart[5][3]));
							resultQ6P1.setText(Integer.toString(answerChart[5][4]));
							resultQ7P5.setText(Integer.toString(answerChart[6][0]));
							resultQ7P4.setText(Integer.toString(answerChart[6][1]));
							resultQ7P3.setText(Integer.toString(answerChart[6][2]));
							resultQ7P2.setText(Integer.toString(answerChart[6][3]));
							resultQ7P1.setText(Integer.toString(answerChart[6][4]));
							
							Double Q1Float = ((answerChart[0][0]+answerChart[0][1])*1.0/count)*100;
							Double Q2Float = ((answerChart[1][0]+answerChart[1][1])*1.0/count)*100;
							Double Q3Float = ((answerChart[2][0]+answerChart[2][1])*1.0/count)*100;
							Double Q4Float = ((answerChart[3][0]+answerChart[3][1])*1.0/count)*100;
							Double Q5Float = ((answerChart[4][0]+answerChart[4][1])*1.0/count)*100;
							Double Q6Float = ((answerChart[5][0]+answerChart[5][1])*1.0/count)*100;
							Double Q7Float = ((answerChart[6][0]+answerChart[6][1])*1.0/count)*100;
							
							String Q1 = String.format("%.1f", Q1Float);
							String Q2 = String.format("%.1f", Q2Float);
							String Q3 = String.format("%.1f", Q3Float);
							String Q4 = String.format("%.1f", Q4Float);
							String Q5 = String.format("%.1f", Q5Float);
							String Q6 = String.format("%.1f", Q6Float);
							String Q7 = String.format("%.1f", Q7Float);
							
							
							resultQ1Percentage.setText(Q1);
							resultQ2Percentage.setText(Q2); 
							resultQ3Percentage.setText(Q3); 
							resultQ4Percentage.setText(Q4);
							resultQ5Percentage.setText(Q5);
							resultQ6Percentage.setText(Q6);
							resultQ7Percentage.setText(Q7);
							resultPercentageAverage.setText(String.format("%.1f", (Q1Float+Q2Float+Q3Float+Q4Float+Q5Float+Q6Float+Q7Float)/7));
						}
						else {
							JOptionPane.showMessageDialog(null, "입력되지 않은 항목이 있습니다.");
						}
					}
				});
				InputPage.add(ExitButton);
	}
}
