package com.mob.test;

import com.alibaba.fastjson.JSONObject;
import com.lamfire.code.AES;
import com.lamfire.code.Base64;
import com.lamfire.utils.ZipUtils;
import com.mob.demo.controller.DemoRestController;
import com.mob.util.crypt.MobCSStandardCrypter;
import com.mob.util.crypt.rsa.MobRSACrypter;
import com.mob.util.http.HttpUtils;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.tools.zip.ZipUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/8/3:12:33
 */
public class RequestClientTest {
    public static void main(String[] args) throws Exception {

        DemoRestController.User user = new DemoRestController.User(10, "xiaopangzi");

        String srcStr = JSONObject.toJSONString(user);

        String aesKey = "19779ABVCDECSa4a";

        String data=clientEncrypt(srcStr,aesKey);

        HttpUtils.PostEntity resp = new HttpUtils.PostEntity("http://localhost:8080/demo/mobjson", data).invoke(false);

        String resp1 = resp.getResp();

        System.out.println(resp);

        System.out.println("before crypt:"+resp1);

        AES aes = new AES(aesKey.getBytes());

        byte[] decode = Base64.decode(resp1);
        String  respStr= new String(aes.decode(decode));

        System.out.println("after crypte:"+respStr);



//        String str="abc周志鹏 ";
//        byte[] compressStr = testGZIPCompress(str);
////        System.out.println(compressStr);
////
//        System.out.println(testGZIPDECompress(compressStr));

//        byte[] gzip = ZipUtils.gzip(str.getBytes("UTF-8"));
//
//        System.out.println(new String( ZipUtils.ungzip(gzip),"UTF-8"));

    }


    private static byte[] testGZIPCompress(String str) throws Exception{
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        GZIPOutputStream gzip = new GZIPOutputStream(out);
//        gzip.write(str.getBytes("UTF-8"));
//        gzip.finish();
//
//        return out.toString("UTF-8");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip;
        gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes("UTF-8"));
        gzip.finish();
        gzip.flush();
        gzip.close();

//        return new String(ZipUtils.gzip(str.getBytes("UTF-8")),"UTF-8") ;

        return out.toByteArray();
    }

    private static String testGZIPDECompress(byte[] bytes) throws Exception{
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        GZIPInputStream gzipInputStream = new GZIPInputStream(in);

        byte[] buffer = new byte[256];
        int n;

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        while ((n = gzipInputStream.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        return out.toString("UTF-8");

//        return new String(ZipUtils.ungzip(str.getBytes("UTF-8")),"UTF-8") ;

    }


    public static String clientEncrypt(String srcStr, String aeskey) throws Exception {
        String text = srcStr;
        byte[] aesKey = aeskey.getBytes();
        AES aes = new AES(aesKey);
        byte[] data = aes.encode(text.getBytes());
        String retStr = "";
        MobRSACrypter defRsaCrypter = new MobRSACrypter();
        byte[] aesKeyRSA = defRsaCrypter.encodeByPublicKey(aesKey);
        System.out.println("aesKeyRSA Len: " + aesKeyRSA.length);
        byte[] mBytes = new byte[8 + data.length + aesKeyRSA.length];
        ByteBuffer b = ByteBuffer.allocate(4);
        b.putInt(aesKeyRSA.length);
        System.arraycopy(b.array(), 0, mBytes, 0, 4);
        System.arraycopy(aesKeyRSA, 0, mBytes, 4, aesKeyRSA.length);
        b = ByteBuffer.allocate(4);
        b.putInt(data.length);
        System.arraycopy(b.array(), 0, mBytes, 4 + aesKeyRSA.length, 4);
        System.arraycopy(data, 0, mBytes, 8 + aesKeyRSA.length, data.length);
        retStr = Base64.encode(mBytes).replaceAll("\n", "");
        System.out.println("encrypt success!=====" + retStr);

        return retStr;
    }
}
