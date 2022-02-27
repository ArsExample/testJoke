package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MyWindowApp extends JFrame { //Наследуя от JFrame мы получаем всю функциональность окна
    Font f1 = new Font("TimesRoman", Font.BOLD, 22);

    public MyWindowApp() {
        super("My First Window"); //Заголовок окна
        setBounds(100, 100, 400, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // запрещаем пользователю закрывать окно
        setLayout(null); // так нада для расположения элементов
        JLabel question = new JLabel("Ты даун?"); // далее добавляем элементы
        question.setFont(f1);
        question.setBounds(120, 10, 380, 30);
        add(question);
        JButton yes = new JButton("да");
        yes.setFont(f1);
        yes.setBounds(40, 180, 80, 30);
        add(yes);
        JButton no = new JButton("нет");
        no.setFont(f1);
        no.setBounds(280, 180, 80, 30);
        add(no);
        JLabel answer = new JLabel("Я так и знал!");
        answer.setBounds(4000, 4000, 10, 10); // не знаю как скрыть элемент, так что просто прячем его
        answer.setFont(f1);
        add(answer);

        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // располагаем кнопку на рандомное местоположение, но так, чтобы не попасть на кнопку да
                no.setBounds((int) ((Math.random() * ((320 - 100) + 1)) + 100), (int) ((Math.random() * ((170 - 0) + 1)) + 0), 80, 30);
            }
        });
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setBounds(4000, 4000, 10, 10);
                yes.setBounds(4000, 4000, 10, 10);
                no.setBounds(4000, 4000, 10, 10);
                answer.setBounds(120, 10, 380, 30);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // наконец разрешаем закрыть окно
            }
        });
    }
}