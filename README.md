# asprise-demo
asprise ocr distinguish

### maven repository
` ``
        <dependency>
            <groupId>com.asprise.ocr</groupId>
            <artifactId>java-ocr-api</artifactId>
            <version>15.3.0.3</version>
        </dependency>
 ` ``
  
  #### test code
` ``   Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_FASTEST);
        String filePath = "/Users/bijialin/Desktop/WechatIMG40.png";
        File file = new File(filePath);
        File files[] = new File[1];
        files[0] = file;
        String result = ocr.recognize(files, com.asprise.ocr.Ocr.RECOGNIZE_TYPE_ALL, com.asprise.ocr.Ocr.OUTPUT_FORMAT_PLAINTEXT, 0, null);
        ocr.stopEngine();
        System.out.println(result);
` ``    
    
  
