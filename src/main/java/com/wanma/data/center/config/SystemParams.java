package com.wanma.data.center.config;
 
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
 
/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/5/14
 */
@Component
@ConfigurationProperties(prefix = "system-params")
public class SystemParams {
 
    private String imageUri;

    private String imageName;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUri() {
        return imageUri;
    }
 
    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
