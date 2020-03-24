package com.grpc.service.hxservice;

import com.grpc.interfaces.hxsplitaccount.entity.Base;
import com.grpc.interfaces.hxsplitaccount.entity.ResHeader;
import com.grpc.interfaces.hxsplitaccount.entity.Status;
import com.grpc.interfaces.hxsplitaccount.request.*;
import com.grpc.interfaces.hxsplitaccount.response.accountBalance.AccountBalanceCpmResponse;
import com.grpc.interfaces.hxsplitaccount.response.bindWithdrawalAccount.BindWithdrawalAccountCpmResponse;
import com.grpc.interfaces.hxsplitaccount.response.bindWithdrawalAccountQuery.BindWithdrawalAccountQueryCpmResponse;
import com.grpc.interfaces.hxsplitaccount.response.createSonAccount.CreateSonAccountCpmB2BResponse;
import com.grpc.interfaces.hxsplitaccount.response.createSonAccount.CreateSonAccountDataResponse;
import com.grpc.interfaces.hxsplitaccount.response.createSonAccount.CreateSonAccountResponse;
import com.grpc.interfaces.hxsplitaccount.response.day.DayCpmB2BResponse;
import com.grpc.interfaces.hxsplitaccount.response.day.DayDataResponse;
import com.grpc.interfaces.hxsplitaccount.response.day.DayResponse;
import com.grpc.interfaces.hxsplitaccount.response.info.InfoCpmResponse;
import com.grpc.interfaces.hxsplitaccount.response.payAccount.PayAccountCpmResponse;
import com.grpc.interfaces.hxsplitaccount.response.payInfoList.PayInfoListCpmResponse;
import com.grpc.interfaces.hxsplitaccount.response.subAccountList.SubAccountListCpmResponse;
import com.grpc.interfaces.hxsplitaccount.response.withdrawal.WithdrawalCpmResponse;
import com.grpc.hx.lib.HxServiceGrpc;
import com.grpc.hx.lib.Hxpay;
import com.mzywx.common.enums.hxenums.TransCodeEnum;
import com.mzywx.common.utils.hxutils.DateUtils;
import com.mzywx.common.utils.hxutils.HxSplitAccountHttpsUtils;
import com.thoughtworks.xstream.XStream;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName HxService
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/16 14:07
 * @Version 1.0
 **/
