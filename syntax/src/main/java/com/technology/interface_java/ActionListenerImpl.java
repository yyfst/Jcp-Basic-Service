package com.technology.interface_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

//该接口为动作监听器，用于定义定时器，传给Timer类
public class ActionListenerImpl implements ActionListener {
    public static int count = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        System.out.println(Instant.ofEpochMilli(e.getWhen()) + "\tcount=\t" + count);
    }
}
