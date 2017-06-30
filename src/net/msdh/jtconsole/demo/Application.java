package net.msdh.jtconsole.demo;

import net.msdh.jtconsole.JTConsole;

import javax.swing.*;
import java.awt.*;

public class Application {

    public static void main(String[] args) {
    	JTConsole jc=new JTConsole(40,20);
    	jc.setCursorVisible(true);

        jc.writeln("port:60000\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:up\n" +
                "priority:0\n" +
                "name:core\n" +
                "bin:\n" +
                "run:/var/run/dh/core.pid\n" +
                "log:/var/log/dh/core.log\n" +
                "==============\n" +
                "port:60001\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:up\n" +
                "priority:0\n" +
                "name:console\n" +
                "bin:\n" +
                "run:/var/run/dh/console.pid\n" +
                "log:/var/log/dh/core.log\n" +
                "==============\n" +
                "port:60002\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:down\n" +
                "priority:2\n" +
                "name:dev\n" +
                "bin:\n" +
                "run:/var/run/dh/dev.pid\n" +
                "log:/var/log/dh/dev.log\n" +
                "==============\n" +
                "port:60003\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:down\n" +
                "priority:2\n" +
                "name:slot\n" +
                "bin:\n" +
                "run:/var/run/dh/slot.pid\n" +
                "log:/var/log/dh/slot.log\n" +
                "==============\n" +
                "port:60004\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:down\n" +
                "priority:3\n" +
                "name:mail\n" +
                "bin:\n" +
                "run:/var/run/dh/mail.pid\n" +
                "log:/var/log/dh/mail.log\n" +
                "==============\n" +
                "port:60005\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:down\n" +
                "priority:3\n" +
                "name:power\n" +
                "bin:\n" +
                "run:/var/run/dh/power.pid\n" +
                "log:/var/log/dh/power.log\n" +
                "==============\n" +
                "port:60006\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:down\n" +
                "priority:3\n" +
                "name:sms\n" +
                "bin:\n" +
                "run:/var/run/dh/sms.pid\n" +
                "log:/var/log/dh/sms.log\n" +
                "==============\n" +
                "port:60007\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:down\n" +
                "priority:3\n" +
                "name:kodi\n" +
                "bin:\n" +
                "run:/var/run/dh/kodi.pid\n" +
                "log:/var/log/dh/kodi.log\n" +
                "==============\n" +
                "port:60007\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:down\n" +
                "priority:3\n" +
                "name:module\n" +
                "bin:\n" +
                "run:/var/run/dh/module.pid\n" +
                "log:/var/log/dh/module.log\n" +
                "==============\n" +
                "port:60011\n" +
                "adress:127.0.0.1\n" +
                "corePort:60000\n" +
                "status:down\n" +
                "priority:3\n" +
                "name:timer\n" +
                "bin:\n" +
                "run:/var/run/dh/timer.pid\n" +
                "log:/var/log/dh/timer.log\n" +
                "==============");
//        jc.writeln("111111");
//        jc.writeln("222222");
//        jc.writeln("333333");
//        jc.writeln("444444");
//        jc.writeln("555555");
//        jc.writeln("666666");
//        jc.writeln("777777");
//        jc.writeln("888888");
//        jc.writeln("999999");
//        jc.writeln("101010");
//        jc.writeln("111111");
//        jc.writeln("121212");
//        jc.writeln("131313");
//        jc.writeln("141414");
//        jc.writeln("151515");
//        jc.writeln("01234567890123456789012345678901234567890123456789109229", Color.RED, Color.BLACK);
//        jc.writeln("161616");
//        jc.writeln("171717");
//        jc.writeln("181818");
//        jc.writeln("191919");
//        jc.writeln("202020");
//        jc.writeln("212121");
//        jc.writeln("test", Color.GREEN, Color.BLACK);
      //  jc.write("test2",Color.GREEN,Color.BLACK);
        jc.setReadOnly(false);
        jc.setFocus();

        System.out.print("Lines: "+jc.getLinesSize());



//        jc.write("0000000000");
//        jc.write("1111111111");
//        jc.write("2222222222");
//        jc.write("3333333333");
//        jc.write("4444444444");
//        jc.write("5555555555");
//        jc.write("6666666666");
//        jc.write("7777777777");
//        jc.write("8888888888");
//        jc.write("9999999999");

    	//System.out.println("Normal output");
    	//jc.captureStdOut();
    	//System.out.println("Captured output");

    	//jc.setCursorPos(0, 0);



        JFrame frame = new JFrame("Swing Text Console");
    	frame.setLayout(new BorderLayout());
		frame.add(jc, BorderLayout.CENTER);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);



    }

}
