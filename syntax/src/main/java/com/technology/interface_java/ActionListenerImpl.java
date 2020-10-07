package com.technology.interface_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

//该接口为动作监听器，用于定义定时器，传给Timer类
public class ActionListenerImpl implements ActionListener {
    private static final Logger log = LoggerFactory.getLogger(ActionListenerImpl.class);
    public static int count = 1;

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        log.info("count={}", count);
    }
}
