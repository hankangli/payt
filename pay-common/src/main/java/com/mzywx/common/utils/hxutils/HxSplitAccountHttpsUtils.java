package com.mzywx.common.utils.hxutils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName HxSplitAccountHttpsUtils
 * @Description 请求华夏分账
 * @Author hankangli
 * @Date 2020/3/3 16:10
 * @Version 1.0
 **/
public class HxSplitAccountHttpsUtils {

    public static final String conf = "10.0.9.18:8081";
    public static final String MerchantNo = "20000320";

    public static String DateToStr(Date date) {

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(date);
        return str;
    }


    @SuppressWarnings("unused")
    public static String requestB2B(String reqMessage) {
        //商户自定义错误信息
        String errMsg = "";
        //日期
//        String clientTime = DateToStr(new Date());
//        String transCode = TransCodeEnum.T_104010.getCode();
//        String transCodeId = clientTime + transCode + "0001";
        StringBuffer sbf = new StringBuffer();
        if (null != conf && null != MerchantNo && !"".equals(conf.trim()) && !"".equals(MerchantNo.trim())) {
//            //准备模拟报文
//            String Test_102060 = "<?xml version=\"1.0\" encoding=\"GBK\"?><CPMB2B><MessageData><Base><Version>1.0</Version><SignFlag>1</SignFlag><SeverModel>3</SeverModel></Base><ReqHeader><TransCodeId>201454578</TransCodeId><TransCode>102060</TransCode><ClientTime>20170115165455</ClientTime><MerchantNo>" + MerchantNo.trim() + "</MerchantNo></ReqHeader><DataBody><RequfileName>0000host.kkf2</RequfileName><BatchCode>CNY</BatchCode><Remark1>155315</Remark1><Remark2>155315</Remark2></DataBody></MessageData></CPMB2B>";
//            String Test_102020 = "<?xml version=\"1.0\" encoding=\"GBK\"?><CPMB2B><MessageData><Base><Version>1.1</Version><SignFlag>1</SignFlag><SeverModel>3</SeverModel></Base><ReqHeader><ClientTime>20180115143917</ClientTime><MerchantNo>" + MerchantNo.trim() + "</MerchantNo><TransCodeId>2f421ab225542497</TransCodeId><TransCode>102020</TransCode></ReqHeader><DataBody><RequfileName>BATCH_PAY_12111151_20180115143918_38.DAT</RequfileName><BatchCode>20180125154376</BatchCode><OrderFile></OrderFile><Remark1>备注1</Remark1><Remark2>备注2</Remark2></DataBody></MessageData></CPMB2B>";
//            String Test_102030 = "<?xml version=\"1.0\" encoding=\"GBK\"?><CPMB2B><MessageData><Base><Version>1.0</Version><SignFlag>1</SignFlag><SeverModel>3</SeverModel></Base><ReqHeader><ClientTime>20180115095447</ClientTime><MerchantNo>" + MerchantNo.trim() + "</MerchantNo><TransCodeId>2018011509544739524442</TransCodeId><TransCode>101030</TransCode></ReqHeader><DataBody><RequfileName>BATCH_OPEN_12111151_20180108165752_01.DAT</RequfileName><Remark1/><Remark2/></DataBody></MessageData></CPMB2B>";
//            String Test_100000 = "<?xml version=\"1.0\" encoding=\"GBK\"?><CPMB2B><MessageData><Base><Version>1.0</Version><SignFlag>0</SignFlag><SeverModel>3</SeverModel></Base><ReqHeader><ClientTime>" + clientTime + "</ClientTime><MerchantNo>" + MerchantNo.trim() + "</MerchantNo><TransCodeId>" + transCodeId + "</TransCodeId><TransCode>" + transCode + "</TransCode></ReqHeader><DataBody><PapersType>16</PapersType><PapersCode>18181</PapersCode><Key></Key></DataBody></MessageData></CPMB2B>";
//            String Test_101030 = "<?xml version=\"1.0\" encoding=\"GBK\"?><CPMB2B><MessageData><Base><Version>1.0</Version><SignFlag>1</SignFlag><SeverModel>3</SeverModel></Base><ReqHeader><ClientTime>20180115095447</ClientTime><MerchantNo>" + MerchantNo.trim() + "</MerchantNo><TransCodeId>2018011509544739524442</TransCodeId><TransCode>101030</TransCode></ReqHeader><DataBody><RequfileName>BATCH_OPEN_12111171_20180108165752_01.DAT</RequfileName><Remark1/><Remark2/></DataBody></MessageData></CPMB2B>";
//            String Test_101090 = "<?xml version=\"1.0\" encoding=\"GBK\"?><CPMB2B><MessageData><Base> <Version>1.0</Version> <SignFlag>1</SignFlag> <SeverModel>3</SeverModel> </Base><ReqHeader> <ClientTime>" + clientTime + "</ClientTime> <MerchantNo>" + MerchantNo.trim() + "</MerchantNo> <TransCodeId>" + transCodeId + "</TransCodeId> <TransCode>101090</TransCode> </ReqHeader><Currency>CNY</Currency></MessageData></CPMB2B>";
//            String Test_info_star = "<?xml version=\"1.0\" encoding=\"GBK\"?><CPMB2B><MessageData><Base><Version>1.0</Version><SignFlag>1</SignFlag><SeverModel>3</SeverModel></Base><ReqHeader><ClientTime>" + clientTime + "</ClientTime><TransCodeId>" + transCodeId + "</TransCodeId><TransCode>" + transCode + "</TransCode><MerchantNo>" + MerchantNo.trim() + "</MerchantNo></ReqHeader><DataBody>";
//            String Test_info_end = "</DataBody></MessageData></CPMB2B>";
//
//            //查询账户信息  101020
//            String Test_101020 = Test_info_star + "<SubAccount>2020021117150001</SubAccount>" + Test_info_end;
//            //子账户开户 101010
////            String Test_101010 = Test_info_star +"<TradeMemBerName>陈郎资金方</TradeMemBerName><Currency>CNY</Currency><SubAcc>2020021117150001</SubAcc><BoothNo>00012826127782046043</BoothNo><TradeMemBerGrade>1</TradeMemBerGrade><TradeMemberProperty>0</TradeMemberProperty><Contact>陈郎资金方</Contact><ContactPhone>5271159</ContactPhone><Phone>18039213899</Phone><ContactAddr>湖北省武汉市新长江传媒大厦</ContactAddr><BusinessName>韩康利</BusinessName><PapersType>16</PapersType><PapersCode>915100007118801111</PapersCode><IsMessager>2</IsMessager><Email>hankanglis@163.com</Email>"+Test_info_end;
//            String Test_101010 = Test_info_star + "<TradeMemBerName>核心企业张</TradeMemBerName><Currency>CNY</Currency><SubAcc>2020021211000001</SubAcc><BoothNo>00012826127782046044</BoothNo><TradeMemBerGrade>1</TradeMemBerGrade><TradeMemberProperty>0</TradeMemberProperty><Contact>核心企业张</Contact><ContactPhone>5271159</ContactPhone><Phone>18039213899</Phone><ContactAddr>湖北省武汉市新长江传媒大厦</ContactAddr><BusinessName>潘相鹏</BusinessName><PapersType>16</PapersType><PapersCode>911302946665931134</PapersCode><IsMessager>2</IsMessager><Email>hankanglis@163.com</Email>" + Test_info_end;
//            //日切
//            String Test_104010 = Test_info_star + "<EndDay>" + "20200303" + "</EndDay>" + Test_info_end;
//
//            //绑定出入金 101070
////            String Test_101070 = Test_info_star +"<OperType>1</OperType><SubAccount>2020021117150001</SubAccount><TradeMemCode>0000629970</TradeMemCode><LinkAccountType>0</LinkAccountType><IsOther>1</IsOther><AccountSign>1</AccountSign><IsOtherBank>0</IsOtherBank><SettleAccountName>陈郎资金方</SettleAccountName><SettleAccount>10250001001723877</SettleAccount><PapersType>16</PapersType><PapersCode>915100007118801111</PapersCode><StrideValidate>1</StrideValidate><CurrCode>CNY</CurrCode>"+Test_info_end;
//            String Test_101070 = Test_info_star + "<OperType>1</OperType><SubAccount>2020021211000001</SubAccount><TradeMemCode>0000629990</TradeMemCode><LinkAccountType>0</LinkAccountType><IsOther>1</IsOther><AccountSign>1</AccountSign><IsOtherBank>0</IsOtherBank><SettleAccountName>核心企业张</SettleAccountName><SettleAccount>10250001001723888</SettleAccount><PapersType>16</PapersType><PapersCode>911302946665931134</PapersCode><StrideValidate>1</StrideValidate><CurrCode>CNY</CurrCode>" + Test_info_end;
//            //子账户绑定账户信息查询 101080   20020191226479431  20000320
//            String Test_101080 = Test_info_star + "<SubAccount>2020021211000001</SubAccount><TradeMemCode>0000629990</TradeMemCode><OutComeAccountType>0</OutComeAccountType>" + Test_info_end;
//            //账户余额 商户子账户 不需要 <MemBerCode>0000629970</MemBerCode>
//            String Test_104020 = Test_info_star + "<Account>2020021211000001</Account><MemBerCode>0000629990</MemBerCode><AccountType>1</AccountType>" + Test_info_end;
//            //本行入金
//            String Test_103020 = Test_info_star + "<PayCode>2020021211450001</PayCode><SubAccount>20020191226479431</SubAccount><InMoney>10000</InMoney>" + Test_info_end;
//            //本行出金  会员编码  不是商户收益子账户 必传
//            String Test_103010 = Test_info_star + "<PayCode>2020021211450009</PayCode><SubAccount>2020021211000001</SubAccount><TradeMemCode>0000629990</TradeMemCode><OutComeMoney>50</OutComeMoney><ChannelNo>0000</ChannelNo><SumSubMoney>50</SumSubMoney><OtherBankCost>0</OtherBankCost><CusPayMoney>0</CusPayMoney><MerOtherPayMoney>0</MerOtherPayMoney><OutComeAccountType>0</OutComeAccountType><OutAccount>10250001001723888</OutAccount><OutAccountName>核心企业张</OutAccountName>" + Test_info_end;
//            //支付交易
//            String Test_102010 = Test_info_star + "<PayCode>2020021211450004</PayCode><PaySubAccount>20020191226479431</PaySubAccount><PayeesSubAccount>2020021117150001</PayeesSubAccount><TradeAccount>100</TradeAccount><TradeCurrency>CNY</TradeCurrency>" + Test_info_end;
//            //子账户交易明细
//            String startTime = "202002120000"; // getDataStr("202002120000");
//            String endTime = "202002122359";//getDataStr("202002122359");
//            String Test_104030 = Test_info_star + "<SubAccount>20020191226479431</SubAccount><TradeMemCode>0000629970</TradeMemCode><StartTimes>" + startTime + "</StartTimes><EndTimes>" + endTime + "</EndTimes>" + Test_info_end;
            String url = "http://" + conf + "/B2BClient/http/MerchantRequestProcees";
            URL u = null;
            HttpURLConnection c = null;
            OutputStreamWriter p = null;
            BufferedReader br = null;
            try {
                u = new URL(url);
                c = (HttpURLConnection) u.openConnection();
                // 设置连接主机超时（单位：毫秒）
                c.setConnectTimeout(30000);
                // 设置从主机读取数据超时（单位：毫秒）
                c.setReadTimeout(30000);
                //设置请求头
                c.setRequestProperty("Accept", "*/*");
                c.setRequestProperty("Connection", "keep-alive");
                c.setDoInput(true);
                c.setDoOutput(true);
                p = new OutputStreamWriter(c.getOutputStream(), "UTF-8");
//                p.print(reqMessage.toString());
                p.write(reqMessage.toString());
                p.flush();
                br = new BufferedReader(new InputStreamReader(c.getInputStream()));
                String tLine = null;
                while ((tLine = br.readLine()) != null) {
                    sbf.append(tLine);
                    if (tLine.indexOf("</CPMB2B>") != -1) {
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                //TODO 商户自定义错误信息
                sbf.append(errMsg);
            } finally {
                if (null != p) {
                    try {
                        p.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (null != br) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        // 忽略异常
                        e.printStackTrace();
                    }
                }
            }
        }
        return sbf.toString();
    }

    public static String composeReqMessage(String message, String transCode) {
        String clientTime = DateToStr(new Date());
//        String transCode = TransCodeEnum.T_104010.getCode();
        String transCodeId = clientTime + transCode + "0001";
        String info_star = "<?xml version=\"1.0\" encoding=\"GBK\"?><CPMB2B><MessageData><Base><Version>1.0</Version><SignFlag>1</SignFlag><SeverModel>3</SeverModel></Base><ReqHeader><ClientTime>" + clientTime + "</ClientTime><TransCodeId>" + transCodeId + "</TransCodeId><TransCode>" + transCode + "</TransCode><MerchantNo>" + MerchantNo.trim() + "</MerchantNo></ReqHeader><DataBody>";
        String info_end = "</DataBody></MessageData></CPMB2B>";
        return info_star + message + info_end;
    }

    public static String utfCode(String str) {
        try {
            return Arrays.toString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
