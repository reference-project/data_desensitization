package com.imooc.springboot.entity;

import com.imooc.springboot.config.Desensitized;
import com.imooc.springboot.enums.SensitiveTypeEnum;
import lombok.Data;

@Data
public class UserEntity {

    /**
     * 中文名
     */
    @Desensitized(type = SensitiveTypeEnum.CHINESE_NAME)
    private String chineseName;

    /**
     * 身份证号码
     */
    @Desensitized(type = SensitiveTypeEnum.ID_CARD)
    private String idCard;

    /**
     * 手机号
     */
    @Desensitized(type = SensitiveTypeEnum.MOBILE_PHONE)
    private String mobileNumber;

    /**
     * 密码
     */
    @Desensitized(type = SensitiveTypeEnum.PASSWORD,isEffictiveMethod = "isEffictiveMethod")
    private String password;

    @Override
    public String toString() {
        return "UserEntity{" +
                "chineseName='" + chineseName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
