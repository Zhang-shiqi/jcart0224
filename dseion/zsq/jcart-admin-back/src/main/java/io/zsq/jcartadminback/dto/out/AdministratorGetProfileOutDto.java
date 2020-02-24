package io.zsq.jcartadminback.dto.out;

public class AdministratorGetProfileOutDto {

    private Integer administratorId;
    private String username;
    private String realname;
    private String email;
    private String avatarUrl;
    private Byte status;
    private Long createTimesTamp;


    public Integer getAdministratorId() {

        return administratorId;
    }

    public String getRealname() {
        return realname;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {

        return email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Byte getStatus() {

        return status;
    }

    public Long getCreateTimesTamp() {
        return createTimesTamp;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setCreateTimesTamp(Long createTimesTamp) {
        this.createTimesTamp = createTimesTamp;
    }
}
