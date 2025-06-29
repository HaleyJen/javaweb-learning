package util;

import java.io.UnsupportedEncodingException;

public class CharactorEncoding {
    public CharactorEncoding() {}

    /**
     * 对字符串进行转码处理
     * @param str 原始字符串
     * @return 编码后的字符串
     */
    public String toString(String str) {
        String text = "";
        if (str != null && !"".equals(str)) {
            try {
                text = new String(str.getBytes("ISO-8859-1"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return text;
    }
}
