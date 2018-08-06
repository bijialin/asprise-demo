package com.nickbi.teesseractdemo;

import com.asprise.ocr.Ocr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeesseractDemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void testImage() {
        Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_FASTEST);
        String filePath = "/Users/bijialin/Desktop/WechatIMG40.png";
        File file = new File(filePath);
        File files[] = new File[1];
        files[0] = file;
        String result = ocr.recognize(files, com.asprise.ocr.Ocr.RECOGNIZE_TYPE_ALL, com.asprise.ocr.Ocr.OUTPUT_FORMAT_PLAINTEXT, 0, null);
        ocr.stopEngine();
        System.out.println(result);
    }
}
