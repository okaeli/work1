// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sample;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.teaopenapi.models.Config;

public class Demo3 {

    public static void sendMsg(String phonenumber) throws Exception {
        Config config = new Config()
                // 必填，您的 AccessKey ID
                .setAccessKeyId("LTAI5tAW8KLjEQ9a9sw641jx")
                // 必填，您的 AccessKey Secret
                .setAccessKeySecret("6GChfu4ikGeGUhAxZHwZodrvZuW0F1");
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        Client client = new Client(config);
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setPhoneNumbers(phonenumber)
                .setSignName("成贺文个人博客")
                .setTemplateCode("SMS_276095212")
                .setTemplateParam("{\"code\":\"1234\"}");
        client.sendSms(sendSmsRequest);
    }

    public static void main(String[] args_) throws Exception {
        String[] number = {"13813671692","18251281354"};
        for (int i = 0; i <number.length ; i++) {
            System.out.println(number[i]);
            sendMsg(number[i]);
        }
        System.out.println("end");
    }
}
