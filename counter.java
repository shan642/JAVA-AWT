//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Button;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class counter {
    counter() {
        Frame frame = new Frame("counter");
        final TextArea num = new TextArea("0");
        num.setBounds(50, 70, 100, 200);
        Button b1 = new Button("INCREMENT");
        b1.addActionListener(new ActionListener(this) {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(num.getText());
                ++n;
                num.setText(String.valueOf(n));
            }
        });
        b1.setBounds(250, 170, 100, 100);
        Button b2 = new Button("RESET");
        b2.addActionListener(new ActionListener(this) {
            public void actionPerformed(ActionEvent e) {
                num.setText("0");
            }
        });
        b2.setBounds(350, 370, 100, 100);
        frame.add(num);
        frame.add(b1);
        frame.add(b2);
        frame.setLayout((LayoutManager)null);
        frame.setVisible(true);
        frame.setSize(500, 500);
    }

    public static void main(String[] args) {
        new counter();
    }
}
