package org.example.assigment.yuki.PetInformationFileSystem.View;
import javax.swing.*;
import java.awt.*;
public class MainView {
    public JFrame frame;
    public JMenuItem catMenuItem;
    public JMenuItem dogMenuItem;
    public JMenu homeMenu;

    public JPanel mainPanel;
    public MainView(){
        frame = new JFrame("Pet Information System");

        JMenuBar menuBar = new JMenuBar();
        homeMenu = new JMenu("Home");

        JMenu menu = new JMenu("Pet Management Menu");
        catMenuItem = new JMenuItem("Cats");
        dogMenuItem = new JMenuItem("Dogs");
        menu.add(catMenuItem);
        menu.add(dogMenuItem);
        menuBar.add(homeMenu);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setView(JPanel panel){
        mainPanel.removeAll();
        mainPanel.add(panel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    public void show(){
        frame.setVisible(true);
    }
}
