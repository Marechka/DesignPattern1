package org.example;

import libs.CpuUtilizationSensor;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

class MyPanel extends JPanel {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(10,10,100,100);
    }
}
public class ActivityMonitorGUI extends JFrame {

//    class MyCanvas extends JComponent {
//        public void paint(Graphics g) {
//            g.setColor(Color.RED);
//            g.fill3DRect(20, 20, 200, 200,true);
//        }
//    }
    public ActivityMonitorGUI() {
        setTitle("Activity Monitor Tracker");
        setLayout(new GridLayout(3,1));
        MyPanel panel = new MyPanel();
        JPanel  memoryUsagePnl = new JPanel();
        memoryUsagePnl.setBorder(new TitledBorder("Memory Usage Alert"));
        memoryUsagePnl.setLayout(new FlowLayout(3));
        memoryUsagePnl.add(panel);
        JLabel label = new JLabel("Center");
        JLabel label1 = new JLabel("     ");
        label1.setOpaque(true);
        label1.setFont(new Font ("Serif", Font.BOLD, 20));
        label1.setBackground(Color.red);

        memoryUsagePnl.add(label);
        memoryUsagePnl.add(label1);


        // memoryUsagePnl.add(panel).setVisible(true);
        add(memoryUsagePnl);
       // add(panel);


        JPanel  cpuUtilizationAlert = new JPanel();
        cpuUtilizationAlert.setBorder(new TitledBorder("CPU Utilization Alert"));
        add(cpuUtilizationAlert);

        JPanel  deskUsageAlert = new JPanel();
        deskUsageAlert.setBorder(new TitledBorder("Desk Usage Alert"));
        add(deskUsageAlert);

        setPreferredSize(new Dimension(600,600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        ActivityMonitorGUI app = new ActivityMonitorGUI();
        //ActivityMonitor app = new ActivityMonitor();
        CpuUtilizationSensor bla = new CpuUtilizationSensor();
        System.out.println("My value " + bla.readValue());
        System.out.println("My alert " + bla.getReport());
    }

}