package sddtc.couple.dao.domain;

/**
 * Created by sddtc on 16/5/2.
 */
public class CoupleUser {
    private long id;
    private String email;
    private String password;
    private String name;
    private int sex;
    private String birthday;
    private String description;
    private String sweetie;
    private String token;
    private int isDeleted;
    private long created;
    private long updated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSweetie() {
        return sweetie;
    }

    public void setSweetie(String sweetie) {
        this.sweetie = sweetie;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "CoupleUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", description='" + description + '\'' +
                ", sweetie='" + sweetie + '\'' +
                ", token='" + token + '\'' +
                ", isDeleted=" + isDeleted +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
