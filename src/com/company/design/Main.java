package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListner;
import com.company.design.proxy.IBrowser;
import com.company.design.strategy.*;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args){

//    AClazz aClazz = new AClazz();
//    Bclazz bclazz = new Bclazz();
//
//    SocketClient aClient = aClazz.getSocketClient();
//    SocketClient bClient = bclazz.getSocketClient();
//
//    System.out.println("두개의 객체가 동일한가");
//    System.out.println(aClient.equals(bClient));

//        HairDryer hairDryer = new HairDryer();
//        connect(hairDryer);
//
//        Cleaner cleaner = new Cleaner();
////      connect(cleaner);
//
//        Electronic110V adaptor = new SocketAdapter(cleaner);
//        connect(adaptor);
//
//        AirConditioner airConditioner = new AirConditioner();
//        Electronic110V airAdaptor = new SocketAdapter(airConditioner);
//        connect(airAdaptor);

//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

//        AtomicLong start = new AtomicLong();
//        AtomicLong end = new AtomicLong();
//
//
//        IBrowser aopBrowser = new AopBrowser("www.naver.com",
//                ()->{
//                    System.out.println("before");
//                    start.set(System.currentTimeMillis());
//
//                },
//                ()->{
//                    long now = System.currentTimeMillis();
//                    end.set(now-start.get());
//                }
//
//                );
//
//                aopBrowser.show();
//                System.out.println("loading time: "+end.get());
//
//                aopBrowser.show();
//                System.out.println("loading time: "+end.get());


//        ICar audi = new Audi(1000);
//        audi.showPrice();
//
//        // a3
//        ICar audi3 = new A3(audi, "A3");
//        audi3.showPrice();
//
//
//        // a4
//        ICar audi4 = new A4(audi, "A4");
//        audi4.showPrice();
//
//
//        // a5
//        ICar audi5 = new A5(audi, "A5");
//        audi5.showPrice();

//        Button button = new Button("버튼");
//        button.addListener(new IButtonListner() {
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//        button.click("메시지 전달 : click1");
//        button.click("메시지 전달 : click2");
//        button.click("메시지 전달 : click3");
//        button.click("메시지 전달 : click4");
//        button.click("메시지 전달 : click5");

//        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
//
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.fileWriter();
//
//        Reader reader = new Reader("text.temp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();
//
//        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.temp");
//        sftpClient.connect();
//        sftpClient.write();
//        sftpClient.read();
//        sftpClient.disConnect();

        Encoder encoder =  new Encoder();

        // base64

        EncodingStrategy base64 = new Base64Strategy();

        // normal

        EncodingStrategy normal = new NormalStrategy();

        String message = "hello Java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);






    }

    // 콘센트

    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();

    }


}
