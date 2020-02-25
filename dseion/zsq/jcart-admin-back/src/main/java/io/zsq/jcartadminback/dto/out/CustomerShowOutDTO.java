package io.zsq.jcartadminback.dto.out;

public class CustomerShowOutDTO {

    private Integer customerId;
    private String username;
    private String realName;
    private String avatarUrl;
    private String mobile;
    private String email;
    private Byte status;
    private Long createTimestamp;
    private Boolean newsSubScribed;
    private Integer rewordPonints;
    private Integer defaultAddressId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Boolean getNewsSubScribed() {
        return newsSubScribed;
    }

    public void setNewsSubScribed(Boolean newsSubScribed) {
        this.newsSubScribed = newsSubScribed;
    }

    public Integer getRewordPonints() {
        return rewordPonints;
    }

    public void setRewordPonints(Integer rewordPonints) {
        this.rewordPonints = rewordPonints;
    }

    public Integer getDefaultAddressId() {
        return defaultAddressId;
    }

    public void setDefaultAddressId(Integer defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }
}
