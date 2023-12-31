package day48;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuTest extends JFrame{
	MenuTest(){
		setTitle("Menu 만들기");
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	public void createMenu() {
		//메뉴바 생성
		JMenuBar mb=new JMenuBar();
		//메뉴 생성
		JMenu screenMenu = new JMenu("메뉴바1");
		//메뉴에 부착할 아이템 생성
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();//구분선
		screenMenu.add(new JMenuItem("Exit"));
		
		//메뉴바에 메뉴 부착
		mb.add(screenMenu);
		mb.add(new JMenu("편집"));
		mb.add(new JMenu("실행"));
		mb.add(new JMenu("도움말"));
		
		//메뉴바를 현재 프레임의 메뉴로 지정
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MenuTest();
	}

}