@Service
@GrpcService(Hxpay.class)
public class HxService extends HxServiceGrpc.HxServiceImplBase {


    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 创建子账户
     * @Date 2020/3/4 10:55
     * @Param [createSonAccountRequest]
     **/
    public void createSonAccount(Hxpay.CreateSonAccountRequest request, StreamObserver<Hxpay.CreateSonAccountCpmB2BResponse> responseObserver) {
        //校验参数
        //String Test_101010 = Test_info_star + "<TradeMemBerName>核心企业张</TradeMemBerName><Currency>CNY</Currency><SubAcc>2020021211000001</SubAcc><BoothNo>00012826127782046044</BoothNo><TradeMemBerGrade>1</TradeMemBerGrade><TradeMemberProperty>0</TradeMemberProperty><Contact>核心企业张</Contact><ContactPhone>5271159</ContactPhone><Phone>18039213899</Phone><ContactAddr>湖北省武汉市新长江传媒大厦</ContactAddr><BusinessName>潘相鹏</BusinessName><PapersType>16</PapersType><PapersCode>911302946665931134</PapersCode><IsMessager>2</IsMessager><Email>hankanglis@163.com</Email>" + Test_info_end;
//        System.err.println(HxSplitAccountHttpsUtils.utfCode(createSonAccountRequest.getTradeMemBerName()));
        String reqMessage = "<TradeMemBerName>" + request.getTradeMemBerName() + "</TradeMemBerName><Currency>CNY</Currency><SubAcc>" + request.getSubAcc() + "</SubAcc><BoothNo>" + request.getBoothNo() + "</BoothNo><TradeMemBerGrade>" + request.getTradeMemBerGrade() + "</TradeMemBerGrade><TradeMemberProperty>" + request.getTradeMemberProperty() + "</TradeMemberProperty><Contact>" + request.getContact() + "</Contact><ContactPhone>" + request.getContactPhone() + "</ContactPhone><Phone>" + request.getPhone() + "</Phone><ContactAddr>" + request.getContactAddr() + "</ContactAddr><BusinessName>" + request.getBusinessName() + "</BusinessName><PapersType>" + request.getPapersType() + "</PapersType><PapersCode>" + request.getPapersCode() + "</PapersCode><IsMessager>" + request.getIsMessager() + "</IsMessager><Email>" + request.getEmail() + "</Email>";
        String message = HxSplitAccountHttpsUtils.composeReqMessage(reqMessage, TransCodeEnum.T_101010.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(message);
//        CreateSonAccountCpmB2BResponse cpmb2B = (CreateSonAccountCpmB2BResponse) HxSplitAccountHttpsUtils.xmlToBean(requestB2B, CreateSonAccountCpmB2BResponse.class, CreateSonAccountDataResponse.class, CreateSonAccountResponse.class);
        //创建xstream对象
        XStream xStream = new XStream();
        //将别名与xml名字对应
        xStream.alias("CPMB2B", CreateSonAccountCpmB2BResponse.class);
        xStream.alias("messageData", CreateSonAccountDataResponse.class);
        xStream.alias("base", Base.class);
        xStream.alias("resHeader", ResHeader.class);
        xStream.alias("status", Status.class);
        xStream.alias("dataBody", CreateSonAccountResponse.class);
        //将字符串类型的xml转换为对象
        CreateSonAccountCpmB2BResponse createSonAccountCpmB2BResponse = (CreateSonAccountCpmB2BResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(createSonAccountCpmB2BResponse);
        //转换工具类
        Hxpay.CreateSonAccountCpmB2BResponse.Builder builder = Hxpay.CreateSonAccountCpmB2BResponse.newBuilder();
        //创建返回对象
        Hxpay.Status.Builder status = Hxpay.Status.newBuilder()
                .setCode(createSonAccountCpmB2BResponse.getMessageData().getResHeader().getStatus().getCode())
                .setMessage(createSonAccountCpmB2BResponse.getMessageData().getResHeader().getStatus().getMessage())
                ;
        Hxpay.CreateSonAccountResponse createSonAccountResponse = Hxpay.CreateSonAccountResponse.newBuilder().setMemBerCode(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getMemBerCode()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getMemBerCode())
                .setRemark1(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark1()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark1())
                .setRemark2(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark2()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark2())
                .build();
        Hxpay.ResHeader resHeader = Hxpay.ResHeader.newBuilder()
                .setTransCode(createSonAccountCpmB2BResponse.getMessageData().getResHeader().getTransCode())
                .setTransCodeId(createSonAccountCpmB2BResponse.getMessageData().getResHeader().getTransCodeId())
                .addStatus(status.build())
                .build();
        Hxpay.Base base = Hxpay.Base.newBuilder()
                .setVersion(createSonAccountCpmB2BResponse.getMessageData().getBase().getVersion())
                .setSignFlag(createSonAccountCpmB2BResponse.getMessageData().getBase().getSignFlag())
                .setSeverModel(createSonAccountCpmB2BResponse.getMessageData().getBase().getSeverModel())
                .build();
        Hxpay.CreateSonAccountDataResponse createSonAccountDataResponse = Hxpay.CreateSonAccountDataResponse
                .newBuilder()
                .addDataBody(createSonAccountResponse)
                .addBase(base)
                .addResHeader(resHeader)
                .build();
        builder.addMessageData(createSonAccountDataResponse);
//        ProtoBufUtils.transformProtoReturnBuilder(builder, createSonAccountCpmB2BResponse);
        Hxpay.CreateSonAccountCpmB2BResponse build = builder.build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();

    }

    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 子账户查询
     * @Date 2020/3/4 11:52
     * @Param [subAccouunt]
     **/

    public void sonAccountList(String subAccouunt) {
        //查询账户信息  101020
        //String Test_101020 = Test_info_star + "<SubAccount>2020030318565000001</SubAccount>" + Test_info_end;
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        String reqMessage = "";
        if (StringUtils.isBlank(subAccouunt) && subAccouunt == null) {
            reqMessage = HxSplitAccountHttpsUtils.composeReqMessage("", TransCodeEnum.T_101020.getCode());
        } else {
            //查询单个账户信息
            String str = "<SubAccount>" + subAccouunt + "</SubAccount>";
            reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_101020.getCode());
        }
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建xstream对象
        XStream xStream = new XStream();
        xStream.processAnnotations(SubAccountListCpmResponse.class);
        SubAccountListCpmResponse listCpmResponse = (SubAccountListCpmResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(listCpmResponse);
//        return returnDatas;
    }


    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 日切日期
     * @Date 2020/3/4 10:56
     * @Param [day]
     **/
    public void day(String day) {
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
//        if (StringUtils.isBlank(day)) {
//            returnDatas.setMessage("参数有误");
//            returnDatas.setStatus(ReturnDatas.ERROR);
//            return returnDatas;
//        }
        //String Test_104010 = Test_info_star + "<EndDay>" + day + "</EndDay>" + Test_info_end;
        String str = "<EndDay>" + day + "</EndDay>";
        String reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_104010.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建xstream对象
        XStream xStream = new XStream();
        //将别名与xml名字对应
        xStream.alias("CPMB2B", DayCpmB2BResponse.class);
        xStream.alias("messageData", DayDataResponse.class);
        xStream.alias("base", Base.class);
        xStream.alias("resHeader", ResHeader.class);
        xStream.alias("status", Status.class);
        xStream.alias("dataBody", DayResponse.class);
        DayCpmB2BResponse cpmB2BResponse = (DayCpmB2BResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(cpmB2BResponse);
//
//        return returnDatas;
    }


    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 绑定出入金账户
     * @Date 2020/3/4 13:44
     * @Param [bindWithDrawalAccount]
     **/
    public void bindWithdrawalAccount(BindWithDrawalAccountRequest bindWithDrawalAccount) {
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        //String Test_101070 = Test_info_star + "<OperType>1</OperType><SubAccount>2020021211000001</SubAccount><TradeMemCode>0000629990</TradeMemCode><LinkAccountType>0</LinkAccountType><IsOther>1</IsOther><AccountSign>1</AccountSign><IsOtherBank>0</IsOtherBank><SettleAccountName>核心企业张</SettleAccountName><SettleAccount>10250001001723888</SettleAccount><PapersType>16</PapersType><PapersCode>911302946665931134</PapersCode><StrideValidate>1</StrideValidate><CurrCode>CNY</CurrCode>" + Test_info_end;
        String str = "<OperType>" + bindWithDrawalAccount.getOperType() +
                "</OperType><SubAccount>" + bindWithDrawalAccount.getSubAccount() +
                "</SubAccount><TradeMemCode>" + bindWithDrawalAccount.getTradeMemCode() +
                "</TradeMemCode><LinkAccountType>" + bindWithDrawalAccount.getLinkAccountType() +
                "</LinkAccountType><IsOther>" + bindWithDrawalAccount.getIsOther() +
                "</IsOther><AccountSign>" + bindWithDrawalAccount.getAccountSign() +
                "</AccountSign><IsOtherBank>" + bindWithDrawalAccount.getIsOtherBank() +
                "</IsOtherBank><SettleAccountName>" + bindWithDrawalAccount.getSettleAccountName() +
                "</SettleAccountName><SettleAccount>" + bindWithDrawalAccount.getSettleAccount() +
                "</SettleAccount><PapersType>" + bindWithDrawalAccount.getPapersType() +
                "</PapersType><PapersCode>" + bindWithDrawalAccount.getPapersCode() +
                "</PapersCode><StrideValidate>" + bindWithDrawalAccount.getStrideValidate() +
                "</StrideValidate><CurrCode>CNY</CurrCode>";
        String reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_101070.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建解析对象
        XStream xStream = new XStream();
        xStream.processAnnotations(BindWithdrawalAccountCpmResponse.class);
        BindWithdrawalAccountCpmResponse accountCpmResponse = (BindWithdrawalAccountCpmResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(accountCpmResponse);
//        return returnDatas;
    }

    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 查询出入金绑定信息
     * @Date 2020/3/4 14:15
     * @Param [bindWithQueryDrawalAccount]
     **/
    public void bindWithdrawalAccountQuery(BindWithdrawalAccountQueryRequest bindWithQueryDrawalAccount) {
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        //String Test_101080 = Test_info_star + "<SubAccount>2020021211000001</SubAccount><TradeMemCode>0000629990</TradeMemCode><OutComeAccountType>0</OutComeAccountType>" + Test_info_end;
        String str = "<SubAccount>" + bindWithQueryDrawalAccount.getSubAccount() +
                "</SubAccount><TradeMemCode>" + bindWithQueryDrawalAccount.getTradeMemCode() +
                "</TradeMemCode><OutComeAccountType>" + bindWithQueryDrawalAccount.getOutComeAccountType() + "</OutComeAccountType>";
        String reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_101080.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建解析对象
        XStream xStream = new XStream();
        xStream.processAnnotations(BindWithdrawalAccountQueryCpmResponse.class);
        BindWithdrawalAccountQueryCpmResponse response = (BindWithdrawalAccountQueryCpmResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(response);
//        return returnDatas;
    }

    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 账户余额
     * @Date 2020/3/4 14:45
     * @Param [balanceRequest]
     **/

    public void accountBalance(AccountBalanceRequest balanceRequest) {
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        //账户余额 商户子账户 不需要 <MemBerCode>0000629970</MemBerCode>
        //String Test_104020 = Test_info_star + "<Account>2020021211000001</Account><MemBerCode>0000629990</MemBerCode><AccountType>1</AccountType>" + Test_info_end;
        String str = "<Account>" + balanceRequest.getAccount() +
                "</Account>";
        if (StringUtils.isNotBlank(balanceRequest.getMemBerCode())) {
            String me = "<MemBerCode>" + balanceRequest.getMemBerCode() +
                    "</MemBerCode>";
            str = str + me;
        }

        str = str + "<AccountType>" + balanceRequest.getAccountType() + "</AccountType>";
        String reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_104020.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建解析对象
        XStream xStream = new XStream();
        xStream.processAnnotations(AccountBalanceCpmResponse.class);
        AccountBalanceCpmResponse response = (AccountBalanceCpmResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(response);
//        return returnDatas;
    }

    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 账户之间的交易
     * @Date 2020/3/4 15:02
     * @Param [payAccountRequest]
     **/
    public void payAccount(Hxpay.PayAccountRequest payAccountRequest , StreamObserver<Hxpay.PayAccountCpmResponse> responseObserver) {
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        //String Test_102010 = Test_info_star + "<PayCode>2020021211450004</PayCode><PaySubAccount>20020191226479431</PaySubAccount><PayeesSubAccount>2020021117150001</PayeesSubAccount><TradeAccount>100</TradeAccount><TradeCurrency>CNY</TradeCurrency>" + Test_info_end;
        String str = "<PayCode>" + DateUtils.formatDateTime(new Date(), "yyyyMMddHHmmss") +
                "</PayCode><PaySubAccount>" + payAccountRequest.getPaySubAccount() +
                "</PaySubAccount>";
        if (StringUtils.isNotBlank(payAccountRequest.getTradeMemCode())) {
            str = str + "<TradeMemCode>" + payAccountRequest.getTradeMemCode() + "</TradeMemCode>";
        }
        str = str + "<PayeesSubAccount>" + payAccountRequest.getPayeesSubAccount() +
                "</PayeesSubAccount><TradeAccount>" + payAccountRequest.getTradeAccount() +
                "</TradeAccount><TradeCurrency>CNY</TradeCurrency>";
        String reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_102010.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建解析对象
        XStream xStream = new XStream();
        xStream.processAnnotations(PayAccountCpmResponse.class);
        PayAccountCpmResponse createSonAccountCpmB2BResponse = (PayAccountCpmResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(accountCpmResponse);
//        return returnDatas;
        //封装返回数据
        Hxpay.PayAccountCpmResponse.Builder builder = Hxpay.PayAccountCpmResponse.newBuilder();
        //创建返回对象
        Hxpay.Status.Builder status = Hxpay.Status.newBuilder()
                .setCode(createSonAccountCpmB2BResponse.getMessageData().getResHeader().getStatus().getCode())
                .setMessage(createSonAccountCpmB2BResponse.getMessageData().getResHeader().getStatus().getMessage())
                ;
        Hxpay.PayAccountResponse createSonAccountResponse = Hxpay.PayAccountResponse.newBuilder()
                .setPayCode(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getPayCode()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getPayCode())
                .setSubAccountMoney(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getSubAccountMoney()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getSubAccountMoney())
                .setFreezeMoney(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getFreezeMoney()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getFreezeMoney())
                .setRemark1(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark1()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark1())
                .setRemark2(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark2()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark2())
                .setRemark3(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark3()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark3())
                .setRemark4(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark4()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark4())
                .setRemark5(StringUtils.isBlank(createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark5()) ? "无数据" : createSonAccountCpmB2BResponse.getMessageData().getDataBody().getRemark5())
                .build();
        Hxpay.ResHeader resHeader = Hxpay.ResHeader.newBuilder()
                .setTransCode(createSonAccountCpmB2BResponse.getMessageData().getResHeader().getTransCode())
                .setTransCodeId(createSonAccountCpmB2BResponse.getMessageData().getResHeader().getTransCodeId())
                .addStatus(status.build())
                .build();
        Hxpay.Base base = Hxpay.Base.newBuilder()
                .setVersion(createSonAccountCpmB2BResponse.getMessageData().getBase().getVersion())
                .setSignFlag(createSonAccountCpmB2BResponse.getMessageData().getBase().getSignFlag())
                .setSeverModel(createSonAccountCpmB2BResponse.getMessageData().getBase().getSeverModel())
                .build();
        Hxpay.PayAccountDataResponse createSonAccountDataResponse = Hxpay.PayAccountDataResponse
                .newBuilder()
                .addDataBody(createSonAccountResponse)
                .addBase(base)
                .addResHeader(resHeader)
                .build();
        builder.addMessageData(createSonAccountDataResponse);
//        ProtoBufUtils.transformProtoReturnBuilder(builder, createSonAccountCpmB2BResponse);
        Hxpay.PayAccountCpmResponse build = builder.build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 本行出金
     * @Date 2020/3/4 15:51
     * @Param [withdrawalRequest]
     **/
    public void withdrawal(WithdrawalRequest withdrawalRequest) {
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        //String Test_103010 = Test_info_star + "<PayCode>2020021211450009</PayCode><SubAccount>2020021211000001</SubAccount><TradeMemCode>0000629990</TradeMemCode><OutComeMoney>50</OutComeMoney><ChannelNo>0000</ChannelNo><SumSubMoney>50</SumSubMoney><OtherBankCost>0</OtherBankCost><CusPayMoney>0</CusPayMoney><MerOtherPayMoney>0</MerOtherPayMoney><OutComeAccountType>0</OutComeAccountType><OutAccount>10250001001723888</OutAccount><OutAccountName>核心企业张</OutAccountName>" + Test_info_end;
        String str = "<PayCode>" + DateUtils.formatDateTime(new Date(), "yyyyMMddHHmmss") +
                "</PayCode><SubAccount>" + withdrawalRequest.getSubAccount() + "</SubAccount>";
        if (StringUtils.isNotBlank(withdrawalRequest.getTradeMemCode())) {
            str = str + "<TradeMemCode>" + withdrawalRequest.getTradeMemCode() + "</TradeMemCode>";
        }
        str = str + "<OutComeMoney>" + withdrawalRequest.getOutComeMoney() +
                "</OutComeMoney><ChannelNo>" + withdrawalRequest.getChannelNo() +
                "</ChannelNo><SumSubMoney>" + withdrawalRequest.getSumSubMoney() +
                "</SumSubMoney><OtherBankCost>" + withdrawalRequest.getOtherBankCost() +
                "</OtherBankCost><CusPayMoney>" + withdrawalRequest.getCusPayMoney() +
                "</CusPayMoney><MerOtherPayMoney>" + withdrawalRequest.getMerOtherPayMoney() +
                "</MerOtherPayMoney><OutComeAccountType>" + withdrawalRequest.getOutComeAccountType() +
                "</OutComeAccountType><OutAccount>" + withdrawalRequest.getOutAccount() +
                "</OutAccount><OutAccountName>" + withdrawalRequest.getOutAccountName() + "</OutAccountName>";
        String reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_103010.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建解析对象
        XStream xStream = new XStream();
        xStream.processAnnotations(WithdrawalCpmResponse.class);
        WithdrawalCpmResponse response = (WithdrawalCpmResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(response);
//        return returnDatas;
    }

    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 本行入金
     * @Date 2020/3/4 16:27
     * @Param [depositRequest]
     **/
    public void deposit(DepositRequest depositRequest) {
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        //String Test_103020 = Test_info_star + "<PayCode>2020021211450001</PayCode><SubAccount>20020191226479431</SubAccount><InMoney>10000</InMoney>" + Test_info_end;
        String str = "<PayCode>" + DateUtils.formatDateTime(new Date(), "yyyyMMdd HHmmss") +
                "</PayCode><SubAccount>" + depositRequest.getSubAccount() +
                "</SubAccount>";
        if (StringUtils.isNotBlank(depositRequest.getTradeMemCode())) {
            str = str + "<TradeMemCode>" + depositRequest.getTradeMemCode() + "</TradeMemCode>";
        }
        str = str + "<InMoney>" + depositRequest.getInMoney() + "</InMoney>";
        String reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_103020.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建解析对象
        XStream xStream = new XStream();
        xStream.processAnnotations(WithdrawalCpmResponse.class);
        WithdrawalCpmResponse response = (WithdrawalCpmResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(response);
//        return returnDatas;
    }

    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 商户信息
     * @Date 2020/3/5 10:16
     * @Param []
     **/

    public void info() {
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        //String Test_101090 = "<?xml version=\"1.0\" encoding=\"GBK\"?><CPMB2B><MessageData><Base> <Version>1.0</Version> <SignFlag>1</SignFlag> <SeverModel>3</SeverModel> </Base><ReqHeader> <ClientTime>" + clientTime + "</ClientTime> <MerchantNo>" + MerchantNo.trim() + "</MerchantNo> <TransCodeId>" + transCodeId + "</TransCodeId> <TransCode>101090</TransCode> </ReqHeader><Currency>CNY</Currency></MessageData></CPMB2B>";
        String str = "<Currency>CNY</Currency>";
        String reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_101090.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建解析对象
        XStream xStream = new XStream();
        xStream.processAnnotations(InfoCpmResponse.class);
        InfoCpmResponse response = (InfoCpmResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(response);
//        return returnDatas;
    }

    /**
     * @return com.zywx.hxpay.utils.ReturnDatas
     * @Author hankangli
     * @Description 账户交易明细
     * @Date 2020/3/5 10:24
     * @Param [listRequest]
     **/
    public void payListInfo(PayInfoListRequest listRequest) {
//        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        //String Test_104030 = Test_info_star + "<SubAccount>20020191226479431</SubAccount><TradeMemCode>0000629970</TradeMemCode><StartTimes>" + startTime + "</StartTimes><EndTimes>" + endTime + "</EndTimes>" + Test_info_end;
        String str = "";
        if (StringUtils.isNotBlank(listRequest.getSubAccount())) {
            str = str + "<SubAccount>" + listRequest.getSubAccount() + "</SubAccount>";
        }
        if (StringUtils.isNotBlank(listRequest.getTradeMemCode())) {
            str = str + "<TradeMemCode>" + listRequest.getTradeMemCode() + "</TradeMemCode>";
        }
        if (StringUtils.isNotBlank(listRequest.getOtherSubAccount())) {
            str = str + "<OtherSubAccount>" + listRequest.getOtherSubAccount() + "</OtherSubAccount>";
        }
        str = str + "<StartTimes>" + listRequest.getStartTimes() + "</StartTimes><EndTimes>" + listRequest.getEndTimes() + "</EndTimes>";
        //组装报文
        String reqMessage = HxSplitAccountHttpsUtils.composeReqMessage(str, TransCodeEnum.T_104030.getCode());
        String requestB2B = HxSplitAccountHttpsUtils.requestB2B(reqMessage);
        //创建解析对象
        XStream xStream = new XStream();
        xStream.processAnnotations(PayInfoListCpmResponse.class);
        PayInfoListCpmResponse response = (PayInfoListCpmResponse) xStream.fromXML(requestB2B);
//        returnDatas.setData(response);
//        return returnDatas;
    }


}
